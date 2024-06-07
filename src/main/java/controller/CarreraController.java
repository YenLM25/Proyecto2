/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.AdmCarreras;
import view.PanelBotones;

/**
 * 
 * @author YendryLeón Matarrita C24251
 */
public class CarreraController implements ActionListener
{
     private AdmCarreras admCarreras;
     private PanelBotones panelBotones;

    public CarreraController(AdmCarreras admCarreras, PanelBotones panelBotones) 
    {
        this.admCarreras = admCarreras;
        this.panelBotones = panelBotones;
    }
    
    public void mostrarVentanaCarrera() 
    {
        if (admCarreras == null) {
            admCarreras = new AdmCarreras();
        }
        admCarreras.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Guardar":
                JOptionPane.showMessageDialog(null, "Guardar presionado");
                break;
            case "Editar":
                JOptionPane.showMessageDialog(null, "Editar presionado");
                break;
            case "Eliminar":
                JOptionPane.showMessageDialog(null, "Eliminar presionado");
                break;
            case "Atrás":
                // Cierra la ventana actual
                admCarreras.dispose();                
                break;
            default:
                System.out.println("Comando no reconocido: " + command);
                break;
        }
    }
}

