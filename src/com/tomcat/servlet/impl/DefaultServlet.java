package com.tomcat.servlet.impl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultServlet extends HttpServlet{

    private final static Logger LOGGER = Logger.getLogger(DefaultServlet.class.getName());

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        LOGGER.log(Level.INFO, "HTTP/1.1 Method Get path: /*");

        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        res.setStatus(200);

        req.getRequestDispatcher("WEB-INF/html/index.jsp").forward(req, res);
    }

}
