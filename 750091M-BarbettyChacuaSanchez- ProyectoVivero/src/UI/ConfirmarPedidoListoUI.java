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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ConfirmarPedidoListoUI extends javax.swing.JInternalFrame {

    private Pedido pedido;
    Distribuidor distribuidor;
    Planta planta;
    Detalle_Pedido detallePedido;
    Detalle_Gasto detalleGasto;

    private ControlPedidos controlPedidos;

    private ControlDetallePedido controlDetallePedido;
    private ControlPlantas controlPlantas;
    private ControlDistribuidores controlDistribuidore;

    public ConfirmarPedidoListoUI() {

        initComponents();
        pedidoTable.setModel(new PedidoTableModel());
        this.controlPedidos = new ControlPedidos();
        this.controlDetallePedido = new ControlDetallePedido();
        this.controlPlantas = new ControlPlantas();
        this.controlDistribuidore = new ControlDistribuidores();
        
        btnConfirmar.addActionListener(new ConfirmarPedidoListener ());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pedidoTable = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();
        cmpDisponible = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cmpBuscarPedido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pedidoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ingresar codigo del pedido:");

        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(cmpDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 326, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cmpBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmpDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(59, 59, 59)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField cmpBuscarPedido;
    private javax.swing.JLabel cmpDisponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pedidoTable;
    // End of variables declaration//GEN-END:variables

    public class PedidoTableModel implements TableModel {

        @Override
        public int getRowCount() {
            return controlPedidos.getListaPedidos().size();

        }

        @Override
        public int getColumnCount() {
            return 7;
        }

        private String[] nombreColumnas = {"Estado", "Codigo", "Nombre", "Distribuidor", "Cantidad", "Costo", "Cantidad disponible"};

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

            Detalle_Pedido detalle = controlDetallePedido.getListaPedidos().get(i);
            Pedido pedido = controlPedidos.getListaPedidos().get(i);

            switch (i1) {
                case 0:
                    return pedido.getEstadoListo();
                case 1:
                    return detalle.getPlanta().getCodigo();
                case 2:
                    return detalle.getPlanta().getNombre();
                case 3:
                    return pedido.getDistribuidor();
                case 4:
                    return detalle.getCantidad();
                case 5:
                    return detalle.getPrecio();
                case 6:
                    return detalle.getPlanta().getListaDetalleGasto().get(i).getCantidad();

            }
            return " ";
        }

        @Override
        public void setValueAt(Object o, int i, int i1) {

            Detalle_Pedido detalle = pedido.getListaDetallePedido().get(i);

            if (i1 != 5) {
                return;

            }

            detalle.setCantidad((int) o);

            //////////////////////////////////////
             if (detalle.getCantidad() > detalle.getPlanta().getListaDetalleGasto().get(i).getCantidad()) {

                try {
                    int cantidad = (int) pedidoTable.getValueAt(pedidoTable.getSelectedRow(), 4);
                    
                    planta = null;
                    pedido.setEstadoListo(EstadoListo.Pendiente);
                    detalle = new Detalle_Pedido(cantidad, planta);
                    controlDetallePedido.actualizarPedido(detalle);
                    pedidoTable.updateUI();
                } catch (Exception ex) {
                    Logger.getLogger(ConfirmarPedidoListoUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                pedido.setEstadoListo(EstadoListo.Listo);
                pedidoTable.updateUI();
            }

            ////////////////////////////////////////////////////////////////////////////////
        }

        @Override
        public void addTableModelListener(TableModelListener tl) {

        }

        @Override
        public void removeTableModelListener(TableModelListener tl) {
        }

    }

     public class ConfirmarPedidoListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           
        }
         
     }
    
    
    
    
    
    
    ///////////// no lo he 
//    public class buscarPedidoListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            String codigo = cmpBuscarPedido.getText();
//
//            try {
//
//                pedido = controlPedidos.buscarPedido(codigo);
//
////////
//                for (int i = 0; i < pedido.getListaDetallePedido().size(); i++) {
//
//                    cmpDisponible.setText(Integer.toString(planta.getListaDetalleGasto().get(i).getCantidad()));
//
//                }
//
//            } catch (Exception ex) {
//                Logger.getLogger(EditarPedidoUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//
//    }
///////////7
}
