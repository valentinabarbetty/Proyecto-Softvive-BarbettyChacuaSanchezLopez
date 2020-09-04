package UI;

import Control.ControlDetallePedido;
import Control.ControlIngresos;
import Control.ControlPedidos;
import Modelo.Detalle_Pedido;
import Modelo.Distribuidor;
import Modelo.Ingreso;
import Modelo.Pedido;
import Modelo.Planta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class IngresosUI extends javax.swing.JInternalFrame {

    Pedido pedido;
    Distribuidor distribuidor;
    Ingreso ingreso;
    Planta planta;
    ControlPedidos cp = new ControlPedidos();
    ControlIngresos ci = new ControlIngresos();
    ControlDetallePedido dp = new ControlDetallePedido();
    int Valortotalpedido = 0;
    int cantidadtotalpedido = 0;

    /**
     * Creates new form NewJFrame
     */
    public IngresosUI() {

        initComponents();

        this.agregarbtn.addActionListener(new agregarIngresoListener());
        this.cancelarbtn.addActionListener(new CancelarListener());
        BuscarPedidoListener bpl = new BuscarPedidoListener();
        this.buscarbtn.addActionListener(bpl);

        entregajT.setEditable(false);
        vlrVendidojT.setEditable(false);
        pagojT.setEditable(false);
        nitjT.setEditable(false);
        nomCliejT.setEditable(false);
        cantProdjT.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingresoTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        agregarbtn = new javax.swing.JButton();
        cantProdjT = new javax.swing.JTextField();
        vlrVendidojT = new javax.swing.JTextField();
        pagojT = new javax.swing.JTextField();
        cancelarbtn = new javax.swing.JButton();
        pedidojT = new javax.swing.JTextField();
        nomCliejT = new javax.swing.JTextField();
        nitjT = new javax.swing.JTextField();
        buscarbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        entregajT = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Agregar Ingresos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Número de pedido:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nit:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nombre cliente:");

        ingresoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Producto", "Cantidad vendida", "Valor unitario", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(ingresoTable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Estado de pago:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cantidad total de productos vendidos:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Valor total vendido:");

        agregarbtn.setText("Agregar Ingreso");

        cantProdjT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        vlrVendidojT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        pagojT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cancelarbtn.setText("Cancelar");

        pedidojT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        nomCliejT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        nitjT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buscarbtn.setText(". . .");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Estado de entrega:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(pedidojT, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(buscarbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(nitjT, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(nomCliejT, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(11, 11, 11)
                                .addComponent(entregajT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(cantProdjT, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11)
                                .addComponent(pagojT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190)
                                .addComponent(jLabel7)
                                .addGap(10, 10, 10)
                                .addComponent(vlrVendidojT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelarbtn)
                                .addGap(595, 595, 595)
                                .addComponent(agregarbtn)))
                        .addGap(42, 42, 42)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(buscarbtn)
                    .addComponent(pedidojT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(nitjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nomCliejT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(entregajT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(cantProdjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(pagojT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(vlrVendidojT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarbtn)
                    .addComponent(agregarbtn))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarbtn;
    private javax.swing.JButton buscarbtn;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField cantProdjT;
    private javax.swing.JTextField entregajT;
    private javax.swing.JTable ingresoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nitjT;
    private javax.swing.JTextField nomCliejT;
    private javax.swing.JTextField pagojT;
    private javax.swing.JTextField pedidojT;
    private javax.swing.JTextField vlrVendidojT;
    // End of variables declaration//GEN-END:variables

    public class BuscarPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String codigo = pedidojT.getText();
            try {
                pedido = cp.buscarPedido(codigo);
                nitjT.setText(Long.toString(pedido.getDistribuidor().getNit()));
                nomCliejT.setText(pedido.getDistribuidor().getNombre());
            //    entregajT.setText(pedido.getEstadoEntregado());
                pagojT.setText(pedido.getEstadoPago());

                ingresoTable.setModel(new IngresosTableModel());
                for (int i = 0; i < pedido.getListaDetallePedido().size(); i++) {

                    cantidadtotalpedido = cantidadtotalpedido + pedido.getListaDetallePedido().get(i).getCantidad();
                    Valortotalpedido = Valortotalpedido + (pedido.getListaDetallePedido().get(i).getCantidad() * pedido.getListaDetallePedido().get(i).getPlanta().getValor_unitario());

                }
                cantProdjT.setText(Integer.toString(cantidadtotalpedido));
                vlrVendidojT.setText(Integer.toString(Valortotalpedido));
            } catch (Exception ex) {
                Logger.getLogger(IngresosUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public class agregarIngresoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                String codigo = pedidojT.getText();
                int total = Integer.parseInt(vlrVendidojT.getText());

                Pedido pedido = new Pedido(codigo,distribuidor);

                ingreso = new Ingreso(total, pedido);
                ingresoTable.updateUI();

                pedidojT.setText("");
                nitjT.setText("");
                nomCliejT.setText("");

                cantProdjT.setText("");
                vlrVendidojT.setText("");
                entregajT.setText("");
                pagojT.setText("");

                try {
                    ci.agregarIngresos(ingreso);
                    JOptionPane.showMessageDialog(rootPane, "El ingreso a sido realizado exitosamente");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getMessage());
                }

            } catch (Exception ex) {
                Logger.getLogger(IngresosUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class IngresosTableModel implements TableModel {

        @Override
        public int getRowCount() {
            return pedido.getListaDetallePedido().size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Detalle_Pedido detalle = pedido.getListaDetallePedido().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return detalle.getPlanta().getNombre();
                case 1:

                    return detalle.getCantidad();
                case 2:
                    return detalle.getPlanta().getValor_unitario();
                case 3:
                    int valorsubtotal = detalle.getCantidad() * detalle.getPlanta().getValor_unitario();
                    return valorsubtotal;
            }
            return " ";
        }

        private String[] nombreColumnas = {"Nombre Producto", "Cantidad Vendida", "Vlr. unidad", "Subtotal"};

        @Override
        public String getColumnName(int columnIndex) {
            return nombreColumnas[columnIndex];
        }

        private Class[] tipoColumnas = {Integer.class, Integer.class, Integer.class, Integer.class};

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            // return String.class;
            return tipoColumnas[columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        }

        @Override
        public void addTableModelListener(TableModelListener l) {

        }

        @Override
        public void removeTableModelListener(TableModelListener l) {

        }

    }

    public class CancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            pedidojT.setText("");
            nitjT.setText("");
            nomCliejT.setText("");
            cantProdjT.setText("");
            vlrVendidojT.setText("");
            entregajT.setText("");
            pagojT.setText("");

            ingresoTable.updateUI();
            JOptionPane.showMessageDialog(rootPane, "El ingreso se cancelo");
        }
    }

}
