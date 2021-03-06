package UI;

import Control.ControlPlantas;
import Control.ControlSiembra;
import Modelo.EstadoEntrega;
import Modelo.EstadoSiembra;
import Modelo.Planta;
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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

public class SiembrasAñadirUI extends javax.swing.JInternalFrame {

    private ControlPlantas controlPlantas;
    private ControlSiembra controlSiembra;
    private Siembra siembra;

    public SiembrasAñadirUI() {
        initComponents();
        controlPlantas = new ControlPlantas();
        controlSiembra = new ControlSiembra();
        this.plantajC.setModel(new PlantasListener());
        this.agregarSiembra.addActionListener(new AgregarSiembraListener());
        this.mesjC.setModel(new MesModel());
        //this.diajC.setModel(new Dia31Model());
        this.añojC.setModel(new AñoModel());
        this.añojC.addActionListener(new codSiembra());
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        plantajC.updateUI();
        this.plantajC.addActionListener(new UpdatePlantascbxListener());
        this.cancelarbtn.addActionListener(new borrarListener());
        this.mesjC.addActionListener(new DiaListener());
        setLocation(0, -32);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        cantjT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        codSiembra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        añojC = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        mesjC = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        diajC = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        plantajC = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        agregarSiembra = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Agregar nueva siembra");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
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

        cantjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cantjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cantjT.setSelectionColor(new java.awt.Color(133, 198, 90));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cantidad Sembrada:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Siembra No°");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setText("Año:");

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel19.setText("Mes:");

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("Día:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setText("Fecha de Siembra:");

        plantajC.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        plantajC.setForeground(new java.awt.Color(102, 102, 102));
        plantajC.setBorder(null);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione la planta:");

        agregarSiembra.setBackground(new java.awt.Color(255, 255, 255));
        agregarSiembra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/agregarbtn.png"))); // NOI18N
        agregarSiembra.setBorderPainted(false);
        agregarSiembra.setContentAreaFilled(false);

        cancelarbtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        cancelarbtn.setBorderPainted(false);
        cancelarbtn.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(añojC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addGap(4, 4, 4)
                                .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantjT, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelarbtn)
                            .addComponent(plantajC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(223, 223, 223)
                        .addComponent(agregarSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codSiembra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(añojC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plantajC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(244, 244, 244))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarSiembra;
    private javax.swing.JComboBox<String> añojC;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField cantjT;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel codSiembra;
    private javax.swing.JComboBox<String> diajC;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mesjC;
    private javax.swing.JComboBox plantajC;
    // End of variables declaration//GEN-END:variables

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

    public class codSiembra implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (controlSiembra.getListaSiembras().isEmpty()) {
                codSiembra.setText(Long.toString(1));

            } else {
                long size = controlSiembra.getListaSiembras().size() - 1;
                Siembra s = controlSiembra.getListaSiembras().get((int) size);

                codSiembra.setText(Long.toString(s.getPk() + 1));
            }

        }

    }

    public JComboBox getPlantajC() {
        return plantajC;
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
            return 32;
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

    public class PlantasListener implements ComboBoxModel {

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

    public class AgregarSiembraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Year año = (Year) añojC.getSelectedItem();
                Month mes = (Month) mesjC.getSelectedItem();
                int dia = (int) diajC.getSelectedItem();
                int cantidad = Integer.parseInt(cantjT.getText());
                Planta p = (Planta) plantajC.getSelectedItem();
                EstadoSiembra es = EstadoSiembra.GERMINACION;
                siembra = new Siembra(dia, mes, año, cantidad, p, 0, es);
                siembra.setPk(Long.parseLong(codSiembra.getText()));
                controlSiembra.agregarSiembra(siembra);
                JOptionPane.showMessageDialog(rootPane, "Siembra agregada con éxito");
                cancelarbtn.doClick();
            } catch (Exception ex) {
                Logger.getLogger(PedidoAgregarUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class UpdatePlantascbxListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                plantajC.updateUI();
            } catch (Exception ex) {
                Logger.getLogger(PedidoAgregarUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class borrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cantjT.setText("");
            diajC.setSelectedItem(null);
            codSiembra.setText("");

        }

    }

}
