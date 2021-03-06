package UI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

public class PedidosUI extends javax.swing.JFrame {

    public PedidosUI() {
        initComponents();
        //setIconImage(new ImageIcon(getClass().getResource("../Resources/planticon.png")).getImage());
        this.AgregarP.addMouseListener(new clickAñadirListener());
        this.AgregarPedido.addMouseListener(new clickAñadirListener());
        this.ConfPedidoEntreg.addMouseListener(new clickEntregadoListener());
        this.ConfPedidoEntregado.addMouseListener(new clickEntregadoListener());
        this.VerP.addMouseListener(new clickVerListener());
        this.VerPedidos.addMouseListener(new clickVerListener());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.EditarP.addMouseListener(new clickEditarListener());
        this.EditarPedido.addMouseListener(new clickEditarListener());
        this.ConfPedidoListo.addMouseListener(new clickListoListener());
        this.ConfPedidoListo.addMouseListener(new clickListoListener());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        VerP = new javax.swing.JLabel();
        AgregarP = new javax.swing.JLabel();
        EditarPedido = new javax.swing.JLabel();
        AgregarPedido = new javax.swing.JLabel();
        ConfirmarPedidoListo = new javax.swing.JLabel();
        EditarP = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        VerPedidos = new javax.swing.JLabel();
        ConfPedidoListo = new javax.swing.JLabel();
        ConfPedidoEntreg = new javax.swing.JLabel();
        ConfPedidoEntregado = new javax.swing.JLabel();

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(133, 198, 90));

        VerP.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        VerP.setForeground(new java.awt.Color(255, 255, 255));
        VerP.setText("Ver Pedidos");

        AgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

        EditarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        AgregarPedido.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        AgregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        AgregarPedido.setText("Agregar Nuevo Pedido");

        ConfirmarPedidoListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/check.png"))); // NOI18N

        EditarP.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EditarP.setForeground(new java.awt.Color(255, 255, 255));
        EditarP.setText("Editar Pedido");

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GESTIONAR PEDIDOS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pedidos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(366, 366, 366))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        VerPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/list (1).png"))); // NOI18N

        ConfPedidoListo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ConfPedidoListo.setForeground(new java.awt.Color(255, 255, 255));
        ConfPedidoListo.setText("Confirmar Pedido Listo");

        ConfPedidoEntreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/truck.png"))); // NOI18N

        ConfPedidoEntregado.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        ConfPedidoEntregado.setForeground(new java.awt.Color(255, 255, 255));
        ConfPedidoEntregado.setText("Confirmar Pedido Entregado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(AgregarPedido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EditarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditarP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VerPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VerP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ConfirmarPedidoListo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConfPedidoListo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ConfPedidoEntreg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConfPedidoEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(AgregarP))
                    .addComponent(AgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ConfirmarPedidoListo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfPedidoListo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ConfPedidoEntreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfPedidoEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(desktop))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop)
                .addGap(1, 1, 1))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgregarP;
    private javax.swing.JLabel AgregarPedido;
    private javax.swing.JLabel ConfPedidoEntreg;
    private javax.swing.JLabel ConfPedidoEntregado;
    private javax.swing.JLabel ConfPedidoListo;
    private javax.swing.JLabel ConfirmarPedidoListo;
    private javax.swing.JLabel EditarP;
    private javax.swing.JLabel EditarPedido;
    private javax.swing.JLabel VerP;
    private javax.swing.JLabel VerPedidos;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public class clickAñadirListener implements MouseListener {

        private PedidoAgregarUI agregarPedidoUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (agregarPedidoUI == null) {
                agregarPedidoUI = new PedidoAgregarUI();
                desktop.add(agregarPedidoUI);
            }
            agregarPedidoUI.setVisible(true);
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

    public class clickEntregadoListener implements MouseListener {

        private PedidoConfirmarEntregaUI pedidoConfirmarEntregaUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (pedidoConfirmarEntregaUI == null) {
                pedidoConfirmarEntregaUI = new PedidoConfirmarEntregaUI();
                desktop.add(pedidoConfirmarEntregaUI);
            }
            pedidoConfirmarEntregaUI.setVisible(true);
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

    public class clickListoListener implements MouseListener {

        private PedidoConfirmarListoUI pedidoConfirmarListoUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (pedidoConfirmarListoUI == null) {
                pedidoConfirmarListoUI = new PedidoConfirmarListoUI();
                desktop.add(pedidoConfirmarListoUI);
            }
            pedidoConfirmarListoUI.setVisible(true);
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

    public class clickVerListener implements MouseListener {

        private PedidoVerUI pedidoVerUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (pedidoVerUI == null) {
                pedidoVerUI = new PedidoVerUI();
                desktop.add(pedidoVerUI);
            }
            pedidoVerUI.setVisible(true);
            pedidoVerUI.getPediTable().updateUI();
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

    public class clickEditarListener implements MouseListener {

        private PedidoEditarUI pedidoEditarUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (pedidoEditarUI == null) {
                pedidoEditarUI = new PedidoEditarUI();
                desktop.add(pedidoEditarUI);
            }
            pedidoEditarUI.setVisible(true);
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
