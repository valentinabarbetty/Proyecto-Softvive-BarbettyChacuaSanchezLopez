package Control;

import DAO.Detalle_GastoDAO;
import Modelo.Detalle_Gasto;
import Modelo.Insumo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlDetalleGasto {

    private Detalle_GastoDAO detalleGastoDAO;
    private List<Detalle_Gasto> listaDetalleGasto;

    public ControlDetalleGasto() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BruzonViveroPU");
        this.detalleGastoDAO = new Detalle_GastoDAO(emf);
        this.listaDetalleGasto = new ArrayList<>();
    }

    public void agregarDetalleGasto(Detalle_Gasto detalleGasto) {
        detalleGastoDAO.create(detalleGasto);
    }

    public List<Detalle_Gasto> getListaGastos() {
        return detalleGastoDAO.findDetalle_GastoEntities();
    }

    public void ActualizarDetalleGasto(Detalle_Gasto dt) throws Exception {
        detalleGastoDAO.edit(dt);
    }

}
