package UI;

import Control.ControlDetalleGasto;
import Control.ControlInsumos;
import Modelo.Detalle_Gasto;
import Modelo.Empleado;
import Modelo.Insumo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InventarioInsumosUI extends javax.swing.JInternalFrame {

    private ControlInsumos controlInsumo;
    private ControlDetalleGasto controlDetalle;

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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarCantidad = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmpNombre = new javax.swing.JTextField();
        cmpDescripcion = new javax.swing.JTextField();
        cmpCantidadIngresada = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnDisminuirCantidad = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        cmpCantidadExistente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Editar inventario insumos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Descripción:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad existente:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Cantidad:");

        btnAgregarCantidad.setText("Agregar cantidad");

        btnCancelar.setText("Cancelar");

        btnBuscar.setText(". . . ");

        btnDisminuirCantidad.setText("Disminuir Cantidad");

        btnActualizar.setText("Actualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmpCantidadExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(btnAgregarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmpCantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(btnDisminuirCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAgregarCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDisminuirCantidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpCantidadExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmpCantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnActualizar))
                .addContainerGap())
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    public class buscarInsumos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                String nombre = cmpNombre.getText();
                System.out.println("Obtengo el nombre");

                Insumo insumo = (Insumo) controlInsumo.buscarInsumo(nombre);
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

                Detalle_Gasto detalle = new Detalle_Gasto(suma);

                controlDetalle.ActualizarDetalleGasto(detalle);

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

                Detalle_Gasto detalle = new Detalle_Gasto(suma);

                controlDetalle.ActualizarDetalleGasto(detalle);

                JOptionPane.showMessageDialog(rootPane, "Cantidad modificada");
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
