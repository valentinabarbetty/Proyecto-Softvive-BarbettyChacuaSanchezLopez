package UI;

import Control.ControlInsumos;
import Control.ControlDetalleGasto;
import Control.ControlHerramienta;
import Modelo.Detalle_Gasto;
import Modelo.Herramienta;
import Modelo.Insumo;
import Modelo.Planta;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());

        tableInventarioInsumos.updateUI();
        tableInventarioHerramientas.updateUI();
        setLocation(-7, -32);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventarioInsumos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableInventarioHerramientas = new javax.swing.JTable();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/list (1).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Inventario registrado");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
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

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Herramientas:");

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Insumos:");

        tableInventarioInsumos.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
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
        tableInventarioInsumos.setGridColor(new java.awt.Color(255, 255, 255));
        tableInventarioInsumos.setSelectionBackground(new java.awt.Color(133, 198, 90));
        tableInventarioInsumos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableInventarioInsumos);

        tableInventarioHerramientas.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
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
        tableInventarioHerramientas.setGridColor(new java.awt.Color(255, 255, 255));
        tableInventarioHerramientas.setSelectionBackground(new java.awt.Color(133, 198, 90));
        tableInventarioHerramientas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tableInventarioHerramientas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableInventarioHerramientas;
    private javax.swing.JTable tableInventarioInsumos;
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
