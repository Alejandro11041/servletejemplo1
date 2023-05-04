package co.edu.uceva.model;

public class Empleado {
    private int id;
    private String nombre;
    private String ciudad;
    private String departamento;
    private Long salario;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String ciudad, String departamento, Long salario) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre(String nombre) {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad(String ciudad) {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento(String departamento) {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }
}
