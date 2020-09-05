package Modelo;

import Modelo.Detalle_Pedido;
import Modelo.Distribuidor;
import Modelo.EstadoEntrega;
import java.time.Month;
import java.time.Year;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-01T21:58:30")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Long> codigo;
    public static volatile SingularAttribute<Pedido, Integer> total;
    public static volatile SingularAttribute<Pedido, Integer> cant_vendida;
    public static volatile ListAttribute<Pedido, Detalle_Pedido> listaDetallePedido;
    public static volatile SingularAttribute<Pedido, Month> mes;
    public static volatile SingularAttribute<Pedido, Integer> dia;
    public static volatile SingularAttribute<Pedido, String> estadoPago;
    public static volatile SingularAttribute<Pedido, Distribuidor> distribuidor;
    public static volatile SingularAttribute<Pedido, Year> año;
    public static volatile SingularAttribute<Pedido, EstadoEntrega> estadoEntrega;

}