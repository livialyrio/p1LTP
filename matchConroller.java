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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Match match = new Match();

        Team resultado = match.getResult();
        
        request.setAttribute("vencedor", resultado);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/pagina_de_resultado.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String home = request.getParameter("home");
        String visitor = request.getParameter("visitor");
        String homeScoreString = request.getParameter("pontos_home");
        String visitorScoreString = request.getParameter("pontos_visitor");

        Match p1 = new Match();
        p1.setHome(home);
        p1.setVisitor(visitor);
        p1.setHomeScore(homeScoreString);
        p1.setvisitorScore(homeScoreString);
    }
    }
}
