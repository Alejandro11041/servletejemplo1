package co.edu.uceva.service;

import co.edu.uceva.model.Articulo;
import co.edu.uceva.model.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ArticuloService implements IService<Articulo>{

    public List<Articulo> listar(){
        List<Articulo> listadoArticulo = new ArrayList<>();
        Articulo Articulo1 = new Articulo(1,"Televiso","Electrodomesticos",5969990L,"SAMSUNG");
        Articulo Articulo2 = new Articulo(2,"Celular","Electrodomesticos",1000000L,"XIAOMI");
        Articulo Articulo3 = new Articulo(3,"Equipo de sonido","Electrodomesticos",6000000L,"LG");
        Articulo Articulo4 = new Articulo(4,"Audifonos","Electrodomesticos",35000L,"SAMSUNG");
        listadoArticulo.add(Articulo1);
        listadoArticulo.add(Articulo2);
        listadoArticulo.add(Articulo3);
        listadoArticulo.add(Articulo4);
        return listadoArticulo;

    }

    @Override
    public Articulo consultar() {
        return null;
    }
}
