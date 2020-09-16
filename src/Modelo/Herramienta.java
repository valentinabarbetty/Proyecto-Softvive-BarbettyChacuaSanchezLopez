package Modelo;

import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity

@NamedQueries({
    @NamedQuery(name = "Herramienta.BuscarHerramientaConsulta", query = "SELECT i from Herramienta i WHERE i.nombre = :nombre")

})
public class Herramienta implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;

    @Column(nullable = false)
    private String nombre;

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

    }

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
        return "Insumo{" + "pk=" + pk + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
