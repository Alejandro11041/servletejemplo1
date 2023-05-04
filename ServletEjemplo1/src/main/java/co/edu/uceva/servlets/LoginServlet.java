package co.edu.uceva.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        /*Cookie cookie;
        Cookie[] cookies = request.getCookies();*/
        boolean isAuth = false;
        HttpSession session = request.getSession();
        if("ADMIN".equals(session.getAttribute("usuario"))){
            isAuth=true;
        }
        /*if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                if ("usuario".equals(cookie.getName())) {
                    out.println("<h1>Hola " + cookie.getValue() + " Bienvenido, autenticación exitosa</h1>");
                    isAuth = true;
                }
            }
        }*/
        if (!isAuth) {
            response.sendRedirect("index.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String passwordAlmacenado="ADMIN";
        String usuarioAlmacenado="ADMIN";

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        Cookie usuarioCookie;
        Cookie cookie;
        //Cookie[] cookies = request.getCookies();
        /*if(cookies!=null) {
            for (int i = 0; i <= cookies.length; i++) {
                cookie = cookies[i];
                out.println(cookie.getName() + " : " + cookie.getValue());

            }
        }*/

        if( passwordAlmacenado.equals(password) && usuarioAlmacenado.equals(usuario)){

            /*usuarioCookie = new Cookie("usuario",usuario);
            response.addCookie(usuarioCookie);*/

            HttpSession session = request.getSession();
            session.setAttribute("usuario",usuario);
            out.println("<h1>Hola "+usuario+" Bienvenido, autenticación exitosa</h1>");

        }else{
            //out.println("<h1>Usuario o Contraseña incorrecto</h1>");

            response.sendRedirect("index.html");
        }
    }
}
