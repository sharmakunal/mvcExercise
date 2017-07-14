package com.kunal.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RequestMapping("/")
@Controller
public class StudentController{

    @RequestMapping("/countryAndState/{countryName}/{stateName}")
    @ResponseBody
    String returnCountryAndState(@PathVariable Map<String, String> requestMap) {
        return requestMap.get("countryName") + " " + requestMap.get("stateName");
    }

       @RequestMapping("/")
           ModelAndView index() {
           ModelAndView modelAndView = new ModelAndView("index");
           return modelAndView;
       }
}
