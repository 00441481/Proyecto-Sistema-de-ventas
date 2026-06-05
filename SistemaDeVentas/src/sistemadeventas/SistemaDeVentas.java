/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeventas;

public class SistemaDeVentas {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                javax.swing.JFrame ventana = new javax.swing.JFrame("Sistema Minimarket y Librería");

                ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                ventana.setContentPane(new FrmLogin());
                ventana.pack();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });
    }
}
