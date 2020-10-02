package Control;

import DAO.SiembraDAO;
import Modelo.Siembra;
//import Modelo.Siembramala;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlSiembra {

    private SiembraDAO siembraDAO;
    private List<Siembra> listaSiembras;
    //llama metodo del DAO consultas -create

    public ControlSiembra() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.siembraDAO = new SiembraDAO(emf);
        //this.listaSiembras = siembraDAO.findSiembraEntities();
    }

    public void agregarSiembra(Siembra s) throws Exception {
        if (siembraDAO.findSiembraEntities().contains(s)) {
            throw new Exception("Siembra ya ingresada");
        }
        siembraDAO.create(s);
    }

    public List<Siembra> getListaSiembras() {
        return siembraDAO.findSiembraEntities();
    }

    public void eliminar(int row) {
        listaSiembras = siembraDAO.findSiembraEntities();
        listaSiembras.remove(row);

    }

    public void actualizarSiembra(Siembra siembra) throws Exception {
        siembraDAO.edit(siembra);
    }
     public Siembra buscarSiembra(long pk) throws Exception {
        return siembraDAO.buscarSiembraPorCodigo(pk);
    }

}
