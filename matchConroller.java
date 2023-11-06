package model.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import model.Match;
import model.Team;

@WebServlet("/matchController")
public class matchController extends HttpServlet {

    @Override 
    protected void doGet(HttpServletRequest request,
    HttpServletResponse response) throws IOException, ServletException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        String home = request.getParameter("home");
        String visitor = request.getParameter("visitor");
        String homeScore = request.getParameter("homeScore");
        String visitorScore = request.getParameter("visitorScore");
    }

    
}
