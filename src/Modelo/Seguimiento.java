/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author xxval
 */
@Entity
public class Seguimiento implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    @OneToOne
    private Siembra siembra;
    @Column(nullable = false)
    private int muertes;
    @Enumerated(EnumType.STRING)
    private EstadoSiembra estadoSiembra;

    public Seguimiento() {
    }

    public Seguimiento(Siembra siembra, int muertes, EstadoSiembra estadoSiembra) {
        this.pk = pk;
        this.siembra = siembra;
        this.muertes = muertes;
        this.estadoSiembra = estadoSiembra;
    }

    public EstadoSiembra getEstadoSiembra() {
        return estadoSiembra;
    }

    public void setEstadoSiembra(EstadoSiembra estadoSiembra) {
        this.estadoSiembra = estadoSiembra;
    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public Siembra getSiembra() {
        return siembra;
    }

    public void setSiembra(Siembra siembra) {
        this.siembra = siembra;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

}
