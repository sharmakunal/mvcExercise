package com.kunal.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class StudentController{

        @ResponseBody
        @RequestMapping(value = "/redirect",method = RequestMethod.POST)
      public   ModelAndView pathDemo(@ModelAttribute("studentCO") StudentCO studentCO) {
            ModelAndView modelAndView=new ModelAndView("welcome");
            modelAndView.addObject(studentCO);
            return modelAndView;
        }


       @RequestMapping("/")
           ModelAndView index() {
           ModelAndView modelAndView = new ModelAndView("index");
           return modelAndView;
       }
        @ModelAttribute
        void addingObject(Model model){
            model.addAttribute("heading","This is spring mvc");
        }
}
