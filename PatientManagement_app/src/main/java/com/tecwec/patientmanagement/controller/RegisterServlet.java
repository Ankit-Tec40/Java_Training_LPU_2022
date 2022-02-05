package com.tecwec.patientmanagement.controller;

import com.tecwec.patientmanagement.db.DB;
import com.tecwec.patientmanagement.db.Operations;
import com.tecwec.patientmanagement.db.Rules;
import com.tecwec.patientmanagement.model.PatientData;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    Rules<PatientData> rules;


    public void init(ServletConfig config) throws ServletException {
        System.out.println("[RegisterServlet] - init");

        rules=new Operations();
    }

    public void destroy() {
        System.out.println("[RegisterServlet] - destroy");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[RegisterServlet] - service");
        PatientData authData=new PatientData();
        authData.setName(req.getParameter("txtName"));
        authData.setEmail(req.getParameter("txtEmail"));
        String password=req.getParameter("txtPassword");
        authData.setPassword(password);

        //insert to DB
        int result = rules.register(authData);
        String message = result > 0 ? authData.name + " Registered" : authData.name + " Registration failed";
        //System.out.println(message);


        // Send Back Response to the client
        resp.setContentType("text/html");
        PrintWriter out =resp.getWriter();

        // Generate HTML Text
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><body>");
        buffer.append("<center>");
        buffer.append("<br><br><h3>"+message+"</h3>");
        //buffer.append("<p>"+authData.name+" Registered"+"</p>");
        buffer.append("</center>");
        buffer.append("</body></html>");

        // Send HTML text as Response
        out.print(buffer.toString());
    }

}
