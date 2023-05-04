package co.edu.uceva.service;

import java.util.List;

public interface IService<T> {
    List<T> listar();
    T consultar();
}

