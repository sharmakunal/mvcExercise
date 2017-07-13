package com.kunal.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Verify extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        try{
            String name = req.getParameter("username");
            String pass = req.getParameter("password");
            if(name.equals("kunal") && pass.equals("vrinda")){
                out.println(name);
                out.println(pass);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
