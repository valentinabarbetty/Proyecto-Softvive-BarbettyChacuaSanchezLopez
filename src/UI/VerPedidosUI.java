package UI;

import Control.ControlPedidos;
import Modelo.Pedido;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.Year;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class VerPedidosUI extends javax.swing.JInternalFrame {

    ControlPedidos controlPedidos;

    public VerPedidosUI() {
        initComponents();
        controlPedidos = new ControlPedidos();
        System.out.println(controlPedidos.getListaPedidos());

        this.pediTable.setModel(new PedidosTableModel());
//        this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pediTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(133, 198, 90));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(133, 198, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedidos");

        pediTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
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
        pediTable.setRowHeight(25);
        pediTable.setShowHorizontalLines(false);
        pediTable.setShowVerticalLines(false);
        pediTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(pediTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(510, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(473, 473, 473))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
            return 6;
        }
        private String[] nombreColumnas = {"Codigo", "Fecha", "EstadoPago", "EstadoEntregado", "Distribuidor", "Cant-vendida"};

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
                    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
                    String fecha = formateador.format(pedido.getFecha());
                    return fecha;
                case 2:
                    return pedido.getEstadoPago();
                case 3:
                    return pedido.getEstadoEntrega();
                case 4:
                    return pedido.getDistribuidor().getNombre();
                case 5:
                    return pedido.getCant_vendida();
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
