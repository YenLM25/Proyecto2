/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.AdmPlanEstudio;
import view.PanelBotones;

/**
 * 
 * @author Maria Alejandra León Matarrita C24250
 */
public class PlanEstudioController implements ActionListener 
{
    private AdmPlanEstudio admPlanEstudio;
    private PanelBotones panelBotones;

    public PlanEstudioController(AdmPlanEstudio admPlanEstudio, PanelBotones panelBotones) 
    {
        this.admPlanEstudio = admPlanEstudio;
        this.panelBotones = panelBotones; // Inicializa el panel de botones   
    }
    
    public void mostrarVentanaPlanEstudio() 
    {
        if (admPlanEstudio == null) 
        {
            admPlanEstudio = new AdmPlanEstudio();
        }
        admPlanEstudio.setVisible(true);
    }
    
public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
        switch (command) 
        {
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
                admPlanEstudio.dispose();                
                break;
            default:
                System.out.println("Comando no reconocido: " + command);
                break;
        }
    }
}




