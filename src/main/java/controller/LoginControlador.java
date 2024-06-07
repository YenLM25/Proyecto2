/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AdmCarreras;
import view.AdmCursos;

import view.VentanaLogin;
import view.AdmPlanEstudio;
import view.AdmUsuario;
import view.PanelBotones;

/**
 *
 * @author Yendry León Matarrita C24251
 */
public class LoginControlador implements ActionListener 
{

    private VentanaLogin ventanaLogin;
    private UsuarioController usuarioController;
    private CarreraController carreraController;
    private CursoController cursoController;
    private PlanEstudioController planEstudioController;
    private AdmCarreras admCarreras;
    private AdmCursos admCursos;
    private AdmUsuario admUsuario;
    private AdmPlanEstudio admPlanEstudio;
    private PanelBotones panelBotones;
    

    
    public LoginControlador() 
     {
        this.ventanaLogin = new VentanaLogin();
        this.ventanaLogin.listen(this);
        admUsuario = new AdmUsuario();
        admCarreras = new AdmCarreras();
        admPlanEstudio = new AdmPlanEstudio();
        admCursos = new AdmCursos();
        panelBotones = new PanelBotones();
        usuarioController = new UsuarioController(admUsuario, panelBotones);
        carreraController = new CarreraController(admCarreras, panelBotones); // Pasar las instancias requeridas
        cursoController = new CursoController(admCursos, panelBotones);
        planEstudioController = new PlanEstudioController(admPlanEstudio, panelBotones);
        panelBotones.listen(carreraController);
        panelBotones.listen(usuarioController); 
        panelBotones.listen(cursoController);
        panelBotones.listen(planEstudioController);
        this.ventanaLogin.setVisible(true);
     }
    
    
   public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        try {
            switch (command) {
                case "Salir":
                    System.exit(0);
                    break;

                case "Administracion y Mantenimiento de Usuarios":
                    // Lógica para manejar el mantenimiento de usuarios
                    if (this.usuarioController == null) 
                    {
                        this.usuarioController = new UsuarioController(admUsuario, panelBotones);
                    } 
                    else 
                    {
                        this.usuarioController.mostrarVentanaUsuario();
                    }
                    break;

                case "Administracion y Mantenimiento de Carreras":
                    // Lógica para manejar el mantenimiento de carreras
                    if (this.carreraController == null) 
                    {
                        this.carreraController = new CarreraController(admCarreras, panelBotones);
                    } 
                    else 
                    {
                        this.carreraController.mostrarVentanaCarrera();
                    }
                    break;

                case "Administracion y Mantenimiento de Cursos":
                    // Lógica para manejar el mantenimiento de cursos
                    if (this.cursoController == null) 
                    {
                        this.cursoController = new CursoController(admCursos, panelBotones);
                    } 
                    else 
                    {
                        this.cursoController.mostrarVentanaCurso();
                    }
                    break;

                case "Administracion y Mantenimiento de Planes de Estudio":
                    // Lógica para manejar el mantenimiento de planes de estudio
                    if (this.planEstudioController == null) 
                    {
                        this.planEstudioController = new PlanEstudioController(admPlanEstudio, panelBotones);
                    } 
                    else 
                    {
                        this.planEstudioController.mostrarVentanaPlanEstudio();
                    }
                    break;

                default:
                    System.out.println("Comando no reconocido: " + command);
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}