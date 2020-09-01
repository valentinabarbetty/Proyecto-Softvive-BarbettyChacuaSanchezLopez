package UI;

import Control.ControlEmpleados;
import Modelo.Empleado;
import Modelo.Rol;
import Modelo.Vivero;
import Resources.fondoDesktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViveroUI extends javax.swing.JFrame {

    private Vivero vivero;

    public ViveroUI(Vivero vivero) {
        initComponents();

        this.vivero = vivero;

        desktop.setBorder(new fondoDesktop());
        this.setExtendedState(ViveroUI.MAXIMIZED_BOTH);

        this.setLocationRelativeTo(null);

        this.agregarDistrim.setVisible(false);
        this.agregarIngresomn.setVisible(false);
        this.agregarPlantasm.setVisible(false);
        this.agregarSiemmn.setVisible(false);
        this.agregarEmpleado.setVisible(false);

        this.verDistrim.setVisible(false);
        this.verIngresosmn.setVisible(false);
        this.verInsumos.setVisible(false);
        this.verPlantasm.setVisible(false);
        this.verSeguimim.setVisible(false);
        this.editPreciomn.setVisible(false);

        this.rmpmn.setVisible(false);
        this.editarInsumos.setVisible(false);
        /////////////////////////////7
        this.agregarSiemmn.addActionListener(new AgregarSiembraListener());
        this.salirm.addActionListener(new SalirListener());
        this.verSeguimim.addActionListener(new VerSiembrasListener());
        this.rmpmn.addActionListener(new RegistrarMuertesListener());
        this.agregarEmpleado.addActionListener(new agregarEmpleadoListener());
        /////////////////////////////7

        //
        this.agregarIngresomn.addActionListener(new AgregarIngresosListener());
        this.verIngresosmn.addActionListener(new VerIngresosListener());

        //
        this.agregarPlantasm.addActionListener(new PlantasListener());
        this.verPlantasm.addActionListener(new VerPlantasListener());
        this.editPreciomn.addActionListener(new EditPrecioListener());
        this.agregarDistrim.addActionListener(new AgregarDistribuidoresListener());

        this.verDistrim.addActionListener(new VerDistribuidoresListener());
        ///////////////////////////////////////////////////////////////
        this.verInsumos.addActionListener(new VerInventarioInsumosListener());
        this.verPedidos.addActionListener(new VerPedidosListener());
        this.editarInsumos.addActionListener(new InventarioInsumosListener());

        this.AccesoEmpleado.addActionListener(new loginEmpleados());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        InicioSesion = new javax.swing.JMenu();
        AccesoEmpleado = new javax.swing.JMenuItem();
        jmPlantas = new javax.swing.JMenu();
        agregarPlantasm = new javax.swing.JMenuItem();
        verPlantasm = new javax.swing.JMenuItem();
        editPreciomn = new javax.swing.JMenuItem();
        jmDistribuidores = new javax.swing.JMenu();
        agregarDistrim = new javax.swing.JMenuItem();
        verDistrim = new javax.swing.JMenuItem();
        jmInventario = new javax.swing.JMenu();
        editarInsumos = new javax.swing.JMenuItem();
        verInsumos = new javax.swing.JMenuItem();
        verPedidos = new javax.swing.JMenuItem();
        jmSiembraSeguimiento = new javax.swing.JMenu();
        agregarSiemmn = new javax.swing.JMenuItem();
        verSeguimim = new javax.swing.JMenuItem();
        rmpmn = new javax.swing.JMenuItem();
        jmIngresos = new javax.swing.JMenu();
        agregarIngresomn = new javax.swing.JMenuItem();
        verIngresosmn = new javax.swing.JMenuItem();
        jmRegistrarEmpleados = new javax.swing.JMenu();
        agregarEmpleado = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        salirm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Vivero Bruzón");

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1247, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        InicioSesion.setText("Inicio sesión");

        AccesoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/inicio.jpg"))); // NOI18N
        AccesoEmpleado.setText("Acceso Empleados");
        InicioSesion.add(AccesoEmpleado);

        jMenuBar1.add(InicioSesion);

        jmPlantas.setText("Administrar Plantas");

        agregarPlantasm.setText("Agregar Planta");
        jmPlantas.add(agregarPlantasm);

        verPlantasm.setText("Ver Plantas");
        jmPlantas.add(verPlantasm);

        editPreciomn.setText("Editar Precio de planta");
        jmPlantas.add(editPreciomn);

        jMenuBar1.add(jmPlantas);

        jmDistribuidores.setText("Administrar Distribuidores");

        agregarDistrim.setText("Agregar Distribuidor");
        jmDistribuidores.add(agregarDistrim);

        verDistrim.setText("Ver Distribuidores");
        jmDistribuidores.add(verDistrim);

        jMenuBar1.add(jmDistribuidores);

        jmInventario.setText("Administrar Inventario Insumos");

        editarInsumos.setText("Editar inventario Insumos");
        jmInventario.add(editarInsumos);

        verInsumos.setText("Ver inventario insumos");
        jmInventario.add(verInsumos);

        verPedidos.setText("Ver pedidos");
        verPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPedidosActionPerformed(evt);
            }
        });
        jmInventario.add(verPedidos);

        jMenuBar1.add(jmInventario);

        jmSiembraSeguimiento.setText("Administrar Siembra y Seguimiento");

        agregarSiemmn.setText("Agregar Siembra");
        jmSiembraSeguimiento.add(agregarSiemmn);

        verSeguimim.setText("Visualizar Seguimiento de Plantas");
        jmSiembraSeguimiento.add(verSeguimim);

        rmpmn.setText("Registrar muerte de planta");
        jmSiembraSeguimiento.add(rmpmn);

        jMenuBar1.add(jmSiembraSeguimiento);

        jmIngresos.setText("Administrar ingresos");

        agregarIngresomn.setText("Agregar ingreso");
        jmIngresos.add(agregarIngresomn);

        verIngresosmn.setText("Ver ingresos");
        jmIngresos.add(verIngresosmn);

        jMenuBar1.add(jmIngresos);

        jmRegistrarEmpleados.setText("Administrar Empleados");

        agregarEmpleado.setText("Registrar Empleado");
        jmRegistrarEmpleados.add(agregarEmpleado);

        jMenuBar1.add(jmRegistrarEmpleados);

        jmSalir.setText("Ayuda");

        salirm.setText("Salir");
        jmSalir.add(salirm);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verPedidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AccesoEmpleado;
    private javax.swing.JMenu InicioSesion;
    private javax.swing.JMenuItem agregarDistrim;
    private javax.swing.JMenuItem agregarEmpleado;
    private javax.swing.JMenuItem agregarIngresomn;
    private javax.swing.JMenuItem agregarPlantasm;
    private javax.swing.JMenuItem agregarSiemmn;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem editPreciomn;
    private javax.swing.JMenuItem editarInsumos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmDistribuidores;
    private javax.swing.JMenu jmIngresos;
    private javax.swing.JMenu jmInventario;
    private javax.swing.JMenu jmPlantas;
    private javax.swing.JMenu jmRegistrarEmpleados;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmSiembraSeguimiento;
    private javax.swing.JMenuItem rmpmn;
    private javax.swing.JMenuItem salirm;
    private javax.swing.JMenuItem verDistrim;
    private javax.swing.JMenuItem verIngresosmn;
    private javax.swing.JMenuItem verInsumos;
    private javax.swing.JMenuItem verPedidos;
    private javax.swing.JMenuItem verPlantasm;
    private javax.swing.JMenuItem verSeguimim;
    // End of variables declaration//GEN-END:variables
public class agregarEmpleadoListener implements ActionListener {

        private CrearUsuarioUI crearUsuarioUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (crearUsuarioUI == null) {
                crearUsuarioUI = new CrearUsuarioUI();
                desktop.add(crearUsuarioUI);
            }
            crearUsuarioUI.setVisible(true);
        }
    }
    public class PlantasListener implements ActionListener {

        private PlantasUI plantasUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (plantasUI == null) {
                plantasUI = new PlantasUI();
                desktop.add(plantasUI);
            }
            plantasUI.setVisible(true);
        }
    }

    public class VerPlantasListener implements ActionListener {

        private VerPlantasUI verPlantasUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (verPlantasUI == null) {
                verPlantasUI = new VerPlantasUI();
                desktop.add(verPlantasUI);
            }
            verPlantasUI.setVisible(true);
        }
    }
/////// DISTRIBUIDORES

    public class AgregarDistribuidoresListener implements ActionListener {

        private AgregarDistribuidoresUI agregarDistiDistribuidoresUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (agregarDistiDistribuidoresUI == null) {
                agregarDistiDistribuidoresUI = new AgregarDistribuidoresUI();
                desktop.add(agregarDistiDistribuidoresUI);
            }
            agregarDistiDistribuidoresUI.setVisible(true);
        }
    }

    public class VerDistribuidoresListener implements ActionListener {

        private VerDistribuidoresUI verDistribuidoresUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (verDistribuidoresUI == null) {
                verDistribuidoresUI = new VerDistribuidoresUI();
                desktop.add(verDistribuidoresUI);
            }
            verDistribuidoresUI.setVisible(true);
        }
    }

    public class EditPrecioListener implements ActionListener {

        private EditarPrecioPlantaUI editarPrecioPlantaUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (editarPrecioPlantaUI == null) {
                editarPrecioPlantaUI = new EditarPrecioPlantaUI();
                desktop.add(editarPrecioPlantaUI);
            }
            editarPrecioPlantaUI.setVisible(true);
        }
    }

    public class RegistrarMuertesListener implements ActionListener {

        private MuertePlantaUI muertePlantaUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (muertePlantaUI == null) {
                muertePlantaUI = new MuertePlantaUI();
                desktop.add(muertePlantaUI);
            }
            muertePlantaUI.setVisible(true);
        }
    }
/////////// SIEMBRA

    public class AgregarSiembraListener implements ActionListener {

        private AgregarSiembraUI agregarSiembraUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (agregarSiembraUI == null) {
                agregarSiembraUI = new AgregarSiembraUI();
                desktop.add(agregarSiembraUI);
            }
            agregarSiembraUI.setVisible(true);
        }
    }

    public class VerSiembrasListener implements ActionListener {

        private VerSeguimientoPlantasUI verSeguimientoPlantasUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (verSeguimientoPlantasUI == null) {
                verSeguimientoPlantasUI = new VerSeguimientoPlantasUI();
                desktop.add(verSeguimientoPlantasUI);
            }
            verSeguimientoPlantasUI.setVisible(true);
        }
    }

    public class SalirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    }
/////////// INGRESOS

    public class AgregarIngresosListener implements ActionListener {

        private IngresosUI ingresosUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (ingresosUI == null) {
                ingresosUI = new IngresosUI();
                desktop.add(ingresosUI);
            }
            ingresosUI.setVisible(true);
        }
    }

    public class VerIngresosListener implements ActionListener {

        private VerIngresos verIngresosUI;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (verIngresosUI == null) {
                try {
                    verIngresosUI = new VerIngresos();
                    desktop.add(verIngresosUI);
                } catch (Exception ex) {
                    Logger.getLogger(ViveroUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            verIngresosUI.setVisible(true);
        }
    }

    //           INSUMOS
    public class InventarioInsumosListener implements ActionListener {

        private InventarioInsumosUI inventarioInsumosUI;

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (inventarioInsumosUI == null) {
                inventarioInsumosUI = new InventarioInsumosUI();
                desktop.add(inventarioInsumosUI);
            }
            inventarioInsumosUI.setVisible(true);

        }

    }

    public class VerInventarioInsumosListener implements ActionListener {

        private VerInventarioInsumosUI VerInventarioInsumosUI;

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (VerInventarioInsumosUI == null) {
                VerInventarioInsumosUI = new VerInventarioInsumosUI();
                desktop.add(VerInventarioInsumosUI);
            }
            VerInventarioInsumosUI.setVisible(true);

        }

    }
    
     public class VerPedidosListener implements ActionListener {
  
        private VerPedidosUI VerPedidosUI;

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (VerPedidosUI == null) {
                VerPedidosUI = new VerPedidosUI();
                desktop.add(VerPedidosUI);
            }
            VerPedidosUI.setVisible(true);

        }
        

    }
/////// LOGIN

    public class loginEmpleados implements ActionListener {

        ControlEmpleados controlEmpleados = new ControlEmpleados();
        Empleado empleado;

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                LoginEmpleadosUI loginUI = new LoginEmpleadosUI();

                int opcion = JOptionPane.showConfirmDialog(ViveroUI.this, loginUI, "Login", JOptionPane.OK_CANCEL_OPTION);

                if (opcion == JOptionPane.CANCEL_OPTION) {
                    return;
                }

                if (opcion == JOptionPane.OK_OPTION) {

                    String cedula = loginUI.getCedula();
                    System.out.println("Cedula obtenida");
                    String contraseña = loginUI.getContraseña();
                    System.out.println("Contraseña obtenida");

                    if (controlEmpleados.AccesoEmpleado(cedula, contraseña) == true) {

                        System.out.println("Comparar para dar acceso");
                        JOptionPane.showMessageDialog(rootPane, " Sesión iniciada ");

                        for (Empleado empleado : controlEmpleados.getListaEmpleados()) {

                            System.out.println("Comparar rol");

                            if (empleado.getRol().GERENTE_PROPIETARIO == (Rol.GERENTE_PROPIETARIO)) {

                                agregarDistrim.setVisible(true);
                                agregarIngresomn.setVisible(true);
                                agregarPlantasm.setVisible(true);
                                agregarSiemmn.setVisible(true);
                                agregarEmpleado.setVisible(true);

                                verDistrim.setVisible(true);
                                verIngresosmn.setVisible(true);
                                verInsumos.setVisible(true);
                                verPlantasm.setVisible(true);
                                verSeguimim.setVisible(true);
                                editPreciomn.setVisible(true);
                                editarInsumos.setVisible(true);

                            }
                            if (empleado.getRol().TRABAJADOR == (Rol.TRABAJADOR)) {

//                                agregarDistrim.setVisible(false);
//                                agregarPlantasm.setVisible(false);
                                agregarSiemmn.setVisible(true);
//                                editPreciomn.setVisible(false);
                                verDistrim.setVisible(true);
//                                verIngresosmn.setVisible(false);
                                verInsumos.setVisible(true);
                                verPlantasm.setVisible(true);
                                verSeguimim.setVisible(true);
                                rmpmn.setVisible(true);
                                editarInsumos.setVisible(true);
//                                agregarEmpleado.setVisible(false);

                            }
                            if (empleado.getRol().TRANSPORTISTA == (Rol.TRANSPORTISTA)) {

                                verDistrim.setVisible(true);
//                                agregarDistrim.setVisible(false);
//                                agregarPlantasm.setVisible(false);
//                                agregarSiemmn.setVisible(false);
//                                editPreciomn.setVisible(false);
//                                verIngresosmn.setVisible(false);
//                                verInsumos.setVisible(false);
//                                verPlantasm.setVisible(false);
//                                verSeguimim.setVisible(false);
//                                rmpmn.setVisible(false);
//                                editarInsumos.setVisible(false);
//                                agregarIngresomn.setVisible(false);
//                                agregarEmpleado.setVisible(false);

                            }

                        }

                    }
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error : NULL " + ex);
                Logger.getLogger(ViveroUI.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

}
