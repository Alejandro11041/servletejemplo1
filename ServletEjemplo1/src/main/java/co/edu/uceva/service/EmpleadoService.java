package co.edu.uceva.service;
import co.edu.uceva.model.Empleado;
import co.edu.uceva.repository.EmpleadoRepository;
import co.edu.uceva.service.EmpleadoService;

import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;
public class EmpleadoService implements IService<Empleado>{

    public List<Empleado> listar(){

        EmpleadoRepository empleadoRepository = new EmpleadoRepository();
       List<Empleado> ListadoEmpleado = new EmpleadoRepository().listar();
       /*
        Empleado empleado1 = new Empleado(1,"Felipe","Tulua","Valle",100L);
        Empleado empleado2 = new Empleado(2,"Andrés","Buga","Valle",100L);
        Empleado empleado3 = new Empleado(3,"Francisco","Cali","Valle",100L);
        Empleado empleado4 = new Empleado(4,"Héctor","Tulua","Valle",100L);
        listadoEmpleado.add(empleado1);
        listadoEmpleado.add(empleado2);
        listadoEmpleado.add(empleado3);
        listadoEmpleado.add(empleado4);

        */
        return ListadoEmpleado;

    }

    @Override
    public Empleado consultar() {
        return null;
    }
}
