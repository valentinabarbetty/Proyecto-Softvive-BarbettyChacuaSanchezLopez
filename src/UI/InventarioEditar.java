package UI;

import Control.ControlDetalleGasto;
import Control.ControlDetalleHerramienta;
import Control.ControlDetalleInsumo;
import Control.ControlHerramienta;
import Control.ControlInsumos;
import Modelo.Detalle_Gasto;
import Modelo.Detalle_GastoHerramienta;
import Modelo.Detalle_GastoInsumo;
import Modelo.Empleado;
import Modelo.Herramienta;
import Modelo.Insumo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InventarioEditar extends javax.swing.JInternalFrame {

    private ControlInsumos controlInsumo;
    private ControlDetalleInsumo controlDetalleInsumo;
    private ControlDetalleHerramienta controlDetalleHerramienta;
    private ControlHerramienta controlHerramienta;


    public InventarioEditar() {
        initComponents();

        this.controlInsumo = new ControlInsumos();
        this.controlDetalleInsumo = new ControlDetalleInsumo();
        this.controlHerramienta = new ControlHerramienta();

        this.controlDetalleHerramienta = new ControlDetalleHerramienta();

        btnBuscar.addActionListener(new buscarInventario());
        //   btnBuscar.addActionListener(new buscarHerramientas());

        btnDisminuirCantidad.addActionListener(new DisminuirCantidad());
        btnAgregarCantidad.addActionListener(new AgregarCantidad());

        btnCancelar.addActionListener(new Cancelar());
        btnActualizar.addActionListener(new actualizarInventario());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Editar Inventario ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Descripción:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad existente:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Editar cantidad:");

        btnAgregarCantidad.setText("Aumentar cantidad");

        btnCancelar.setText("Cancelar");

        btnBuscar.setText(". . . ");

        btnDisminuirCantidad.setText("Disminuir Cantidad");

        btnActualizar.setText("Actualizar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(cmpCantidadExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnDisminuirCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmpCantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnBuscar))
                            .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(cmpCantidadExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cmpCantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCantidad)
                    .addComponent(btnDisminuirCantidad))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    public class buscarInventario implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                String nombre = cmpNombre.getText();

                Herramienta herramienta = controlHerramienta.buscarHerramientaNom(nombre);

                if (nombre.equals(herramienta.getNombre())) {

                    cmpDescripcion.setText(herramienta.getDescripcion());

                    for (int i = 0; i < herramienta.getListaGastoHerramienta().size(); i++) {

                        int cantidad = herramienta.getListaGastoHerramienta().get(i).getCantidad();
                        cmpCantidadExistente.setText(Integer.toString(cantidad));
                    }

                } else {

                    Insumo insumo = controlInsumo.buscarInsumoNom(nombre);

                    if (nombre.equals(insumo.getNombre())) {

                        cmpDescripcion.setText(insumo.getDescripcion());

                        for (int i = 0; i < insumo.getListaGastoInsumo().size(); i++) {

                            int cantidad = insumo.getListaGastoInsumo().get(i).getCantidad();
                            cmpCantidadExistente.setText(Integer.toString(cantidad));

                        }
                    }
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error :" + ex);
                Logger.getLogger(InventarioEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class AgregarCantidad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                String nombre = cmpNombre.getText();
                
                Herramienta herramienta = controlHerramienta.buscarHerramientaNom(nombre);

                if (nombre.equals(herramienta.getNombre())) {

                    Detalle_GastoHerramienta detalleH = (Detalle_GastoHerramienta) herramienta.getListaGastoHerramienta();

                    int cantExiste = Integer.parseInt(cmpCantidadExistente.getText());
                    int cantIngre = Integer.parseInt(cmpCantidadIngresada.getText());

                    int suma = cantExiste + cantIngre;
                    cmpCantidadExistente.setText(Integer.toString(suma));

                    detalleH.setCantidad(suma);
                    controlDetalleHerramienta.ActualizarDetalleGastoHerramienta(detalleH);

                    JOptionPane.showMessageDialog(rootPane, "Cantidad agregada");
                } else {

                    Insumo insumo = controlInsumo.buscarInsumoNom(nombre);

                    if (nombre.equals(insumo.getNombre())) {

                        Detalle_GastoInsumo detalleI = (Detalle_GastoInsumo) insumo.getListaGastoInsumo();

                        int cantExiste = Integer.parseInt(cmpCantidadExistente.getText());
                        int cantIngre = Integer.parseInt(cmpCantidadIngresada.getText());

                        int suma = cantExiste + cantIngre;
                        cmpCantidadExistente.setText(Integer.toString(suma));

                        detalleI.setCantidad(suma);
                        controlDetalleInsumo.ActualizarDetalleGasto(detalleI);

                        JOptionPane.showMessageDialog(rootPane, "Cantidad agregada");

                    }
                }

            } catch (Exception ex) {
                Logger.getLogger(InventarioEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class DisminuirCantidad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                String nombre = cmpNombre.getText();

                Herramienta herramienta = controlHerramienta.buscarHerramientaNom(nombre);

                if (nombre.equals(herramienta.getNombre())) {

                    Detalle_GastoHerramienta detalleH = (Detalle_GastoHerramienta) herramienta.getListaGastoHerramienta();

                    int cantExiste = Integer.parseInt(cmpCantidadExistente.getText());
                    int cantIngre = Integer.parseInt(cmpCantidadIngresada.getText());

                    int resta = cantExiste - cantIngre;
                    cmpCantidadExistente.setText(Integer.toString(resta));

                    detalleH.setCantidad(resta);
                    controlDetalleHerramienta.ActualizarDetalleGastoHerramienta(detalleH);

                    JOptionPane.showMessageDialog(rootPane, "Cantidad modificada");
                } else {

                    Insumo insumo = controlInsumo.buscarInsumoNom(nombre);

                    if (nombre.equals(insumo.getNombre())) {

                        Detalle_GastoInsumo detalleI = (Detalle_GastoInsumo) insumo.getListaGastoInsumo();

                        int cantExiste = Integer.parseInt(cmpCantidadExistente.getText());
                        int cantIngre = Integer.parseInt(cmpCantidadIngresada.getText());

                        int resta = cantExiste - cantIngre;
                        cmpCantidadExistente.setText(Integer.toString(resta));

                        detalleI.setCantidad(resta);
                        controlDetalleInsumo.ActualizarDetalleGasto(detalleI);

                        JOptionPane.showMessageDialog(rootPane, "Cantidad modificada");

                    }
                }

            } catch (Exception ex) {
                Logger.getLogger(InventarioEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class actualizarInventario implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                JOptionPane.showMessageDialog(rootPane, "Cantidad actualizada");

                cmpNombre.setText("");
                cmpDescripcion.setText("");
                cmpCantidadIngresada.setText("");
                cmpCantidadExistente.setText("");

            } catch (Exception ex) {
                Logger.getLogger(InventarioEditar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class Cancelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            cmpNombre.setText("");
            cmpDescripcion.setText("");
            cmpCantidadIngresada.setText("");
            cmpCantidadExistente.setText("");

        }

    }

}
