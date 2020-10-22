package br.edu.ifpb.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Headers")
public class HeaderServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        Enumeration<String> headers = request.getHeaderNames();
        Map<String, String> result = new HashMap<String, String>();
        
        while (headers.hasMoreElements()) {
            String key = (String) headers.nextElement();
            String value = request.getHeader(key);
            result.put(key, value);
        }

        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }

}