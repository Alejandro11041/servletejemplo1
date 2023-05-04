package co.edu.uceva.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "CabecerasHttpRequestServlet", value = "/CabecerasHttpRequestServlet")
public class CabecerasHttpRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String metodo   = request.getMethod();
        String uri      = request.getRequestURI();
        String contexto = request.getContextPath();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"es\">");
        out.println("<head>");
        out.println("<title>Ejemplo Cabeceras</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");
        out.println("</header>");
        out.println("<main>");
        out.println("<ul>");
            out.println("<li>Metodo: "+metodo+"</li>");
            out.println("<li>Metodo: "+uri+"</li>");
            out.println("<li>Raiz de Contexto: "+contexto+"</li>");
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String nombre = headerNames.nextElement();
            out.println("<li>"+nombre+": "+request.getHeader(nombre)+"</li>");
        }
        out.println("</ul>");
        out.println("</main>");
        out.println("<body>");
        out.println("<html>");



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
