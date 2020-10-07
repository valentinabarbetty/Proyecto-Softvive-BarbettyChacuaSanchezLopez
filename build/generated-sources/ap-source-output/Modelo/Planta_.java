package Modelo;

import Modelo.Detalle_Gasto;
import Modelo.TipoReproduccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:44:40")
@StaticMetamodel(Planta.class)
public class Planta_ { 

    public static volatile SingularAttribute<Planta, String> codigo;
    public static volatile ListAttribute<Planta, Detalle_Gasto> listaDetalleGasto;
    public static volatile SingularAttribute<Planta, Integer> tiempoGerminacion;
    public static volatile SingularAttribute<Planta, TipoReproduccion> tipoReproduccion;
    public static volatile SingularAttribute<Planta, String> nombre;
    public static volatile SingularAttribute<Planta, Integer> tiempoCrecimiento;
    public static volatile SingularAttribute<Planta, Integer> valor_unitario;

}