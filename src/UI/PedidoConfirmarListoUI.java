package UI;

import Modelo.Pedido;
import Modelo.Distribuidor;
import Modelo.Planta;
import Control.ControlDetallePedido;
import Control.ControlDetalleGasto;
import Control.ControlDistribuidores;
import Control.ControlPedidos;
import Control.ControlPlantas;
import Modelo.Detalle_Gasto;
import Modelo.Detalle_Pedido;
import Modelo.EstadoListo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PedidoConfirmarListoUI extends javax.swing.JInternalFrame {

    private Pedido pedido;

    private ControlPedidos controlPedidos;

    private ControlDetallePedido controlDetallePedido;
    private ControlDetalleGasto controlDetalleGasto;
    private ControlPlantas controlPlantas;
    private int Disponible;

    public PedidoConfirmarListoUI() {

        initComponents();

        pedidoTable.updateUI();
        detalleTable.updateUI();

        this.pedidoTable.setModel(new PedidoTableModel());
        this.pedidoTable.addMouseListener(new clickPedido());

        this.pedido = new Pedido();

        this.detalleTable.setModel(new dPTableModel());
        this.controlPedidos = new ControlPedidos();
        this.controlDetallePedido = new ControlDetallePedido();
        this.controlDetalleGasto = new ControlDetalleGasto();
        this.controlPlantas = new ControlPlantas();
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());

        this.cancelarbtn.addActionListener(new ConfirmarPedido());
        
        this.btnAgregar.addActionListener(new cantidadDisponibles());
        this.btnActualizar.addActionListener(new cantidadDisponibles());
        this.cmpCantidad.addActionListener(new cantidadDisponibles());

        setLocation(0, -32);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmpDisponible = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidoTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalleTable = new javax.swing.JTable();
        cancelarbtn = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmpCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/check.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Confirmar Pedido Listo");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(30, 30, 30)
                .addComponent(jLabel17)
                .addGap(218, 218, 218)
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

        pedidoTable.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        pedidoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        pedidoTable.setGridColor(new java.awt.Color(255, 255, 255));
        pedidoTable.setSelectionBackground(new java.awt.Color(133, 198, 90));
        pedidoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(pedidoTable);

        detalleTable.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        detalleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        detalleTable.setGridColor(new java.awt.Color(255, 255, 255));
        detalleTable.setSelectionBackground(new java.awt.Color(133, 198, 90));
        detalleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(detalleTable);

        cancelarbtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/confbtn.png"))); // NOI18N
        cancelarbtn.setBorderPainted(false);
        cancelarbtn.setContentAreaFilled(false);

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actbtn.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Detalles del pedido:");

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Resumen del Pedido:");

        btnAgregar.setForeground(new java.awt.Color(51, 255, 51));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscar.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Ingresar cantidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(657, 657, 657)
                        .addComponent(cmpDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 108, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(cancelarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(cmpCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmpDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel18)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmpCantidad)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarbtn)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField cmpCantidad;
    private javax.swing.JLabel cmpDisponible;
    private javax.swing.JTable detalleTable;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pedidoTable;
    // End of variables declaration//GEN-END:variables

    public class PedidoTableModel implements TableModel {

        @Override
        public int getRowCount() {
            return controlPedidos.getListaPedidos().size();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        private String[] nombreColumnas = {"Estado", "Pago", "Codigo", "Distribuidor", "CostoTotal"};

        @Override
        public String getColumnName(int i) {
            return nombreColumnas[i];
        }

        //private Class[] tipoColumnas = {String.class, Integer.class, Integer.class, Integer.class, Integer.class};
        @Override
        public Class<?> getColumnClass(int i) {
            return String.class;
        }

        @Override
        public boolean isCellEditable(int i, int i1) {
            return i1 == 0;
        }

        @Override
        public Object getValueAt(int i, int i1) {
            pedido = controlPedidos.getListaPedidos().get(i);

            switch (i1) {
                case 0:
                    return pedido.getEstadoListo();
                case 1:
                    return pedido.getEstadoPago();
                case 2:
                    return pedido.getCodigo();
                case 3:
                    return pedido.getDistribuidor().getNombre();
                case 4:
                    return pedido.getTotal();

            }
            return " ";
        }

        @Override
        public void setValueAt(Object o, int i, int i1) {
            /////////////////////////////////////////////////////////////////////
        }

        @Override
        public void addTableModelListener(TableModelListener tl) {

        }

        @Override
        public void removeTableModelListener(TableModelListener tl) {
        }

    }

    public class dPTableModel implements TableModel {

        @Override
        public int getRowCount() {

            int dp = 0;
            if (pedidoTable.getSelectedRow() < 0) {
                dp = 0;
            } else {

                int f = pedidoTable.getSelectedRow();
                Pedido p = controlPedidos.getListaPedidos().get(f);

                dp = p.getListaDetallePedido().size();

            }
            return dp;

        }

        @Override
        public int getColumnCount() {
            return 5;

        }

        private String[] nombreColumnas = {"Codigo Planta", "Nombre", "Cantidad pedido", "Vlr Unitario", "Costo"};

        @Override
        public String getColumnName(int i) {
            return nombreColumnas[i];
        }

        private Class[] tipoColumnas = {String.class, String.class, Integer.class, Integer.class, Integer.class};

        @Override
        public Class<?> getColumnClass(int i) {
            return tipoColumnas[i];
        }

        @Override
        public boolean isCellEditable(int i, int i1) {
            return i1 == 5;

        }

        @Override
        public Object getValueAt(int i, int i1) {

            int dp = pedidoTable.getSelectedRow();
            pedido = controlPedidos.getListaPedidos().get(dp);
            Detalle_Pedido detalle = pedido.getListaDetallePedido().get(i);

            switch (i1) {

                case 0:
                    return detalle.getPlanta().getCodigo();
                case 1:
                    return detalle.getPlanta().getNombre();
                case 2:
                    return detalle.getCantidad();
                case 3:
                    return detalle.getPlanta().getValor_unitario();
                case 4:
                    return detalle.getPrecio();
            }
            return " ";

        }

        @Override
        public void setValueAt(Object o, int i, int i1) {
            //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addTableModelListener(TableModelListener tl) {
            //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeTableModelListener(TableModelListener tl) {
            //To change body of generated methods, choose Tools | Templates.
        }

    }

    public class clickPedido implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            int row = detalleTable.getSelectedRow();
            Pedido p = controlPedidos.getListaPedidos().get(row + 1);
            detalleTable.updateUI();
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

//////////////////////
//    public class cantidadDisponible implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            try {
//
////                if (cmpCantidad.getText().equals("")) {
////                    JOptionPane.showMessageDialog(rootPane, "Debe debe ingresar cantidad");
////                } else {
//                String codPlanta = (String) detalleTable.getValueAt(detalleTable.getSelectedRow(), 0);
//
//                Planta planta = controlPlantas.buscarPlanta(codPlanta);
//
//                for (int t = 0; t < planta.getListaDetalleGasto().size(); t++) {
//
//                    Detalle_Gasto gasto = planta.getListaDetalleGasto().get(t);
//                    gasto.setCantidad(Integer.parseInt(cmpCantidad.getText()));
//
//                    // controlDetalleGasto.ActualizarDetalleGasto(gasto);
//                    controlDetalleGasto.agregarDetalleGasto(gasto);
//
//                    pedidoTable.updateUI();
//                    detalleTable.updateUI();
//                }
////                }
//
//            } catch (Exception ex) {
//                Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//
//    }
    public class cantidadDisponibles implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                Long codPed = (Long) pedidoTable.getValueAt(pedidoTable.getSelectedRow(), 2);
                pedido = controlPedidos.buscarPedido(codPed);

                int cantidad = Integer.parseInt(cmpCantidad.getText());

                for (int t = 0; t < pedido.getListaDetallePedido().size(); t++) {

                    Detalle_Pedido d = pedido.getListaDetallePedido().get(t);

                    int totalAnterior = (int) pedidoTable.getValueAt(pedidoTable.getSelectedRow(), 4);
                    int total = totalAnterior - d.getPrecio();

                    pedido.setTotal(total);

                    d.setCantidad(cantidad);
                    
                    d.setPrecio(d.getPlanta().getValor_unitario() * cantidad);
                    pedido.setTotal(total + d.getPrecio());

                    pedidoTable.setValueAt(Integer.toString(total + d.getPrecio()), pedidoTable.getSelectedRow(), 4);
                    
                    controlDetallePedido.actualizarDPedido(d);
                    controlPedidos.actualizarPedido(pedido);

                    pedidoTable.updateUI();
                    detalleTable.updateUI();

                }

            } catch (Exception ex) {
                Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class ConfirmarPedido implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                Long cod = (long) pedidoTable.getValueAt(pedidoTable.getSelectedRow(), 2);

                Pedido pedido = controlPedidos.buscarPedido(cod);

                if (Disponible == 0) {
                    pedido.setEstadoListo(EstadoListo.Pendiente);
                    JOptionPane.showMessageDialog(rootPane, "¡No puede confirmar pedido!, no hay cantidad disponibles de plantas para completar el pedido.");
                    throw new Exception("no hay cantidad diponibles para efectuar el pedido.");
                }

                pedido.setEstadoListo(EstadoListo.Listo);

                controlPedidos.actualizarPedido(pedido);
                pedidoTable.updateUI();
                JOptionPane.showMessageDialog(rootPane, "Pedido confirmado con éxito");

            } catch (Exception ex) {
                Logger.getLogger(PedidoAgregarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    //////////////////////////////////////////////////////////////////77
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
