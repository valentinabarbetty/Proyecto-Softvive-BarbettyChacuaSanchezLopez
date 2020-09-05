package Main;

import Control.ControlDetalleGasto;
import Control.ControlEmpleados;
import Control.ControlInsumos;
import Control.ControlPlantas;
import Modelo.Detalle_Gasto;
import Modelo.Detalle_Pedido;
import Modelo.Distribuidor;
import Modelo.Empleado;
import Modelo.Ingreso;
import Modelo.Rol;
import Modelo.Insumo;
import Modelo.Pedido;
import Modelo.Planta;
import Modelo.TipoReproduccion;
import Modelo.Vivero;
import UI.Login;
import UI.ViveroUI;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViveroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViveroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViveroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViveroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    Vivero vivero = new Vivero("123678", "Bruzón", "calle 26");

                    Empleado empleado1 = new Empleado("18588331", "Tony Stark", "11111111", "cra #1-2", 11622736, Rol.GERENTE_PROPIETARIO, "Palmira");
                    Empleado empleado2 = new Empleado("12345678", "Elon Musk", "22222222", "cra # 3-12", 1672839, Rol.TRANSPORTISTA, "Cali");
                    Empleado empleado3 = new Empleado("12345679", "Timothee Chalamet", "33333333", "cra #4-2", 2987624, Rol.TRABAJADOR, "Medellin");

//                    ControlEmpleados ce = new ControlEmpleados();
//                    ce.agregarEmpleado(empleado1);
//                    ce.agregarEmpleado(empleado2);
//                    ce.agregarEmpleado(empleado3);
//                    new ViveroUI(vivero).setVisible(true);
                    new Login(vivero).setVisible(true);

                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
