package Control;

import DAO.Detalle_PedidoDAO;
import Modelo.Detalle_Pedido;
import Modelo.Pedido;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlDetallePedido {

    private Detalle_PedidoDAO dpDAO;
    private Pedido pedido;
    private ArrayList<Detalle_Pedido> listaDetallePedido;
    //llama metodo del DAO consultas -create

    public ControlDetallePedido() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BruzonViveroPU");
        this.dpDAO = new Detalle_PedidoDAO(emf);
        this.listaDetallePedido = new ArrayList<>();
    }

    public void agregarDp(Detalle_Pedido dp) throws Exception {
        if (dpDAO.findDetalle_PedidoEntities().contains(dp)) {
            throw new Exception("El detalle pedido ya esta registrado");
        }
        dpDAO.create(dp);
    }

    public Detalle_Pedido buscarDetallePedido(Long codigo) throws Exception {
        return dpDAO.findDetalle_Pedido(codigo);
    }

    public List<Detalle_Pedido> getListaPedidos() {
        return dpDAO.findDetalle_PedidoEntities();
    }

    public void eliminarDetallePedido() {
        this.listaDetallePedido.removeAll(listaDetallePedido);
    }

    public void devolverDetallePedido(int seleccionar) {
        this.listaDetallePedido.remove(seleccionar);

    }
    
    public void actualizarPedido(Detalle_Pedido dp) {

        try {
            dpDAO.edit(dp);
        } catch (Exception ex) {
            Logger.getLogger(ControlDetallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
