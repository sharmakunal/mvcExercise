package com.kunal.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@RequestMapping("/")
@Controller
public class StudentController extends MultiActionController{


        @ResponseBody
        @RequestMapping(value = "/redirect",method = RequestMethod.POST)
      public   ModelAndView pathDemo(@RequestParam String firstName,@RequestParam String lastName) {
            ModelAndView modelAndView=new ModelAndView("welcome");
            modelAndView.addObject("firstName",firstName);
            modelAndView.addObject("lastName",lastName);
            return modelAndView;
        }


       @RequestMapping("/")
           ModelAndView index() {
           ModelAndView modelAndView = new ModelAndView("index");
           return modelAndView;
       }
}
