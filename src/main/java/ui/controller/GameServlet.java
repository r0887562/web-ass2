package ui.controller;

import domain.db.gameDB;
import domain.model.Game;


import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.RequestDispatcher;




@WebServlet("/overzicht")
public class GameServlet extends HttpServlet {

    public gameDB games = new gameDB();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("overzicht", games);
        RequestDispatcher view = request.getRequestDispatcher("overzicht.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String naam = request.getParameter("naam");
        String developer = request.getParameter("developer");
        String IGNFromParameter = request.getParameter("IGN");
        int IGN = Integer.parseInt(IGNFromParameter);
        String PEGIFromParameter = request.getParameter("PEGI");
        int Pegi = Integer.parseInt(PEGIFromParameter);
        Game game1 = new Game(naam, developer, IGN, Pegi);
        games.add(game1);
        request.setAttribute("overzicht", games);
        RequestDispatcher view = request.getRequestDispatcher("overzicht.jsp");
        view.forward(request, response);
    }



}

