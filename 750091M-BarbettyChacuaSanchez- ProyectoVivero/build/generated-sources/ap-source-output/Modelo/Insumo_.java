package Modelo;

import Modelo.Detalle_Gasto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T15:09:55")
@StaticMetamodel(Insumo.class)
public class Insumo_ { 

    public static volatile SingularAttribute<Insumo, String> descripcion;
    public static volatile SingularAttribute<Insumo, Detalle_Gasto> detalleGasto;
    public static volatile SingularAttribute<Insumo, Long> pk;
    public static volatile SingularAttribute<Insumo, String> nombre;

}