package co.edu.uceva.repository;

import co.edu.uceva.model.Empleado;
import co.edu.uceva.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmpleadoRepository implements IRepository <Empleado>{
    public EmpleadoRepository(){

    }

    @Override
    public List<Empleado> listar(){
        List<Empleado> ListadoEmpleado = new ArrayList<>();
        Connection conect = ConexionBaseDatos.getConnection();

        try(
            Statement stmt = conect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM empleados");

        ) {
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt("id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setCiudad(rs.getString("ciudad"));
                empleado.setDepartamento(rs.getString("departamento"));
                empleado.setSalario(rs.getLong("salario"));
                ListadoEmpleado.add(empleado);
            }

        }
        catch (SQLException e) {
           e.printStackTrace();
        }
        return ListadoEmpleado;
    }
    @Override
    public Empleado consultar(){
        return null;
    }

}
