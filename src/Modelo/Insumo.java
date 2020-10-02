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
    @NamedQuery(name = "Insumo.buscarInsumosConsulta1", query = "SELECT i from Insumo i WHERE i.nombre = :nombre")
//    ,
//    @NamedQuery(name = "Insumo.buscarInsumosCodigo", query = "SELECT i from Insumo i WHERE i.codigo = :codigo")

})
public class Insumo implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;

    @Column(nullable = false)
    private String nombre;

//    @Column(nullable = false)
//    private Detalle_GastoInsumo detalleI;
    @Column(length = 100, nullable = false)
    private String descripcion;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Detalle_GastoInsumo> listaGastoInsumo;

    public Insumo() {
    }

    public Insumo(String nombre, String descripcion) throws Exception {

        if (nombre == null) {
            throw new Exception("Debe ingresar nombre");
        }
        if (descripcion == null) {
            throw new Exception("no debe de estar vacia");
        }

        this.nombre = nombre;
        this.descripcion = descripcion;
        //      this.detalleI = detalleI;
        this.listaGastoInsumo = new ArrayList<>();;

    }

    public void agregarDetalleGastoInsumo(Detalle_GastoInsumo detalleGastoI) {

        this.listaGastoInsumo.add(detalleGastoI);
    }

    public String getNombre() {
        return nombre;
    }

//    public Detalle_GastoInsumo getDetalleI() {
//        return detalleI;
//    }
//
//    public void setDetalleI(Detalle_GastoInsumo detalleI) {
//        this.detalleI = detalleI;
//    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Detalle_GastoInsumo> getListaGastoInsumo() {
        return listaGastoInsumo;
    }

    public void setListaGastoInsumo(List<Detalle_GastoInsumo> listaGastoInsumo) {
        this.listaGastoInsumo = listaGastoInsumo;
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
        final Insumo other = (Insumo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
