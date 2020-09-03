package UI;

import Control.ControlDistribuidores;
import Modelo.Distribuidor;
import Modelo.Planta;
import Modelo.TipoReproduccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;

public class AgregarDistribuidoresUI extends javax.swing.JInternalFrame {
    
    private ControlDistribuidores controlDistribuidores;
    
    public AgregarDistribuidoresUI() {
        initComponents();
        this.controlDistribuidores = new ControlDistribuidores();
        this.agregarbtn.addActionListener(new agregarDistribuidorListener());
        this.cancelarbtn.addActionListener(new borrarListener());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        agregarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        nomjT = new javax.swing.JTextField();
        teljT = new javax.swing.JTextField();
        dirjT = new javax.swing.JTextField();
        nitjT = new javax.swing.JTextField();
        emailjT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ciudadjT = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Agregar Distribuidor");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("E-mail:");

        jLabel6.setText("Nit:");

        agregarbtn.setText("Agregar");

        cancelarbtn.setText("Cancelar");

        jLabel7.setText("Ciudad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(395, 395, 395))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelarbtn)
                        .addGap(324, 324, 324)
                        .addComponent(agregarbtn)
                        .addGap(298, 298, 298))))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(emailjT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(nomjT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teljT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dirjT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nitjT)
                    .addComponent(ciudadjT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dirjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(teljT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ciudadjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nitjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(emailjT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(agregarbtn)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelarbtn)
                        .addGap(82, 82, 82))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarbtn;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField ciudadjT;
    private javax.swing.JTextField dirjT;
    private javax.swing.JTextField emailjT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nitjT;
    private javax.swing.JTextField nomjT;
    private javax.swing.JTextField teljT;
    // End of variables declaration//GEN-END:variables

    public class agregarDistribuidorListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long nit = Long.parseLong(nitjT.getText());
                String nom = nomjT.getText();
                String dir = dirjT.getText();
                String email = emailjT.getText();
                long tel = Long.parseLong(teljT.getText());
                String ciudad = ciudadjT.getText();
                //BUSCAR CIUDAD ----------------------------------------------------------------

                Distribuidor d = new Distribuidor(nit, nom, tel, email, dir, ciudad);
                controlDistribuidores.agregarDistribuidor(d);
                
                JOptionPane.showMessageDialog(rootPane, "Distribuidor agregado con éxito");
                cancelarbtn.doClick();
            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
        
    }
    
    public class borrarListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            nitjT.setText("");
            nomjT.setText("");
            dirjT.setText("");
            emailjT.setText("");
            teljT.setText("");
            ciudadjT.setText("");
        }
        
    }
    
}
