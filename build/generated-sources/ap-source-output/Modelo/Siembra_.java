package Modelo;

import Modelo.EstadoSiembra;
import Modelo.Planta;
import java.time.Month;
import java.time.Year;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T23:44:40")
@StaticMetamodel(Siembra.class)
public class Siembra_ { 

    public static volatile SingularAttribute<Siembra, Planta> planta;
    public static volatile SingularAttribute<Siembra, EstadoSiembra> estadoSiembra;
    public static volatile SingularAttribute<Siembra, Month> mes;
    public static volatile SingularAttribute<Siembra, Long> pk;
    public static volatile SingularAttribute<Siembra, Integer> cantidad;
    public static volatile SingularAttribute<Siembra, Integer> dia;
    public static volatile SingularAttribute<Siembra, Year> año;
    public static volatile SingularAttribute<Siembra, Integer> muertes;

}