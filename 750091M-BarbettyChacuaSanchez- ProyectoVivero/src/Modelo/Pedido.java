package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.time.Year;
import java.time.Month;
import java.util.Objects;
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
    private String codigo;
    @Column(nullable = false)
    private Month mes;
    @Column(nullable = false)
    private int dia;
    @Column(nullable = false)
    private Year año;
    @Column(nullable = false)
    private String estadoPago;
    @Enumerated(EnumType.STRING)
    private EstadoEntrega estadoEntrega;
    @Enumerated(EnumType.STRING)
    private EstadoListo estadoListo;
    @OneToOne
    private Distribuidor distribuidor;
    @Column(nullable = false)
    private int cant_vendida = 0;
    @Column(nullable = false)
    private int total = 0;

    private int contador = 0;

//    @Column(nullable = false)
//    private int cant_vendida;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Detalle_Pedido> listaDetallePedido;

    public Pedido() {
    }

    public Pedido(String codigo, Distribuidor distribuidor) throws Exception {

        if (codigo == null || "".equals(codigo.trim())) {
            throw new Exception("la casilla del codigo no puede estar vacia");
        }
        if (estadoPago == null) {
            throw new Exception("la casilla del estadoPago no puede estar vacia");
        }
        if (estadoEntrega == null) {
            throw new Exception("la casilla del estadoEntrega no puede estar vacia");
        }
        if (distribuidor == null) {
            throw new Exception("la casilla del distribuidor no puede estar vacia");
        }
        if (cant_vendida <= 0) {
            throw new Exception("la casilla de la cantidad vendida no puede estar vacia y deber ser menor a cero");
        }

        this.codigo = codigo;
        this.mes = mes;
        this.dia = dia;
        this.año = año;
        this.cant_vendida = cant_vendida;
        this.total = total;
        this.estadoPago = estadoPago;
        this.estadoEntrega = estadoEntrega;
        this.estadoListo = estadoListo;
        this.distribuidor = distribuidor;
        this.listaDetallePedido = new ArrayList<>();
    }

    public void devolverDetallePedido(int seleccionar) {

        Detalle_Pedido detalle = this.listaDetallePedido.remove(seleccionar);
        contador += 1;
        
        total -= detalle.getPrecio();
        cant_vendida = listaDetallePedido.size() - 1;

        ///////////////////
    }

    public void agregarDetallePedido(Detalle_Pedido detalle) {

        this.listaDetallePedido.add(detalle);
         contador += 1;
         
         
        int costoCompra = detalle.getCantidad() * detalle.getPlanta().getValor_unitario();
         
        total += costoCompra;
        
//        total += detalle.getPrecio();
        cant_vendida = listaDetallePedido.size();

        //sub = cant_vendida + contador;
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
//////////////////////7
    public void eliminarDetallePedido() {
        this.listaDetallePedido.removeAll(listaDetallePedido);
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

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setDia(int dia) {
        this.dia = dia;
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

    public int getCant_vendida() {
        return cant_vendida;
    }

    public void setCant_vendida(int cant_vendida) {
        this.cant_vendida = cant_vendida;
    }

    public EstadoListo getEstadoListo() {
        return estadoListo;
    }

    public void setEstadoListo(EstadoListo estadoListo) {
        this.estadoListo = estadoListo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.distribuidor);
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
        final Pedido other = (Pedido) obj;
        if (!Objects.equals(this.distribuidor, other.distribuidor)) {
            return false;
        }
        return true;
    }
}
