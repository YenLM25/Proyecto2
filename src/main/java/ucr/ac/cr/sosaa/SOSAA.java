/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucr.ac.cr.sosaa;

import javax.swing.JFrame;
import view.Login;

/**
 *
 * @author Yendry Leon C24251
 */
public class SOSAA 
{

    public static void main(String[] args) 
    {
        // Crear una instancia de la clase Login y hacerla visible
        Login loginWindow = new Login();
        loginWindow.setVisible(true);
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
