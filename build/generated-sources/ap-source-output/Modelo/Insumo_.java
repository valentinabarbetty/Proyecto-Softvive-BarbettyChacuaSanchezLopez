package Modelo;

import Modelo.Detalle_GastoInsumo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:44:40")
@StaticMetamodel(Insumo.class)
public class Insumo_ { 

    public static volatile SingularAttribute<Insumo, String> descripcion;
    public static volatile ListAttribute<Insumo, Detalle_GastoInsumo> listaGastoInsumo;
    public static volatile SingularAttribute<Insumo, Long> pk;
    public static volatile SingularAttribute<Insumo, String> nombre;

}