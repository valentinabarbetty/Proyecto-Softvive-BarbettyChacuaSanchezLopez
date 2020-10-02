package UI;

import Control.ControlInsumos;
import Control.ControlDetalleGasto;
import Control.ControlHerramienta;
import Modelo.Detalle_Gasto;
import Modelo.Herramienta;
import Modelo.Insumo;
import Modelo.Planta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class InventarioVer extends javax.swing.JInternalFrame {

    private ControlInsumos controlInsumos;
    private ControlHerramienta controlHerramienta;
    private int cantidadI;

    public InventarioVer() {

        initComponents();

        this.controlInsumos = new ControlInsumos();
        this.controlHerramienta = new ControlHerramienta();

        this.tableInventarioInsumos.setModel(new tablaInsumoListener());
        this.tableInventarioHerramientas.setModel(new tablaHerramientaListener());

        tableInventarioInsumos.updateUI();
        tableInventarioHerramientas.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventarioInsumos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInventarioHerramientas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        tableInventarioInsumos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableInventarioInsumos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Inventario");

        tableInventarioHerramientas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableInventarioHerramientas);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Herramientas:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Insumos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableInventarioHerramientas;
    private javax.swing.JTable tableInventarioInsumos;
    // End of variables declaration//GEN-END:variables

    public class tablaInsumoListener implements TableModel {

        @Override
        public int getRowCount() {

            return controlInsumos.getListaInsumos().size();

        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        private String[] nombreTable = {"Nombre", "Descripcion", "Cantidad existente", "Fecha"};

        @Override
        public String getColumnName(int i) {
            return nombreTable[i];
        }

        private Class[] classType = {String.class, String.class, Integer.class, String.class};

        @Override
        public Class<?> getColumnClass(int i) {
            return classType[i];
        }

        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }

        @Override
        public Object getValueAt(int i, int i1) {

            Insumo insumo = controlInsumos.getListaInsumos().get(i);
            updateUI();

            switch (i1) {

                case 0:
                    return insumo.getNombre();
                case 1:
                    return insumo.getDescripcion();
                case 2:

                    for (int t = 0; t < insumo.getListaGastoInsumo().size(); t++) {

                        cantidadI = insumo.getListaGastoInsumo().get(t).getCantidad();
                    }
                    return cantidadI;
                case 3:

                    for (int t = 0; t < insumo.getListaGastoInsumo().size(); t++) {

                        return insumo.getListaGastoInsumo().get(t).getFecha();
                    }
            }

            return "";
        }

        @Override
        public void setValueAt(Object o, int i, int i1) {
//
        }

        @Override
        public void addTableModelListener(TableModelListener tl) {
//
        }

        @Override
        public void removeTableModelListener(TableModelListener tl) {
//
        }

    }

    public class tablaHerramientaListener implements TableModel {

        @Override
        public int getRowCount() {

            return controlHerramienta.getListaHerramientas().size();

        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        private String[] nombreTable = {"Nombre", "Descripcion", "Cantidad existente", "Fecha"};

        @Override
        public String getColumnName(int i) {
            return nombreTable[i];
        }

        private Class[] classType = {String.class, String.class, Integer.class, String.class};

        @Override
        public Class<?> getColumnClass(int i) {
            return classType[i];
        }

        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }

        @Override
        public Object getValueAt(int i, int i1) {

            Herramienta herramienta = controlHerramienta.getListaHerramientas().get(i);
            updateUI();

//            int posicion = 0;
            switch (i1) {

                case 0:
                    return herramienta.getNombre();
                case 1:
                    return herramienta.getDescripcion();
                case 2:

                    for (int t = 0; t < herramienta.getListaGastoHerramienta().size(); t++) {
                        int cantidadH = herramienta.getListaGastoHerramienta().get(t).getCantidad();
                        return cantidadH;
                    }
                case 3:

                    for (int t = 0; t < herramienta.getListaGastoHerramienta().size(); t++) {
                        return herramienta.getListaGastoHerramienta().get(t).getFecha();
                    }

            }

            return "";
        }

        @Override
        public void setValueAt(Object o, int i, int i1) {

        }

        @Override
        public void addTableModelListener(TableModelListener tl) {

        }

        @Override
        public void removeTableModelListener(TableModelListener tl) {

        }

    }

    public JTable getTableInventarioHerramientas() {
        return tableInventarioHerramientas;
    }

    public JTable getTableInventarioInsumos() {
        return tableInventarioInsumos;
    }

}
