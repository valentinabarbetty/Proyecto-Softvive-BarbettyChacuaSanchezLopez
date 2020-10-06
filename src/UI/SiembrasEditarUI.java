package UI;

import Modelo.Planta;
import Control.ControlPlantas;
import Control.ControlSiembra;
import Modelo.EstadoEntrega;
import Modelo.EstadoSiembra;
import Modelo.Siembra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

public class SiembrasEditarUI extends javax.swing.JInternalFrame {

    private Siembra siembra;
    private Planta planta;
    private EstadoSiembra estadoSiembra;
    private boolean d;
    private boolean m;
    private boolean a;

    private ControlSiembra controlSiembra;
    private ControlPlantas controlPlantas;

    public SiembrasEditarUI() {

        initComponents();
        this.d = false;
        this.a = false;
        this.m = false;
        this.controlSiembra = new ControlSiembra();
        this.controlPlantas = new ControlPlantas();
        //this.añojC.setModel(new AñoModel());
        this.mesjC.setModel(new MesModel());
        //this.diajC.setModel(new Dia31Model());
        this.mesjC.addActionListener(new DiaListener());
        this.btonBuscarSiembra.addActionListener(new buscarSiembraListener());
        this.diajC.addActionListener(new Dia1Listener());
        this.mesjC.addActionListener(new MesListener());
        //this.añojC.addActionListener(new Año1Listener());

        this.btonGuardar.addActionListener(new actualizarSiembraListener());
        this.btonCancelar.addActionListener(new CancelarListener());
        this.btonBuscarPlanta.addActionListener(new buscarPlantaLister());
        TextPrompt nombre = new TextPrompt("Ingrese el código", cmpCodigoPedido);
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        setLocation(0, -32);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmpCodigoPedido = new javax.swing.JTextField();
        btonBuscarSiembra = new javax.swing.JButton();
        cmpMuertes = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmpCantidad = new javax.swing.JTextField();
        btonGuardar = new javax.swing.JButton();
        btonCancelar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        mesjC = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        diajC = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cmpplanta = new javax.swing.JTextField();
        cmpestadosiembra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btonBuscarPlanta = new javax.swing.JButton();
        codPlanta = new javax.swing.JTextField();
        añojT = new javax.swing.JTextField();
        mesjT = new javax.swing.JTextField();
        diajT = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setText("Año:");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(108, 169, 62));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Editar Siembra");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(203, 203, 203)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Código:");

        btonBuscarSiembra.setForeground(new java.awt.Color(51, 255, 51));
        btonBuscarSiembra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscar.png"))); // NOI18N
        btonBuscarSiembra.setBorder(null);
        btonBuscarSiembra.setBorderPainted(false);
        btonBuscarSiembra.setContentAreaFilled(false);

        cmpMuertes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpMuertesActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Muertes:");

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Estado siembra:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("planta:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad:");

        cmpCantidad.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cmpCantidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cmpCantidad.setSelectionColor(new java.awt.Color(133, 198, 90));
        cmpCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCantidadActionPerformed(evt);
            }
        });

        btonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actualizar.png"))); // NOI18N
        btonGuardar.setBorder(null);
        btonGuardar.setBorderPainted(false);
        btonGuardar.setContentAreaFilled(false);

        btonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        btonCancelar.setBorderPainted(false);
        btonCancelar.setContentAreaFilled(false);

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel19.setText("Año:");

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel25.setText("Día:");

        diajC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diajCActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel26.setText("Mes:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Escoja la planta");

        btonBuscarPlanta.setForeground(new java.awt.Color(51, 255, 51));
        btonBuscarPlanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscar.png"))); // NOI18N
        btonBuscarPlanta.setBorder(null);
        btonBuscarPlanta.setBorderPainted(false);
        btonBuscarPlanta.setContentAreaFilled(false);

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setText("Seleccione la fecha;");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btonGuardar)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(cmpMuertes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(155, 155, 155)
                                            .addComponent(jLabel6))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btonBuscarSiembra))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmpplanta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(codPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(btonBuscarPlanta)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(añojT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmpestadosiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(249, 249, 249))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mesjT)
                                    .addComponent(mesjC, 0, 90, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(diajT)
                                    .addComponent(diajC, 0, 59, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btonBuscarSiembra))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(btonBuscarPlanta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmpCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmpMuertes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpestadosiembra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añojT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diajT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btonGuardar)
                    .addComponent(btonCancelar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmpMuertesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpMuertesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpMuertesActionPerformed

    private void cmpCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpCantidadActionPerformed

    private void diajCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diajCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diajCActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField añojT;
    private javax.swing.JButton btonBuscarPlanta;
    private javax.swing.JButton btonBuscarSiembra;
    private javax.swing.JButton btonCancelar;
    private javax.swing.JButton btonGuardar;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField cmpCantidad;
    private javax.swing.JTextField cmpCodigoPedido;
    private javax.swing.JTextField cmpMuertes;
    private javax.swing.JTextField cmpestadosiembra;
    private javax.swing.JTextField cmpplanta;
    private javax.swing.JTextField codPlanta;
    private javax.swing.JComboBox<String> diajC;
    private javax.swing.JTextField diajT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> mesjC;
    private javax.swing.JTextField mesjT;
    // End of variables declaration//GEN-END:variables

    public class buscarPlantaLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                planta = controlPlantas.buscarPlanta(codPlanta.getText());
                cmpplanta.setText(planta.getNombre());
            } catch (Exception ex) {
                Logger.getLogger(SiembrasEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class buscarSiembraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

//            Long pk = Long.parseLong(cmpCodigoPedido.getText());
            try {
                Long pk = Long.parseLong(cmpCodigoPedido.getText());
                siembra = controlSiembra.buscarSiembra(pk);
                diajT.setText(Integer.toString(siembra.getDia()));
                mesjT.setText(siembra.getMes().toString());
                añojT.setText(siembra.getAño().toString());
                // añojC.setSelectedItem(siembra.getAño());
                mesjC.setSelectedItem(siembra.getMes());
                diajC.setSelectedItem(siembra.getDia());
                cmpplanta.setText(siembra.getPlanta().getNombre());
                //CBplanta.setSelectedItem(siembra.getPlanta());
                cmpCantidad.setText(Integer.toString(siembra.getCantidad()));
                cmpMuertes.setText(Integer.toString(siembra.getMuertes()));
                cmpestadosiembra.setText(siembra.getEstadoSiembra().toString());

                //jcmbxEstado.setSelectedItem(siembra.getEstadoSiembra());
            } catch (Exception ex) {
                Logger.getLogger(SiembrasEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class actualizarSiembraListener implements ActionListener {

        int dia;

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                //Planta planta = (Planta) CBplanta.getSelectedItem();
                if (siembra.getPlanta().getNombre().equals(cmpplanta.getText())) {
                    planta = siembra.getPlanta();
                } else {
                    planta = controlPlantas.buscarPlanta(codPlanta.getText());
                }
                int año = Integer.parseInt(añojT.getText());
               // Month mes = Month.valueOf(mesjT.getText());

                dia = Integer.parseInt(diajT.getText());

                siembra.setAño(Year.of(año));
                siembra.setMes((Month) mesjC.getSelectedItem());
                siembra.setDia(dia);

                int cantidad = Integer.parseInt(cmpCantidad.getText());
                int muertes = Integer.parseInt(cmpMuertes.getText());
//                Year año = (Year) añojC.getSelectedItem();
//                Month mes = (Month) mesjC.getSelectedItem();
//                int dia = (int) diajC.getSelectedItem();
                siembra.setAño(Year.of(año));
                siembra.setDia(dia);
                //siembra.setMes(mes);
                // siembra.setAño((Year) añojC.getSelectedItem());
                siembra.setCantidad(cantidad);

                siembra.setMuertes(muertes);
                siembra.setPlanta(planta);
                //siembra.setEstadoSiembra(estadoSiembra);

                controlSiembra.actualizarSiembra(siembra);

                JOptionPane.showMessageDialog(rootPane, "Siembra editada con éxito");
                btonCancelar.doClick();
            } catch (Exception ex) {
                Logger.getLogger(UsuariosEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class Dia1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (d = true) {
                diajT.setText(diajC.getSelectedItem().toString());
            }

        }

    }

    public class MesListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            if (m = true) {
//                mesjT.setText((String)mesjC.getSelectedItem());
//            }
        }
    }

    public class Año1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (a = true) {
                // añojT.setText((String) añojC.getSelectedItem());
            }
        }

    }

    public class CancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

//            añojC.setSelectedItem(null);
//            mesjC.setSelectedItem(null);
//            diajC.setSelectedItem(null);
            añojT.setText("");
            diajT.setText("");
            mesjT.setText("");
            cmpestadosiembra.setText("");
            cmpplanta.setText("");
            cmpMuertes.setText("");
            cmpCantidad.setText("");

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

    public class MesModel implements ComboBoxModel {

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
            return 17;
        }
        Calendar c;

        @Override
        public Object getElementAt(int index) {
            switch (index) {
                case 0:
                    return Month.JANUARY;
                case 1:
                    return Month.FEBRUARY;
                case 2:
                    return Month.MARCH;
                case 3:
                    return Month.APRIL;
                case 4:
                    return Month.MAY;
                case 5:
                    return Month.JUNE;
                case 6:
                    return Month.JULY;
                case 7:
                    return Month.AUGUST;
                case 8:
                    return Month.SEPTEMBER;
                case 9:
                    return Month.OCTOBER;
                case 10:
                    return Month.NOVEMBER;
                case 11:
                    return Month.DECEMBER;

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

    public class Dia31Model implements ComboBoxModel {

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
            return 31;
        }

        @Override
        public Object getElementAt(int i) {
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case 8:
                    return 8;
                case 9:
                    return 9;
                case 10:
                    return 10;
                case 11:
                    return 11;
                case 12:
                    return 12;
                case 13:
                    return 13;
                case 14:
                    return 14;
                case 15:
                    return 15;
                case 16:
                    return 16;
                case 17:
                    return 17;
                case 18:
                    return 18;
                case 19:
                    return 19;
                case 20:
                    return 20;
                case 21:
                    return 21;
                case 22:
                    return 22;
                case 23:
                    return 23;
                case 24:
                    return 24;
                case 25:
                    return 25;
                case 26:
                    return 26;
                case 27:
                    return 27;
                case 28:
                    return 28;
                case 29:
                    return 29;
                case 30:
                    return 30;
                case 31:
                    return 31;

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

    public class Dia30Model implements ComboBoxModel {

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
            return 31;
        }

        @Override
        public Object getElementAt(int i) {
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case 8:
                    return 8;
                case 9:
                    return 9;
                case 10:
                    return 10;
                case 11:
                    return 11;
                case 12:
                    return 12;
                case 13:
                    return 13;
                case 14:
                    return 14;
                case 15:
                    return 15;
                case 16:
                    return 16;
                case 17:
                    return 17;
                case 18:
                    return 18;
                case 19:
                    return 19;
                case 20:
                    return 20;
                case 21:
                    return 21;
                case 22:
                    return 22;
                case 23:
                    return 23;
                case 24:
                    return 24;
                case 25:
                    return 25;
                case 26:
                    return 26;
                case 27:
                    return 27;
                case 28:
                    return 28;
                case 29:
                    return 29;
                case 30:
                    return 30;

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

    public class Dia28Model implements ComboBoxModel {

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
            return 31;
        }

        @Override
        public Object getElementAt(int i) {
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case 8:
                    return 8;
                case 9:
                    return 9;
                case 10:
                    return 10;
                case 11:
                    return 11;
                case 12:
                    return 12;
                case 13:
                    return 13;
                case 14:
                    return 14;
                case 15:
                    return 15;
                case 16:
                    return 16;
                case 17:
                    return 17;
                case 18:
                    return 18;
                case 19:
                    return 19;
                case 20:
                    return 20;
                case 21:
                    return 21;
                case 22:
                    return 22;
                case 23:
                    return 23;
                case 24:
                    return 24;
                case 25:
                    return 25;
                case 26:
                    return 26;
                case 27:
                    return 27;
                case 28:
                    return 28;

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

    public class DiaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if ((mesjC.getSelectedItem().equals(Month.JANUARY)) || (mesjC.getSelectedItem().equals(Month.JANUARY)) || (mesjC.getSelectedItem().equals(Month.MARCH))
                    || (mesjC.getSelectedItem().equals(Month.MAY)) || (mesjC.getSelectedItem().equals(Month.JULY)) || (mesjC.getSelectedItem().equals(Month.AUGUST))
                    || (mesjC.getSelectedItem().equals(Month.OCTOBER)) || (mesjC.getSelectedItem().equals(Month.DECEMBER))) {
                diajC.setModel(new Dia31Model());
            }
            if ((mesjC.getSelectedItem().equals(Month.FEBRUARY))) {
                diajC.setModel(new Dia28Model());
            }
            if ((mesjC.getSelectedItem().equals(Month.APRIL)) || (mesjC.getSelectedItem().equals(Month.JUNE)) || (mesjC.getSelectedItem().equals(Month.SEPTEMBER))
                    || (mesjC.getSelectedItem().equals(Month.NOVEMBER))) {
                diajC.setModel(new Dia30Model());
            }

        }

    }

    public class AñoModel implements ComboBoxModel {

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
            return 17;
        }

        @Override
        public Object getElementAt(int i) {
            switch (i) {
                case 1:
                    return Year.of(2020);
                case 2:
                    return Year.of(2021);
                case 3:
                    return Year.of(2022);
                case 4:
                    return Year.of(2023);
                case 5:
                    return Year.of(2024);
                case 6:
                    return Year.of(2025);
                case 7:
                    return Year.of(2026);
                case 8:
                    return Year.of(2027);

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

    public class clickDiaListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            d = true;

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

    public class clickMesListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            m = true;

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

    public class clickAñoListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            a = true;

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

    public class borrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            codPlanta.setText("");
            cmpCantidad.setText("");
            cmpCodigoPedido.setText("");
            cmpMuertes.setText("");
            cmpestadosiembra.setText("");
            cmpplanta.setText("");
            añojT.setText("");
            mesjT.setText("");
            diajT.setText("");

        }

    }
}
