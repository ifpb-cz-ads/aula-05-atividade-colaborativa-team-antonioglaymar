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

@WebServlet("/NumandStrin")
public class NumandStrin extends HttpServlet{

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        String value = request.getParameter("text");
        try {
            Double number = Double.parseDouble(value);
            request.setAttribute("styles", "Numerico");
        } catch (Exception e) {
            request.setAttribute("styles", "Textual");
        }
        
        RequestDispatcher view = request.getRequestDispatcher("numandStrin.jsp");
        view.forward(request, response);

    }

}