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

public class ViveroTransportadorUI extends javax.swing.JFrame {

    private Vivero vivero;
    private PlantasUI plantasUI;
    private Empleado empleado;

    public ViveroTransportadorUI(Vivero vivero) {
        initComponents();

        this.vivero = vivero;

        this.setResizable(false);
        desktop.setBorder(new fondoDesktop());
        // this.setExtendedState(ViveroGerenteUI.MAXIMIZED_BOTH);

        this.setLocationRelativeTo(null);

//        pedidos.setVisible(false);
//        pedidos1.setVisible(false);
//        distri.setVisible(false);
//        distri1.setVisible(false);
        this.cerrarSes.addMouseListener(new clickCerrarSesion());
        this.cerrarSesion.addMouseListener(new clickCerrarSesion());
        this.distri.addMouseListener(new clickDistribuidoresListener());
        this.distri1.addMouseListener(new clickDistribuidoresListener());
        this.pedidos.addMouseListener(new clickPedidosListener());
        this.pedidos1.addMouseListener(new clickPedidosListener());
        this.empleado = new Empleado();
        this.plantasUI = new PlantasUI();

//
//        this.AccesoEmpleado.addActionListener(new loginEmpleados());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        distri = new javax.swing.JLabel();
        distri1 = new javax.swing.JLabel();
        pedidos1 = new javax.swing.JLabel();
        pedidos = new javax.swing.JLabel();
        cerrarSes = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Vivero Bruzón");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        distri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/distribuidores.png"))); // NOI18N

        distri1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        distri1.setForeground(new java.awt.Color(153, 153, 153));
        distri1.setText("Distribuidores");

        pedidos1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pedidos1.setForeground(new java.awt.Color(153, 153, 153));
        pedidos1.setText("Pedidos");

        pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pedidos.png"))); // NOI18N

        cerrarSes.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cerrarSes.setForeground(new java.awt.Color(153, 153, 153));
        cerrarSes.setText("Cerrar Sesión");

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logout.png"))); // NOI18N

        bienvenido.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/userlogin_2.png"))); // NOI18N

        desktop.setLayer(distri, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(distri1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(pedidos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(pedidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(cerrarSes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(cerrarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(bienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrarSes)
                .addGap(30, 30, 30))
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(distri, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(distri1))
                .addGap(86, 86, 86)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pedidos1)
                    .addComponent(pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1125, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarSes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bienvenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distri, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distri1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(445, Short.MAX_VALUE))
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verPedidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel cerrarSes;
    private javax.swing.JLabel cerrarSesion;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel distri;
    private javax.swing.JLabel distri1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pedidos;
    private javax.swing.JLabel pedidos1;
    // End of variables declaration//GEN-END:variables
      public JDesktopPane desktop() {
        return this.desktop;
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

    public void privilegioTrabajador() {

//        distri.setVisible(true);
//        distri1.setVisible(true);
    }

    public void privilegioTransportador() {

//        distri.setVisible(true);
//        distri1.setVisible(true);
    }

    public class loginEmpleados implements ActionListener {

        ControlEmpleados controlEmpleados = new ControlEmpleados();
        Empleado empleado;

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                LoginEmpleadosUI loginUI = new LoginEmpleadosUI();

                int opcion = JOptionPane.showConfirmDialog(ViveroTransportadorUI.this, loginUI, "Login", JOptionPane.OK_CANCEL_OPTION);

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

                        for (Empleado empleado : controlEmpleados.getListaEmpleados()) {

                            System.out.println("Comparar rol");

                            if (empleado.getRol().GERENTE_PROPIETARIO == (Rol.GERENTE_PROPIETARIO)) {

//                                distri.setVisible(true);
//                                distri1.setVisible(true);
//                            
                            }
                            if (empleado.getRol().TRABAJADOR == (Rol.TRABAJADOR)) {
//
//                                distri.setVisible(true);
//                                distri1.setVisible(true);

//                         
                            }
                            if (empleado.getRol().TRANSPORTISTA == (Rol.TRANSPORTISTA)) {

//                                distri.setVisible(true);
//                                distri1.setVisible(true);
//                         
                            }

                        }

                    }
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error : NULL " + ex);
                Logger.getLogger(ViveroTransportadorUI.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    public class CerrarSesion implements ActionListener {

        private Login loginUI;

        @Override
        public void actionPerformed(ActionEvent ae) {

            int opcion = JOptionPane.showConfirmDialog(ViveroTransportadorUI.this, vivero, "¿Desea Salir del sistema?", JOptionPane.OK_CANCEL_OPTION);

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
                Logger.getLogger(ViveroTransportadorUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class clickCerrarSesion implements MouseListener {

        private Login loginUI;

        @Override
        public void mouseClicked(MouseEvent e) {
            int opcion = JOptionPane.showConfirmDialog(ViveroTransportadorUI.this, vivero, "¿Desea Salir del sistema?", JOptionPane.OK_CANCEL_OPTION);

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

    public void setBienvenido(String bienvenido) {
        this.bienvenido.setText(bienvenido);
    }
}
