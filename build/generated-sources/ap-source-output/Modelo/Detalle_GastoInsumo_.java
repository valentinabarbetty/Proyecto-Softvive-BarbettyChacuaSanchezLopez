package Modelo;

import Modelo.Insumo;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:44:40")
@StaticMetamodel(Detalle_GastoInsumo.class)
public class Detalle_GastoInsumo_ { 

    public static volatile SingularAttribute<Detalle_GastoInsumo, LocalDate> fecha;
    public static volatile SingularAttribute<Detalle_GastoInsumo, Insumo> insumo;
    public static volatile SingularAttribute<Detalle_GastoInsumo, Long> pk;
    public static volatile SingularAttribute<Detalle_GastoInsumo, Integer> cantidad;

}