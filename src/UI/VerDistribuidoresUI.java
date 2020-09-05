package UI;

import Control.ControlDistribuidores;
import Modelo.Distribuidor;
import Modelo.Planta;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class VerDistribuidoresUI extends javax.swing.JInternalFrame {

    ControlDistribuidores controlDistribuidores;

    public VerDistribuidoresUI() {
        initComponents();
        controlDistribuidores = new ControlDistribuidores();
        this.distriTable.setModel(new DistribuidoresTableModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        distriTable = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Distribuidores");

        distriTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(distriTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(428, 428, 428))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable distriTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public class DistribuidoresTableModel implements TableModel {

        @Override
        public int getRowCount() {
            //return curso.getListaCupos().size();

            return controlDistribuidores.getListaDistribuidores().size();
        }

        @Override
        public int getColumnCount() {
            return 6;
        }
        private String[] nombreColumnas = {"Nit", "Nombre", "Teléfono", "E-mail", "Dirección", "Ciudad"};

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
            Distribuidor distribuidor = controlDistribuidores.getListaDistribuidores().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return distribuidor.getNit();
                case 1:
                    return distribuidor.getNombre();
                case 2:
                    return distribuidor.getTelefono();
                case 3:
                    return distribuidor.getDireccion();
                case 4:
                    return distribuidor.getEmail();
                case 5:
                    return distribuidor.getCiudad();
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
//
}
