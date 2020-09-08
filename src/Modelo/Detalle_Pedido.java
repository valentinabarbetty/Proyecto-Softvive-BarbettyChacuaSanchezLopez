package Modelo;

import java.io.Serializable;
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
    @NamedQuery(name = "ControlDetallePedido.buscarDetallePedido",
            query = "SELECT d from Detalle_Pedido d WHERE d.pk = :pk")
})
public class Detalle_Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    @Column(nullable = false)
    private int cantidad;
    @Column(nullable = false)
    private int precio;
    @OneToOne
    private Planta planta;

    public Detalle_Pedido() {
    }

    public Detalle_Pedido(int cantidad, Planta planta) {
        this.cantidad = cantidad;
        this.planta = planta;
        this.precio = this.planta.getValor_unitario() * this.cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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
