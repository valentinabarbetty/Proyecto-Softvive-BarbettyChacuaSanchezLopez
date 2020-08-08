package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    private String codigo;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(nullable = false)
    private String estadoPago;
    @Column(nullable = false)
    private String estadoEntregado;
    @OneToOne
    private Distribuidor distribuidor;

    @Column(nullable = false)
    private int cant_vendida;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Detalle_Pedido> listaDetallePedido;

    
//    public int total_prod = 0;
//    public int subtotal = 0;
//    public int total = 0;

    public Pedido() {
    }

    public Pedido(String codigo, String estadoPago, String estadoEntregado, Distribuidor distribuidor, int cant_vendida) {
        this.codigo = codigo;
        this.fecha = new Date();
        this.estadoPago = estadoPago;
        this.estadoEntregado = estadoEntregado;
        this.distribuidor = distribuidor;
        this.cant_vendida = cant_vendida;
        this.listaDetallePedido = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getEstadoEntregado() {
        return estadoEntregado;
    }

    public void setEstadoEntregado(String estadoEntregado) {
        this.estadoEntregado = estadoEntregado;
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

//    public void setTotal_prod(int total_prod) {
//        this.total_prod = total_prod;
//    }
//
//    public int getTotal_prod() {
//        total_prod = total_prod + cant_vendida;
//        return total_prod;
//    }

//    public int getSubtotal() {
//        return subtotal;
//    }
//
//    public void setSubtotal(int subtotal) {
//        this.subtotal = subtotal;
//    }
//
//    public int getTotal() {
//        return total;
//    }
//
//    public void setTotal(int total) {
//        this.total = total;
//    }
}
