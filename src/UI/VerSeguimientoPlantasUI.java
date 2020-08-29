package UI;

import Control.ControlSiembra;
import Modelo.Planta;
import Modelo.Siembra;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class VerSeguimientoPlantasUI extends javax.swing.JInternalFrame {

    private ControlSiembra controlSiembra;

    public VerSeguimientoPlantasUI() {
        initComponents();
        controlSiembra = new ControlSiembra();
        this.seguTable.setModel(new SiembraTableModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        seguTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        seguTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(seguTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Seguimiento de Plantas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable seguTable;
    // End of variables declaration//GEN-END:variables

    public class SiembraTableModel implements TableModel {

        @Override
        public int getRowCount() {
            //return curso.getListaCupos().size();

            return controlSiembra.getListaSiembras().size();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }
        private String[] nombreColumnas = {"Nombre Planta", "Cantidad Sembrada", "Fecha de siembra", "Tiempo de germinación", "Tiempo de crecimiento"};

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
            Siembra siembra = controlSiembra.getListaSiembras().get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return siembra.getPlanta().getNombre();
                case 1:
                    return siembra.getCantidad();
                case 2:
                    return siembra.getFecha();
                case 3:
                    return siembra.getPlanta().getTiempoGerminacion();
                case 4:
                    return siembra.getPlanta().getTiempoCrecimiento();

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

}
