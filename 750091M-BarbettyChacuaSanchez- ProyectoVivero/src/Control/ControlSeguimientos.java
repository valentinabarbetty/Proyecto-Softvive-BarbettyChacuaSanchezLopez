package Control;

import DAO.SeguimientoDAO;
import DAO.SiembraDAO;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlSeguimientos {

    private SeguimientoDAO seguimientoDAO;
    private SiembraDAO siembraDAO;

    //llama metodo del DAO consultas -create
    public ControlSeguimientos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BruzonViveroPU");
        this.seguimientoDAO = new SeguimientoDAO(emf);
        this.siembraDAO = new SiembraDAO(emf);
    }

}
