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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class IngresosAñadirUI extends javax.swing.JInternalFrame {

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
     * Creates new form SiembrasAñadirUI
     */
    public IngresosAñadirUI() {
        initComponents();
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        setLocation(0, -32);

        this.agregarbtn.addActionListener(new agregarIngresoListener());
        this.cancelarbtn.addActionListener(new CancelarListener());
        BuscarPedidoListener bpl = new BuscarPedidoListener();
        this.buscarbtn.addActionListener(bpl);
        this.conPagojT.addActionListener(new confirmarPago());

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

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pedidojT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nitjT = new javax.swing.JTextField();
        nomCliejT = new javax.swing.JTextField();
        entregajT = new javax.swing.JTextField();
        pagojT = new javax.swing.JTextField();
        vlrVendidojT = new javax.swing.JTextField();
        buscarbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingresoTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        agregarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        conPagojT = new javax.swing.JButton();
        cantProdjT = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Agregar nuevo Ingreso");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Número de pedido:");

        pedidojT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pedidojT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pedidojT.setSelectionColor(new java.awt.Color(133, 198, 90));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("NIT:");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Nombre Cliente:");

        nitjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nitjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nitjT.setSelectionColor(new java.awt.Color(133, 198, 90));

        nomCliejT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nomCliejT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nomCliejT.setSelectionColor(new java.awt.Color(133, 198, 90));

        entregajT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        entregajT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        entregajT.setSelectionColor(new java.awt.Color(133, 198, 90));

        pagojT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pagojT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pagojT.setSelectionColor(new java.awt.Color(133, 198, 90));

        vlrVendidojT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        vlrVendidojT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        vlrVendidojT.setSelectionColor(new java.awt.Color(133, 198, 90));

        buscarbtn.setForeground(new java.awt.Color(51, 255, 51));
        buscarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscar.png"))); // NOI18N
        buscarbtn.setBorder(null);
        buscarbtn.setBorderPainted(false);
        buscarbtn.setContentAreaFilled(false);

        ingresoTable.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        ingresoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ingresoTable.setGridColor(new java.awt.Color(255, 255, 255));
        ingresoTable.setSelectionBackground(new java.awt.Color(133, 198, 90));
        ingresoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(ingresoTable);

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Valor total vendido:");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Cantidad total de productos vendidos:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Estado de entrega:");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Estado de pago:");

        agregarbtn.setForeground(new java.awt.Color(51, 255, 51));
        agregarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonAdd.png"))); // NOI18N
        agregarbtn.setBorder(null);
        agregarbtn.setBorderPainted(false);
        agregarbtn.setContentAreaFilled(false);

        cancelarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        cancelarbtn.setBorder(null);
        cancelarbtn.setBorderPainted(false);
        cancelarbtn.setContentAreaFilled(false);
        cancelarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        conPagojT.setForeground(new java.awt.Color(51, 255, 51));
        conPagojT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/btnConfPago_1.png"))); // NOI18N
        conPagojT.setBorder(null);
        conPagojT.setBorderPainted(false);
        conPagojT.setContentAreaFilled(false);

        cantProdjT.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cantProdjT.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cantProdjT.setSelectionColor(new java.awt.Color(133, 198, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(cancelarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(entregajT, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(pagojT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(agregarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantProdjT, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(vlrVendidojT)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(conPagojT, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nitjT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(pedidojT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomCliejT))
                                .addGap(32, 32, 32)
                                .addComponent(buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(pedidojT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarbtn))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(nitjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(nomCliejT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(entregajT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantProdjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel13)
                    .addComponent(pagojT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vlrVendidojT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(conPagojT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(agregarbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarbtn;
    private javax.swing.JButton buscarbtn;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField cantProdjT;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JButton conPagojT;
    private javax.swing.JTextField entregajT;
    private javax.swing.JTable ingresoTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nitjT;
    private javax.swing.JTextField nomCliejT;
    private javax.swing.JTextField pagojT;
    private javax.swing.JTextField pedidojT;
    private javax.swing.JTextField vlrVendidojT;
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

    public class BuscarPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (pedidojT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "El campo codigo está vacio");
            } else {
                long codigo = Long.parseLong(pedidojT.getText());
                try {
                    pedido = cp.buscarPedido(codigo);

                    nitjT.setText(Long.toString(pedido.getDistribuidor().getNit()));
                    nomCliejT.setText(pedido.getDistribuidor().getNombre());
                    entregajT.setText(pedido.getEstadoEntrega().toString());
                    pagojT.setText(pedido.getEstadoPago());

                    ingresoTable.setModel(new IngresosTableModel());
                    for (int i = 0; i < pedido.getListaDetallePedido().size(); i++) {

                        cantidadtotalpedido = cantidadtotalpedido + pedido.getListaDetallePedido().get(i).getCantidad();
                        Valortotalpedido = Valortotalpedido + (pedido.getListaDetallePedido().get(i).getCantidad() * pedido.getListaDetallePedido().get(i).getPlanta().getValor_unitario());

                    }
                    cantProdjT.setText(Integer.toString(cantidadtotalpedido));
                    vlrVendidojT.setText(Integer.toString(Valortotalpedido));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "El codigo es incorrecto");
                    Logger.getLogger(IngresosUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public class confirmarPago implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (pagojT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "El campo está vacio");
            } else {
                try {

                    pedido.setEstadoPago("Pago");
                    pagojT.setText(pedido.getEstadoPago());
                    JOptionPane.showMessageDialog(rootPane, "El pago se ha confirmado");

                } catch (Exception ex) {
                    Logger.getLogger(IngresosUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public class agregarIngresoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (pedidojT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No hay datos que ingresar");
            } else {

                try {
                    int total = Integer.parseInt(vlrVendidojT.getText());

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
                        ingresoTable.setModel(new DefaultTableModel());
                        cp.actualizarPedido(pedido);
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
