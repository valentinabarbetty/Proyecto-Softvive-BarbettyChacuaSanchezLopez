package Control;

import DAO.IngresoDAO;
import Modelo.Ingreso;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlIngresos {

    private IngresoDAO ingresoDAO;
    private ArrayList<Ingreso> listaIngresos;

    //llama metodo del DAO consultas -create
    public ControlIngresos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.ingresoDAO = new IngresoDAO(emf);
        this.listaIngresos = new ArrayList<>();
    }

    public void agregarIngresos(Ingreso i) throws Exception {
        if (ingresoDAO.findIngresoEntities().contains(i)) {
            throw new Exception("Planta ya ingresada");
        }
        ingresoDAO.create(i);
    }

    public Ingreso buscarIngresos(Long codigo) throws Exception {
        return ingresoDAO.findIngresoCodigo(codigo);
    }

    public List<Ingreso> getListaIngresos() {
        return ingresoDAO.findIngresoEntities();
    }

    public List<Ingreso> listaIngresosTodos() throws Exception {
        return ingresoDAO.buscarTodosIngresos();
    }

    public IngresoDAO getIngresosDAO() {
        return ingresoDAO;
    }

    public void setIngresosDAO(IngresoDAO ingresosDAO) {
        this.ingresoDAO = ingresosDAO;
    }

    public void eliminarIngreso(Ingreso listaIngresos) {
        this.listaIngresos.remove(listaIngresos);
    }

}
