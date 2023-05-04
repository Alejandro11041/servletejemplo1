package co.edu.uceva.servlets;

import co.edu.uceva.model.Empleado;
import co.edu.uceva.service.EmpleadoService;

import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;


@WebServlet(name = "EmpleadoListServlet", value = "/EmpleadoListServlet")
public class EmpleadoListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        EmpleadoService empleadoService = new EmpleadoService();
        List<Empleado> listadoEmpleado =  empleadoService.listar();
        String empleadoJsonString = new Gson().toJson(listadoEmpleado);
        response.setContentType("application/json");
        out.print(empleadoJsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
