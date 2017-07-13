package com.kunal.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends AbstractController{


    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String Mess = "Abstract Controller Test";
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", Mess);
        return modelAndView;
    }
}
