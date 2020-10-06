package UI;

import Control.ControlEmpleados;
import Control.ControlPlantas;
import Modelo.Empleado;
import Modelo.Planta;
import Modelo.Rol;
import Modelo.TipoReproduccion;
import Modelo.Vivero;
import Resources.fondoDesktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

public class PlantasUI extends javax.swing.JFrame {

    private PlantasAñadirUI plantasAñadirUI;
    private Vivero vivero;

    public PlantasUI() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Resources/planticon.png")).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.plantasAñadirUI = new PlantasAñadirUI();
        desktop.setBorder(new fondoDesktop());
        this.EditarPlanta1.addMouseListener(new clickEditarListener());
        this.EditarPlanta.addMouseListener(new clickEditarListener());
        this.AñadirPlanta1.addMouseListener(new clickAñadirListener());
        this.AñadirPlanta.addMouseListener(new clickAñadirListener());
        this.VerPlantas1.addMouseListener(new clickVerListener());
        this.VerPlantas.addMouseListener(new clickVerListener());
        this.AñadirPlanta.setVisible(true);
//
//        if (plantasAñadirUI.isEnabled()) {
//            click.setBackground(new java.awt.Color(133, 197, 91));
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        VerPlantas1 = new javax.swing.JLabel();
        EditarPlanta = new javax.swing.JLabel();
        VerPlantas = new javax.swing.JLabel();
        EditarPlanta1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        AñadirPlanta1 = new javax.swing.JLabel();
        AñadirPlanta = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 605));

        jPanel1.setBackground(new java.awt.Color(133, 198, 90));

        VerPlantas1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        VerPlantas1.setForeground(new java.awt.Color(255, 255, 255));
        VerPlantas1.setText("Ver Plantas");

        EditarPlanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit (1).png"))); // NOI18N

        VerPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/list (1).png"))); // NOI18N

        EditarPlanta1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        EditarPlanta1.setForeground(new java.awt.Color(255, 255, 255));
        EditarPlanta1.setText("Editar Plantas");

        jPanel2.setBackground(new java.awt.Color(108, 169, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plantas_1.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GESTIONAR PLANTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AñadirPlanta1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        AñadirPlanta1.setForeground(new java.awt.Color(255, 255, 255));
        AñadirPlanta1.setText("Agregar Nueva Planta");

        AñadirPlanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus (2).png"))); // NOI18N

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
                                .addComponent(EditarPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(EditarPlanta1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VerPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VerPlantas1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AñadirPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AñadirPlanta1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(AñadirPlanta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(AñadirPlanta1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditarPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarPlanta1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerPlantas1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        getAccessibleContext().setAccessibleName("Gestionar Plantas");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AñadirPlanta;
    private javax.swing.JLabel AñadirPlanta1;
    private javax.swing.JLabel EditarPlanta;
    private javax.swing.JLabel EditarPlanta1;
    private javax.swing.JLabel VerPlantas;
    private javax.swing.JLabel VerPlantas1;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public class clickAñadirListener implements MouseListener {

        private PlantasAñadirUI plantasAddUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (plantasAddUI == null) {
                plantasAddUI = new PlantasAñadirUI();
                desktop.add(plantasAddUI);
            }
            plantasAddUI.setVisible(true);
//
//            click.setBackground(new java.awt.Color(100, 160, 54));
//            click.setVisible(true);

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

        private PlantasVerUI plantasVerUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (plantasVerUI == null) {
                plantasVerUI = new PlantasVerUI();
                desktop.add(plantasVerUI);
            }
            plantasVerUI.setVisible(true);
            plantasVerUI.getPlantasTable().updateUI();
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

        private PlantaEditarUI plantasEditUI;

        @Override
        public void mouseClicked(MouseEvent e) {

            if (plantasEditUI == null) {
                plantasEditUI = new PlantaEditarUI();
                desktop.add(plantasEditUI);
            }
            plantasEditUI.setVisible(true);
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
