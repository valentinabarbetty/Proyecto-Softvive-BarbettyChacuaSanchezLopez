package Modelo;

import java.io.Serializable;
import java.time.Month;
import java.time.Year;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
    @NamedQuery(name = "BuscarSiembraEspecifica",
            query = "SELECT d from Siembra d WHERE d.pk = :pk")
})
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
    @Column(nullable = false)
    private int muertes;
    @Enumerated(EnumType.STRING)
    private EstadoSiembra estadoSiembra;

    public Siembra() {
    }

    public Siembra(int dia, Month mes, Year año, int cantidad, Planta planta, int muertes, EstadoSiembra estadoSiembra) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.cantidad = cantidad;
        this.planta = planta;
        this.muertes = muertes;
        this.estadoSiembra = estadoSiembra;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public EstadoSiembra getEstadoSiembra() {
        return estadoSiembra;
    }

    public void setEstadoSiembra(EstadoSiembra estadoSiembra) {
        this.estadoSiembra = estadoSiembra;
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

    @Override
    public String toString() {
        return "" + mes + " / " + dia + " / " + año + "";
    }
}
