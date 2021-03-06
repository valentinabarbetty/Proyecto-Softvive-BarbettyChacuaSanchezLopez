package UI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

public class DistribuidoresUI extends javax.swing.JFrame {

    public DistribuidoresUI() {
        initComponents();
       // setIconImage(new ImageIcon(getClass().getResource("../Resources/planticon.png")).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.AñadirDistri1.addMouseListener(new clickAddListener());
        this.AñadirDistri.addMouseListener(new clickAddListener());
        this.EditarDistri.addMouseListener(new clickEditListener());
        this.EditarDistri1.addMouseListener(new clickEditListener());
        this.VerDistri1.addMouseListener(new clickSeeListener());
        this.VerDistri.addMouseListener(new clickSeeListener());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        VerDistri1 = new javax.swing.JLabel();
        AñadirDistri = new javax.swing.JLabel();
        EditarDistri = new javax.swing.JLabel();
        AñadirDistri1 = new javax.swing.JLabel();
        VerDistri = new javax.swing.JLabel();
        EditarDistri1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        desktopd = new javax.swing.JDesktopPane();

        jCheckBox1.setText("jCheckBox1");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 605));

        jPanel9.setBackground(new java.awt.Color(133, 198, 90));

        VerDistri1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        VerDistri1.setForeground(new java.awt.Color(255, 255, 255));
        VerDistri1.setText("Ver Distribuidores");

        AñadirDistri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

        EditarDistri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        AñadirDistri1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        AñadirDistri1.setForeground(new java.awt.Color(255, 255, 255));
        AñadirDistri1.setText("Agregar Nuevo Distribuidor");

        VerDistri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/list (1).png"))); // NOI18N

        EditarDistri1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EditarDistri1.setForeground(new java.awt.Color(255, 255, 255));
        EditarDistri1.setText("Editar Distribuidores");

        jPanel10.setBackground(new java.awt.Color(108, 169, 62));
        jPanel10.setPreferredSize(new java.awt.Dimension(418, 81));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/distribuidores.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("GESTIONAR DISTRIBUIDORES");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 287, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(AñadirDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(AñadirDistri1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(EditarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditarDistri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(VerDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VerDistri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(AñadirDistri))
                    .addComponent(AñadirDistri1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditarDistri1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VerDistri1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
        );

        desktopd.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopdLayout = new javax.swing.GroupLayout(desktopd);
        desktopd.setLayout(desktopdLayout);
        desktopdLayout.setHorizontalGroup(
            desktopdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        desktopdLayout.setVerticalGroup(
            desktopdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(desktopd))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopd)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Distribuidores");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AñadirDistri;
    private javax.swing.JLabel AñadirDistri1;
    private javax.swing.JLabel EditarDistri;
    private javax.swing.JLabel EditarDistri1;
    private javax.swing.JLabel VerDistri;
    private javax.swing.JLabel VerDistri1;
    private javax.swing.JDesktopPane desktopd;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
        public class clickAddListener implements MouseListener {

        private DistribuidoresAñadirUI distribuidoresAddUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (distribuidoresAddUI == null) {
                distribuidoresAddUI = new DistribuidoresAñadirUI();
                desktopd.add(distribuidoresAddUI);
            }
            distribuidoresAddUI.setVisible(true);
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

        private DistribuidoresVerUI distribuidoresSeeUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (distribuidoresSeeUI == null) {
                distribuidoresSeeUI = new DistribuidoresVerUI();
                desktopd.add(distribuidoresSeeUI);
            }
            distribuidoresSeeUI.setVisible(true);
            distribuidoresSeeUI.getDistriTable().updateUI();
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

        private DistribuidoresEditarUI distribuidoresEditUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (distribuidoresEditUI == null) {
                distribuidoresEditUI = new DistribuidoresEditarUI();
                desktopd.add(distribuidoresEditUI);
            }
            distribuidoresEditUI.setVisible(true);
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
