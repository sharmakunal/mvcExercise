package com.kunal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {

        @ResponseBody
        @RequestMapping("/index")
        ModelAndView index() {
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("msg", "Hello World");
            return modelAndView;
        }
}
