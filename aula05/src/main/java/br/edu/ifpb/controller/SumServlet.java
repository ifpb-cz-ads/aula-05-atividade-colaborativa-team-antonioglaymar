package br.edu.ifpb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sum")
public class SumServlet extends HttpServlet{
    
    private static final long serialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        Integer number = Integer.parseInt(request.getParameter("number"));
        
        if (number > 0){
            request.setAttribute("styles", number);
        } else{
            request.setAttribute("error", "Valores negativos não são aceitos");
        }
        RequestDispatcher view = request.getRequestDispatcher("sum.jsp");
        view.forward(request, response);
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        String[] numbers = request.getParameterValues("values");

        Double sum = 0.0;
        for (String number : numbers){
            sum += Double.parseDouble(number);
        }

        request.setAttribute("result", sum);
        RequestDispatcher view = request.getRequestDispatcher("sum.jsp");
        view.forward(request, response);
    }
}