package Control;

import DAO.PlantaDAO;
import Modelo.Planta;
import Modelo.Detalle_Gasto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlPlantas {

    private PlantaDAO plantaDAO;
    private ControlDetalleGasto detalleGasto;
    //llama metodo del DAO consultas -create

    public ControlPlantas() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BruzonViveroPU");
        this.plantaDAO = new PlantaDAO(emf);
    }

//    public void agregarPlantas(Planta p){
//        plantasDAO.agregarPlanta(p);
//    }
//    public ArrayList<Planta> getListaPlantas() {
//        return plantasDAO.getListaPlantas();
//    }
//            
    public void agregarDetelleGasto(Detalle_Gasto dg) {
        detalleGasto.agregarDetalleGasto(dg);
    }

    public void agregarPlanta(Planta p) throws Exception {
        if (plantaDAO.findPlantaEntities().contains(p)) {
            throw new Exception("Planta ya ingresada");
        }
        plantaDAO.create(p);
    }

    public Planta buscarPlanta(String codigo) throws Exception {
        return plantaDAO.buscarPlantaConsulta(codigo);
    }

    public List<Planta> getListaPlantas() {
        return plantaDAO.findPlantaEntities();
    }

    public void actualizarPlanta(Planta planta) throws Exception {
        plantaDAO.edit(planta);
    }
}
