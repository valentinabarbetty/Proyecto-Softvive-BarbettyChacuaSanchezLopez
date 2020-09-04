package Modelo;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Vivero {

    private String nit;
    private String nombre;
    private String direccion;

    private List<Empleado> listaEmpleados;
    private List<Detalle_Pedido> listaDetallePedidos;

    public Vivero() {
    }

    public Vivero(String nit, String nombre, String direccion) throws Exception {

        if (nit == null) {
            throw new Exception("el nit de la universidad no puede ser nulo");
        }
        if (nombre == null) {
            throw new Exception("el nombre de la universidad no puede ser nulo");
        }
        if (direccion == null) {
            throw new Exception("la direccion de la universidad no puede ser nula");
        }

        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEmpleados = new LinkedList<>();
        this.listaDetallePedidos = new LinkedList<>();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(LinkedList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Detalle_Pedido> getListaDetallePedidos() {
        return listaDetallePedidos;
    }

    public void setListaDetallePedidos(List<Detalle_Pedido> listaDetallePedidos) {
        this.listaDetallePedidos = listaDetallePedidos;
    }
}
