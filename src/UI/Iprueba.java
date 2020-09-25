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

public class Iprueba extends javax.swing.JInternalFrame {

    private ControlInsumos controlInsumo;
    private ControlDetalleInsumo controlDetalleInsumo;
    private ControlDetalleHerramienta controlDetalleHerramienta;
    private ControlHerramienta controlHerramienta;
    private Detalle_GastoHerramienta detalleGH;
    private Detalle_GastoInsumo detalleGI;

    public Iprueba() {
        initComponents();

        this.controlInsumo = new ControlInsumos();
        this.controlDetalleInsumo = new ControlDetalleInsumo();
        this.controlHerramienta = new ControlHerramienta();
        this.controlDetalleHerramienta = new ControlDetalleHerramienta();
        this.detalleGI = new Detalle_GastoInsumo();
        this.detalleGH = new Detalle_GastoHerramienta();

        btnBuscarI.addActionListener(new buscarInsumos());
        btnBuscarH.addActionListener(new buscarHerramientas());

        btnDisminuirCantidadH.addActionListener(new DisminuirCantidadH());
        btnDisminuirCantidadI.addActionListener(new DisminuirCantidadI());

        btnAgregarCantidadH.addActionListener(new AgregarCantidadH());
        btnAgregarCantidadI.addActionListener(new AgregarCantidadI());

        btnCancelarH.addActionListener(new CancelarH());
        btnCancelarI.addActionListener(new CancelarI());

        btnActualizarH.addActionListener(new actualizarInventarioH());
        btnActualizarI.addActionListener(new actualizarInventarioI());

        this.cmpDescripcionH.setEditable(false);
        this.cmpDescripcionI.setEditable(false);
        this.cmpCantidadExistenteH.setEditable(false);
        this.cmpCantidadExistenteI.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pestañas = new javax.swing.JTabbedPane();
        panelInsumos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cmpNombreI = new javax.swing.JTextField();
        btnBuscarI = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmpDescripcionI = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmpCantidadExistenteI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmpCantidadIngresadaI = new javax.swing.JTextField();
        btnAgregarCantidadI = new javax.swing.JButton();
        btnDisminuirCantidadI = new javax.swing.JButton();
        btnActualizarI = new javax.swing.JButton();
        btnCancelarI = new javax.swing.JButton();
        panelHerramientas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmpNombreH = new javax.swing.JTextField();
        btnBuscarH = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmpDescripcionH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmpCantidadIngresadaH = new javax.swing.JTextField();
        btnAgregarCantidadH = new javax.swing.JButton();
        btnDisminuirCantidadH = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCancelarH = new javax.swing.JButton();
        btnActualizarH = new javax.swing.JButton();
        cmpCantidadExistenteH = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        panelInsumos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nombre:");

        btnBuscarI.setText(". . . ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Descripción:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Cantidad existente:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Editar cantidad:");

        btnAgregarCantidadI.setText("Aumentar (+)");

        btnDisminuirCantidadI.setText("Disminuir (-)");

        btnActualizarI.setText("Actualizar");

        btnCancelarI.setText("Cancelar");

        javax.swing.GroupLayout panelInsumosLayout = new javax.swing.GroupLayout(panelInsumos);
        panelInsumos.setLayout(panelInsumosLayout);
        panelInsumosLayout.setHorizontalGroup(
            panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInsumosLayout.createSequentialGroup()
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInsumosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelarI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(panelInsumosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInsumosLayout.createSequentialGroup()
                                .addComponent(cmpNombreI, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarI))
                            .addComponent(cmpDescripcionI, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpCantidadExistenteI, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelInsumosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelInsumosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cmpCantidadIngresadaI, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelInsumosLayout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnDisminuirCantidadI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAgregarCantidadI))))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panelInsumosLayout.setVerticalGroup(
            panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInsumosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmpNombreI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarI))
                .addGap(18, 18, 18)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmpDescripcionI, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmpCantidadExistenteI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInsumosLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnCancelarI))
                    .addGroup(panelInsumosLayout.createSequentialGroup()
                        .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInsumosLayout.createSequentialGroup()
                                .addComponent(btnAgregarCantidadI)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInsumosLayout.createSequentialGroup()
                                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmpCantidadIngresadaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(9, 9, 9)))
                        .addComponent(btnDisminuirCantidadI)
                        .addGap(17, 17, 17)
                        .addComponent(btnActualizarI))))
        );

        Pestañas.addTab("INSUMOS", panelInsumos);

        panelHerramientas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nombre:");

        btnBuscarH.setText(". . . ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Descripción:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Editar cantidad:");

        btnAgregarCantidadH.setText("Aumentar (+)");

        btnDisminuirCantidadH.setText("Disminuir (-)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Cantidad existente:");

        btnCancelarH.setText("Cancelar");

        btnActualizarH.setText("Actualizar");

        javax.swing.GroupLayout panelHerramientasLayout = new javax.swing.GroupLayout(panelHerramientas);
        panelHerramientas.setLayout(panelHerramientasLayout);
        panelHerramientasLayout.setHorizontalGroup(
            panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHerramientasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnCancelarH, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(panelHerramientasLayout.createSequentialGroup()
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHerramientasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHerramientasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(28, 28, 28)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHerramientasLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHerramientasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmpCantidadIngresadaH, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelHerramientasLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDisminuirCantidadH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarCantidadH)))))
                    .addGroup(panelHerramientasLayout.createSequentialGroup()
                        .addComponent(cmpNombreH, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarH))
                    .addComponent(cmpDescripcionH, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpCantidadExistenteH, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelHerramientasLayout.setVerticalGroup(
            panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHerramientasLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmpNombreH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarH))
                .addGap(18, 18, 18)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmpDescripcionH, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmpCantidadExistenteH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHerramientasLayout.createSequentialGroup()
                        .addComponent(btnAgregarCantidadH)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHerramientasLayout.createSequentialGroup()
                        .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpCantidadIngresadaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)))
                .addComponent(btnDisminuirCantidadH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarH)
                    .addComponent(btnActualizarH))
                .addContainerGap())
        );

        Pestañas.addTab("HERRAMIENTAS", panelHerramientas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Editar Inventario ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pestañas)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(311, 311, 311))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pestañas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Pestañas;
    private javax.swing.JButton btnActualizarH;
    private javax.swing.JButton btnActualizarI;
    private javax.swing.JButton btnAgregarCantidadH;
    private javax.swing.JButton btnAgregarCantidadI;
    private javax.swing.JButton btnBuscarH;
    private javax.swing.JButton btnBuscarI;
    private javax.swing.JButton btnCancelarH;
    private javax.swing.JButton btnCancelarI;
    private javax.swing.JButton btnDisminuirCantidadH;
    private javax.swing.JButton btnDisminuirCantidadI;
    private javax.swing.JTextField cmpCantidadExistenteH;
    private javax.swing.JTextField cmpCantidadExistenteI;
    private javax.swing.JTextField cmpCantidadIngresadaH;
    private javax.swing.JTextField cmpCantidadIngresadaI;
    private javax.swing.JTextField cmpDescripcionH;
    private javax.swing.JTextField cmpDescripcionI;
    private javax.swing.JTextField cmpNombreH;
    private javax.swing.JTextField cmpNombreI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelHerramientas;
    private javax.swing.JPanel panelInsumos;
    // End of variables declaration//GEN-END:variables

    public class buscarInsumos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                String nombre = cmpNombreI.getText();
                Insumo insumo = controlInsumo.buscarInsumoNom(nombre);

                cmpDescripcionI.setText(insumo.getDescripcion());

                for (int i = 0; i < insumo.getListaGastoInsumo().size(); i++) {

                    int cantidad = insumo.getListaGastoInsumo().get(i).getCantidad();
                    cmpCantidadExistenteI.setText(Integer.toString(cantidad));

                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error :" + ex);
                Logger.getLogger(Iprueba.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class buscarHerramientas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                String nombre = cmpNombreH.getText();

                Herramienta herramienta = controlHerramienta.buscarHerramientaNom(nombre);

                cmpDescripcionH.setText(herramienta.getDescripcion());

                for (int i = 0; i < herramienta.getListaGastoHerramienta().size(); i++) {

                    int cantidad = herramienta.getListaGastoHerramienta().get(i).getCantidad();
                    cmpCantidadExistenteH.setText(Integer.toString(cantidad));

                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error :" + ex);
                Logger.getLogger(Iprueba.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class AgregarCantidadH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                // String nombre = cmpNombreH.getText();
                //  Herramienta herramienta = controlHerramienta.buscarHerramientaNom(nombre);

                //Detalle_GastoHerramienta detalleH = new Detalle_GastoHerramienta() ;
                int cantExiste = Integer.parseInt(cmpCantidadExistenteH.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresadaH.getText());

                int suma = cantExiste + cantIngre;
                cmpCantidadExistenteH.setText(Integer.toString(suma));

                detalleGH.setCantidad(suma);
                detalleGH.getFecha();

                controlDetalleHerramienta.ActualizarDetalleGastoHerramienta(detalleGH);

                JOptionPane.showMessageDialog(rootPane, "Cantidad agregada");
            } catch (Exception ex) {
                Logger.getLogger(Iprueba.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class AgregarCantidadI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                String nombre = cmpNombreI.getText();
                //               Insumo insumo = (Insumo) controlInsumo.buscarInsumoNom(nombre);

//                Detalle_GastoInsumo detalleI = (Detalle_GastoInsumo) insumo.getListaGastoInsumo();
                int cantExiste = Integer.parseInt(cmpCantidadExistenteI.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresadaI.getText());

                int suma = cantExiste + cantIngre;
                cmpCantidadExistenteI.setText(Integer.toString(suma));

                detalleGI.setCantidad(suma);
                controlDetalleInsumo.ActualizarDetalleGasto(detalleGI);

                JOptionPane.showMessageDialog(rootPane, "Cantidad agregada");
            } catch (Exception ex) {
                Logger.getLogger(Iprueba.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class DisminuirCantidadH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                String nombre = cmpNombreH.getText();

                Herramienta herramienta = controlHerramienta.buscarHerramientaNom(nombre);

                int cantExiste = Integer.parseInt(cmpCantidadExistenteH.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresadaH.getText());

                int resta = cantExiste - cantIngre;
                cmpCantidadExistenteH.setText(Integer.toString(resta));

                //  Detalle_GastoHerramienta detalleH = (Detalle_GastoHerramienta) herramienta.getListaGastoHerramienta();
                detalleGH.setCantidad(resta);
                controlDetalleHerramienta.ActualizarDetalleGastoHerramienta(detalleGH);

                JOptionPane.showMessageDialog(rootPane, "Cantidad modificada");
            } catch (Exception ex) {
                Logger.getLogger(Iprueba.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class DisminuirCantidadI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                String nombre = cmpNombreI.getText();
                Insumo insumo = controlInsumo.buscarInsumoNom(nombre);

                //               Detalle_GastoInsumo detalleI = (Detalle_GastoInsumo) insumo.getListaGastoInsumo();
                int cantExiste = Integer.parseInt(cmpCantidadExistenteI.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresadaI.getText());

                int resta = cantExiste - cantIngre;
                cmpCantidadExistenteI.setText(Integer.toString(resta));

                detalleGI.setCantidad(resta);
                controlDetalleInsumo.ActualizarDetalleGasto(detalleGI);

                JOptionPane.showMessageDialog(rootPane, "Cantidad modificada");
            } catch (Exception ex) {
                Logger.getLogger(Iprueba.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class actualizarInventarioI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                JOptionPane.showMessageDialog(rootPane, "Cantidad actualizada");
                btnCancelarI.doClick();

            } catch (Exception ex) {
                Logger.getLogger(Iprueba.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class actualizarInventarioH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                JOptionPane.showMessageDialog(rootPane, "Cantidad actualizada");
                btnCancelarH.doClick();

            } catch (Exception ex) {
                Logger.getLogger(Iprueba.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class CancelarI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            cmpNombreI.setText("");
            cmpDescripcionI.setText("");
            cmpCantidadIngresadaI.setText("");
            cmpCantidadExistenteI.setText("");

        }

    }

    public class CancelarH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            cmpNombreH.setText("");
            cmpDescripcionH.setText("");
            cmpCantidadIngresadaH.setText("");
            cmpCantidadExistenteH.setText("");

        }

    }

}
