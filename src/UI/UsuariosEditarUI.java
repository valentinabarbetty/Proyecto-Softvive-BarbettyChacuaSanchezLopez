/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Control.ControlEmpleados;
import Modelo.Empleado;
import Modelo.EstadoEmpleado;
import Modelo.Rol;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Valentina
 */
public class UsuariosEditarUI extends javax.swing.JInternalFrame {

    private ControlEmpleados controlEmpleados;
    private Empleado empleado;

    /**
     * Creates new form UsuarioEditUI
     */
    public UsuariosEditarUI() {
        initComponents();
        this.controlEmpleados = new ControlEmpleados();
        this.boxEmpleados.setModel(new UsuariosListener());
        this.acbtn.addActionListener(new EditEmpleadoListener());
        this.canbtn.addActionListener(new borrarListener());
        this.boxEmpleados.addActionListener(new buscarUsuariosListener());
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        this.ciudadcbx.setModel(new CiudadModel());
        setLocation(0, -32);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        boxEmpleados = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        canbtn = new javax.swing.JButton();
        acbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        nomU = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        contraseñaU = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        direccionU = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        telefonoU = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ciudad = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ciudadcbx = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        roljT = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        boxrol = new javax.swing.JComboBox(Rol.values()); ;
        jLabel25 = new javax.swing.JLabel();
        estadojT = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        estadocbx = new javax.swing.JComboBox(EstadoEmpleado.values()); ;

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Editar Usuario");

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
                .addGap(188, 188, 188)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Seleccione el usuario:");

        canbtn.setBackground(new java.awt.Color(255, 255, 255));
        canbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        canbtn.setBorder(null);
        canbtn.setBorderPainted(false);
        canbtn.setContentAreaFilled(false);

        acbtn.setBackground(new java.awt.Color(255, 255, 255));
        acbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actualizar.png"))); // NOI18N
        acbtn.setBorder(null);
        acbtn.setBorderPainted(false);
        acbtn.setContentAreaFilled(false);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cédula:");

        cedula.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        nomU.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nomU.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nomU.setSelectionColor(new java.awt.Color(133, 198, 90));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Nombre:");

        contraseñaU.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Contraseña:");

        direccionU.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        direccionU.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        direccionU.setSelectionColor(new java.awt.Color(133, 198, 90));
        direccionU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionUActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Dirección:");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Teléfono:");

        telefonoU.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        telefonoU.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        telefonoU.setSelectionColor(new java.awt.Color(133, 198, 90));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Ciudad:");

        ciudad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Seleccione la ciudad:");

        ciudadcbx.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Rol:");

        roljT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Seleccione el rol:");

        boxrol.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Estado:");

        estadojT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Seleccione el estado:");

        estadocbx.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25)
                            .addComponent(jLabel15)
                            .addComponent(jLabel22)
                            .addComponent(jLabel14)
                            .addComponent(boxEmpleados, 0, 241, Short.MAX_VALUE)
                            .addComponent(nomU)
                            .addComponent(contraseñaU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(direccionU)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(telefonoU)
                            .addComponent(ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roljT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(estadojT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(ciudadcbx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(estadocbx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxrol, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(canbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acbtn)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaU, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccionU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ciudadcbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(2, 2, 2)
                                .addComponent(roljT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(2, 2, 2)
                                .addComponent(boxrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(2, 2, 2)
                        .addComponent(estadojT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addGap(2, 2, 2)
                        .addComponent(estadocbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canbtn)
                    .addComponent(acbtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void direccionUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acbtn;
    private javax.swing.JComboBox boxEmpleados;
    private javax.swing.JComboBox<String> boxrol;
    private javax.swing.JButton canbtn;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel ciudad;
    private javax.swing.JComboBox<String> ciudadcbx;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel contraseñaU;
    private javax.swing.JTextField direccionU;
    private javax.swing.JComboBox<String> estadocbx;
    private javax.swing.JLabel estadojT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomU;
    private javax.swing.JLabel roljT;
    private javax.swing.JTextField telefonoU;
    // End of variables declaration//GEN-END:variables
 public class UsuariosListener implements ComboBoxModel {

        List<Empleado> empleados = controlEmpleados.getListaEmpleados();
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
            return empleados.size();
        }

        @Override
        public Object getElementAt(int index) {
            return empleados.get(index);
        }

        @Override
        public void addListDataListener(ListDataListener l) {

        }

        @Override
        public void removeListDataListener(ListDataListener l) {

        }

    }

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

    public class buscarUsuariosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            empleado = (Empleado) boxEmpleados.getSelectedItem();
            long cedu = empleado.getCedula();
            String nombre = empleado.getNombre();
            String contraseña = empleado.getContraseña();
            String direccion = empleado.getDireccion();
            long telefono = empleado.getTelefono();
            Rol rol1 = empleado.getRol();
            String ciu = empleado.getCiudad();
            EstadoEmpleado ee = empleado.getEstadoEmpleado();

            cedula.setText(Long.toString(cedu));
            nomU.setText(nombre);
            contraseñaU.setText(contraseña);
            direccionU.setText(direccion);
            telefonoU.setText(Long.toString(telefono));
            estadojT.setText(ee.toString());
            ciudad.setText(ciu);
            roljT.setText(rol1.toString());
            boxrol.setSelectedItem(rol1);
            ciudadcbx.setSelectedItem(ciu);
            estadocbx.setSelectedItem(ee);

        }

    }

    public class EditEmpleadoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String nombre = nomU.getText();
                Rol rol = (Rol) boxrol.getSelectedItem();
                String contraseña = contraseñaU.getText();
                String direccion = direccionU.getText();
                long telefono = Long.parseLong(telefonoU.getText());
                String ciudad = (String) ciudadcbx.getSelectedItem();
                EstadoEmpleado ee = (EstadoEmpleado) estadocbx.getSelectedItem();

//                if (!ciudadcbx.getSelectedItem().equals(null)) {
//                    empleado.setCiudad(ciudad);
//                }
//                if(!boxrol.getSelectedItem().equals(null)){
//                    empleado.setRol(rol);
//                }
                empleado = (Empleado) boxEmpleados.getSelectedItem();

                empleado.setNombre(nombre);
                empleado.setCiudad(ciudad);
                empleado.setContraseña(contraseña);
                empleado.setDireccion(direccion);
                empleado.setTelefono(telefono);
                empleado.setRol(rol);
                empleado.setEstadoEmpleado(ee);
                controlEmpleados.actualizarEmpleado(empleado);
                

                JOptionPane.showMessageDialog(rootPane, "Empleado editado con éxito");
                canbtn.doClick();
            } catch (Exception ex) {
                Logger.getLogger(UsuariosEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class borrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nomU.setText("");
            cedula.setText("");
            telefonoU.setText("");
            direccionU.setText("");
            contraseñaU.setText("");
            ciudad.setText("");
            roljT.setText("");
            estadojT.setText("");

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
