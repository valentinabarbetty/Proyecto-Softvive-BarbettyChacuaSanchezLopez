package UI;

import Control.ControlPedidos;
import Modelo.Detalle_Pedido;
import Modelo.Pedido;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.Month;
import java.time.Year;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PedidoVerUI extends javax.swing.JInternalFrame {

    ControlPedidos controlPedidos;

    public PedidoVerUI() {
        initComponents();
        controlPedidos = new ControlPedidos();
        System.out.println(controlPedidos.getListaPedidos());

        this.pediTable.setModel(new PedidosTableModel());
        this.pediTable.addMouseListener(new clickPedido());
        dpTable.setModel(new DPTableModel());
//        this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pediTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dpTable = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(133, 198, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedidos");

        pediTable.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        pediTable.setModel(new javax.swing.table.DefaultTableModel(
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
        pediTable.setGridColor(new java.awt.Color(255, 255, 255));
        pediTable.setSelectionBackground(new java.awt.Color(133, 198, 90));
        pediTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(pediTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(473, 473, 473))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(438, 438, 438))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Detalles del pedido:");

        dpTable.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        dpTable.setModel(new javax.swing.table.DefaultTableModel(
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
        dpTable.setGridColor(new java.awt.Color(255, 255, 255));
        dpTable.setSelectionBackground(new java.awt.Color(133, 198, 90));
        dpTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(dpTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dpTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable pediTable;
    // End of variables declaration//GEN-END:variables
    public class PedidosTableModel implements TableModel {

        @Override
        public int getRowCount() {
            //return curso.getListaCupos().size();

            return controlPedidos.getListaPedidos().size();
        }

        @Override
        public int getColumnCount() {
            return 7;
        }
        private String[] nombreColumnas = {"Codigo", "Fecha", "EstadoPago", "EstadoEntregado", "Distribuidor", "Cant-vendida", "Valor Total"};

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
            Pedido pedido = controlPedidos.getListaPedidos().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return pedido.getCodigo();
                case 1:
                    return pedido.toString();
                case 2:
                    return pedido.getEstadoPago();
                case 3:
                    return pedido.getEstadoEntrega();
                case 4:
                    return pedido.getDistribuidor().getNombre();
                case 5:
                    return pedido.getCant_vendida();
                case 6:
                    return pedido.getTotal();
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

    public class clickPedido implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            int row = dpTable.getSelectedRow();
            Pedido p = controlPedidos.getListaPedidos().get(row + 1);
            dpTable.updateUI();
        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {

        }

        @Override
        public void mouseExited(MouseEvent me) {

        }
    }

    public class DPTableModel implements TableModel {

        @Override
        public int getRowCount() {
            int n = 0;
            if (pediTable.getSelectedRow() < 0) {
                n = 0;
            } else {

                int m = pediTable.getSelectedRow();
                Pedido p = controlPedidos.getListaPedidos().get(m);

                n = p.getListaDetallePedido().size();

            }
            return n;

        }

        @Override
        public int getColumnCount() {
            return 4;
        }
        private String[] nombreColumnas = {"Cód Planta", "Nombre planta", "Cantidad", "Costo"};

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
            int n = pediTable.getSelectedRow();
            Pedido p = controlPedidos.getListaPedidos().get(n);
            Detalle_Pedido dp = p.getListaDetallePedido().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return dp.getPlanta().getCodigo();
                case 1:
                    return dp.getPlanta().getNombre();
                case 2:
                    return dp.getCantidad();
                case 3:
                    return dp.getPrecio();
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
