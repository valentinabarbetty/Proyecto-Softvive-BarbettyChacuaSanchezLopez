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
import Modelo.EstadoEntrega;
import Modelo.TipoReproduccion;
import Modelo.Vivero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.DayOfWeek;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class EditarPedidoUI extends javax.swing.JInternalFrame {

    private Pedido pedido;
    private Distribuidor distribuidor;

    private ControlPedidos controlPedidos;
    private ControlDetallePedido controlDetallePedido;
    private ControlPlantas controlPlantas;
    private ControlDistribuidores controlDistribuidore;

    public EditarPedidoUI() {

        initComponents();

        this.controlPedidos = new ControlPedidos();
        this.controlDetallePedido = new ControlDetallePedido();
        this.controlPlantas = new ControlPlantas();
        this.controlDistribuidore = new ControlDistribuidores();

        this.pedidoTable.setModel(new PedidoTableModel());
        this.btonBuscarPedido.addActionListener(new buscarPedidoListener());
        this.btonBuscar.addActionListener(new buscarPlantaListener());

        this.AgregarTabla.addActionListener(new agregarDetallePedidoListener());
        this.btonDevolver.addActionListener(new devolverPedidoListener());

        this.btonGuardar.addActionListener(new actualizarPedidoListener());
        this.btonCancelar.addActionListener(new CancelarListener());

        this.cmpNombrePlanta.setEditable(false);
        this.cmpValorUnitario.setEditable(false);
        this.cmpPlantasCompradas.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmpCodigoPedido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmpPlantasCompradas = new javax.swing.JTextField();
        btonBuscarPedido = new javax.swing.JButton();
        jcmbxEntregado = new javax.swing.JComboBox(EstadoEntrega.values());
        cmpEstadoPago = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        añojC = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        mesjC = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        diajC = new javax.swing.JComboBox<>();
        jDate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmpCodigoPlanta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidoTable = new javax.swing.JTable();
        btonBuscar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cmpCantidadAComprar = new javax.swing.JTextField();
        btonDevolver = new javax.swing.JButton();
        AgregarTabla = new javax.swing.JButton();
        cmpNombrePlanta = new javax.swing.JTextField();
        cmpValorUnitario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cmpNombreDistribuidores = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        cmpNitlDistribuidores = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmpTelDistribuidores = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmpCorreolDistribuidores = new javax.swing.JTextField();
        cmpCiudadlDistribuidores = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmpDireccionlDistribuidores = new javax.swing.JTextField();
        cmpCostoTotalPlantas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btonCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        btonGuardar.setText("Guardar cambios");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("EDITAR PEDIDO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jLabel2.setText("Codigo:");

        jLabel7.setText("Estado Pago:");

        jLabel8.setText("Estado entregado:");

        jLabel5.setText("Total Productos:");

        btonBuscarPedido.setText("jButton1");

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("Año:");

        añojC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel21.setText("Mes:");

        mesjC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setText("Día:");

        diajC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btonBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmpPlantasCompradas, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(cmpEstadoPago))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jcmbxEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(añojC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btonBuscarPedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añojC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmpEstadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmpPlantasCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbxEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Plantas"));

        jLabel9.setText("Codigo:");

        jLabel11.setText("Nombre:");

        pedidoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad (unidad)", "Vr unitario", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pedidoTable);

        btonBuscar.setText("jButton1");

        jLabel18.setText("Cantidad:");

        btonDevolver.setText("Devolver");

        AgregarTabla.setText("Agregar");

        jLabel19.setText("Valor unitario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmpCodigoPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpNombrePlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(cmpValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmpCantidadAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AgregarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(btonDevolver)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpCodigoPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonBuscar)
                    .addComponent(cmpCantidadAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpNombrePlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarTabla)
                    .addComponent(btonDevolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Distribuidores"));

        jLabel12.setText("Nombre:");

        Telefono.setText("Nit:");

        jLabel14.setText("Telefono:");

        jLabel13.setText("Correo:");

        jLabel15.setText("Ciudad");

        jLabel16.setText("Dirección");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Telefono)
                            .addComponent(cmpNitlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(cmpTelDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12)
                    .addComponent(cmpNombreDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cmpCorreolDistribuidores)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpCiudadlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(cmpDireccionlDistribuidores))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmpNombreDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpNitlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpTelDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmpCorreolDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpCiudadlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpDireccionlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setText("Total a pagar:   $");

        btonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(btonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpCostoTotalPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cmpCostoTotalPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTabla;
    private javax.swing.JLabel Telefono;
    private javax.swing.JComboBox<String> añojC;
    private javax.swing.JButton btonBuscar;
    private javax.swing.JButton btonBuscarPedido;
    private javax.swing.JButton btonCancelar;
    private javax.swing.JButton btonDevolver;
    private javax.swing.JButton btonGuardar;
    private javax.swing.JTextField cmpCantidadAComprar;
    private javax.swing.JTextField cmpCiudadlDistribuidores;
    private javax.swing.JTextField cmpCodigoPedido;
    private javax.swing.JTextField cmpCodigoPlanta;
    private javax.swing.JTextField cmpCorreolDistribuidores;
    private javax.swing.JTextField cmpCostoTotalPlantas;
    private javax.swing.JTextField cmpDireccionlDistribuidores;
    private javax.swing.JTextField cmpEstadoPago;
    private javax.swing.JTextField cmpNitlDistribuidores;
    private javax.swing.JTextField cmpNombreDistribuidores;
    private javax.swing.JTextField cmpNombrePlanta;
    private javax.swing.JTextField cmpPlantasCompradas;
    private javax.swing.JTextField cmpTelDistribuidores;
    private javax.swing.JTextField cmpValorUnitario;
    private javax.swing.JComboBox<String> diajC;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbxEntregado;
    private javax.swing.JComboBox<String> mesjC;
    private javax.swing.JTable pedidoTable;
    // End of variables declaration//GEN-END:variables
     private Planta plantaAComprar;

    public class buscarPlantaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            String codigo = cmpCodigoPlanta.getText();

            try {

                plantaAComprar = controlPlantas.buscarPlanta(codigo);

                cmpNombrePlanta.setText(plantaAComprar.getNombre());
                cmpValorUnitario.setText(Integer.toString(plantaAComprar.getValor_unitario()));

            } catch (Exception ex) {
                Logger.getLogger(EditarPedidoUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class agregarDetallePedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                int cantidad = Integer.parseInt(cmpCantidadAComprar.getText());

                Detalle_Pedido dp = new Detalle_Pedido(cantidad, plantaAComprar);

                pedido.agregarDetallePedido(dp);

                cmpPlantasCompradas.setText(Integer.toString(pedido.getCant_vendida()));
                cmpCostoTotalPlantas.setText(Integer.toString(pedido.getTotal()));

                pedidoTable.updateUI();

            } catch (Exception ex) {
                Logger.getLogger(EditarPedidoUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
//////////////////////////////////////////////////////////////////////////////////////////////7

    public class devolverPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            int seleccionar = pedidoTable.getSelectedRowCount();
            pedido.devolverDetallePedido(seleccionar);

            cmpPlantasCompradas.setText(Integer.toString(pedido.getCant_vendida()));
            cmpCostoTotalPlantas.setText(Integer.toString(pedido.getTotal()));

            pedidoTable.updateUI();

        }

    }
//////////////////////Pendiente
    public class actualizarPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                String codigo = cmpCodigoPedido.getText();

                jcmbxEntregado.setSelectedItem(pedido.getEstadoEntrega());
                cmpEstadoPago.setText(pedido.getEstadoPago());
                cmpPlantasCompradas.setText(Integer.toString(pedido.getCant_vendida()));

                String nombre = cmpNombreDistribuidores.getText();
                Long nit = Long.parseLong(cmpNitlDistribuidores.getText());
                Long tel = Long.parseLong(cmpTelDistribuidores.getText());
                String correo = cmpCorreolDistribuidores.getText();
                String ciudad = cmpCiudadlDistribuidores.getText();
                String direccion = cmpDireccionlDistribuidores.getText();

                pedido = new Pedido();
//////////////// actualiza pedidos
                controlPedidos.actualizarPedido(pedido);

                int cantidad = Integer.parseInt(cmpCantidadAComprar.getText());

                Detalle_Pedido dp = new Detalle_Pedido(cantidad, plantaAComprar);
////////////// actualiza detalle pedido
                controlDetallePedido.actualizarDPedido(dp);

                JOptionPane.showMessageDialog(rootPane, "El pedido se ha actualizado con éxito");

                btonCancelar.doClick();

                pedidoTable.updateUI();
                
            } catch (Exception ex) {
                Logger.getLogger(EditarPedidoUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class buscarPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            Long codigo = Long.parseLong(cmpCodigoPedido.getText());

            try {

                pedido = controlPedidos.buscarPedido(codigo);

              //cmpFechaP.setText(pedido.getDia() + "/" + pedido.getMes().toString() + "/" + pedido.getAño().toString());
                jcmbxEntregado.setSelectedItem(pedido.getEstadoEntrega());
                cmpEstadoPago.setText(pedido.getEstadoPago());
                cmpPlantasCompradas.setText(Integer.toString(pedido.getCant_vendida()));
                cmpCostoTotalPlantas.setText(Integer.toString(pedido.getTotal()));

                cmpNombreDistribuidores.setText(distribuidor.getNombre());
                cmpNitlDistribuidores.setText(Long.toString(distribuidor.getNit()));
                cmpTelDistribuidores.setText(Long.toString(distribuidor.getTelefono()));
                cmpCorreolDistribuidores.setText(distribuidor.getEmail());
                cmpCiudadlDistribuidores.setText(distribuidor.getCiudad());
                cmpDireccionlDistribuidores.setText(distribuidor.getDireccion());

                pedidoTable.setModel(new PedidoTableModel());

            } catch (Exception ex) {
                Logger.getLogger(EditarPedidoUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class PedidoTableModel implements TableModel {

        @Override
        public int getRowCount() {

            return pedido.getListaDetallePedido().size();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        private String[] nombreColumnas = {"Codigo", "Nombre Planta", "Cantidad", "Vlr unitario", "Subtotal"};

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
            return i1 == 3;
        }

        @Override
        public Object getValueAt(int i, int i1) {
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

            Detalle_Pedido detalle = pedido.getListaDetallePedido().get(i);

            if (i1 != 2) {
                return;

            }

            detalle.setCantidad((int) o);

        }

        @Override
        public void addTableModelListener(TableModelListener tl) {

        }

        @Override
        public void removeTableModelListener(TableModelListener tl) {
        }

        ///////////////////// NO PROBADOOO
        public void EditarCantidad(java.awt.event.KeyEvent evt) {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                try {
                    int cantidad = (int) pedidoTable.getValueAt(pedidoTable.getSelectedRow(), 2);
                    
                    plantaAComprar = null;
                    
                    Detalle_Pedido detalle = new Detalle_Pedido(cantidad, plantaAComprar);
                    
                    controlDetallePedido.actualizarDPedido(detalle);
                    
                } catch (Exception ex) {
                    Logger.getLogger(EditarPedidoUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

    public class CancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            int opcion = JOptionPane.showConfirmDialog(EditarPedidoUI.this, rootPane, "¿Desea cancelar?", JOptionPane.OK_CANCEL_OPTION);

            if (opcion == JOptionPane.CANCEL_OPTION) {
                return;
            }
            if (opcion == JOptionPane.OK_OPTION) {

                //       controlDetallePedido.eliminarDetallePedido();
                pedido.eliminarDetallePedido();
                cmpCodigoPedido.setText("");
                cmpEstadoPago.setText("");
                jcmbxEntregado.setSelectedItem(null);
                cmpPlantasCompradas.setText("");

                cmpNombreDistribuidores.setText("");
                cmpNitlDistribuidores.setText("");
                cmpTelDistribuidores.setText("");
                cmpCorreolDistribuidores.setText("");
                cmpCiudadlDistribuidores.setText("");
                cmpDireccionlDistribuidores.setText("");

                cmpCodigoPlanta.setText("");
                cmpNombrePlanta.setText("");
                cmpValorUnitario.setText("");
                pedidoTable.updateUI();

            }

        }

    }
}
