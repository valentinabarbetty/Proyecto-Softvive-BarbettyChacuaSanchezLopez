package Modelo;

import Modelo.Planta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-02T15:09:55")
@StaticMetamodel(Siembra.class)
public class Siembra_ { 

    public static volatile SingularAttribute<Siembra, String> fecha;
    public static volatile SingularAttribute<Siembra, Planta> planta;
    public static volatile SingularAttribute<Siembra, Long> pk;
    public static volatile SingularAttribute<Siembra, Integer> cantidad;

}