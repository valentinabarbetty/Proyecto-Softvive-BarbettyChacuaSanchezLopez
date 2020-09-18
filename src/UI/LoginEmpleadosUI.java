package UI;

import javax.swing.JTextField;

public class LoginEmpleadosUI extends javax.swing.JPanel {

    public LoginEmpleadosUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JLabel();
        cmpUsuario = new javax.swing.JTextField();
        cmpContraseña = new javax.swing.JPasswordField();
        bannerUser = new javax.swing.JLabel();
        bannerContraseña = new javax.swing.JLabel();
        iconCandado = new javax.swing.JLabel();

        banner.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        banner.setText("¡Por favor ingresar usuario y contraseña!");

        bannerUser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bannerUser.setText("Usuario :");

        bannerContraseña.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bannerContraseña.setText("Contraseña :");

        iconCandado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sesion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(iconCandado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bannerUser)
                            .addComponent(bannerContraseña))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmpUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(cmpContraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(banner)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bannerUser)
                            .addComponent(cmpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bannerContraseña)
                            .addComponent(cmpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(iconCandado))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JLabel bannerContraseña;
    private javax.swing.JLabel bannerUser;
    private javax.swing.JPasswordField cmpContraseña;
    private javax.swing.JTextField cmpUsuario;
    private javax.swing.JLabel iconCandado;
    // End of variables declaration//GEN-END:variables
    
    public long getCedula() {
        return Long.parseLong(cmpUsuario.getText());
    }

    public String getContraseña() {
        return new String(cmpContraseña.getPassword());
    }

    public JTextField getCampoTextoCodigo() {
        return this.cmpUsuario;
    }

}
