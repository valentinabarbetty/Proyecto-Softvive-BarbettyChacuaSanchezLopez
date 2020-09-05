package Control;

import DAO.EmpleadoDAO;
import Modelo.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlEmpleados {

    private EmpleadoDAO empleadoDAO;
    private List<Empleado> listaEmpleados;

    public ControlEmpleados() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");

        this.empleadoDAO = new EmpleadoDAO(emf);
        this.listaEmpleados = new ArrayList<>();

    }

    public void agregarEmpleado(Empleado empleado) throws Exception {

        if (empleadoDAO.findEmpleadoEntities().contains(empleado)) {
            throw new Exception("El empleado" + empleado.getCedula() + "Ya se encuentra en el aplicativo");
        }

        empleadoDAO.create(empleado);

    }

    public List<Empleado> getListaEmpleados() {
        return empleadoDAO.findEmpleadoEntities();
    }

    public boolean AccesoEmpleado(String cedula, String contraseña) throws Exception {
        return empleadoDAO.registroEmpleadoConsulta(cedula, contraseña);
    }

    public Empleado buscarContraseña(String contraseña) throws Exception {
        return empleadoDAO.buscarContraseñaConsulta(contraseña);
    }

    public Empleado buscarEmpleado(String cedula) throws Exception {
        if (empleadoDAO.buscarEmpleadoConsulta(cedula) != null) {
            return empleadoDAO.buscarEmpleadoConsulta(cedula);
        }
        throw new Exception("Empleado no encontrado");
    }

    public void actualizarEmpleado(Empleado empleado) throws Exception {
        empleadoDAO.edit(empleado);
    }
}
