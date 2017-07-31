package com.tomcat.servlet.impl;

import com.tomcat.model.impl.User;
import com.tomcat.servlet.AbstractServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrationServlet extends AbstractServlet {

    private final static Logger LOGGER = Logger.getLogger(RegistrationServlet.class.getName());
    private final static String TEMPLATE_PATH = "WEB-INF/html/registration/";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        LOGGER.log(Level.INFO, "HTTP/1.1 Method Get path: /registration");

        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        req.getRequestDispatcher(TEMPLATE_PATH + "registration.html").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        LOGGER.log(Level.INFO, "HTTP/1.1 Method Post path: /registration");

        User newUser = new User();
        if (isFilledUser(req)) {
            newUser.setName(req.getParameter("username"));
            newUser.setPassword(req.getParameter("password"));

            req.getRequestDispatcher(TEMPLATE_PATH + "successful.html").forward(req, res);
        }

        //request.getRequestDispatcher(TEMPLATE_PATH + "fault.html").forward(request, response);

    }

    private boolean isFilledUser(HttpServletRequest req) {
        if (req.getParameter("username") != null && req.getParameter("password") != null) {
            return true;
        }
        return false;
    }
}
