package Control;

import DAO.Detalle_GastoHerramientaDAO;
import Modelo.Detalle_GastoHerramienta;
import Modelo.Insumo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlDetalleHerramienta {

    private Detalle_GastoHerramientaDAO detalleGastoHerramientaDAO;
    private List<Detalle_GastoHerramienta> listaDetalleGastoHerramienta;

    public ControlDetalleHerramienta() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.detalleGastoHerramientaDAO = new Detalle_GastoHerramientaDAO(emf);
        this.listaDetalleGastoHerramienta = new ArrayList<>();
    }

    public void agregarDetalleGastoHerramienta(Detalle_GastoHerramienta detalleGastoHerramienta) {
        detalleGastoHerramientaDAO.create(detalleGastoHerramienta);
    }

    public List<Detalle_GastoHerramienta> getListaGastos() {
        return detalleGastoHerramientaDAO.findDetalle_GastoHerramientaEntities();
    }

    public void ActualizarDetalleGastoHerramienta(Detalle_GastoHerramienta dt) throws Exception {
        detalleGastoHerramientaDAO.edit(dt);
    }

}
