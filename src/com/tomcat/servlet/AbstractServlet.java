package com.tomcat.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class AbstractServlet extends HttpServlet {

    protected abstract void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException;

    protected abstract void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException;

}
