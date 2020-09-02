package Modelo;

import Modelo.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-01T21:58:30")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> cedula;
    public static volatile SingularAttribute<Empleado, String> ciudad;
    public static volatile SingularAttribute<Empleado, String> name;
    public static volatile SingularAttribute<Empleado, String> direccion;
    public static volatile SingularAttribute<Empleado, Long> pk;
    public static volatile SingularAttribute<Empleado, String> telefono;
    public static volatile SingularAttribute<Empleado, Rol> rol;
    public static volatile SingularAttribute<Empleado, String> contraseña;

}