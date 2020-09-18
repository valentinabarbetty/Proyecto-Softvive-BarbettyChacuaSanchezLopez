package Modelo;

import Modelo.Siembra;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T15:09:55")
@StaticMetamodel(Detalle_Gasto.class)
public class Detalle_Gasto_ { 

    public static volatile SingularAttribute<Detalle_Gasto, LocalDateTime> fecha;
    public static volatile SingularAttribute<Detalle_Gasto, Siembra> siembra;
    public static volatile SingularAttribute<Detalle_Gasto, Long> pk;
    public static volatile SingularAttribute<Detalle_Gasto, Integer> cantidad;

}