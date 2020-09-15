package Control;

import DAO.Detalle_Gasto_HerramientaDAO;
import Modelo.Detalle_Gasto_Herramienta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlDetalleGasto_Herramienta {

    private Detalle_Gasto_HerramientaDAO detalle_Gasto_HerramientaDAO;
    private List<Detalle_Gasto_Herramienta> listaDetalleGasto_Herramienta;

    public ControlDetalleGasto_Herramienta() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.detalle_Gasto_HerramientaDAO = new Detalle_Gasto_HerramientaDAO(emf);
        this.listaDetalleGasto_Herramienta = new ArrayList<>();
    }

    public void agregarDetalleGastoHerramienta(Detalle_Gasto_Herramienta detalleGasto_Herramientaasto) {
        detalle_Gasto_HerramientaDAO.create(detalleGasto_Herramientaasto);
    }

    public List<Detalle_Gasto_Herramienta> getListaGastosHerramientas() {
        return detalle_Gasto_HerramientaDAO.findDetalle_Gasto_HerramientaEntities();
    }

    public void ActualizarDetalleGastoHerramienta(Detalle_Gasto_Herramienta dt) throws Exception {

        detalle_Gasto_HerramientaDAO.edit(dt);

    }

}
