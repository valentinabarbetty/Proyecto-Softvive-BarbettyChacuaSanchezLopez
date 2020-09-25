package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Detalle_GastoHerramienta implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private LocalDate fecha;

    @OneToOne
    private Herramienta herramienta;

    public Detalle_GastoHerramienta() {
    }

    public Detalle_GastoHerramienta(int cantidad) throws Exception {

        if (cantidad < 0) {
            throw new Exception("No puede ingresar numeros negativos");
        }

        this.pk = pk;
        this.cantidad = cantidad;
        this.fecha = LocalDate.now();
        this.herramienta = herramienta;

        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fecha.format(fechaFormatter);

    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta siembra) {
        this.herramienta = herramienta;
    }

    @Override
    public String toString() {
        return ", cantidad=" + cantidad + ", fecha=" + fecha;
    }

}
