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
public class Detalle_GastoInsumo implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private LocalDate fecha;

    @OneToOne
    private Insumo insumo;

    public Detalle_GastoInsumo() {
    }

    public Detalle_GastoInsumo(int cantidad) throws Exception {

        if (cantidad < 0) {
            throw new Exception("No puede ingresar numeros negativos");
        }

        this.pk = pk;
        this.cantidad = cantidad;
        this.fecha = LocalDate.now();
        this.insumo = insumo;

//        this.listaInsumos = new ArrayList<>();
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyyy");
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

//    public Insumo getInsumo() {
//        return insumo;
//    }
//
//    public void setInsumo(Insumo insumo) {
//        this.insumo = insumo;
//    }
//    public List<Insumo> getListaInsumos() {
//        return listaInsumos;
//    }
//
//    public void setListaInsumos(List<Insumo> listaInsumos) {
//        this.listaInsumos = listaInsumos;
//    }
    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    @Override
    public String toString() {
        return ", cantidad=" + cantidad + ", fecha=" + fecha + ", siembra=" + insumo+ '}';
    }

}
