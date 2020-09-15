package Modelo;

import java.io.Serializable;
import java.time.Month;
import java.time.Year;
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
    private int dia;
    @Column(nullable = false)
    private Month mes;
    @Column(nullable = false)
    private Year año;
    @Column(nullable = false)
    private int cantidad;
    @OneToOne
    private Planta planta;

    public Siembra() {
    }

    public Siembra(int dia, Month mes, Year año, int cantidad, Planta planta) {
        this.pk = pk;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.cantidad = cantidad;
        this.planta = planta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        this.mes = mes;
    }

    public Year getAño() {
        return año;
    }

    public void setAño(Year año) {
        this.año = año;
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
