/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucr.ac.cr.sosaa;

import javax.swing.JFrame;
import view.VentanaLogin;

/**
 *
 * @author Yendry Leon C24251
 */
public class SOSAA 
{

    public static void main(String[] args) 
    {
        // Crear una instancia de la clase VentanaLogin y hacerla visible
        VentanaLogin loginWindow = new VentanaLogin();
        loginWindow.setVisible(true);
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
