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

@WebServlet("/PostAndGet")
public class PostAndGet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        Double primeiro = Double.parseDouble(request.getParameter("brabo1"));
        Double segundo = Double.parseDouble(request.getParameter("brabo2"));
        Double result = primeiro - segundo;

        request.setAttribute("result", result);
        RequestDispatcher view = request.getRequestDispatcher("postAndget.jsp");
        view.forward(request, response);

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        Double primeiro = Double.parseDouble(request.getParameter("brabo1"));
        Double segundo = Double.parseDouble(request.getParameter("brabo2"));
        Double result = primeiro + segundo;

        request.setAttribute("result", result);
        RequestDispatcher view = request.getRequestDispatcher("postAndget.jsp");
        view.forward(request, response);

    }
}