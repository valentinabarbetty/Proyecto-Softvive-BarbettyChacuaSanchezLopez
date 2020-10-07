package Modelo;

import Modelo.Pedido;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:44:40")
@StaticMetamodel(Ingreso.class)
public class Ingreso_ { 

    public static volatile SingularAttribute<Ingreso, LocalDate> fecha;
    public static volatile SingularAttribute<Ingreso, Float> precio;
    public static volatile SingularAttribute<Ingreso, Pedido> pedido;
    public static volatile SingularAttribute<Ingreso, Long> pk;

}