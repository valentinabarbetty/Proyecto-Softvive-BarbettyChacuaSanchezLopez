package Control;

import DAO.Detalle_PedidoDAO;
import Modelo.Detalle_Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlDetallePedido {

    private Detalle_PedidoDAO dpDAO;
    private ArrayList<Detalle_Pedido> listaDetallePedido;
    //llama metodo del DAO consultas -create

    public ControlDetallePedido() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
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

}
