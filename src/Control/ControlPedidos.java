package Control;

import DAO.PedidoDAO;
import Modelo.Pedido;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class ControlPedidos implements Serializable{

    private PedidoDAO pedidoDAO;
    //llama metodo del DAO consultas -create

    public ControlPedidos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.pedidoDAO = new PedidoDAO(emf);
    }

    public void agregarPlanta(Pedido p) throws Exception {
        if (pedidoDAO.findPedidoEntities().contains(p)) {
            throw new Exception("Planta ya ingresada");
        }
        pedidoDAO.create(p);
    }

    public Pedido buscarPedido(long codigo) throws Exception{
        return pedidoDAO.buscarPedidoPorCodigo(codigo);
    }

    public List<Pedido> getListaPedidos() {
        return pedidoDAO.findPedidoEntities();
    }

}
