package UI;

import Control.ControlDetalleGasto;
import Control.ControlInsumos;
import Modelo.Detalle_Gasto;
import Modelo.Empleado;
import Modelo.Insumo;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InventarioInsumosUI extends javax.swing.JInternalFrame {

    private ControlInsumos controlInsumo;
    private ControlDetalleGasto controlDetalle;
    private Detalle_Gasto detalleBuscado;

    //    private ControlInsumos      ci = new ControlInsumos();
//    private ControlDetalleGasto dg = new ControlDetalleGasto();
    public InventarioInsumosUI() {
        initComponents();

        this.controlInsumo = new ControlInsumos();
        this.controlDetalle = new ControlDetalleGasto();

        btnBuscar.addActionListener(new buscarInsumos());
        btnDisminuirCantidad.addActionListener(new DisminuirCantidad());
        btnAgregarCantidad.addActionListener(new AgregarCantidad());
        btnCancelar.addActionListener(new Cancelar());
        btnActualizar.addActionListener(new actualizarInventario());

        TextPrompt nombre = new TextPrompt("Nombre", cmpNombre);
        TextPrompt descripcion = new TextPrompt("Descripcion", cmpDescripcion);
        TextPrompt cantidad = new TextPrompt("Cantidad", cmpCantidadIngresada);
      
        this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAgregarCantidad = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmpNombre = new javax.swing.JTextField();
        cmpDescripcion = new javax.swing.JTextField();
        cmpCantidadIngresada = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnDisminuirCantidad = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        cmpCantidadExistente = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Editar herramienta/insumo");

        btnAgregarCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/agregarboton.png"))); // NOI18N
        btnAgregarCantidad.setBorder(null);
        btnAgregarCantidad.setBorderPainted(false);
        btnAgregarCantidad.setContentAreaFilled(false);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);

        cmpNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmpNombre.setForeground(new java.awt.Color(204, 204, 204));
        cmpNombre.setToolTipText("");
        cmpNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cmpDescripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmpDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        cmpDescripcion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cmpCantidadIngresada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmpCantidadIngresada.setForeground(new java.awt.Color(204, 204, 204));
        cmpCantidadIngresada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscarboton.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);

        btnDisminuirCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/disminuirboton.png"))); // NOI18N
        btnDisminuirCantidad.setBorder(null);
        btnDisminuirCantidad.setBorderPainted(false);
        btnDisminuirCantidad.setContentAreaFilled(false);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actualizarboton.png"))); // NOI18N
        btnActualizar.setAutoscrolls(true);
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);

        cmpCantidadExistente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmpCantidadExistente.setForeground(new java.awt.Color(204, 204, 204));
        cmpCantidadExistente.setText("Cantidad existente");
        cmpCantidadExistente.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmpCantidadIngresada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(btnAgregarCantidad))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(btnDisminuirCantidad))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(btnActualizar)))
                            .addGap(78, 78, 78)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpCantidadExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addGap(106, 106, 106))))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(21, 21, 21)
                .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(cmpCantidadExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnAgregarCantidad)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpCantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisminuirCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnActualizar))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarCantidad;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDisminuirCantidad;
    private javax.swing.JLabel cmpCantidadExistente;
    private javax.swing.JTextField cmpCantidadIngresada;
    private javax.swing.JTextField cmpDescripcion;
    private javax.swing.JTextField cmpNombre;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public class buscarInsumos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                String nombre = cmpNombre.getText();
                System.out.println("Obtengo el nombre");

                Insumo insumo = (Insumo) controlInsumo.buscarInsumo(nombre);
                detalleBuscado = insumo.getDetalleGasto();
                System.out.println("Busco por el nombre");

                cmpDescripcion.setText(insumo.getDescripcion());
                cmpCantidadExistente.setText(Integer.toString(insumo.getDetalleGasto().getCantidad()));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error :" + ex);
                Logger.getLogger(InventarioInsumosUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class AgregarCantidad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                int cantExiste = Integer.parseInt(cmpCantidadExistente.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresada.getText());

                int suma = cantExiste + cantIngre;
                cmpCantidadExistente.setText(Integer.toString(suma));

                JOptionPane.showMessageDialog(rootPane, "Cantidad agregada");
            } catch (Exception ex) {
                Logger.getLogger(InventarioInsumosUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class DisminuirCantidad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                int cantExiste = Integer.parseInt(cmpCantidadExistente.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresada.getText());

                int suma = cantExiste - cantIngre;
                cmpCantidadExistente.setText(Integer.toString(suma));


                JOptionPane.showMessageDialog(rootPane, "Cantidad disminuida");
            } catch (Exception ex) {
                Logger.getLogger(InventarioInsumosUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class actualizarInventario implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
//                String nombre = cmpNombre.getText();
//                String descripcion = cmpDescripcion.getText();
//
//                int cantidadExistente = Integer.parseInt(cmpCantidadExistente.getText());
//
//                Detalle_Gasto detalleGasto = new Detalle_Gasto(cantidadExistente);
//
//                Insumo insumo = new Insumo(nombre, descripcion, detalleGasto);
//
//                controlInsumo.AgregarInsumo(insumo);
//
//                controlDetalle.ActualizarDetalleGasto(detalleGasto);
//                controlDetalle.agregarDetalleGasto(detalleGasto);

                int cantExiste = Integer.parseInt(cmpCantidadExistente.getText());

//                Detalle_Gasto detalle = new Detalle_Gasto(cantExiste);
                detalleBuscado.setCantidad(cantExiste);

                controlDetalle.ActualizarDetalleGasto(detalleBuscado);

                JOptionPane.showMessageDialog(rootPane, "Cantidad actualizada");

                cmpNombre.setText("");
                cmpDescripcion.setText("");
                cmpCantidadIngresada.setText("");
                cmpCantidadExistente.setText("");

            } catch (Exception ex) {
                Logger.getLogger(InventarioInsumosUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class Cancelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            int opcion = JOptionPane.showConfirmDialog(InventarioInsumosUI.this, rootPane, "¿Desea cancelar?", JOptionPane.OK_CANCEL_OPTION);

            if (opcion == JOptionPane.CANCEL_OPTION) {
                return;
            }
            if (opcion == JOptionPane.OK_OPTION) {

                cmpNombre.setText("");
                cmpDescripcion.setText("");
                cmpCantidadIngresada.setText("");
                cmpCantidadExistente.setText("");

            }

        }

    }

}
