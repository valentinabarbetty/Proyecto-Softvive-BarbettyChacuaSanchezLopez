package Control;

import DAO.HerramientaDAO;
import DAO.InsumoDAO;
import Modelo.Detalle_Gasto;
import Modelo.Herramienta;
import Modelo.Insumo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlHerramientas {

    private HerramientaDAO herramientaDAO;
    private List<Herramienta> listaHerramientas;

    public ControlHerramientas() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.herramientaDAO = new HerramientaDAO(emf);
        this.listaHerramientas = new ArrayList<>();
    }

    public void AgregarHerramienta(Herramienta herramienta) throws Exception {

        if (herramientaDAO.findHerramientaEntities().contains(herramienta)) {

            throw new Exception("Herramienta " + herramienta + " ya esta registrada");

        }
        herramientaDAO.create(herramienta);
    }

    public Herramienta buscarHerramienta(String nombre) throws Exception {
        if (herramientaDAO.BuscarHerramientaConsulta(nombre) != null) {
            return herramientaDAO.BuscarHerramientaConsulta(nombre);
        }

        throw new Exception(" Herramienta no encontrada");

    }

    public List<Herramienta> getListaheHerramientas() {
        return herramientaDAO.findHerramientaEntities();
    }

    public HerramientaDAO getHerramientaDAO() {
        return herramientaDAO;
    }

    public void setHerramientaDAO(HerramientaDAO ingresosDAO) {
        this.herramientaDAO = ingresosDAO;
    }
    
    public void ActualizarHerramienta(Herramienta h) throws Exception {
         this.herramientaDAO.edit(h);

    }

}
