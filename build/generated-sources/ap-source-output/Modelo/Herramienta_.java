package Modelo;

import Modelo.Detalle_GastoHerramienta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:44:40")
@StaticMetamodel(Herramienta.class)
public class Herramienta_ { 

    public static volatile SingularAttribute<Herramienta, String> descripcion;
    public static volatile SingularAttribute<Herramienta, Long> pk;
    public static volatile SingularAttribute<Herramienta, String> nombre;
    public static volatile ListAttribute<Herramienta, Detalle_GastoHerramienta> listaGastoHerramienta;

}