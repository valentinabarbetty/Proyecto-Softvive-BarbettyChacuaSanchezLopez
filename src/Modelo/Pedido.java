package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
    @Column(nullable = false)
    private int dia;
    @Column(nullable = false)
    private Month mes;
    @Column(nullable = false)
    private Year año;
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
//    public Pedido() {
//    }
    public Pedido() {
        this.codigo = codigo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
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

//    public void editarDetallePedido(Detalle_Pedido dp) {
//        total = dp.
//    }

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
        return "" + mes + " / " + dia + " / " + año + "";
    }

}
