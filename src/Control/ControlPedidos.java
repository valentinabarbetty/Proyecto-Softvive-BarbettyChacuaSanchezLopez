package Control;

import DAO.Detalle_PedidoDAO;
import DAO.PedidoDAO;
import Modelo.Detalle_Pedido;
import Modelo.Pedido;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class ControlPedidos implements Serializable {

    private PedidoDAO pedidoDAO;
    private Detalle_PedidoDAO detalle_PedidoDAO;
    private ControlDetallePedido controlDetallePedido;
    //llama metodo del DAO consultas -create

    public ControlPedidos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.pedidoDAO = new PedidoDAO(emf);
        this.detalle_PedidoDAO = new Detalle_PedidoDAO(emf);
        this.controlDetallePedido = new ControlDetallePedido();
    }

    public void agregarPedido(Pedido p) throws Exception {
        if (pedidoDAO.findPedidoEntities().contains(p)) {
            throw new Exception("Pedido ya ingresado");
        }
        pedidoDAO.create(p);
    }

    public Pedido buscarPedido(long codigo) throws Exception {
        return pedidoDAO.buscarPedidoPorCodigo(codigo);
    }

    public List<Pedido> getListaPedidos() {
        return pedidoDAO.findPedidoEntities();
    }

    public List<Detalle_Pedido> getListaDP() {
        return controlDetallePedido.getListaPedidos();
    }

    public void agregarDP(Detalle_Pedido dp) {
        List<Detalle_Pedido> detalles = new ArrayList<>();
        detalles.add(dp);
    }

    public void actualizarPedido(Pedido pedido) throws Exception {
        pedidoDAO.edit(pedido);
    }

}
