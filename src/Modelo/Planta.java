package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
    @NamedQuery(name = "Planta.buscarPlantaConsulta", query = "SELECT p from Planta p WHERE p.codigo = :codigo")
})

public class Planta implements Serializable {

    @Id
    private String codigo;

    @Column(nullable = false)
    private String nombre;

    @Enumerated(EnumType.STRING)
    private TipoReproduccion tipoReproduccion;

    @Column(nullable = false)
    private int tiempoGerminacion;

    @Column(nullable = false)
    private int tiempoCrecimiento;

    @Column(nullable = false)
    private int valor_unitario;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Detalle_Gasto> listaDetalleGasto;

    public Planta() {
    }

    public Planta(String codigo, String nombre, int tiempoGerminacion, int tiempoCrecimiento, TipoReproduccion tipoReproduccion, int valor_unitario) throws Exception {
        if (tiempoCrecimiento <= 0) {
            throw new Exception("El tiempo de crecimiento debe ser mayor a 0");

        }
        if (tiempoGerminacion <= 0) {
            throw new Exception("El tiempo de germinación debe ser mayor a 0");

        }
        if (tipoReproduccion == null) {
            throw new Exception("Debe escoger un tipo de reproducción");

        }
        if (valor_unitario <= 0) {
            throw new Exception("El precio debe ser mayor a 0");

        }
        if (nombre.isEmpty()) {
            throw new Exception("Ingrese un nombre a la planta");

        }
        if (codigo.isEmpty()) {
            throw new Exception("Ingrese un código a la planta");

        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoReproduccion = tipoReproduccion;
        this.tiempoGerminacion = tiempoGerminacion;
        this.tiempoCrecimiento = tiempoCrecimiento;
        this.valor_unitario = valor_unitario;
        this.listaDetalleGasto = new ArrayList<>();
    }

    public void agregarDetalleGasto(Detalle_Gasto detalleGasto) {

        this.listaDetalleGasto.add(detalleGasto);

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoReproduccion getTipoReproduccion() {
        return tipoReproduccion;
    }

    public int getTiempoGerminacion() {
        return tiempoGerminacion;
    }

    public int getTiempoCrecimiento() {
        return tiempoCrecimiento;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoReproduccion(TipoReproduccion tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public void setTiempoGerminacion(int tiempoGerminacion) {
        this.tiempoGerminacion = tiempoGerminacion;
    }

    public void setTiempoCrecimiento(int tiempoCrecimiento) {
        this.tiempoCrecimiento = tiempoCrecimiento;
    }

    public int getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(int valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public List<Detalle_Gasto> getListaDetalleGasto() {
        return listaDetalleGasto;
    }

    public void setListaDetalleGasto(List<Detalle_Gasto> listaDetalleGasto) {
        this.listaDetalleGasto = listaDetalleGasto;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
