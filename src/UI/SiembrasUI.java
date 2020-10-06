package UI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

public class SiembrasUI extends javax.swing.JFrame {

    public SiembrasUI() {
        initComponents();
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("../Resources/planticon.png")).getImage());
        this.setLocationRelativeTo(null);
        this.editarSiembra.addMouseListener(new clickEditListener());
        this.editarSiembra1.addMouseListener(new clickEditListener());
        this.agregarSiembra.addMouseListener(new clickAddListener());
        this.agregarSiembra1.addMouseListener(new clickAddListener());
        this.verSiembra1.addMouseListener(new clickSeeListener());
        this.verSiembra.addMouseListener(new clickSeeListener());
        this.actSiembra.addMouseListener(new clickActualizarListener());
        this.actSiembra1.addMouseListener(new clickActualizarListener());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        verSiembra = new javax.swing.JLabel();
        editarSiembra1 = new javax.swing.JLabel();
        verSiembra1 = new javax.swing.JLabel();
        editarSiembra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        agregarSiembra = new javax.swing.JLabel();
        agregarSiembra1 = new javax.swing.JLabel();
        actSiembra1 = new javax.swing.JLabel();
        actSiembra = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1020, 615));

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(133, 198, 90));

        verSiembra.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        verSiembra.setForeground(new java.awt.Color(255, 255, 255));
        verSiembra.setText("Ver Siembras");

        editarSiembra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        verSiembra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/list (1).png"))); // NOI18N

        editarSiembra.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        editarSiembra.setForeground(new java.awt.Color(255, 255, 255));
        editarSiembra.setText("Editar Siembra");

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/siembras.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GESTIONAR SIEMBRAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        agregarSiembra.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        agregarSiembra.setForeground(new java.awt.Color(255, 255, 255));
        agregarSiembra.setText("Agregar Nueva Siembra");

        agregarSiembra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

        actSiembra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/check.png"))); // NOI18N

        actSiembra.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        actSiembra.setForeground(new java.awt.Color(255, 255, 255));
        actSiembra.setText("Actualizar Estado ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(editarSiembra1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(editarSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(verSiembra1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(agregarSiembra1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(agregarSiembra))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(actSiembra1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actSiembra)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(agregarSiembra1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(agregarSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editarSiembra1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verSiembra1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actSiembra1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actSiembra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(318, Short.MAX_VALUE))
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
            .addComponent(desktop)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actSiembra;
    private javax.swing.JLabel actSiembra1;
    private javax.swing.JLabel agregarSiembra;
    private javax.swing.JLabel agregarSiembra1;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel editarSiembra;
    private javax.swing.JLabel editarSiembra1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel verSiembra;
    private javax.swing.JLabel verSiembra1;
    // End of variables declaration//GEN-END:variables

    public class clickAddListener implements MouseListener {

        private SiembrasAñadirUI siembrasAñadirUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (siembrasAñadirUI == null) {
                siembrasAñadirUI = new SiembrasAñadirUI();
                desktop.add(siembrasAñadirUI);
            }
            siembrasAñadirUI.setVisible(true);
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

    public class clickSeeListener implements MouseListener {

        private SiembrasVerUI siembrasVerUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (siembrasVerUI == null) {
                siembrasVerUI = new SiembrasVerUI();
                desktop.add(siembrasVerUI);
            }
            siembrasVerUI.setVisible(true);
            siembrasVerUI.getSiembraTable().updateUI();
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

    public class clickEditListener implements MouseListener {

        private SiembrasEditarUI siembrasEditarUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (siembrasEditarUI == null) {
                siembrasEditarUI = new SiembrasEditarUI();
                desktop.add(siembrasEditarUI);
            }
            siembrasEditarUI.setVisible(true);
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

    public class clickActualizarListener implements MouseListener {

        private SiembrasEstadoUI siembrasEstadoUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (siembrasEstadoUI == null) {
                siembrasEstadoUI = new SiembrasEstadoUI();
                desktop.add(siembrasEstadoUI);
            }
            siembrasEstadoUI.setVisible(true);
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
