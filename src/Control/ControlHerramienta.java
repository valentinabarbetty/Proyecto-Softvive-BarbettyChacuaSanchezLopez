package Control;

import DAO.HerramientaDAO;
import Modelo.Detalle_Gasto;
import Modelo.Herramienta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlHerramienta {

    private HerramientaDAO herramientaDAO;
    private List<Herramienta> listaHerramientas;

    public ControlHerramienta() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPruebaPU");
        this.herramientaDAO = new HerramientaDAO(emf);
        this.listaHerramientas = new ArrayList<>();
    }

    public void AgregarHerramienta(Herramienta herramienta) throws Exception {

        if (herramientaDAO.findHerramientaEntities().contains(herramienta)) {

            throw new Exception("El herramienta " + herramienta + " ya esta registrado");

        }
        herramientaDAO.create(herramienta);
    }
//
    public Herramienta buscarHerramientaNom(String nombre) throws Exception {
        if (herramientaDAO.BuscarHerramientaConsulta1(nombre) != null) {
            return herramientaDAO.BuscarHerramientaConsulta1(nombre);
        }

        throw new Exception("Herramienta no encontrado");

    }
//    public Herramienta buscarHerramientaCod(Long cod) throws Exception {
//        if (herramientaDAO.BuscarHerramientaCodigo(cod) != null) {
//            return herramientaDAO.BuscarHerramientaCodigo(cod);
//        }
//
//        throw new Exception(" Herramienta no encontrado");
//
//    }

    public List<Herramienta> getListaHerramientas() {
        return herramientaDAO.findHerramientaEntities();
    }

    public HerramientaDAO getHerramientaDAO() {
        return herramientaDAO;
    }

    public void setHerramientaDAO(HerramientaDAO ingresosDAO) {
        this.herramientaDAO = ingresosDAO;
    }

}
