/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.AdmCursos;
import view.PanelBotones;

/**
 * 
 * @author Maria Alejandra León Matarrita C24250
 */
public class CursoController implements ActionListener 
{
     private AdmCursos admCursos;
     private PanelBotones panelBotones;

    public CursoController(AdmCursos admCursos, PanelBotones panelBotones) 
    {
       this.admCursos = admCursos;
        this.panelBotones = panelBotones; // Inicializa el panel de botones
    }
    
    public void mostrarVentanaCurso() 
    {
        if (admCursos == null) {
            admCursos = new AdmCursos();
        }
        admCursos.setVisible(true);
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
                admCursos.dispose();                
                break;
            default:
                System.out.println("Comando no reconocido: " + command);
                break;
        }
    }
}



