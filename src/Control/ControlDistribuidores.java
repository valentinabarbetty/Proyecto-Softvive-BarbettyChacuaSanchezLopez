
package Control;

import DAO.DistribuidorDAO;
import DAO.PlantaDAO;
import Modelo.Distribuidor;
import Modelo.Planta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlDistribuidores {

    private DistribuidorDAO distribuidorDAO;
    //llama metodo del DAO consultas -create

    public ControlDistribuidores() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BruzonViveroPU");
        this.distribuidorDAO = new DistribuidorDAO(emf);
    }
//
//    public void agregarDistribuidores(Distribuidor d) {
//        distribuidorDAO.agregarDistribuidores(d);
//    }
//
//    public ArrayList<Distribuidor> getListaDistribuidores() {
//        return distribuidorDAO.getListaDistribuidores();
//    }

//    public void agregarPlantas(Planta p){
//        plantasDAO.agregarPlanta(p);
//    }
//    public ArrayList<Planta> getListaPlantas() {
//        return plantasDAO.getListaPlantas();
//    }
//            
    public void agregarDistribuidor(Distribuidor d) throws Exception {
        if (distribuidorDAO.findDistribuidorEntities().contains(d)) {
            throw new Exception("Distribuidor ya ingresada");
        }
        distribuidorDAO.create(d);
    }

    public void actualizarDistribuidores(Distribuidor distribuidor)throws Exception {
         distribuidorDAO.edit(distribuidor);
       
    }
    public Distribuidor buscarDistribuidor(String nombre) throws Exception {
        return distribuidorDAO.buscarDistribuidorConsulta(nombre);
    }

    public List<Distribuidor> getListaDistribuidores() {
        return distribuidorDAO.findDistribuidorEntities();
    }
}
