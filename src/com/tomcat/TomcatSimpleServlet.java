package com.tomcat;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TomcatSimpleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //В ответе мы указываем, что тип возращаемого документа будет HTML
        response.setContentType("text/html;charset=utf-8");
        // Получаем экземпляр PrintWriter, чтобы отправить в поток строку, которая в себе хранит html-тег
        PrintWriter pw = response.getWriter();
        pw.println("<H1>Hello, world!</H1>");
    }

}
