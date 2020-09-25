package Control;

import DAO.Detalle_GastoInsumoDAO;
import Modelo.Detalle_GastoInsumo;
import Modelo.Insumo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlDetalleInsumo {

    private Detalle_GastoInsumoDAO detalle_GastoInsumoDAO;
    private List<Detalle_GastoInsumo> listaDetalleGasto;

    public ControlDetalleInsumo() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.detalle_GastoInsumoDAO = new Detalle_GastoInsumoDAO(emf);
        this.listaDetalleGasto = new ArrayList<>();
    }

    public void agregarDetalleGasto(Detalle_GastoInsumo detalle_GastoInsumo) {
        detalle_GastoInsumoDAO.create(detalle_GastoInsumo);
    }

    public List<Detalle_GastoInsumo> getListaGastos() {
        return detalle_GastoInsumoDAO.findDetalle_GastoInsumoEntities();
    }

    public void ActualizarDetalleGasto(Detalle_GastoInsumo dt) throws Exception {

        detalle_GastoInsumoDAO.edit(dt);

    }

}
