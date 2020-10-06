package UI;

import Control.ControlPedidos;
import Modelo.Detalle_Pedido;
import Modelo.Distribuidor;
import Modelo.EstadoEntrega;
import Modelo.Pedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PedidoConfirmarEntregaUI extends javax.swing.JInternalFrame {

    private ControlPedidos controlPedidos;

    public PedidoConfirmarEntregaUI() {
        initComponents();
        controlPedidos = new ControlPedidos();
        this.TablePedidos.setModel(new PedidoTableModel());
        TablePedidos.updateUI();
        this.confEntregabtn.addActionListener(new ConfirmarEntregaListener());
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        setLocation(0, -32);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        confEntregabtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        TablePedidos.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablePedidos.setGridColor(new java.awt.Color(255, 255, 255));
        TablePedidos.setSelectionBackground(new java.awt.Color(133, 198, 90));
        TablePedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablePedidos);

        confEntregabtn.setBackground(new java.awt.Color(255, 255, 255));
        confEntregabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/confirmarentregabtn.png"))); // NOI18N
        confEntregabtn.setBorderPainted(false);
        confEntregabtn.setContentAreaFilled(false);

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/truck.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Confirmar Pedido Entregado");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(237, 237, 237)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Seleccione el pedido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confEntregabtn)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(confEntregabtn)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePedidos;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JButton confEntregabtn;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public class PedidoTableModel implements TableModel {

        @Override
        public int getRowCount() {
            return controlPedidos.getListaPedidos().size();
        }

        @Override
        public int getColumnCount() {
            return 6;
        }
        private String[] nombreColumnas = {"Código Pedido", "Distribuidor", "NIT", "Fecha", "Estado Entrega", "Total vendido", "Valor"};

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
            return columnIndex == 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Pedido pedido = controlPedidos.getListaPedidos().get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return pedido.getCodigo();
                case 1:
                    return pedido.getDistribuidor().getNombre();
                case 2:
                    return pedido.getDistribuidor().getNit();
                case 3:
                    return pedido.toString();
                case 4:
                    return pedido.getEstadoEntrega();
                case 5:
                    return pedido.getCant_vendida();
                case 6:
                    return pedido.getTotal();
            }
            return "";
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//            DetalleCompra detalle = compra.getListaDetallesCompra().get(rowIndex);
//            if (columnIndex != 3) {
//                return;
//            }
//            detalle.setCantidad((int) aValue);

        }

        @Override
        public void addTableModelListener(TableModelListener l) {

        }

        @Override
        public void removeTableModelListener(TableModelListener l) {

        }

    }

    public class ConfirmarEntregaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(TablePedidos.getSelectedRow() >= 0)) {
                JOptionPane.showMessageDialog(rootPane, "Seleccione un pedido");
            }
            try {
                long cod_pedido = (long) TablePedidos.getValueAt(TablePedidos.getSelectedRow(), 0);
                Pedido pedido = controlPedidos.buscarPedido(cod_pedido);
                pedido.setEstadoEntrega(EstadoEntrega.Entregado);
                controlPedidos.actualizarPedido(pedido);
                TablePedidos.updateUI();
                JOptionPane.showMessageDialog(rootPane, "Pedido entregado con éxito");
            } catch (Exception ex) {
                Logger.getLogger(PedidoConfirmarEntregaUI.class.getName()).log(Level.SEVERE, null, ex);
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
}
