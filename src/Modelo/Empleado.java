package Modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.swing.JOptionPane;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
    @NamedQuery(name = "Empleado.buscarContraseñaConsulta", query = "SELECT e from Empleado e WHERE e.contraseña = :contraseña")
    ,
    @NamedQuery(name = "Empleado.buscarEmpleadoConsulta", query = "SELECT e from Empleado e WHERE e.cedula = :cedula")
    ,
    @NamedQuery(name = "Empleado.buscarRolConsulta", query = "SELECT e from Empleado e WHERE e.rol = :rol")
    ,
    @NamedQuery(name = "Empleado.registroEmpleadoConsulta", query = "SELECT e from Empleado e WHERE e.cedula = :cedula AND e.contraseña = :contraseña")

})

public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    private long cedula;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String contraseña;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private long telefono;
    @Enumerated(EnumType.STRING)
    private Rol rol;
    @Column(nullable = false)
    private String ciudad;
    @Enumerated(EnumType.STRING)
    private EstadoEmpleado estadoEmpleado;

    public Empleado() {
    }

    public Empleado(long cedula, String nombre, String contraseña, String direccion, long telefono, Rol rol, String ciudad, EstadoEmpleado estadoEmpleado) throws Exception {

        if (Long.toString(cedula).equals(null)) {
            throw new Exception("Debe ingresar el número de la cédula");
        }
        if (contraseña == null) {
            throw new Exception("Debe ingresar contraseña");
        }
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rol = rol;
        this.ciudad = ciudad;
        this.contraseña = contraseña;
        this.estadoEmpleado = estadoEmpleado;
    }

    public EstadoEmpleado getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(EstadoEmpleado estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cedula);
        hash = 97 * hash + Objects.hashCode(this.contraseña);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID: " + cedula + " " + "Nombre: " + nombre;
    }

}
