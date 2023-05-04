package co.edu.uceva.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HolaMundoServlet", value = "/HolaMundoServlet")
public class HolaMundoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String nombre = request.getParameter("nombre");

        PrintWriter out = response.getWriter();
        out.println("<h1>Hola "+nombre+"</h1>");



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
