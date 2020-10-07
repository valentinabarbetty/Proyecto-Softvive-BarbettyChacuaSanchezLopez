package Modelo;

import Modelo.Herramienta;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:44:40")
@StaticMetamodel(Detalle_GastoHerramienta.class)
public class Detalle_GastoHerramienta_ { 

    public static volatile SingularAttribute<Detalle_GastoHerramienta, LocalDate> fecha;
    public static volatile SingularAttribute<Detalle_GastoHerramienta, Herramienta> herramienta;
    public static volatile SingularAttribute<Detalle_GastoHerramienta, Long> pk;
    public static volatile SingularAttribute<Detalle_GastoHerramienta, Integer> cantidad;

}