/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.AdmUsuario;
import view.PanelBotones;

/**
 * 
 * @author Maria Alejandra León Matarrita C24250
 */
public class UsuarioController implements ActionListener
{
     private AdmUsuario admUsuario;
     private PanelBotones panelBotones;
    

    public UsuarioController(AdmUsuario admUsuario, PanelBotones panelBotones) 
    {
        this.admUsuario = admUsuario;
        this.panelBotones = panelBotones; // Inicializa el panel de botones
    }
    
    public void mostrarVentanaUsuario() {
        if (admUsuario == null) {
            admUsuario = new AdmUsuario();
        }
        admUsuario.setVisible(true);
    }

    @Override
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
                admUsuario.dispose();                
                break;
            default:
                System.out.println("Comando no reconocido: " + command);
                break;
        }
    }
}


