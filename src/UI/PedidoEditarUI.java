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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class PedidoEditarUI extends javax.swing.JInternalFrame {

    private Pedido pedido;
    private Distribuidor distribuidor;

    private ControlPedidos controlPedidos;
    private ControlDetallePedido controlDetallePedido;
    private ControlPlantas controlPlantas;
    private ControlDistribuidores controlDistribuidore;

    public PedidoEditarUI() {

        initComponents();

        this.controlPedidos = new ControlPedidos();
        this.controlDetallePedido = new ControlDetallePedido();
        this.controlPlantas = new ControlPlantas();
        this.controlDistribuidore = new ControlDistribuidores();

        //this.pedidoTable.setModel(new PedidoTableModel());
        this.btonBuscarPedido.addActionListener(new buscarPedidoListener());

        this.AgregarTabla.addActionListener(new agregarDetallePedidoListener());
        this.btonDevolver.addActionListener(new devolverPedidoListener());

        this.btonGuardar.addActionListener(new actualizarPedidoListener());
        this.btonCancelar.addActionListener(new CancelarListener());

        this.cmpPlantasCompradas.setEditable(false);
        TextPrompt nombre = new TextPrompt("Ingrese el código", cmpCodigoPedido);
        this.plantajC.setModel(new PlantasListener());
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());
        setLocation(0, -32);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmpCodigoPedido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmpFechaP = new javax.swing.JTextField();
        btonBuscarPedido = new javax.swing.JButton();
        cmpEstadoPago = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jcmbxEntregado = new javax.swing.JComboBox(EstadoEntrega.values());
        cmpPlantasCompradas = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cmpNombreDistribuidores = new javax.swing.JLabel();
        cmpNitlDistribuidores = new javax.swing.JLabel();
        cmpTelDistribuidores = new javax.swing.JLabel();
        cmpCorreoDistribuidores = new javax.swing.JLabel();
        cmpCiudadlDistribuidores = new javax.swing.JLabel();
        cmpDireccionlDistribuidores = new javax.swing.JLabel();
        cmpCostoTotalPlantas = new javax.swing.JLabel();
        plantajC = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmpCantidadAComprar = new javax.swing.JTextField();
        AgregarTabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidoTable = new javax.swing.JTable();
        btonDevolver = new javax.swing.JButton();
        btonGuardar = new javax.swing.JButton();
        btonCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel17.setText("Total a pagar:   $");

        jPanel4.setBackground(new java.awt.Color(108, 169, 62));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Editar Pedido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(453, 453, 453)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(412, 412, 412)
                    .addComponent(jLabel21)
                    .addContainerGap(412, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Código:");

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Fecha:");

        btonBuscarPedido.setForeground(new java.awt.Color(51, 255, 51));
        btonBuscarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscar.png"))); // NOI18N
        btonBuscarPedido.setBorder(null);
        btonBuscarPedido.setBorderPainted(false);
        btonBuscarPedido.setContentAreaFilled(false);

        cmpEstadoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpEstadoPagoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Estado pago:");

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Estado entrega:");

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Total productos:");

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("DISTRIBUIDOR:");

        jLabel27.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("NIT:");

        jLabel28.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("E-mail:");

        jLabel29.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Teléfono:");

        jLabel30.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Ciudad:");

        jLabel31.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Dirección:");

        jLabel32.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Nombre:");

        cmpCostoTotalPlantas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmpCostoTotalPlantas.setForeground(new java.awt.Color(153, 153, 153));

        plantajC.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        plantajC.setForeground(new java.awt.Color(102, 102, 102));
        plantajC.setBorder(null);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione la planta:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad:");

        cmpCantidadAComprar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cmpCantidadAComprar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cmpCantidadAComprar.setSelectionColor(new java.awt.Color(133, 198, 90));
        cmpCantidadAComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCantidadAComprarActionPerformed(evt);
            }
        });

        AgregarTabla.setBackground(new java.awt.Color(255, 255, 255));
        AgregarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/agregarbtn.png"))); // NOI18N
        AgregarTabla.setBorderPainted(false);
        AgregarTabla.setContentAreaFilled(false);

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

        btonDevolver.setBackground(new java.awt.Color(255, 255, 255));
        btonDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/eliminardetallebtn.png"))); // NOI18N
        btonDevolver.setBorderPainted(false);
        btonDevolver.setContentAreaFilled(false);

        btonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actualizar.png"))); // NOI18N
        btonGuardar.setBorder(null);
        btonGuardar.setBorderPainted(false);
        btonGuardar.setContentAreaFilled(false);

        btonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buttonCancel.png"))); // NOI18N
        btonCancelar.setBorderPainted(false);
        btonCancelar.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btonDevolver)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmpCostoTotalPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcmbxEntregado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmpFechaP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22))
                                .addComponent(cmpEstadoPago, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(cmpPlantasCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel29)
                                            .addComponent(cmpNombreDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmpTelDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel30)
                                            .addComponent(cmpCiudadlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(71, 71, 71))
                                    .addComponent(AgregarTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btonBuscarPedido)
                                .addGap(146, 146, 146)
                                .addComponent(jLabel26)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(cmpNitlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpCorreoDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmpDireccionlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31))
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(plantajC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpCantidadAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(btonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btonGuardar)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btonBuscarPedido))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpEstadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmpCorreoDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(cmpNombreDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmpTelDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmpDireccionlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmpCiudadlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpNitlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmpCostoTotalPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmpPlantasCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcmbxEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(plantajC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(cmpCantidadAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AgregarTabla)
                                .addGap(44, 44, 44)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel17))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btonCancelar)
                    .addComponent(btonGuardar))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmpEstadoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpEstadoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpEstadoPagoActionPerformed

    private void cmpCantidadAComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCantidadAComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpCantidadAComprarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTabla;
    private javax.swing.JButton btonBuscarPedido;
    private javax.swing.JButton btonCancelar;
    private javax.swing.JButton btonDevolver;
    private javax.swing.JButton btonGuardar;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField cmpCantidadAComprar;
    private javax.swing.JLabel cmpCiudadlDistribuidores;
    private javax.swing.JTextField cmpCodigoPedido;
    private javax.swing.JLabel cmpCorreoDistribuidores;
    private javax.swing.JLabel cmpCostoTotalPlantas;
    private javax.swing.JLabel cmpDireccionlDistribuidores;
    private javax.swing.JTextField cmpEstadoPago;
    private javax.swing.JTextField cmpFechaP;
    private javax.swing.JLabel cmpNitlDistribuidores;
    private javax.swing.JLabel cmpNombreDistribuidores;
    private javax.swing.JTextField cmpPlantasCompradas;
    private javax.swing.JLabel cmpTelDistribuidores;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbxEntregado;
    private javax.swing.JTable pedidoTable;
    private javax.swing.JComboBox plantajC;
    // End of variables declaration//GEN-END:variables
     private Planta plantaAComprar;

    public class PlantasListener implements ComboBoxModel {

        List<Planta> plantas = controlPlantas.getListaPlantas();
        private Object selected = null;

        @Override

        public void setSelectedItem(Object anItem) {
            this.selected = anItem;
        }

        @Override
        public Object getSelectedItem() {
            return this.selected;
        }

        @Override
        public int getSize() {
            return plantas.size();
        }

        @Override
        public Object getElementAt(int index) {
            return plantas.get(index);
        }

        @Override
        public void addListDataListener(ListDataListener l) {

        }

        @Override
        public void removeListDataListener(ListDataListener l) {

        }

    }

//    public class buscarPlantaListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            String codigo = cmpCodigoPlanta.getText();
//
//            try {
//
//                plantaAComprar = controlPlantas.buscarPlanta(codigo);
//
//                
//
//            } catch (Exception ex) {
//                Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//
//    }
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
                Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
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

    public class actualizarPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                // String codigo = cedula.getText();

                jcmbxEntregado.setSelectedItem(pedido.getEstadoEntrega());
                cmpEstadoPago.setText(pedido.getEstadoPago());
                cmpPlantasCompradas.setText(Integer.toString(pedido.getCant_vendida()));

                String nombre = cmpNombreDistribuidores.getText();
                Long nit = Long.parseLong(cmpNitlDistribuidores.getText());
                Long tel = Long.parseLong(cmpTelDistribuidores.getText());
                String correo = cmpCorreoDistribuidores.getText();
                String ciudad = cmpCiudadlDistribuidores.getText();
                String direccion = cmpDireccionlDistribuidores.getText();

                Distribuidor distribuidor = new Distribuidor(nit, nombre, tel, correo, direccion, ciudad);

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
                Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class buscarPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            Long codigo = Long.parseLong(cmpCodigoPedido.getText());

            try {

                pedido = controlPedidos.buscarPedido(codigo);
                Distribuidor d = pedido.getDistribuidor();
                cmpFechaP.setText(pedido.getDia() + "/" + pedido.getMes().toString() + "/" + pedido.getAño().toString());
                jcmbxEntregado.setSelectedItem(pedido.getEstadoEntrega());
                cmpEstadoPago.setText(pedido.getEstadoPago());
                cmpPlantasCompradas.setText(Integer.toString(pedido.getCant_vendida()));
                cmpCostoTotalPlantas.setText(Integer.toString(pedido.getTotal()));

                cmpNombreDistribuidores.setText(d.getNombre());
                cmpNitlDistribuidores.setText(Long.toString(d.getNit()));
                cmpTelDistribuidores.setText(Long.toString(d.getTelefono()));
                cmpCorreoDistribuidores.setText(d.getEmail());
                cmpCiudadlDistribuidores.setText(d.getCiudad());
                cmpDireccionlDistribuidores.setText(d.getDireccion());

                pedidoTable.setModel(new PedidoTableModel());

            } catch (Exception ex) {
                Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

    public class CancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            int opcion = JOptionPane.showConfirmDialog(PedidoEditarUI.this, rootPane, "¿Desea cancelar?", JOptionPane.OK_CANCEL_OPTION);

            if (opcion == JOptionPane.CANCEL_OPTION) {
                return;
            }
            if (opcion == JOptionPane.OK_OPTION) {

                //       controlDetallePedido.eliminarDetallePedido();
                pedido.eliminarDetallePedido();
                //   cedula.setText("");
                cmpEstadoPago.setText("");
                jcmbxEntregado.setSelectedItem(null);
                cmpPlantasCompradas.setText("");

                cmpNombreDistribuidores.setText("");
                cmpNitlDistribuidores.setText("");
                cmpTelDistribuidores.setText("");
                cmpCiudadlDistribuidores.setText("");
                cmpCiudadlDistribuidores.setText("");
                cmpDireccionlDistribuidores.setText("");

                pedidoTable.updateUI();

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
