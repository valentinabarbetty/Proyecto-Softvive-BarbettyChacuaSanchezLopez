/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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

    public Seguimiento() {
    }

    public Seguimiento(Siembra siembra, int muertes) {
        this.siembra = siembra;
        this.muertes = muertes;
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
