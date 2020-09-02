package UI;

import Control.ControlPlantas;
import Modelo.Planta;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PlantasVerUI extends javax.swing.JInternalFrame {

    private ControlPlantas controlPlantas;

    public PlantasVerUI() {
        initComponents();
        controlPlantas = new ControlPlantas();
        plantasTable.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 12));
        plantasTable.getTableHeader().setOpaque(false);
        plantasTable.getTableHeader().setBackground(Color.white);
        plantasTable.getTableHeader().setForeground(Color.black);

        plantasTable.setModel(new PlantasTableModel());
        plantasTable.updateUI();
//        d.addActionListener(new verListener());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plantasTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(133, 198, 90));
        jPanel1.setForeground(new java.awt.Color(133, 198, 90));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Plantas Registradas");

        plantasTable.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        plantasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        plantasTable.setGridColor(new java.awt.Color(255, 255, 255));
        plantasTable.setSelectionBackground(new java.awt.Color(133, 198, 90));
        plantasTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(plantasTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable plantasTable;
    // End of variables declaration//GEN-END:variables

    public class PlantasTableModel implements TableModel {

        @Override
        public int getRowCount() {
            //return curso.getListaCupos().size();

            return controlPlantas.getListaPlantas().size();
        }

        @Override
        public int getColumnCount() {
            return 6;
        }
        private String[] nombreColumnas = {"Código", "Nombre", "Tiempo de germinación", "Tiempo de crecimiento", "Tipo de reproducción", "Precio"};

        @Override
        public String getColumnName(int columnIndex) {
            return nombreColumnas[columnIndex];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return String.class;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex == 1;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            //Cupo cupo = curso.getListaCupos().get(rowIndex);
            Planta planta = controlPlantas.getListaPlantas().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return planta.getCodigo();
                case 1:
                    return planta.getNombre();
                case 2:
                    return planta.getTiempoCrecimiento();
                case 3:
                    return planta.getTiempoGerminacion();
                case 4:
                    return planta.getTipoReproduccion();
                case 5:
                    return planta.getValor_unitario();
            }
            return "";
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addTableModelListener(TableModelListener l) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeTableModelListener(TableModelListener l) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public class verListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            plantasTable.updateUI();
            // System.out.println(controlPlantas.getListaPlantas().size());
        }

    }

}
