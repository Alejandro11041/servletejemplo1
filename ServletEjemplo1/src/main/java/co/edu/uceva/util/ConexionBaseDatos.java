package co.edu.uceva.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url="jdbc:sqlite:D:\\Documentos\\ProjectosIntellijIDEA\\ServletEjemplo1\\empleados.sqlite";

    public static Connection getConnection(){

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            return DriverManager.getConnection(url,"","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
