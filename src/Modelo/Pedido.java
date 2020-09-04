package Modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
    @NamedQuery(name = "BuscarUnPedidoEspecifico",
            query = "SELECT d from Pedido d WHERE d.codigo = :codigo")
})
public class Pedido implements Serializable {

    @Id
    private long codigo;
     @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(nullable = false)
    private String estadoPago;
    @Enumerated(EnumType.STRING)
    private EstadoEntrega estadoEntrega;
    @OneToOne
    private Distribuidor distribuidor;
    @Column(nullable = false)
    private int total = 0;
    @Column(nullable = false)
    private int cant_vendida;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Detalle_Pedido> listaDetallePedido;

//    public int total_prod = 0;
//    public int subtotal = 0;
//    public int total = 0;
    public Pedido() {
    }

    
    public Pedido(long codigo, String estadoPago, EstadoEntrega estadoEntrega, Distribuidor distribuidor, int cant_vendida) {
        this.codigo = codigo;
        this.fecha = new Date();
        this.estadoPago = estadoPago;
        this.estadoEntrega = estadoEntrega;
        this.distribuidor = distribuidor;
        this.cant_vendida = cant_vendida;
        this.listaDetallePedido = new ArrayList<>();
    }

    
    public void agregarDetallePedido(Detalle_Pedido dp) {
        this.listaDetallePedido.add(dp);
        total = total + dp.getPrecio();
    }
    

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public EstadoEntrega getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(EstadoEntrega estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    public int getCant_vendida() {
        return cant_vendida;
    }

    public void setCant_vendida(int cant_vendida) {
        this.cant_vendida = cant_vendida;
    }

    public Date getFecha() { 
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Detalle_Pedido> getListaDetallePedido() {
        return listaDetallePedido;
    }

    public void setListaDetallePedido(List<Detalle_Pedido> listaDetallePedido) {
        this.listaDetallePedido = listaDetallePedido;
    }

    public void addDetallep(Detalle_Pedido listaDetallePedido) {
        this.listaDetallePedido.add(listaDetallePedido);
    }

    public void eliminarDetallePedido(int rowSel) {

        Detalle_Pedido dp = listaDetallePedido.remove(rowSel);
        total = (int) (total - dp.getPrecio());

    }

    @Override
    public String toString() {
        return "Pedido{" + "fecha=" + fecha + '}';
    }



}