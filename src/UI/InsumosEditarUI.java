package UI;

import Control.ControlDetalleGasto;
import Control.ControlInsumos;
import Modelo.Detalle_Gasto;
import Modelo.Insumo;
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

public class InsumosEditarUI extends javax.swing.JInternalFrame {

    private ControlInsumos controlInsumo;
    private Insumo insumo;

    public InsumosEditarUI() {
        initComponents();
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        setLocation(0, -32);

        this.controlInsumo = new ControlInsumos();
        this.insumojC.setModel(new InsumosListener());
        this.insumojC.addActionListener(new buscarInsumoListener());

        btnCancelar.addActionListener(new Cancelar());
        btnActualizar.addActionListener(new actualizarInsumo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        cmpNombre = new javax.swing.JTextField();
        cmpDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        insumojC = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Editar Insumos");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel1.setText("Nombre:");

        jLabel2.setText("Descripcion:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actualizar.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);

        jLabel3.setText("Seleccione un insumo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(insumojC, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnActualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insumojC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField cmpDescripcion;
    private javax.swing.JTextField cmpNombre;
    private javax.swing.JComboBox<String> insumojC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
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

    public class InsumosListener implements ComboBoxModel {

        List<Insumo> insumos = controlInsumo.getListaInsumos();
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
            return insumos.size();
        }

        @Override
        public Object getElementAt(int index) {
            return insumos.get(index);
        }

        @Override
        public void addListDataListener(ListDataListener l) {

        }

        @Override
        public void removeListDataListener(ListDataListener l) {

        }

    }

    public class buscarInsumoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            insumo = (Insumo) insumojC.getSelectedItem();
            String descripcion = insumo.getDescripcion();
            cmpDescripcion.setText(descripcion);
            cmpNombre.setText(insumo.getNombre());

        }

    }

    public class buscarInsumos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                String nombre = cmpNombre.getText();
                if (cmpNombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre");
                } else {

                    insumo = (Insumo) controlInsumo.buscarInsumoNom(nombre);

                    cmpDescripcion.setText(insumo.getDescripcion());
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error :" + ex);
                Logger.getLogger(InsumosEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class actualizarInsumo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (cmpNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre");
            } else {

                try {
                    String nombre = cmpNombre.getText();
                    String descr = cmpDescripcion.getText();

                    insumo.setNombre(nombre);
                    insumo.setDescripcion(descr);

                    controlInsumo.ActualizarInsumo(insumo);

                    JOptionPane.showMessageDialog(rootPane, "Insumo actualizado");

                    cmpNombre.setText("");
                    cmpDescripcion.setText("");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Debe ingresar los datos");
                    Logger.getLogger(InsumosEditarUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public class Cancelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            int opcion = JOptionPane.showConfirmDialog(InsumosEditarUI.this, rootPane, "¿Desea cancelar?", JOptionPane.OK_CANCEL_OPTION);

            if (opcion == JOptionPane.CANCEL_OPTION) {
                return;
            }
            if (opcion == JOptionPane.OK_OPTION) {

                cmpNombre.setText("");
                cmpDescripcion.setText("");

            }

        }

    }
}
