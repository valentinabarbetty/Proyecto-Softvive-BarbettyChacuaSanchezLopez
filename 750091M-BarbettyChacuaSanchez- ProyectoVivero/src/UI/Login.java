package UI;

import Control.ControlEmpleados;
import Modelo.Detalle_Pedido;
import Modelo.Empleado;
import Modelo.Vivero;
import Modelo.Rol;
import UI.ViveroUI;
import UI.PerfilEmpleadosUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {

    private Vivero vivero;

    private ViveroUI viveroUI;
    private Empleado empleado;
    private Rol rol;

    private ControlEmpleados controlEmpleados;

    public Login(Vivero vivero) {
        initComponents();

        this.vivero = vivero;
        this.empleado = empleado;
        this.rol = rol;
        this.viveroUI = viveroUI;

        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.controlEmpleados = new ControlEmpleados();

        btnAcceder.addActionListener(new LoginEmpleadosGeneral());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        cmpUsuario = new javax.swing.JTextField();
        cmpContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(null);

        banner.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        banner.setText("Acceda al Jardín Vivero Bruzón");
        jPanel1.add(banner);
        banner.setBounds(290, 240, 264, 46);
        jPanel1.add(cmpUsuario);
        cmpUsuario.setBounds(230, 330, 373, 29);
        jPanel1.add(cmpContraseña);
        cmpContraseña.setBounds(230, 410, 373, 32);

        btnAcceder.setText("Acceder");
        jPanel1.add(btnAcceder);
        btnAcceder.setBounds(350, 460, 140, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre de usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 300, 140, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 380, 130, 15);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/verde.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 220, 430, 290);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/viveroFondoLogin.jpeg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-4, -30, 690, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JPasswordField cmpContraseña;
    private javax.swing.JTextField cmpUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public String getCedula() {
        return cmpUsuario.getText();
    }

    public String getContraseña() {
        return new String(cmpContraseña.getPassword());
    }

    public JTextField getCampoTextoCodigo() {
        return this.cmpUsuario;
    }

    /////////////////////////////////////////////////////////////////////////////
    public class LoginEmpleadosGeneral implements ActionListener {

        private ViveroUI viveroUI;
        private PerfilEmpleadosUI perfilUI;

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                String cedula = cmpUsuario.getText();
                String contraseña = new String(cmpContraseña.getPassword());

                empleado = controlEmpleados.buscarEmpleado(cedula);

                if (controlEmpleados.AccesoEmpleado(cedula, contraseña) == true) {

//                    JOptionPane.showMessageDialog(rootPane, " Sesión iniciada ");
                    try {

                        if (viveroUI == null) {

                            viveroUI = new ViveroUI(vivero);
                        }

                        viveroUI.setVisible(true);

                        dispose();

                    } catch (Exception ex) {

                        JOptionPane.showMessageDialog(rootPane, "Error : El usuario o contraseña es incorrecto " + ex);
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try {

                        if (empleado.getRol().equals(rol.TRABAJADOR)) {

                            viveroUI.privilegioTrabajador();

                        }
                        if (empleado.getRol().equals(rol.TRANSPORTISTA)) {

                            viveroUI.privilegioTransportador();

                        }

                    } catch (Exception ex) {
                        Logger.getLogger(ViveroUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (perfilUI == null) {

                        try {
                            perfilUI = new PerfilEmpleadosUI(controlEmpleados.buscarEmpleado(cedula));
                            viveroUI.desktop().add(perfilUI);

                            perfilUI.setVisible(true);

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(rootPane, " - Error : No estás pasando nada de informacion");
                            Logger.getLogger(ViveroUI.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                    //////////////////////////////////////////////////////////////////////////////////////////////////777         
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(rootPane, "El usuario o contraseña son incorrectos " + ex);

                cmpUsuario.setText("");
                cmpContraseña.setText("");

                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////777
}
