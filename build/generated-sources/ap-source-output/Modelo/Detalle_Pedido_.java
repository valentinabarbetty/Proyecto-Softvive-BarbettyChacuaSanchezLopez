package Modelo;

import Modelo.Planta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-01T21:58:30")
@StaticMetamodel(Detalle_Pedido.class)
public class Detalle_Pedido_ { 

    public static volatile SingularAttribute<Detalle_Pedido, Integer> precio;
    public static volatile SingularAttribute<Detalle_Pedido, Planta> planta;
    public static volatile SingularAttribute<Detalle_Pedido, Long> pk;
    public static volatile SingularAttribute<Detalle_Pedido, Integer> cantidad;

}