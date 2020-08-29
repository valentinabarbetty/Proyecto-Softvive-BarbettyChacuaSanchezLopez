package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
    @NamedQuery(name = "Distribuidor.buscarDistribuidorConsulta", query = "SELECT d from Distribuidor d WHERE d.nombre = :nombre")
})
public class Distribuidor implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    @Column(nullable = false)
    private long nit;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private long telefono;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String ciudad;

    public Distribuidor() {
    }

    public Distribuidor(long nit, String nombre, long telefono, String email, String direccion, String ciudad) throws Exception {
//        if (this.nit <= 0) {
//            throw new Exception("El NIT debe ser un valor válido");
//        }
        if (this.nombre.equals(null)) {
            throw new Exception("Debe ingresar un nombre");
        }
        if (this.telefono <= 0) {
            throw new Exception("El número de teléfono debe ser un valor válido");
        }
        if (this.email.equals(null)) {
            throw new Exception("El email no es válido");
        }
        if (this.direccion.equals(null)) {
            throw new Exception("La dirección no es válida");
        }
        if (this.ciudad.equals(null)) {
            throw new Exception("La ciudad no es válida");

        }
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public long getNit() {
        return nit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    @Override
    public String toString() {
        return nombre;
    }
}
