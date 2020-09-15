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
    
    private ControlSiembra controlSiembra;
    private ControlPlantas controlPlantas;
    
    public SiembrasEditarUI() {
        
        initComponents();
        
        this.controlSiembra = new ControlSiembra();
        this.controlPlantas = new ControlPlantas();
        this.añojC.setModel(new AñoModel());
        this.mesjC.setModel(new MesModel());
        this.diajC.setModel(new Dia31Model());
        this.btonBuscarSiembra.addActionListener(new buscarSiembraListener());
        
        this.btonGuardar.addActionListener(new actualizarSiembraListener());
        this.btonCancelar.addActionListener(new CancelarListener());
        
        TextPrompt nombre = new TextPrompt("Ingrese el código", cmpCodigoPedido);
        this.plantasjCbx.setModel(new PlantasTableModel());
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
        jLabel22 = new javax.swing.JLabel();
        btonBuscarSiembra = new javax.swing.JButton();
        cmpMuertes = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        plantasjCbx = new javax.swing.JComboBox();
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
        añojC = new javax.swing.JComboBox<>();
        cmpplanta = new javax.swing.JTextField();
        cmpestadosiembra = new javax.swing.JTextField();
        cmpfecha = new javax.swing.JTextField();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(329, 329, 329)
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

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Fecha:");

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

        plantasjCbx.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        plantasjCbx.setForeground(new java.awt.Color(102, 102, 102));
        plantasjCbx.setBorder(null);

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

        mesjC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel25.setText("Día:");

        diajC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        diajC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diajCActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel26.setText("Mes:");

        añojC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btonCancelar)
                                    .addComponent(cmpfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(añojC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26))
                                    .addComponent(btonGuardar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btonBuscarSiembra))
                            .addComponent(jLabel24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cmpestadosiembra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmpMuertes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmpCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmpplanta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plantasjCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plantasjCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmpplanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmpCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cmpMuertes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpestadosiembra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añojC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btonCancelar)
                    .addComponent(btonGuardar))
                .addContainerGap(85, Short.MAX_VALUE))
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
    private javax.swing.JComboBox<String> añojC;
    private javax.swing.JButton btonBuscarSiembra;
    private javax.swing.JButton btonCancelar;
    private javax.swing.JButton btonGuardar;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField cmpCantidad;
    private javax.swing.JTextField cmpCodigoPedido;
    private javax.swing.JTextField cmpMuertes;
    private javax.swing.JTextField cmpestadosiembra;
    private javax.swing.JTextField cmpfecha;
    private javax.swing.JTextField cmpplanta;
    private javax.swing.JComboBox<String> diajC;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> mesjC;
    private javax.swing.JComboBox plantasjCbx;
    // End of variables declaration//GEN-END:variables

    public class PlantasTableModel implements ComboBoxModel {
        
        List<Planta> plantas = controlPlantas.getListaPlantas();
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
            return plantas.size();
        }
        
        @Override
        public Object getElementAt(int index) {
            return plantas.get(index);
        }
        
        @Override
        public void addListDataListener(ListDataListener l) {
            
        }
        
        @Override
        public void removeListDataListener(ListDataListener l) {
            
        }
        
    }
    
    public class actualizarSiembraListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Planta planta = (Planta) plantasjCbx.getSelectedItem();
                int cantidad = Integer.parseInt(cmpCantidad.getText());
                int muertes = Integer.parseInt(cmpMuertes.getText());
                Year año = (Year) añojC.getSelectedItem();
                Month mes = (Month) mesjC.getSelectedItem();
                int dia = (int) diajC.getSelectedItem();
                
                siembra.setDia(dia);
                siembra.setMes(mes);
                siembra.setAño(año);
                siembra.setCantidad(cantidad);
                siembra.setPlanta(planta);
                siembra.setMuertes(muertes);
                //siembra.setEstadoSiembra(estadoSiembra);

                controlSiembra.actualizarSiembra(siembra);
                
                JOptionPane.showMessageDialog(rootPane, "Siembra editada con éxito");
                //btonCancelar.doClick();
            } catch (Exception ex) {
                Logger.getLogger(UsuariosEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public class buscarSiembraListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            Long pk = Long.parseLong(cmpCodigoPedido.getText());
            
            try {
                
                siembra = controlSiembra.buscarSiembra(pk);
                cmpfecha.setText(siembra.getDia() + "/" + siembra.getMes().toString() + "/" + siembra.getAño().toString());
                añojC.setSelectedItem(siembra.getAño());
                mesjC.setSelectedItem(siembra.getMes());
                diajC.setSelectedItem(siembra.getDia());
                cmpplanta.setText(siembra.getPlanta().getNombre());
                plantasjCbx.setSelectedItem(siembra.getPlanta());
                cmpCantidad.setText(Integer.toString(siembra.getCantidad()));
                cmpMuertes.setText(Integer.toString(siembra.getMuertes()));
                cmpestadosiembra.setText(siembra.getEstadoSiembra().toString());
                //jcmbxEstado.setSelectedItem(siembra.getEstadoSiembra());

            } catch (Exception ex) {
                Logger.getLogger(SiembrasEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public class CancelarListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            int opcion = JOptionPane.showConfirmDialog(SiembrasEditarUI.this, rootPane, "¿Desea cancelar?", JOptionPane.OK_CANCEL_OPTION);
            
            if (opcion == JOptionPane.CANCEL_OPTION) {
                return;
            }
            if (opcion == JOptionPane.OK_OPTION) {
                
                añojC.setSelectedItem(null);
                mesjC.setSelectedItem(null);
                diajC.setSelectedItem(null);
                plantasjCbx.setSelectedItem(null);
                cmpMuertes.setText("");
                cmpCantidad.setText("");
                
            }
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
}
