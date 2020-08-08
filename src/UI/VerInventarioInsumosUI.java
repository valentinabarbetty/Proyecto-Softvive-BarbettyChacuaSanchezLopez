package UI;

import Control.ControlInsumos;
import Control.ControlDetalleGasto;
import Modelo.Detalle_Gasto;
import Modelo.Insumo;
import Modelo.Planta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class VerInventarioInsumosUI extends javax.swing.JInternalFrame {

    ControlInsumos ci = new ControlInsumos();

    ControlDetalleGasto dt = new ControlDetalleGasto();

    List<Insumo> listaInsumos = new ArrayList<>();
    List<Detalle_Gasto> listaDetalleGasto = new ArrayList<>();

    public VerInventarioInsumosUI() {

        initComponents();

        listaInsumos = ci.getListaInsumos();
        listaDetalleGasto = dt.getListaGastos();

        this.tableInventarioInsumos.setModel(new tablaInventarioListener());
        tableInventarioInsumos.updateUI();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventarioInsumos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel1.setText("Inventario Insumos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(380, 380, 380))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInventarioInsumos;
    // End of variables declaration//GEN-END:variables

    public class tablaInventarioListener implements TableModel {

        @Override
        public int getRowCount() {

//            return listaDetalleGasto.size();
            return listaInsumos.size();

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
            return i1 == 3;
        }

        @Override
        public Object getValueAt(int i, int i1) {

//            Detalle_Gasto detalle = listaDetalleGasto.get(i);
            Insumo insumo = listaInsumos.get(i);

            switch (i1) {

                case 0:
//                    detalle.getInsumo().getNombre();
                    insumo.getNombre();
                case 1:
//                    detalle.getInsumo().getDescripcion();
                    insumo.getDescripcion();
                case 2:
//                    detalle.getCantidad();
                    insumo.getDetalleGasto().getCantidad();
                case 3:
//                    detalle.getFecha();
                    insumo.getDetalleGasto().getFecha();

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

}
