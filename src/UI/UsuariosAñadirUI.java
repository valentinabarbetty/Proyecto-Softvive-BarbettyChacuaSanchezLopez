package UI;

import Control.ControlEmpleados;
import Modelo.Empleado;
import Modelo.EstadoEmpleado;
import Modelo.Rol;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

public class UsuariosAñadirUI extends javax.swing.JInternalFrame {

    private ControlEmpleados controlEmpleados;

    public UsuariosAñadirUI() {
        initComponents();
        this.controlEmpleados = new ControlEmpleados();
        this.agregarbtn.addActionListener(new agregarUsuarioListener());
        this.cancelarbtn.addActionListener(new borrarListener());
        this.ciudadcbx.setModel(new CiudadModel());
        TextPrompt nombre = new TextPrompt("Ingrese un nombre", nomjT);
        TextPrompt cedula = new TextPrompt("Ingrese el número de ID", ccjT);
        TextPrompt telefono = new TextPrompt("Ingrese un número de télefono", teljT);
        // TextPrompt ciudad = new TextPrompt("Ciudad", ciudadJjT);
        TextPrompt direccion = new TextPrompt("Ingrese una direccion", direccionjT);
        TextPrompt contraseña = new TextPrompt("Ingrese una contraseña", contraseñajT);
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        setLocation(0, -32);
        this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomjT = new javax.swing.JTextField();
        teljT = new javax.swing.JTextField();
        ccjT = new javax.swing.JTextField();
        agregarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        contraseñajT = new javax.swing.JTextField();
        rol = new javax.swing.JComboBox(Rol.values());
        direccionjT = new javax.swing.JTextField();
        ciudadcbx = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(905, 710));

        nomjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nomjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nomjT.setSelectionColor(new java.awt.Color(133, 198, 90));

        teljT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        teljT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        teljT.setSelectionColor(new java.awt.Color(133, 198, 90));

        ccjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ccjT.setToolTipText("");
        ccjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ccjT.setSelectionColor(new java.awt.Color(133, 198, 90));

        agregarbtn.setForeground(new java.awt.Color(51, 255, 51));
        agregarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonAdd.png"))); // NOI18N
        agregarbtn.setBorder(null);
        agregarbtn.setBorderPainted(false);
        agregarbtn.setContentAreaFilled(false);

        cancelarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        cancelarbtn.setBorder(null);
        cancelarbtn.setBorderPainted(false);
        cancelarbtn.setContentAreaFilled(false);
        cancelarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contraseñajT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        contraseñajT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        contraseñajT.setSelectionColor(new java.awt.Color(133, 198, 90));

        rol.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rol.setForeground(new java.awt.Color(255, 255, 255));
        rol.setToolTipText("");
        rol.setAutoscrolls(true);
        rol.setBorder(null);
        rol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        direccionjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        direccionjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        direccionjT.setSelectionColor(new java.awt.Color(133, 198, 90));

        ciudadcbx.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Añadir Nuevo Usuario");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(247, 247, 247)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Ciudad:");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Contraseña:");

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Cédula:");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Teléfono:");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Dirección:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Rol:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(cancelarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 293, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraseñajT, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addComponent(ciudadcbx, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionjT, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(ccjT, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(nomjT, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(teljT, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(nomjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ccjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(3, 3, 3)
                .addComponent(teljT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(4, 4, 4)
                .addComponent(direccionjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ciudadcbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñajT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarbtn;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField ccjT;
    private javax.swing.JComboBox<String> ciudadcbx;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField contraseñajT;
    private javax.swing.JTextField direccionjT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomjT;
    private javax.swing.JComboBox<Rol> rol;
    private javax.swing.JTextField teljT;
    // End of variables declaration//GEN-END:variables

    public class CiudadModel implements ComboBoxModel {

        private Object selected = null;

        @Override
        public void setSelectedItem(Object anItem) {
            this.selected = anItem;
        }

        @Override
        public Object getSelectedItem() {
            return this.selected;
        }

        @Override
        public int getSize() {
            return 8;
        }

        @Override
        public Object getElementAt(int index) {
            switch (index) {
                case 0:
                    return "Cali";
                case 1:
                    return "Palmira";
                case 2:
                    return "Jumbo";
                case 3:
                    return "Tuluá";
                case 4:
                    return "Cartago";
                case 5:
                    return "Buenaventura";
                case 6:
                    return "Buga";
                case 7:
                    return "Ginebra";

            }
            return "";
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
        }

    }

    public class agregarUsuarioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (ccjT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar el número de la cédula");
            } else if (nomjT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre completo");
            } else if (contraseñajT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar la contraseña");
            } else if (teljT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar el telefono");
            } else if (ciudadcbx.getSelectedItem().equals(null)) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar la ciudad");
            } else if (direccionjT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar la dirección");
            } else if (rol.getSelectedItem().equals(" ")) {
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el rol");
            } else {
                try {
                    long cedula = Long.parseLong(ccjT.getText());
                    String nom = nomjT.getText();
                    String contraseña = contraseñajT.getText();
                    long tel = Long.parseLong(teljT.getText());
                    String ciudad = (String) ciudadcbx.getSelectedItem();
                    String direccion = direccionjT.getText();
                    Rol selectRol = (Rol) rol.getSelectedItem();

                    Empleado d = new Empleado(cedula, nom, contraseña, direccion, tel, selectRol, ciudad, EstadoEmpleado.ACTIVO);
                    controlEmpleados.agregarEmpleado(d);

                    JOptionPane.showMessageDialog(rootPane, "Empleado agregado con éxito");
                    cancelarbtn.doClick();
                } catch (Exception ex) {
//                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }
        }

    }

    public class borrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ccjT.setText("");
            nomjT.setText("");
            direccionjT.setText("");
            rol.setSelectedItem("");
            teljT.setText("");
            ciudadcbx.setSelectedItem(null);
            contraseñajT.setText("");
        }

    }

    public class clickCerrarListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            setVisible(false);

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
}
