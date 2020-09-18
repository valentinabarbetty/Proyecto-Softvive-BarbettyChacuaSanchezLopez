package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
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

@Entity

@NamedQueries({
    @NamedQuery(name = "Herramienta.buscarHerramientaConsulta1", query = "SELECT h from Herramienta h WHERE h.nombre = :nombre")
//    ,
//    @NamedQuery(name = "Herramienta.buscarHerramientaCodigo", query = "SELECT h from Herramienta h WHERE h.codigo = :codigo")

})
public class Herramienta implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;

    @Column(nullable = false)
    private String nombre;

//    @Column(nullable = false)
//    private Detalle_GastoHerramienta detalleH;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Detalle_GastoHerramienta> listaGastoHerramienta;

    @Column(length = 100, nullable = false)
    private String descripcion;

    public Herramienta() {
    }

    public Herramienta(String nombre, String descripcion) throws Exception {

        if (nombre == null) {
            throw new Exception("Debe ingresar nombre");
        }
        if (descripcion == null) {
            throw new Exception("no debe de estar vacia");
        }

        this.nombre = nombre;
        this.descripcion = descripcion;
   
        //this.detalleH = detalleH;
        this.listaGastoHerramienta = new ArrayList<>();

    }

    public void agregarDetalleGastoHerramienta(Detalle_GastoHerramienta detalleGastoH) {
        this.listaGastoHerramienta.add(detalleGastoH);
    }
//
//    public Detalle_GastoHerramienta getDetalleH() {
//        return detalleH;
//    }
//
//    public void setDetalleH(Detalle_GastoHerramienta detalleH) {
//        this.detalleH = detalleH;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    public List<Detalle_GastoHerramienta> getListaGastoHerramienta() {
        return listaGastoHerramienta;
    }

    public void setListaGastoHerramienta(List<Detalle_GastoHerramienta> listaGastoHerramienta) {
        this.listaGastoHerramienta = listaGastoHerramienta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Herramienta other = (Herramienta) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", descripcion=" + descripcion;
    }

}
