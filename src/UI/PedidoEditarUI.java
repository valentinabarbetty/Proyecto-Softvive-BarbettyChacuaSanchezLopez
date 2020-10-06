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
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
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

    private ControlPedidos controlPedidos;
    private ControlDetallePedido controlDetallePedido;
    private ControlPlantas controlPlantas;
    private ControlDistribuidores controlDistribuidore;
    private boolean d;
    private boolean m;
    private boolean a;

    public PedidoEditarUI() {

        initComponents();

        //  this.pedido = new Pedido();
        this.d = false;
        this.a = false;
        this.m = false;
        this.controlPedidos = new ControlPedidos();
        this.controlDetallePedido = new ControlDetallePedido();
        this.controlPlantas = new ControlPlantas();
        this.controlDistribuidore = new ControlDistribuidores();

        //this.pedidoTable.setModel(new PedidoTableModel());
        this.btonBuscarPedido.addActionListener(new buscarPedidoListener());
        this.cmpCodigoPedido.addActionListener(new buscarPedidoListener());
        // this.btonBuscar.addActionListener(new PedidoEditarUI.buscarPlantaListener());
        this.close.addMouseListener(new clickCerrarListener());
        this.close1.addMouseListener(new clickCerrarListener());

        this.AgregarCantidadTabla.addActionListener(new agregarDetallePedidoListener());
        this.btonDevolver.addActionListener(new devolverPedidoListener());

        //this.añojC.setModel(new AñoModel());
        this.mesjC.setModel(new MesModel());

        this.plantajC.setModel(new PlantasListener());

        this.btonGuardar.addActionListener(new actualizarPedidoListener());
        this.btonCancelar.addActionListener(new CancelarListener());

        this.mesjC.addActionListener(new DiaListener());
        this.diajC.addActionListener(new Dia1Listener());
        this.mesjC.addActionListener(new MesListener());
        this.actdp.addActionListener(new EditarDPListener());
        // this.añojC.addActionListener(new Año1Listener());

        this.mesjC.addMouseListener(new clickMesListener());
//        this.cmpCant.addActionListener(new cantListener());
        setLocation(0, -32);
        this.pedidoTable.addKeyListener(new cantidadListener1());

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
        AgregarCantidadTabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidoTable = new javax.swing.JTable();
        btonDevolver = new javax.swing.JButton();
        btonGuardar = new javax.swing.JButton();
        btonCancelar = new javax.swing.JButton();
        mesjC = new javax.swing.JComboBox<>();
        diajC = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diajT = new javax.swing.JTextField();
        mesjT = new javax.swing.JTextField();
        añojT = new javax.swing.JTextField();
        actdp = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(329, 329, 329)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Código:");

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

        AgregarCantidadTabla.setBackground(new java.awt.Color(255, 255, 255));
        AgregarCantidadTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/agregarbtn.png"))); // NOI18N
        AgregarCantidadTabla.setBorderPainted(false);
        AgregarCantidadTabla.setContentAreaFilled(false);

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

        jLabel33.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel33.setText("Día:");

        jLabel34.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel34.setText("Mes:");

        jLabel35.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel35.setText("Año:");

        jLabel6.setText("Editar Fecha de entrega:");

        actdp.setBackground(new java.awt.Color(255, 255, 255));
        actdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/actcant.png"))); // NOI18N
        actdp.setBorderPainted(false);
        actdp.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcmbxEntregado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cmpEstadoPago, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(cmpPlantasCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                            .addComponent(AgregarCantidadTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                    .addComponent(cmpDireccionlDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(añojT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(mesjT, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mesjC, javax.swing.GroupLayout.Alignment.LEADING, 0, 82, Short.MAX_VALUE))
                                            .addComponent(jLabel34))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel33)
                                            .addComponent(diajC, 0, 89, Short.MAX_VALUE)
                                            .addComponent(diajT)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btonDevolver)
                        .addGap(18, 18, 18)
                        .addComponent(actdp, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpCostoTotalPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(plantajC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpCantidadAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addGap(68, 68, 68)
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
                    .addComponent(cmpPlantasCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcmbxEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(añojT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(diajT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plantajC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(cmpCantidadAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AgregarCantidadTabla)
                        .addGap(44, 44, 44)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmpCostoTotalPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btonCancelar)
                    .addComponent(btonGuardar))
                .addContainerGap(51, Short.MAX_VALUE))
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
    private javax.swing.JButton AgregarCantidadTabla;
    private javax.swing.JButton actdp;
    private javax.swing.JTextField añojT;
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
    private javax.swing.JLabel cmpNitlDistribuidores;
    private javax.swing.JLabel cmpNombreDistribuidores;
    private javax.swing.JTextField cmpPlantasCompradas;
    private javax.swing.JLabel cmpTelDistribuidores;
    private javax.swing.JComboBox<String> diajC;
    private javax.swing.JTextField diajT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbxEntregado;
    private javax.swing.JComboBox<String> mesjC;
    private javax.swing.JTextField mesjT;
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
        public class EditarDPListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int dp = pedidoTable.getSelectedRow();
                Detalle_Pedido d = pedido.getListaDetallePedido().get(dp);
                int totAntes = Integer.parseInt(cmpCostoTotalPlantas.getText());
                int totalM = totAntes - d.getPrecio();
                pedido.setTotal(totalM);
                d.setCantidad(Integer.parseInt(cmpCantidadAComprar.getText()));
                d.setPrecio(d.getPlanta().getValor_unitario() * Integer.parseInt(cmpCantidadAComprar.getText()));
                pedido.setTotal(totalM + d.getPrecio());
                controlDetallePedido.actualizarDPedido(d);
                cmpCostoTotalPlantas.setText(Integer.toString(totalM + d.getPrecio()));
                cmpCostoTotalPlantas.updateUI();
                pedidoTable.updateUI();
            } catch (Exception ex) {
                Logger.getLogger(PedidoAgregarUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public class agregarDetallePedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                Planta planta = (Planta) plantajC.getSelectedItem();

                int cantidad = Integer.parseInt(cmpCantidadAComprar.getText());

                Detalle_Pedido dp = new Detalle_Pedido(cantidad, planta);

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

            int seleccionar = pedidoTable.getSelectedRow();
            pedido.devolverDetallePedido(seleccionar);

            cmpPlantasCompradas.setText(Integer.toString(pedido.getCant_vendida()));
            cmpCostoTotalPlantas.setText(Integer.toString(pedido.getTotal()));

            pedidoTable.updateUI();

        }

    }

    public class actualizarPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int dia;
            try {
                int total = Integer.parseInt(cmpCostoTotalPlantas.getText());
                int año = Integer.parseInt(añojT.getText());
                // Month mes = Month.valueOf(mesjT.getText());

                dia = Integer.parseInt(diajT.getText());

                pedido.setAño(Year.of(año));
                pedido.setMes((Month) mesjC.getSelectedItem());
                pedido.setDia(dia);
                pedido.setTotal(total);
                pedido.setEstadoEntrega((EstadoEntrega) jcmbxEntregado.getSelectedItem());
                pedido.setEstadoPago(cmpEstadoPago.getText());
                pedido.setCant_vendida(Integer.parseInt(cmpPlantasCompradas.getText()));
                //////////////// actualiza pedidos               
                controlPedidos.actualizarPedido(pedido);

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

            if (cmpCodigoPedido.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar el codigo");
            } else {

                try {
                    Long codigo = Long.parseLong(cmpCodigoPedido.getText());

                    pedido = controlPedidos.buscarPedido(codigo);
                    Distribuidor d = pedido.getDistribuidor();
                    // añojC.setSelectedItem(pedido.getDia());
                    mesjC.setSelectedItem(pedido.getMes());
                    diajC.setSelectedItem(pedido.getAño());

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
                    diajT.setText(Integer.toString(pedido.getDia()));
                    mesjT.setText(pedido.getMes().toString());
                    añojT.setText(pedido.getAño().toString());
                    pedidoTable.setModel(new PedidoTableModel());

                } catch (Exception ex) {
                    Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

//    public class clickDiaListener implements MouseListener {
//
//        private PedidoAgregarUI agregarPedidoUI;
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            diajC.setSelectedItem(pedido.getDia());
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//
//        }
//
//    }
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
            return i1 == 2;
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

    }

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

                    int dp = pedidoTable.getSelectedRow();
                    Detalle_Pedido detalle = pedido.getListaDetallePedido().get(dp);

                    int totalAnterior = Integer.parseInt(cmpCostoTotalPlantas.getText());
                    int total = totalAnterior - detalle.getPrecio();

                    pedido.setTotal(total);

                    int cantidad = (int) pedidoTable.getValueAt(pedidoTable.getSelectedRow(), 2);
                    detalle.setCantidad(cantidad);
                    detalle.setPrecio(detalle.getPlanta().getValor_unitario() * cantidad);
                    pedido.setTotal(total + detalle.getPrecio());

                    controlDetallePedido.actualizarDPedido(detalle);

                    cmpCostoTotalPlantas.setText(Integer.toString(total + detalle.getPrecio()));
                    cmpCostoTotalPlantas.updateUI();

                    pedidoTable.updateUI();

                } catch (Exception ex) {
                    Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    public class Dia1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (d = true) {
                diajT.setText(diajC.getSelectedItem().toString());
            }

        }

    }

    public class MesListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (m = true) {
//                mesjT.setText((String) mesjC.getSelectedItem());
            }
        }
    }

    public class Año1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (a = true) {
                //  añojT.setText((String) añojC.getSelectedItem());

                //añojT.setText((Year.of((int)(añojC.getSelectedItem()))));
            }
        }

    }

    public class CancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            cmpCodigoPedido.setText("");
            cmpEstadoPago.setText("");
            //jcmbxEntregado.setSelectedItem(null);
            cmpPlantasCompradas.setText("");

            añojT.setText("");
            mesjT.setText("");
            diajT.setText("");
            cmpCostoTotalPlantas.setText("");

            cmpNombreDistribuidores.setText("");
            cmpNitlDistribuidores.setText("");
            cmpTelDistribuidores.setText("");
            cmpCorreoDistribuidores.setText("");
            cmpCiudadlDistribuidores.setText("");
            cmpDireccionlDistribuidores.setText("");

            int num = pedidoTable.getRowCount() - 1;

            for (int i = num; i >= 0; i--) {
                pedido.eliminarDetallePedido(i);

                pedidoTable.updateUI();

            }

        }

    }

    public class MesModel implements ComboBoxModel {

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
            return 17;
        }
        Calendar c;

        @Override
        public Object getElementAt(int index) {
            switch (index) {
                case 0:
                    return Month.JANUARY;
                case 1:
                    return Month.FEBRUARY;
                case 2:
                    return Month.MARCH;
                case 3:
                    return Month.APRIL;
                case 4:
                    return Month.MAY;
                case 5:
                    return Month.JUNE;
                case 6:
                    return Month.JULY;
                case 7:
                    return Month.AUGUST;
                case 8:
                    return Month.SEPTEMBER;
                case 9:
                    return Month.OCTOBER;
                case 10:
                    return Month.NOVEMBER;
                case 11:
                    return Month.DECEMBER;

            }
            return "";
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
        }

    }

    public class Dia31Model implements ComboBoxModel {

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
            return 32;
        }

        @Override
        public Object getElementAt(int i) {
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case 8:
                    return 8;
                case 9:
                    return 9;
                case 10:
                    return 10;
                case 11:
                    return 11;
                case 12:
                    return 12;
                case 13:
                    return 13;
                case 14:
                    return 14;
                case 15:
                    return 15;
                case 16:
                    return 16;
                case 17:
                    return 17;
                case 18:
                    return 18;
                case 19:
                    return 19;
                case 20:
                    return 20;
                case 21:
                    return 21;
                case 22:
                    return 22;
                case 23:
                    return 23;
                case 24:
                    return 24;
                case 25:
                    return 25;
                case 26:
                    return 26;
                case 27:
                    return 27;
                case 28:
                    return 28;
                case 29:
                    return 29;
                case 30:
                    return 30;
                case 31:
                    return 31;

            }
            return "";
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
        }

    }

    public class Dia30Model implements ComboBoxModel {

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
            return 31;
        }

        @Override
        public Object getElementAt(int i) {
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case 8:
                    return 8;
                case 9:
                    return 9;
                case 10:
                    return 10;
                case 11:
                    return 11;
                case 12:
                    return 12;
                case 13:
                    return 13;
                case 14:
                    return 14;
                case 15:
                    return 15;
                case 16:
                    return 16;
                case 17:
                    return 17;
                case 18:
                    return 18;
                case 19:
                    return 19;
                case 20:
                    return 20;
                case 21:
                    return 21;
                case 22:
                    return 22;
                case 23:
                    return 23;
                case 24:
                    return 24;
                case 25:
                    return 25;
                case 26:
                    return 26;
                case 27:
                    return 27;
                case 28:
                    return 28;
                case 29:
                    return 29;
                case 30:
                    return 30;

            }
            return "";
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
        }

    }

    public class Dia28Model implements ComboBoxModel {

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
            return 31;
        }

        @Override
        public Object getElementAt(int i) {
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case 8:
                    return 8;
                case 9:
                    return 9;
                case 10:
                    return 10;
                case 11:
                    return 11;
                case 12:
                    return 12;
                case 13:
                    return 13;
                case 14:
                    return 14;
                case 15:
                    return 15;
                case 16:
                    return 16;
                case 17:
                    return 17;
                case 18:
                    return 18;
                case 19:
                    return 19;
                case 20:
                    return 20;
                case 21:
                    return 21;
                case 22:
                    return 22;
                case 23:
                    return 23;
                case 24:
                    return 24;
                case 25:
                    return 25;
                case 26:
                    return 26;
                case 27:
                    return 27;
                case 28:
                    return 28;

            }
            return "";
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
        }

    }

    public class DiaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if ((mesjC.getSelectedItem().equals(Month.JANUARY)) || (mesjC.getSelectedItem().equals(Month.JANUARY)) || (mesjC.getSelectedItem().equals(Month.MARCH))
                    || (mesjC.getSelectedItem().equals(Month.MAY)) || (mesjC.getSelectedItem().equals(Month.JULY)) || (mesjC.getSelectedItem().equals(Month.AUGUST))
                    || (mesjC.getSelectedItem().equals(Month.OCTOBER)) || (mesjC.getSelectedItem().equals(Month.DECEMBER))) {
                diajC.setModel(new Dia31Model());
            }
            if ((mesjC.getSelectedItem().equals(Month.FEBRUARY))) {
                diajC.setModel(new Dia28Model());
            }
            if ((mesjC.getSelectedItem().equals(Month.APRIL)) || (mesjC.getSelectedItem().equals(Month.JUNE)) || (mesjC.getSelectedItem().equals(Month.SEPTEMBER))
                    || (mesjC.getSelectedItem().equals(Month.NOVEMBER))) {
                diajC.setModel(new Dia30Model());
            }

        }

    }

    public class AñoModel implements ComboBoxModel {

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
            return 17;
        }

        @Override
        public Object getElementAt(int i) {
            switch (i) {
                case 1:
                    return Year.of(2020);
                case 2:
                    return Year.of(2021);
                case 3:
                    return Year.of(2022);
                case 4:
                    return Year.of(2023);
                case 5:
                    return Year.of(2024);
                case 6:
                    return Year.of(2025);
                case 7:
                    return Year.of(2026);
                case 8:
                    return Year.of(2027);

            }
            return "";
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
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

    public class clickDiaListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            d = true;

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

    public class clickMesListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
//            if (m = true) {
//                mesjT.setText((String) mesjC.getSelectedItem());
//            }

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

    public class clickAñoListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            a = true;

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
/////////////////////////////////////////////////////////////////////////////////
}
