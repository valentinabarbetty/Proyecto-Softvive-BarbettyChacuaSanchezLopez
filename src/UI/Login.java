package UI;

import Control.ControlEmpleados;
import Modelo.Detalle_Pedido;
import Modelo.Empleado;
import Modelo.EstadoEmpleado;
import Modelo.Vivero;
import Modelo.Rol;
import UI.ViveroGerenteUI;
import UI.PerfilEmpleadosUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {

    private Vivero vivero;

    private ViveroGerenteUI viveroGerenteUI;
    private ViveroTrabajadorUI viveroTrabajadorUI;
    private ViveroTransportadorUI viveroTransportadorUI;
    private Empleado empleado;
    private Empleado gerente;
    private Rol rol;
    private PlantasUI plantasUI;

    private ControlEmpleados controlEmpleados;

    public Login(Vivero vivero) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Resources/planticon.png")).getImage());
        this.vivero = vivero;
        this.empleado = empleado;
        this.rol = rol;
        this.viveroGerenteUI = new ViveroGerenteUI(vivero);
        this.viveroTrabajadorUI = new ViveroTrabajadorUI(vivero);
        this.viveroTransportadorUI = new ViveroTransportadorUI(vivero);
        this.plantasUI = new PlantasUI();
//        try {
//            gerente = new Empleado(12345, "Jeon Jungkook", "11111", "Calle 76", 2584999, Rol.GERENTE_PROPIETARIO, "Palmira");
//            controlEmpleados.agregarEmpleado(gerente);
//        } catch (Exception ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }

        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.controlEmpleados = new ControlEmpleados();

        btnAcceder.addActionListener(new LoginEmpleadosGeneral());
        cmpContraseña.addActionListener(new LoginEmpleadosGeneral());
        TextPrompt cedula = new TextPrompt("Cédula", cmpUsuario);
        TextPrompt contraseña = new TextPrompt("Contraseña", cmpContraseña);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcceder1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmpUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmpContraseña = new javax.swing.JPasswordField();
        banner = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        btnAcceder1.setBackground(new java.awt.Color(255, 255, 255));
        btnAcceder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/acceder.png"))); // NOI18N
        btnAcceder1.setBorder(null);
        btnAcceder1.setBorderPainted(false);
        btnAcceder1.setContentAreaFilled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/userlogin_1.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/password_1.jpg"))); // NOI18N

        banner.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        banner.setText("Login");

        btnAcceder.setBackground(new java.awt.Color(255, 255, 255));
        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/acceder.png"))); // NOI18N
        btnAcceder.setBorder(null);
        btnAcceder.setBorderPainted(false);
        btnAcceder.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnAcceder)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addComponent(btnAcceder)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(180, 230, 460, 260);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/viveroFondoLogin.jpeg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 690, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnAcceder1;
    private javax.swing.JPasswordField cmpContraseña;
    private javax.swing.JTextField cmpUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public long getCedula() {
        return Long.parseLong(cmpUsuario.getText());
    }

    public String getContraseña() {
        return new String(cmpContraseña.getPassword());
    }

    public JTextField getCampoTextoCodigo() {
        return this.cmpUsuario;
    }

    public class LoginEmpleadosGeneral implements ActionListener {
//
//        private ViveroTrabajadorUI viveroTrabajadorUI;
//        private ViveroTransportadorUI viveroTransportadorUI;
//        private ViveroGerenteUI viveroGerenteUI;

        private PerfilEmpleadosUI perfilUI;

        @Override
        public void actionPerformed(ActionEvent ae) {
            long cedula = Long.parseLong(cmpUsuario.getText());
            String contraseña = new String(cmpContraseña.getPassword());
            try {

                empleado = controlEmpleados.buscarEmpleado(cedula);

                if ((controlEmpleados.AccesoEmpleado(cedula, contraseña) == true) && (empleado.getRol().equals(Rol.TRABAJADOR)) && (empleado.getEstadoEmpleado().equals(EstadoEmpleado.ACTIVO))) {

//                    JOptionPane.showMessageDialog(rootPane, " Sesión iniciada ");
                    try {

                        if (viveroTrabajadorUI == null) {

                            viveroTrabajadorUI = new ViveroTrabajadorUI(vivero);
                        }

                        viveroTrabajadorUI.setVisible(true);
                        viveroTrabajadorUI.setVisible(true);
                        viveroTrabajadorUI.setBienvenido("Bienvenido" + " " + empleado.getNombre());

                        dispose();
                    } catch (Exception ex) {

                        JOptionPane.showMessageDialog(rootPane, "Error : El usuario o contraseña es incorrecto " + ex);
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }

//                    try {
//
//                        if (empleado.getRol().equals(rol.TRABAJADOR)) {
//
//                            //viveroTransportadorUI.privilegioTrabajador();
//
//                        }
//                        if (empleado.getRol().equals(rol.TRANSPORTISTA)) {
//
//                           // viveroTransportadorUI.privilegioTransportador();
//
//                        }
//
//                    } catch (Exception ex) {
//                        Logger.getLogger(ViveroGerenteUI.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                    if (perfilUI == null) {

                        try {
                            perfilUI = new PerfilEmpleadosUI(controlEmpleados.buscarEmpleado(cedula));
                            viveroTransportadorUI.desktop().add(perfilUI);

                            perfilUI.setVisible(true);

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(rootPane, " - Error : No estás pasando nada de informacion");
                            Logger.getLogger(ViveroGerenteUI.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                    //////////////////////////////////////////////////////////////////////////////////////////////////777         
                }
                if ((controlEmpleados.AccesoEmpleado(cedula, contraseña) == true) && (empleado.getRol().equals(Rol.TRANSPORTISTA)) && (empleado.getEstadoEmpleado().equals(EstadoEmpleado.ACTIVO))) {

                    if (viveroTransportadorUI == null) {

                        viveroTransportadorUI = new ViveroTransportadorUI(vivero);
                    }

                    viveroTransportadorUI.setVisible(true);
                    viveroTransportadorUI.setBienvenido("Bienvenido" + " " + empleado.getNombre());
                    dispose();
                }
                if ((controlEmpleados.AccesoEmpleado(cedula, contraseña) == true) && (empleado.getRol().equals(Rol.GERENTE_PROPIETARIO))) {

                    if (viveroGerenteUI == null) {

                        viveroGerenteUI = new ViveroGerenteUI(vivero);
                    }

                    viveroGerenteUI.setVisible(true);
                    viveroGerenteUI.setBienvenido("Bienvenido" + " " + empleado.getNombre());
                    dispose();
                }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(rootPane, "El usuario o contraseña son incorrectos " + ex);

                cmpUsuario.setText("");
                cmpContraseña.setText("");

                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                if (empleado.getEstadoEmpleado().equals(EstadoEmpleado.INACTIVO) && (controlEmpleados.AccesoEmpleado(cedula, contraseña) == true)) {
                    JOptionPane.showMessageDialog(Login.this, "El empleado se encuentra inactivo");
                }
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////777
}
