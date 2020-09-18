package Control;

import DAO.InsumoDAO;
import Modelo.Detalle_Gasto;
import Modelo.Insumo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlInsumos {

    private InsumoDAO insumoDAO;
    private List<Insumo> listaInsumos;

    public ControlInsumos() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BruzonViveroPU");
        this.insumoDAO = new InsumoDAO(emf);
        this.listaInsumos = new ArrayList<>();
    }

    public void AgregarInsumo(Insumo insumo) throws Exception {

        if (insumoDAO.findInsumoEntities().contains(insumo)) {

            throw new Exception("El insumo " + insumo + " ya esta registrado");

        }
        insumoDAO.create(insumo);
    }

    public Insumo buscarInsumo(String nombre) throws Exception {
        if (insumoDAO.BuscarInsumoConsulta1(nombre) != null) {
            return insumoDAO.BuscarInsumoConsulta1(nombre);
        }

        throw new Exception(" Insumo no encontrado");

    }

    public List<Insumo> getListaInsumos() {
        return insumoDAO.findInsumoEntities();
    }

    public InsumoDAO getInsumoDAO() {
        return insumoDAO;
    }

    public void setInsumoDAO(InsumoDAO ingresosDAO) {
        this.insumoDAO = ingresosDAO;
    }

}
