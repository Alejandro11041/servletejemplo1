package co.edu.uceva.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> listar();
    T consultar();
}

