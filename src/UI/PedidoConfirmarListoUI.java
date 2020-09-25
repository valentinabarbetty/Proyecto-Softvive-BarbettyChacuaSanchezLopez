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

        this.pedidoTable.setModel(new PedidoTableModel());
        this.pedidoTable.addMouseListener(new clickPedido());

        this.detalleTable.setModel(new dPTableModel());
        this.controlPedidos = new ControlPedidos();
        this.controlDetallePedido = new ControlDetallePedido();
        this.controlDetalleGasto = new ControlDetalleGasto();
        this.controlPlantas = new ControlPlantas();

        btnConfirmar.addActionListener(new ConfirmarPedido());

        this.detalleTable.addKeyListener(new cantidadListener1());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidoTable = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();
        cmpDisponible = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        detalleTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pedidoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Estado", "Codigo", "nombre", "Distribuidor"
            }
        ));
        jScrollPane1.setViewportView(pedidoTable);

        btnConfirmar.setText("Confirmar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Confirmar Pedido");

        btnGuardar.setText("Guardar");

        detalleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Planta", "Cantidad Pedido", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(detalleTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConfirmar)
                                .addGap(444, 444, 444)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(cmpDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel cmpDisponible;
    private javax.swing.JTable detalleTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable pedidoTable;
    // End of variables declaration//GEN-END:variables

    public void setDisponible(int disponible) {
        this.Disponible = disponible;
    }

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
            Pedido pedido = controlPedidos.getListaPedidos().get(i);

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
            return 4;

        }

        private String[] nombreColumnas = {"Codigo Planta", "Nombre", "Cantidad pedido", "Cantidad disponible"};

        @Override
        public String getColumnName(int i) {
            return nombreColumnas[i];
        }

        private Class[] tipoColumnas = {String.class, String.class, Integer.class, Integer.class};

        @Override
        public Class<?> getColumnClass(int i) {
            return tipoColumnas[i];
        }

        @Override
        public boolean isCellEditable(int i, int i1) {
            return i1 == 3;

        }

        @Override
        public Object getValueAt(int i, int i1) {

            int dp = pedidoTable.getSelectedRow();
            Pedido pedido = controlPedidos.getListaPedidos().get(dp);
            Detalle_Pedido detalle = pedido.getListaDetallePedido().get(i);

            switch (i1) {

                case 0:
                    return detalle.getPlanta().getCodigo();
                case 1:
                    return detalle.getPlanta().getNombre();
                case 2:
                    return detalle.getCantidad();
                case 3:
                    return Disponible;

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
///////////////// KEY

    public class cantidadListener1 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent ke) {

        }

        @Override
        public void keyPressed(KeyEvent ke) {

        }

        @Override
        public void keyReleased(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                try {
//                    detalleTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//                    detalleTable.setCellSelectionEnabled(true);
//                    detalleTable.addRowSelectionInterval(codplant, dp);
//                    detalleTable.addColumnSelectionInterval(codplant, dp);
//                    detalleTable.setColumnSelectionInterval(codplant, dp);
//                    detalleTable.setRowSelectionInterval(codplant, dp);

                    int dp = detalleTable.getSelectedRow();
//                    int codplant = detalleTable.getSelectedRow();
//                   Disponible = (int) detalleTable.getValueAt(detalleTable.getSelectedRow(), 3);

                    int cantidadDisponible = (int) detalleTable.getValueAt(detalleTable.getSelectedRow(), 3);
                    String codPlanta = (String) detalleTable.getValueAt(detalleTable.getSelectedRow(), 0);
                    
                   detalleTable.setValueAt(cantidadDisponible, detalleTable.getSelectedRow(), 3);
                   Pedido pedido = controlPedidos.getListaPedidos().get(dp);

                    setDisponible(cantidadDisponible);

                    Planta planta = controlPlantas.buscarPlanta(codPlanta);
                    Detalle_Gasto gasto = new Detalle_Gasto(cantidadDisponible);

                    Detalle_Pedido detalle = pedido.getListaDetallePedido().get(dp);
                    pedido.setTotal(cantidadDisponible * detalle.getPlanta().getValor_unitario());
                    

                    gasto.setCantidad(cantidadDisponible);
                    planta.agregarDetalleGasto(gasto);
                    controlPedidos.actualizarPedido(pedido);

                    detalleTable.updateUI();

                } catch (Exception ex) {
                    Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                    JOptionPane.showMessageDialog(rootPane, "¡No puede confirmar pedido!, no hay cantidad disponibles de plantas para completar el pedido");
                    throw new Exception("no hay cantidad diponibles para efectuar el pedido");
                }

                pedido.setEstadoListo(EstadoListo.Listo);
                pedido.setEstadoPago("pago");

                controlPedidos.actualizarPedido(pedido);
                pedidoTable.updateUI();
                JOptionPane.showMessageDialog(rootPane, "Pedido confirmado con éxito");

            } catch (Exception ex) {
                Logger.getLogger(PedidoAgregarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    //////////////////////////////////////////////////////////////////77

}
