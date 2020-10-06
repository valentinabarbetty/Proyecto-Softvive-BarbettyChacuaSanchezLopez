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
import Modelo.Planta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

public class InventarioEditarUI extends javax.swing.JInternalFrame {

    private ControlInsumos controlInsumo;
    private ControlDetalleInsumo controlDetalleInsumo;

    private ControlDetalleHerramienta controlDetalleHerramienta;
    private ControlHerramienta controlHerramienta;

    private Detalle_GastoHerramienta detalleGH;
    private Detalle_GastoInsumo detalleGI;

    public InventarioEditarUI() {
        initComponents();
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        setLocation(0, -32);
        this.controlInsumo = new ControlInsumos();
        this.controlDetalleInsumo = new ControlDetalleInsumo();
        this.controlHerramienta = new ControlHerramienta();
        this.controlDetalleHerramienta = new ControlDetalleHerramienta();
        this.detalleGI = new Detalle_GastoInsumo();
        this.detalleGH = new Detalle_GastoHerramienta();

        this.cmbxInsumo.setModel(new InsumosListener());
        this.cmbxHerramienta.setModel(new HerramientasListener());

        this.cmbxInsumo.addActionListener(new buscarInsumos());
        this.cmbxHerramienta.addActionListener(new buscarHerramientas());

        this.btnDisminuirCantidadH.addActionListener(new DisminuirCantidadH());
        this.btnDisminuirCantidadI.addActionListener(new DisminuirCantidadI());

        this.btnAgregarCantidadH.addActionListener(new AgregarCantidadH());
        this.btnAgregarCantidadI.addActionListener(new AgregarCantidadI());

        this.btnCancelarH.addActionListener(new CancelarH());
        this.btnCancelarI.addActionListener(new CancelarI());

        this.btnActualizarH.addActionListener(new actualizarInventarioH());
        this.btnActualizarI.addActionListener(new actualizarInventarioI());

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
        cmbxInsumo = new javax.swing.JComboBox<>();
        btnCancelarI = new javax.swing.JButton();
        btnActualizarI = new javax.swing.JButton();
        btnAgregarCantidadI = new javax.swing.JButton();
        btnDisminuirCantidadI = new javax.swing.JButton();
        cmpCantidadIngresadaI = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmpDescripcionI = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmpCantidadExistenteI = new javax.swing.JTextField();
        panelHerramientas = new javax.swing.JPanel();
        btnCancelarH = new javax.swing.JButton();
        btnActualizarH = new javax.swing.JButton();
        btnDisminuirCantidadH = new javax.swing.JButton();
        btnAgregarCantidadH = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cmpCantidadIngresadaH = new javax.swing.JTextField();
        cmpCantidadExistenteH = new javax.swing.JTextField();
        cmpDescripcionH = new javax.swing.JTextField();
        cmbxHerramienta = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 623));

        Pestañas.setBackground(new java.awt.Color(255, 255, 255));

        panelInsumos.setBackground(new java.awt.Color(255, 255, 255));

        btnCancelarI.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        btnCancelarI.setBorderPainted(false);
        btnCancelarI.setContentAreaFilled(false);

        btnActualizarI.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actualizar.png"))); // NOI18N
        btnActualizarI.setBorder(null);
        btnActualizarI.setBorderPainted(false);
        btnActualizarI.setContentAreaFilled(false);

        btnAgregarCantidadI.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCantidadI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/aumbtn.png"))); // NOI18N
        btnAgregarCantidadI.setBorder(null);
        btnAgregarCantidadI.setBorderPainted(false);
        btnAgregarCantidadI.setContentAreaFilled(false);

        btnDisminuirCantidadI.setBackground(new java.awt.Color(255, 255, 255));
        btnDisminuirCantidadI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dismbtn.png"))); // NOI18N
        btnDisminuirCantidadI.setBorder(null);
        btnDisminuirCantidadI.setBorderPainted(false);
        btnDisminuirCantidadI.setContentAreaFilled(false);

        cmpCantidadIngresadaI.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmpCantidadIngresadaI.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cmpCantidadIngresadaI.setSelectionColor(new java.awt.Color(133, 198, 90));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Editar cantidad:");

        cmpDescripcionI.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmpDescripcionI.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cmpDescripcionI.setSelectionColor(new java.awt.Color(133, 198, 90));

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Descripción:");

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Cantidad existente:");

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Nombre:");

        cmpCantidadExistenteI.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmpCantidadExistenteI.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cmpCantidadExistenteI.setSelectionColor(new java.awt.Color(133, 198, 90));

        javax.swing.GroupLayout panelInsumosLayout = new javax.swing.GroupLayout(panelInsumos);
        panelInsumos.setLayout(panelInsumosLayout);
        panelInsumosLayout.setHorizontalGroup(
            panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInsumosLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addGap(28, 28, 28)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInsumosLayout.createSequentialGroup()
                        .addComponent(cmpCantidadIngresadaI, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCantidadI)
                            .addComponent(btnDisminuirCantidadI)))
                    .addComponent(cmpDescripcionI, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpCantidadExistenteI, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInsumosLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btnCancelarI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btnActualizarI)
                .addGap(182, 182, 182))
        );
        panelInsumosLayout.setVerticalGroup(
            panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInsumosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(47, 47, 47)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(cmpDescripcionI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInsumosLayout.createSequentialGroup()
                        .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cmpCantidadExistenteI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarCantidadI)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisminuirCantidadI)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInsumosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarI, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInsumosLayout.createSequentialGroup()
                                .addGroup(panelInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmpCantidadIngresadaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(58, 58, 58)
                                .addComponent(btnCancelarI, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9))
        );

        Pestañas.addTab("INSUMOS", panelInsumos);

        panelHerramientas.setBackground(new java.awt.Color(255, 255, 255));

        btnCancelarH.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        btnCancelarH.setBorderPainted(false);
        btnCancelarH.setContentAreaFilled(false);

        btnActualizarH.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actualizar.png"))); // NOI18N
        btnActualizarH.setBorder(null);
        btnActualizarH.setBorderPainted(false);
        btnActualizarH.setContentAreaFilled(false);

        btnDisminuirCantidadH.setBackground(new java.awt.Color(255, 255, 255));
        btnDisminuirCantidadH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dismbtn.png"))); // NOI18N
        btnDisminuirCantidadH.setBorder(null);
        btnDisminuirCantidadH.setBorderPainted(false);
        btnDisminuirCantidadH.setContentAreaFilled(false);

        btnAgregarCantidadH.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCantidadH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/aumbtn.png"))); // NOI18N
        btnAgregarCantidadH.setBorder(null);
        btnAgregarCantidadH.setBorderPainted(false);
        btnAgregarCantidadH.setContentAreaFilled(false);

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Nombre:");

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Descripción:");

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Cantidad existente:");

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Editar cantidad:");

        cmpCantidadIngresadaH.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmpCantidadIngresadaH.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cmpCantidadIngresadaH.setSelectionColor(new java.awt.Color(133, 198, 90));

        cmpCantidadExistenteH.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmpCantidadExistenteH.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cmpCantidadExistenteH.setSelectionColor(new java.awt.Color(133, 198, 90));

        cmpDescripcionH.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmpDescripcionH.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cmpDescripcionH.setSelectionColor(new java.awt.Color(133, 198, 90));

        javax.swing.GroupLayout panelHerramientasLayout = new javax.swing.GroupLayout(panelHerramientas);
        panelHerramientas.setLayout(panelHerramientasLayout);
        panelHerramientasLayout.setHorizontalGroup(
            panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHerramientasLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnCancelarH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarH)
                .addGap(115, 115, 115))
            .addGroup(panelHerramientasLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpCantidadIngresadaH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpDescripcionH, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpCantidadExistenteH, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHerramientasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDisminuirCantidadH)
                    .addComponent(btnAgregarCantidadH))
                .addGap(223, 223, 223))
        );
        panelHerramientasLayout.setVerticalGroup(
            panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHerramientasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cmbxHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(cmpDescripcionH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelHerramientasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(cmpCantidadExistenteH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(cmpCantidadIngresadaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(panelHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarH, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelarH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelHerramientasLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnAgregarCantidadH)
                        .addGap(28, 28, 28)
                        .addComponent(btnDisminuirCantidadH)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );

        Pestañas.addTab("HERRAMIENTAS", panelHerramientas);

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Editar inventario");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pestañas)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Pestañas;
    private javax.swing.JButton btnActualizarH;
    private javax.swing.JButton btnActualizarI;
    private javax.swing.JButton btnAgregarCantidadH;
    private javax.swing.JButton btnAgregarCantidadI;
    private javax.swing.JButton btnCancelarH;
    private javax.swing.JButton btnCancelarI;
    private javax.swing.JButton btnDisminuirCantidadH;
    private javax.swing.JButton btnDisminuirCantidadI;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JComboBox<String> cmbxHerramienta;
    private javax.swing.JComboBox<String> cmbxInsumo;
    private javax.swing.JTextField cmpCantidadExistenteH;
    private javax.swing.JTextField cmpCantidadExistenteI;
    private javax.swing.JTextField cmpCantidadIngresadaH;
    private javax.swing.JTextField cmpCantidadIngresadaI;
    private javax.swing.JTextField cmpDescripcionH;
    private javax.swing.JTextField cmpDescripcionI;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHerramientas;
    private javax.swing.JPanel panelInsumos;
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

    public class HerramientasListener implements ComboBoxModel {

        List<Herramienta> herramientas = controlHerramienta.getListaHerramientas();
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
            return herramientas.size();
        }

        @Override
        public Object getElementAt(int index) {
            return herramientas.get(index);
        }

        @Override
        public void addListDataListener(ListDataListener l) {

        }

        @Override
        public void removeListDataListener(ListDataListener l) {

        }

    }

    public class buscarInsumos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                Insumo insumo = (Insumo) cmbxInsumo.getSelectedItem();
//                String nombre = cmpNombreI.getText();
//                Insumo insumo = controlInsumo.buscarInsumoNom(nombre);

                cmpDescripcionI.setText(insumo.getDescripcion());

                for (int i = 0; i < insumo.getListaGastoInsumo().size(); i++) {

                    int cantidad = insumo.getListaGastoInsumo().get(i).getCantidad();
                    cmpCantidadExistenteI.setText(Integer.toString(cantidad));

                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error :" + ex);
                Logger.getLogger(InventarioEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class buscarHerramientas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
//                String nombre = cmpNombreH.getText();
//                Herramienta herramienta = controlHerramienta.buscarHerramientaNom(nombre);

                Herramienta herramienta = (Herramienta) cmbxHerramienta.getSelectedItem();

                cmpDescripcionH.setText(herramienta.getDescripcion());

                for (int i = 0; i < herramienta.getListaGastoHerramienta().size(); i++) {

                    int cantidad = herramienta.getListaGastoHerramienta().get(i).getCantidad();
                    cmpCantidadExistenteH.setText(Integer.toString(cantidad));

                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error :" + ex);
                Logger.getLogger(InventarioEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class AgregarCantidadH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                int cantExiste = Integer.parseInt(cmpCantidadExistenteH.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresadaH.getText());

                int suma = cantExiste + cantIngre;
                cmpCantidadExistenteH.setText(Integer.toString(suma));

                JOptionPane.showMessageDialog(rootPane, "Cantidad agregada");
            } catch (Exception ex) {
                Logger.getLogger(InventarioEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class AgregarCantidadI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                int cantExiste = Integer.parseInt(cmpCantidadExistenteI.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresadaI.getText());

                int suma = cantExiste + cantIngre;
                cmpCantidadExistenteI.setText(Integer.toString(suma));

                JOptionPane.showMessageDialog(rootPane, "Cantidad agregada");
            } catch (Exception ex) {
                Logger.getLogger(InventarioEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class DisminuirCantidadH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                int cantExiste = Integer.parseInt(cmpCantidadExistenteH.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresadaH.getText());

                int resta = cantExiste - cantIngre;
                cmpCantidadExistenteH.setText(Integer.toString(resta));

                JOptionPane.showMessageDialog(rootPane, "Cantidad modificada");
            } catch (Exception ex) {
                Logger.getLogger(InventarioEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class DisminuirCantidadI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                int cantExiste = Integer.parseInt(cmpCantidadExistenteI.getText());
                int cantIngre = Integer.parseInt(cmpCantidadIngresadaI.getText());

                int resta = cantExiste - cantIngre;
                cmpCantidadExistenteI.setText(Integer.toString(resta));

                JOptionPane.showMessageDialog(rootPane, "Cantidad modificada");
            } catch (Exception ex) {
                Logger.getLogger(InventarioEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class actualizarInventarioI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                Insumo insumo = (Insumo) cmbxInsumo.getSelectedItem();
                int suma = Integer.parseInt(cmpCantidadExistenteI.getText());

                for (int t = 0; t < insumo.getListaGastoInsumo().size(); t++) {

                    Detalle_GastoInsumo detalleGI = insumo.getListaGastoInsumo().get(t);

                    detalleGI.setCantidad(suma);
                    detalleGI.setFecha(LocalDate.now());
                    controlDetalleInsumo.ActualizarDetalleGasto(detalleGI);
                    JOptionPane.showMessageDialog(rootPane, "Cantidad actualizada");
                }

                btnCancelarI.doClick();

            } catch (Exception ex) {
                Logger.getLogger(InventarioEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class actualizarInventarioH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                Herramienta herramienta = (Herramienta) cmbxHerramienta.getSelectedItem();
                int suma = Integer.parseInt(cmpCantidadExistenteH.getText());

                for (int t = 0; t < herramienta.getListaGastoHerramienta().size(); t++) {

                    Detalle_GastoHerramienta detalle = herramienta.getListaGastoHerramienta().get(t);

                    detalle.setCantidad(suma);
                    detalle.setFecha(LocalDate.now());
                    controlDetalleHerramienta.ActualizarDetalleGastoHerramienta(detalle);

                    JOptionPane.showMessageDialog(rootPane, "Cantidad actualizada");

                }

                btnCancelarH.doClick();

            } catch (Exception ex) {
                Logger.getLogger(InventarioEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class CancelarI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

           // cmbxInsumo.setSelectedItem(null);
            cmpDescripcionI.setText("");
            cmpCantidadIngresadaI.setText("");
            cmpCantidadExistenteI.setText("");

        }

    }

    public class CancelarH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            cmbxHerramienta.setSelectedItem(null);
            cmpDescripcionH.setText("");
            cmpCantidadIngresadaH.setText("");
            cmpCantidadExistenteH.setText("");

        }

    }

}
