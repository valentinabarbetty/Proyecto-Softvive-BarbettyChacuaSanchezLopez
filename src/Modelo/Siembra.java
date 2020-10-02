package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Siembra implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    @Column(nullable = false)
    private String fecha;
    @Column(nullable = false)
    private int cantidad;
    @OneToOne
    private Planta planta;

    public Siembra() {
    }

    public Siembra(String fecha, int cantidad, Planta planta) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.planta = planta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

}
