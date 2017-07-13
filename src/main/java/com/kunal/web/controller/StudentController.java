package com.kunal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*@Controller
public class StudentController extends AbstractController{

    //Ques 1.Implement AbstractController in StudentController. create a mapping index.html
    //for it and render index.jsp view from it which displays messages "Hello from index.gsp"
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String Mess = "Hello";
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", Mess);
        return modelAndView;
    }
}*/

public class StudentController extends MultiActionController{

    //Que 2.Now remove AbstractController and useMultiActionController for StudentController which contains
    // 2 actions one action renders a jsp view and another action uses HttpServletResponse
    // to show the output on the Web browser.


    public ModelAndView dummy(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    public void dummy2(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>HELLO World</b>");
    }


}
