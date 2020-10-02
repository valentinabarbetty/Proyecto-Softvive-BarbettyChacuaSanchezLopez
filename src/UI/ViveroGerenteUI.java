package UI;

import Control.ControlEmpleados;
import Modelo.Empleado;
import Modelo.Rol;
import Modelo.Vivero;
import Resources.fondoDesktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViveroGerenteUI extends javax.swing.JFrame {

    private Vivero vivero;
    private PlantasUI plantasUI;
    private Empleado empleado;

    public ViveroGerenteUI(Vivero vivero) {
        initComponents();

        this.vivero = vivero;

        this.setResizable(false);
        desktop.setBorder(new fondoDesktop());
        // this.setExtendedState(ViveroGerenteUI.MAXIMIZED_BOTH);
        this.bienvenido.addMouseListener(new clickCerrarSesion());
        this.cerrarSesion.addMouseListener(new clickCerrarSesion());
        this.cerrarSes.addMouseListener(new clickCerrarSesion());
        this.setLocationRelativeTo(null);

        this.plantas.addMouseListener(new clickPlantasListener());
        this.plantas1.addMouseListener(new clickPlantasListener());
        this.distri.addMouseListener(new clickDistribuidoresListener());
        this.distri1.addMouseListener(new clickDistribuidoresListener());
        this.Pedidos.addMouseListener(new clickPedidosListener());
        this.Pedidos1.addMouseListener(new clickPedidosListener());
        this.Usuarios.addMouseListener(new clickUsuariosListener());
        this.Usuarios1.addMouseListener(new clickUsuariosListener());
        this.Siembras.addMouseListener(new clickSiembrasListener());
        this.Siembras1.addMouseListener(new clickSiembrasListener());
        this.Insumos.addMouseListener(new clickInsumosListener());
        this.Insumos1.addMouseListener(new clickInsumosListener());
        this.Ingresos.addMouseListener(new clickIngresosListener());
        this.Ingresos1.addMouseListener(new clickIngresosListener());
        this.Herramientas.addMouseListener(new clickHerramientasListener());
        this.Herramientas1.addMouseListener(new clickHerramientasListener());
        this.Inventario.addMouseListener(new clickInventarioListener());
        this.Inventario1.addMouseListener(new clickInventarioListener());
        this.empleado = new Empleado();
        this.plantasUI = new PlantasUI();

//
//        this.AccesoEmpleado.addActionListener(new loginEmpleados());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        plantas = new javax.swing.JLabel();
        plantas1 = new javax.swing.JLabel();
        distri = new javax.swing.JLabel();
        distri1 = new javax.swing.JLabel();
        Insumos1 = new javax.swing.JLabel();
        Insumos = new javax.swing.JLabel();
        Siembras = new javax.swing.JLabel();
        Pedidos1 = new javax.swing.JLabel();
        Pedidos = new javax.swing.JLabel();
        Siembras1 = new javax.swing.JLabel();
        Usuarios = new javax.swing.JLabel();
        Usuarios1 = new javax.swing.JLabel();
        Ingresos = new javax.swing.JLabel();
        Ingresos1 = new javax.swing.JLabel();
        Herramientas = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        Inventario1 = new javax.swing.JLabel();
        Inventario = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JLabel();
        Herramientas1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cerrarSes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Vivero Bruzón");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        plantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plantas_1.png"))); // NOI18N

        plantas1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        plantas1.setForeground(new java.awt.Color(153, 153, 153));
        plantas1.setText("Plantas");

        distri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/distribuidores.png"))); // NOI18N

        distri1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        distri1.setForeground(new java.awt.Color(153, 153, 153));
        distri1.setText("Distribuidores");

        Insumos1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Insumos1.setForeground(new java.awt.Color(153, 153, 153));
        Insumos1.setText("Insumos");

        Insumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/insumos.png"))); // NOI18N

        Siembras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/siembras.png"))); // NOI18N

        Pedidos1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Pedidos1.setForeground(new java.awt.Color(153, 153, 153));
        Pedidos1.setText("Pedidos");

        Pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pedidos.png"))); // NOI18N

        Siembras1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Siembras1.setForeground(new java.awt.Color(153, 153, 153));
        Siembras1.setText("Siembras");

        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/usersnew.png"))); // NOI18N

        Usuarios1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Usuarios1.setForeground(new java.awt.Color(153, 153, 153));
        Usuarios1.setText("Usuarios");

        Ingresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ingresos.png"))); // NOI18N

        Ingresos1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Ingresos1.setForeground(new java.awt.Color(153, 153, 153));
        Ingresos1.setText("Ingresos");

        Herramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/herramientas.png"))); // NOI18N

        bienvenido.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(153, 153, 153));

        Inventario1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Inventario1.setForeground(new java.awt.Color(153, 153, 153));
        Inventario1.setText("Inventario");

        Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/inventario.png"))); // NOI18N

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logout.png"))); // NOI18N

        Herramientas1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Herramientas1.setForeground(new java.awt.Color(153, 153, 153));
        Herramientas1.setText("Herramientas");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/userlogin_2.png"))); // NOI18N

        cerrarSes.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cerrarSes.setForeground(new java.awt.Color(153, 153, 153));
        cerrarSes.setText("Cerrar Sesión");

        desktop.setLayer(plantas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(plantas1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(distri, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(distri1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Insumos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Insumos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Siembras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Pedidos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Pedidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Siembras1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Usuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Usuarios1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Ingresos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Ingresos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Herramientas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(bienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Inventario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Inventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(cerrarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(Herramientas1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(cerrarSes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, desktopLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plantas)
                            .addComponent(plantas1))
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(desktopLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(distri, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(desktopLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(distri1)))))
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(desktopLayout.createSequentialGroup()
                                .addComponent(Pedidos1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Usuarios1))
                            .addGroup(desktopLayout.createSequentialGroup()
                                .addComponent(Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Siembras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Siembras1))
                        .addGap(86, 86, 86)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Insumos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Insumos1))
                        .addGap(86, 86, 86)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ingresos1)
                            .addComponent(Ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(desktopLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(Herramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Herramientas1)
                                .addGap(57, 57, 57)
                                .addComponent(Inventario1))))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSesion)
                        .addGap(6, 6, 6)
                        .addComponent(cerrarSes)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bienvenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cerrarSes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plantas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distri, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Siembras, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insumos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Herramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plantas1)
                    .addComponent(distri1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pedidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Siembras1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insumos1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingresos1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(420, Short.MAX_VALUE))
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verPedidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Herramientas;
    private javax.swing.JLabel Herramientas1;
    private javax.swing.JLabel Ingresos;
    private javax.swing.JLabel Ingresos1;
    private javax.swing.JLabel Insumos;
    private javax.swing.JLabel Insumos1;
    private javax.swing.JLabel Inventario;
    private javax.swing.JLabel Inventario1;
    private javax.swing.JLabel Pedidos;
    private javax.swing.JLabel Pedidos1;
    private javax.swing.JLabel Siembras;
    private javax.swing.JLabel Siembras1;
    private javax.swing.JLabel Usuarios;
    private javax.swing.JLabel Usuarios1;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel cerrarSes;
    private javax.swing.JLabel cerrarSesion;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel distri;
    private javax.swing.JLabel distri1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel plantas;
    private javax.swing.JLabel plantas1;
    // End of variables declaration//GEN-END:variables
      public JDesktopPane desktop() {
        return this.desktop;
    }

    public class clickPlantasListener implements MouseListener {

        private PlantasUI plantasUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (plantasUI == null) {
                plantasUI = new PlantasUI();
//                desktop.add(plantasUI);
            }
            plantasUI.setVisible(true);
            //setVisible(false);
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

    public class clickInventarioListener implements MouseListener {

        private InventarioUI inventarioUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (inventarioUI == null) {
                inventarioUI = new InventarioUI();
//                desktop.add(plantasUI);
            }
            inventarioUI.setVisible(true);
            //setVisible(false);
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

    public class clickHerramientasListener implements MouseListener {

        private HerramientasUI herramientasUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (herramientasUI == null) {
                herramientasUI = new HerramientasUI();
//                desktop.add(plantasUI);
            }
            herramientasUI.setVisible(true);
            //setVisible(false);
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

    public class clickIngresosListener implements MouseListener {

        private IngresosUI ingresosUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (ingresosUI == null) {
                ingresosUI = new IngresosUI();
//                desktop.add(plantasUI);
            }
            ingresosUI.setVisible(true);
            //setVisible(false);
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

    public class clickInsumosListener implements MouseListener {

        private InsumosUI insumosUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (insumosUI == null) {
                insumosUI = new InsumosUI();
//                desktop.add(plantasUI);
            }
            insumosUI.setVisible(true);
            //setVisible(false);
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
                // desktop.add(distribuidoresUI);
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

    public class clickPedidosListener implements MouseListener {

        private PedidosUI pedidosUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (pedidosUI == null) {
                pedidosUI = new PedidosUI();
                // desktop.add(pedidosUI);
            }
            pedidosUI.setVisible(true);

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

    public class clickUsuariosListener implements MouseListener {

        private UsuariosUI usuariosUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (usuariosUI == null) {
                usuariosUI = new UsuariosUI();
                // desktop.add(pedidosUI);
            }
            usuariosUI.setVisible(true);

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

    public void privilegioTrabajador() {

        plantas.setVisible(true);
        plantas1.setVisible(true);
        Insumos.setVisible(true);
        Insumos1.setVisible(true);
        distri.setVisible(false);
        distri1.setVisible(false);
    }

    public void privilegioTransportador() {

        plantas.setVisible(false);
        plantas1.setVisible(false);
        Insumos.setVisible(true);
        Insumos1.setVisible(true);
        distri.setVisible(true);
        distri1.setVisible(true);

    }

    public class loginEmpleados implements ActionListener {

        ControlEmpleados controlEmpleados = new ControlEmpleados();
        Empleado empleado;

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                LoginEmpleadosUI loginUI = new LoginEmpleadosUI();

                int opcion = JOptionPane.showConfirmDialog(ViveroGerenteUI.this, loginUI, "Login", JOptionPane.OK_CANCEL_OPTION);

                if (opcion == JOptionPane.CANCEL_OPTION) {
                    return;
                }

                if (opcion == JOptionPane.OK_OPTION) {

                    long cedula = loginUI.getCedula();
                    System.out.println("Cedula obtenida");
                    String contraseña = loginUI.getContraseña();
                    System.out.println("Contraseña obtenida");

                    if (controlEmpleados.AccesoEmpleado(cedula, contraseña) == true) {

                        System.out.println("Comparar para dar acceso");
                        JOptionPane.showMessageDialog(rootPane, " Sesión iniciada ");
                        Empleado e = controlEmpleados.buscarEmpleado(cedula);
                        for (Empleado empleado : controlEmpleados.getListaEmpleados()) {

                            System.out.println("Comparar rol");

                            if (empleado.getRol().GERENTE_PROPIETARIO == (Rol.GERENTE_PROPIETARIO)) {
                                plantas.setVisible(true);
                                plantas1.setVisible(true);
                                Insumos.setVisible(true);
                                Insumos1.setVisible(true);
                                distri.setVisible(true);
                                distri1.setVisible(true);

//                            
                            }
                            if (empleado.getRol().TRABAJADOR == (Rol.TRABAJADOR)) {
                                plantas.setVisible(true);
                                plantas1.setVisible(true);
                                Insumos.setVisible(true);
                                Insumos1.setVisible(true);
                                distri.setVisible(true);
                                distri1.setVisible(true);

//                         
                            }
                            if (empleado.getRol().TRANSPORTISTA == (Rol.TRANSPORTISTA)) {

                                plantas.setVisible(false);
                                plantas1.setVisible(false);
                                Insumos.setVisible(true);
                                Insumos1.setVisible(true);
                                distri.setVisible(true);
                                distri1.setVisible(true);
//                         
                            }

                        }

                    }
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error : NULL " + ex);
                Logger.getLogger(ViveroGerenteUI.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    public class clickCerrarSesion implements MouseListener {

        private Login loginUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            int opcion = JOptionPane.showConfirmDialog(ViveroGerenteUI.this, vivero, "¿Desea Salir del sistema?", JOptionPane.OK_CANCEL_OPTION);

            if (opcion == JOptionPane.CANCEL_OPTION) {
                return;
            }
            if (opcion == JOptionPane.OK_OPTION) {

                dispose();

            }

            try {

                if (loginUI == null) {

                    loginUI = new Login(vivero);
                }

                loginUI.setVisible(true);

            } catch (Exception ex) {
                Logger.getLogger(ViveroGerenteUI.class.getName()).log(Level.SEVERE, null, ex);
            }
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

    public class clickSiembrasListener implements MouseListener {

        private SiembrasUI siembrasUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (siembrasUI == null) {
                siembrasUI = new SiembrasUI();
                // desktop.add(distribuidoresUI);
            }
            siembrasUI.setVisible(true);

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

    public void setBienvenido(String bienvenido) {
        this.bienvenido.setText(bienvenido);
    }

}
