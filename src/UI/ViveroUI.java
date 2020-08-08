package UI;

import Control.ControlEmpleados;
import Modelo.Empleado;
import Modelo.Rol;
import Modelo.Vivero;
import java.awt.Color;
import Resources.fondoDesktop;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.tools.tree.ThisExpression;

public class ViveroUI extends javax.swing.JFrame {

    private Vivero vivero;

    public ViveroUI(Vivero vivero) {
        initComponents();
        desktop.setBorder(new fondoDesktop());
        this.vivero = vivero;
        this.setExtendedState(ViveroUI.MAXIMIZED_BOTH);

        this.setLocationRelativeTo(null);

//        this.GPlantas.setVisible(false);
//        this.gPJlabel.setVisible(false);
//       
        this.GPlantas.addMouseListener(new clickPlantasListener());
        this.gPJlabel.addMouseListener(new clickPlantasListener());
        this.distrib.addMouseListener(new clickDistribuidoresListener());
        this.distrib.addMouseListener(new clickDistribuidoresListener());
//        this.agregarDistrim.setVisible(false);
//        this.agregarIngresomn.setVisible(false);
//        this.agregarPlantasm.setVisible(false);
//        this.agregarSiemmn.setVisible(false);
//
//        this.verDistrim.setVisible(false);
//        this.verIngresosmn.setVisible(false);
//        this.verInsumos.setVisible(false);
//        this.verPlantasm.setVisible(false);
//        this.verSeguimim.setVisible(false);
//        this.editPreciomn.setVisible(false);
//
//        this.rmpmn.setVisible(false);
//        this.editarInsumos.setVisible(false);
//        /////////////////////////////7
//        this.agregarSiemmn.addActionListener(new AgregarSiembraListener());
//        this.salirm.addActionListener(new SalirListener());
//        this.verSeguimim.addActionListener(new VerSiembrasListener());
//        this.rmpmn.addActionListener(new RegistrarMuertesListener());
//        /////////////////////////////7
//
//        //
//        this.agregarIngresomn.addActionListener(new AgregarIngresosListener());
//        this.verIngresosmn.addActionListener(new VerIngresosListener());
//
//        //
//       // this.agregarPlantasm.addActionListener(new PlantasListener());
//        this.verPlantasm.addActionListener(new VerPlantasListener());
//        this.editPreciomn.addActionListener(new EditPrecioListener());
//        this.agregarDistrim.addActionListener(new AgregarDistribuidoresListener());
//
//        this.verDistrim.addActionListener(new VerDistribuidoresListener());
//        ///////////////////////////////////////////////////////////////
//        this.verInsumos.addActionListener(new VerInventarioInsumosListener());
//        this.editarInsumos.addActionListener(new InventarioInsumosListener());
        this.AccesoEmpleado.addActionListener(new loginEmpleados());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        GPlantas = new javax.swing.JLabel();
        gPJlabel = new javax.swing.JLabel();
        distrib = new javax.swing.JLabel();
        distribuidores = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        InicioSesion = new javax.swing.JMenu();
        AccesoEmpleado = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        salirm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Vivero Bruzón");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        GPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plantas.png"))); // NOI18N
        GPlantas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GPlantasMouseClicked(evt);
            }
        });

        gPJlabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        gPJlabel.setForeground(new java.awt.Color(153, 153, 153));
        gPJlabel.setText("Gestionar Plantas");

        distrib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/distri.png"))); // NOI18N

        distribuidores.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        distribuidores.setForeground(new java.awt.Color(153, 153, 153));
        distribuidores.setText("Gestionar Distribuidores");

        desktop.setLayer(GPlantas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(gPJlabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(distrib, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(distribuidores, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(GPlantas))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(gPJlabel)))
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(distribuidores))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(distrib, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distrib, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gPJlabel)
                    .addComponent(distribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1036, 540));

        InicioSesion.setText("Inicio sesión");

        AccesoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/inicio.jpg"))); // NOI18N
        AccesoEmpleado.setText("Acceso Empleados");
        InicioSesion.add(AccesoEmpleado);

        jMenuBar1.add(InicioSesion);

        jmSalir.setText("Ayuda");

        salirm.setText("Salir");
        jmSalir.add(salirm);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GPlantasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GPlantasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GPlantasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AccesoEmpleado;
    private javax.swing.JLabel GPlantas;
    private javax.swing.JMenu InicioSesion;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel distrib;
    private javax.swing.JLabel distribuidores;
    private javax.swing.JLabel gPJlabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem salirm;
    // End of variables declaration//GEN-END:variables

    public class clickPlantasListener implements MouseListener {

        private PlantasUI plantasUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (plantasUI == null) {
                plantasUI = new PlantasUI();
                desktop.add(plantasUI);
            }
            plantasUI.setVisible(true);

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }

    public class clickDistribuidoresListener implements MouseListener {

        private DistribuidoresUI distribuidoresUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (distribuidoresUI == null) {
                distribuidoresUI = new DistribuidoresUI();
                desktop.add(distribuidoresUI);
            }
            distribuidoresUI.setVisible(true);

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }
//    public class PlantasListener implements ActionListener {
//
//        private PlantasUI plantasUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (plantasUI == null) {
//                plantasUI = new PlantasUI();
//                desktop.add(plantasUI);
//            }
//            plantasUI.setVisible(true);
//        }
//    }

//    public class VerPlantasListener implements ActionListener {
//
//        private VerPlantasUI verPlantasUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (verPlantasUI == null) {
//                verPlantasUI = new VerPlantasUI();
//                desktop.add(verPlantasUI);
//            }
//            verPlantasUI.setVisible(true);
//        }
//    }
/////// DISTRIBUIDORES
//    public class AgregarDistribuidoresListener implements ActionListener {
//
//        private AgregarDistribuidoresUI agregarDistiDistribuidoresUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (agregarDistiDistribuidoresUI == null) {
//                agregarDistiDistribuidoresUI = new AgregarDistribuidoresUI();
//                desktop.add(agregarDistiDistribuidoresUI);
//            }
//            agregarDistiDistribuidoresUI.setVisible(true);
//        }
//    }
//    public class VerDistribuidoresListener implements ActionListener {
//
//        private VerDistribuidoresUI verDistribuidoresUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (verDistribuidoresUI == null) {
//                verDistribuidoresUI = new VerDistribuidoresUI();
//                desktop.add(verDistribuidoresUI);
//            }
//            verDistribuidoresUI.setVisible(true);
//        }
//    }
//
//    public class EditPrecioListener implements ActionListener {
//
//        private PlantaEditUI editarPrecioPlantaUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (editarPrecioPlantaUI == null) {
//                editarPrecioPlantaUI = new PlantaEditUI();
//                desktop.add(editarPrecioPlantaUI);
//            }
//            editarPrecioPlantaUI.setVisible(true);
//        }
//    }
//
//    public class RegistrarMuertesListener implements ActionListener {
//
//        private MuertePlantaUI muertePlantaUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (muertePlantaUI == null) {
//                muertePlantaUI = new MuertePlantaUI();
//                desktop.add(muertePlantaUI);
//            }
//            muertePlantaUI.setVisible(true);
//        }
//    }
///////////// SIEMBRA
//
//    public class AgregarSiembraListener implements ActionListener {
//
//        private AgregarSiembraUI agregarSiembraUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (agregarSiembraUI == null) {
//                agregarSiembraUI = new AgregarSiembraUI();
//                desktop.add(agregarSiembraUI);
//            }
//            agregarSiembraUI.setVisible(true);
//        }
//    }
//
//    public class VerSiembrasListener implements ActionListener {
//
//        private VerSeguimientoPlantasUI verSeguimientoPlantasUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (verSeguimientoPlantasUI == null) {
//                verSeguimientoPlantasUI = new VerSeguimientoPlantasUI();
//                desktop.add(verSeguimientoPlantasUI);
//            }
//            verSeguimientoPlantasUI.setVisible(true);
//        }
//    }
//    public class SalirListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.exit(0);
//        }
//
//    }
///////////// INGRESOS
//
//    public class AgregarIngresosListener implements ActionListener {
//
//        private IngresosUI ingresosUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (ingresosUI == null) {
//                ingresosUI = new IngresosUI();
//                desktop.add(ingresosUI);
//            }
//            ingresosUI.setVisible(true);
//        }
//    }
//
//    public class VerIngresosListener implements ActionListener {
//
//        private VerIngresos verIngresosUI;
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (verIngresosUI == null) {
//                try {
//                    verIngresosUI = new VerIngresos();
//                    desktop.add(verIngresosUI);
//                } catch (Exception ex) {
//                    Logger.getLogger(ViveroUI.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            verIngresosUI.setVisible(true);
//        }
//    }
//
//    //           INSUMOS
//    public class InventarioInsumosListener implements ActionListener {
//
//        private InventarioInsumosUI inventarioInsumosUI;
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            if (inventarioInsumosUI == null) {
//                inventarioInsumosUI = new InventarioInsumosUI();
//                desktop.add(inventarioInsumosUI);
//            }
//            inventarioInsumosUI.setVisible(true);
//
//        }
//
//    }
//
//    public class VerInventarioInsumosListener implements ActionListener {
//
//        private VerInventarioInsumosUI VerInventarioInsumosUI;
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            if (VerInventarioInsumosUI == null) {
//                VerInventarioInsumosUI = new VerInventarioInsumosUI();
//                desktop.add(VerInventarioInsumosUI);
//            }
//            VerInventarioInsumosUI.setVisible(true);
//
//        }
//
//    }
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
                                GPlantas.setVisible(true);
                                gPJlabel.setVisible(true);

//                                agregarDistrim.setVisible(true);
//                                agregarIngresomn.setVisible(true);
//                                agregarPlantasm.setVisible(true);
//                                agregarSiemmn.setVisible(true);
//
//                                verDistrim.setVisible(true);
//                                verIngresosmn.setVisible(true);
//                                verInsumos.setVisible(true);
//                                verPlantasm.setVisible(true);
//                                verSeguimim.setVisible(true);
//                                editPreciomn.setVisible(true);
//                                editarInsumos.setVisible(true);
                            }
                            if (empleado.getRol().TRABAJADOR == (Rol.TRABAJADOR)) {

//                                agregarDistrim.setVisible(false);
////                                agregarPlantasm.setVisible(false);
//                                agregarSiemmn.setVisible(true);
////                                editPreciomn.setVisible(false);
//                                verDistrim.setVisible(true);
////                                verIngresosmn.setVisible(false);
//                                verInsumos.setVisible(true);
//                                verPlantasm.setVisible(true);
//                                verSeguimim.setVisible(true);
//                                rmpmn.setVisible(true);
//                                editarInsumos.setVisible(true);
//                                agregarEmpleado.setVisible(false);
                            }
                            if (empleado.getRol().TRANSPORTISTA == (Rol.TRANSPORTISTA)) {

                                // verDistrim.setVisible(true);
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
