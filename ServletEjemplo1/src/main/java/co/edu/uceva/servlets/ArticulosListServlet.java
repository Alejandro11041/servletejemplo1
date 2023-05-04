package co.edu.uceva.servlets;

import co.edu.uceva.model.Articulo;
import co.edu.uceva.model.Empleado;
import co.edu.uceva.service.ArticuloService;
import co.edu.uceva.service.EmpleadoService;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ArticulosListServlet", value = "/ArticulosListServlet")
public class ArticulosListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        ArticuloService articuloService = new ArticuloService();
        List<Articulo> listadoArticulo =  articuloService.listar();
        String ArticuloJsonString = new Gson().toJson(listadoArticulo);
        response.setContentType("application/json");
        out.print(ArticuloJsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
