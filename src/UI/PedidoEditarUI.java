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

    public PedidoEditarUI() {

        initComponents();

        this.controlPedidos = new ControlPedidos();
        this.controlDetallePedido = new ControlDetallePedido();
        this.controlPlantas = new ControlPlantas();
        this.controlDistribuidore = new ControlDistribuidores();

        //this.pedidoTable.setModel(new PedidoTableModel());
        this.btonBuscarPedido.addActionListener(new buscarPedidoListener());
        this.cmpCodigoPedido.addActionListener(new buscarPedidoListener());
        this.btonBuscar.addActionListener(new buscarPlantaListener());

        this.AgregarTabla.addActionListener(new agregarDetallePedidoListener());
        this.btonDevolver.addActionListener(new devolverPedidoListener());
        
        this.diajC.setModel(new Dia31Model());
        this.añojC.setModel(new AñoModel());
        this.mesjC.setModel(new MesModel());

        this.btonGuardar.addActionListener(new actualizarPedidoListener());
        this.btonCancelar.addActionListener(new CancelarListener());
//        this.cmpCant.addActionListener(new cantListener());

        this.pedidoTable.addKeyListener(new cantidadListener1());

        this.cmpNombrePlanta.setEditable(false);
        this.cmpValorUnitario.setEditable(false);
        this.cmpPlantasCompradas.setEditable(false);
        this.cmpCostoTotalPlantas.setEditable(false);

        this.cmpNombreDistribuidores.setEditable(false);
        this.cmpNitlDistribuidores.setEditable(false);
        this.cmpTelDistribuidores.setEditable(false);
        this.cmpCorreolDistribuidores.setEditable(false);
        this.cmpCiudadlDistribuidores.setEditable(false);
        this.cmpDireccionlDistribuidores.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmpCodigoPedido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmpPlantasCompradas = new javax.swing.JTextField();
        btonBuscarPedido = new javax.swing.JButton();
        jcmbxEntregado = new javax.swing.JComboBox(EstadoEntrega.values());
        cmpEstadoPago = new javax.swing.JTextField();
        añojC = new javax.swing.JComboBox<>();
        mesjC = new javax.swing.JComboBox<>();
        diajC = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmpCodigoPlanta = new javax.swing.JTextField();
        btonBuscar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cmpCantidadAComprar = new javax.swing.JTextField();
        cmpCant = new javax.swing.JButton();
        AgregarTabla = new javax.swing.JButton();
        cmpNombrePlanta = new javax.swing.JTextField();
        cmpValorUnitario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidoTable = new javax.swing.JTable();
        cmpCostoTotalPlantas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btonDevolver = new javax.swing.JButton();
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
        btonCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        btonGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jLabel2.setText("Codigo:");

        jLabel6.setText("Fecha:");

        jLabel7.setText("Estado Pago:");

        jLabel8.setText("Estado entregado:");

        jLabel5.setText("Total Productos:");

        btonBuscarPedido.setText("jButton1");

        añojC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        mesjC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        diajC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setText("Año:");

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setText("Mes:");

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setText("Día:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(añojC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel23)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpPlantasCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btonBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmpEstadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jcmbxEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonBuscarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añojC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesjC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diajC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpEstadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbxEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmpPlantasCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Plantas"));

        jLabel9.setText("Codigo:");

        jLabel11.setText("Nombre:");

        btonBuscar.setText("jButton1");

        jLabel18.setText("Cantidad:");

        cmpCant.setText("actualizar");

        AgregarTabla.setText("Agregar");

        jLabel19.setText("Valor unitario:");

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

        jLabel17.setText("Total a pagar:   $");

        btonDevolver.setText("Devolver");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                            .addComponent(cmpCantidadAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarTabla)
                            .addComponent(cmpCant))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(cmpCostoTotalPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(662, Short.MAX_VALUE)
                    .addComponent(btonDevolver)
                    .addGap(139, 139, 139)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(cmpCant))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmpCodigoPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btonBuscar)
                        .addComponent(cmpCantidadAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmpNombrePlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmpValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AgregarTabla))
                    .addComponent(cmpCostoTotalPlantas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(btonDevolver)
                    .addContainerGap(158, Short.MAX_VALUE)))
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

        btonCancelar.setText("Cancelar");

        jPanel4.setBackground(new java.awt.Color(108, 169, 62));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Editar Pedido");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N

        close1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("Cerrar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(254, 254, 254)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btonGuardar.setText("Guardar cambios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)
                        .addComponent(btonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JButton cmpCant;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
                Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
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

            try {

                Year año = (Year) añojC.getSelectedItem();
                Month mes = (Month) mesjC.getSelectedItem();
                int dia = (int) diajC.getSelectedItem();

                int total = Integer.parseInt(cmpCostoTotalPlantas.getText());

                pedido.setAño(año);
                pedido.setMes(mes);
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

            Long codigo = Long.parseLong(cmpCodigoPedido.getText());

            try {

                pedido = controlPedidos.buscarPedido(codigo);
                Distribuidor d = pedido.getDistribuidor();
                añojC.setSelectedItem(pedido.getDia());
                mesjC.setSelectedItem(pedido.getMes());
                diajC.setSelectedItem(pedido.getAño());

                jcmbxEntregado.setSelectedItem(pedido.getEstadoEntrega());
                cmpEstadoPago.setText(pedido.getEstadoPago());
                cmpPlantasCompradas.setText(Integer.toString(pedido.getCant_vendida()));
                cmpCostoTotalPlantas.setText(Integer.toString(pedido.getTotal()));

                cmpNombreDistribuidores.setText(d.getNombre());
                cmpNitlDistribuidores.setText(Long.toString(d.getNit()));
                cmpTelDistribuidores.setText(Long.toString(d.getTelefono()));
                cmpCorreolDistribuidores.setText(d.getEmail());
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

//    public class cantListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//
//            try {
//               
//                int dp = pedidoTable.getSelectedRow();
//                Detalle_Pedido d = pedido.getListaDetallePedido().get(dp);
//
//                int cantAntes = d.getCantidad();
//                int totAntes = Integer.parseInt(cmpCostoTotalPlantas.getText());
//
//                cmpCostoTotalPlantas.setText(Integer.toString(totAntes - (cantAntes * d.getPlanta().getValor_unitario()) + (d.getPlanta().getValor_unitario() * Integer.parseInt(cmpCant.getText()))));
//
//                d.setCantidad(Integer.parseInt(cmpCant.getText()));
//                d.setPrecio(d.getPlanta().getValor_unitario() * Integer.parseInt(cmpCant.getText()));
//
//                pedido.setTotal(d.getPlanta().getValor_unitario() * Integer.parseInt(cmpCant.getText()));
//
//                controlDetallePedido.actualizarDPedido(d);
//                
//                pedidoTable.updateUI();
//
//            } catch (Exception ex) {
//                Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//
//    }
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

                    int cantidad = (int) pedidoTable.getValueAt(pedidoTable.getSelectedRow(), 2);

                    Detalle_Pedido detalle = pedido.getListaDetallePedido().get(dp);

                    int cantActual = detalle.getCantidad();
                    int totalActual = Integer.parseInt(cmpCostoTotalPlantas.getText());
//
                    int totalAnterior = (totalActual - (cantActual * detalle.getPlanta().getValor_unitario()));
                    int totalNuevo = (cantidad * detalle.getPlanta().getValor_unitario());

                    int totalActualizado = totalAnterior + totalNuevo;

                    //NuevoTotal
                    cmpCostoTotalPlantas.setText(Integer.toString((totalActual - (cantActual * detalle.getPlanta().getValor_unitario())) + (cantidad * detalle.getPlanta().getValor_unitario())));
                    //actualizar cantidad
                    detalle.setCantidad(cantidad);
                    //act precio
                    detalle.setPrecio(detalle.getPlanta().getValor_unitario() * cantidad);
                    pedido.setTotal(detalle.getPlanta().getValor_unitario() * cantidad);

                    controlDetallePedido.actualizarDPedido(detalle);
                    //controlPedidos.actualizarPedido(pedido);

                    pedidoTable.updateUI();
                 
                } catch (Exception ex) {
                    Logger.getLogger(PedidoEditarUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    public class CancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

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
/////////////////////////////////////////////////////////////////////////////////
}
