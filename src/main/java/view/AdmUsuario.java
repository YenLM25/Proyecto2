/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UsuarioController;

/**
 *
 * @author Usuario
 */
public class AdmUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AdmUsuario
     */
    public AdmUsuario() {
        initComponents();
        UsuarioController usuarioController = new UsuarioController(this, panelBotones1);
        panelBotones1.listen(usuarioController);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelBotones1 = new view.PanelBotones();
        panelDataUsuarios2 = new view.PanelDataUsuarios();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración y Mantenimiento de Usuarios");
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administración y Mantenimiento de Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));
        getContentPane().add(panelBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));
        getContentPane().add(panelDataUsuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        jlFondo.setText("jLabel1");
        jlFondo.setMaximumSize(new java.awt.Dimension(600, 600));
        jlFondo.setMinimumSize(new java.awt.Dimension(600, 600));
        jlFondo.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlFondo;
    private view.PanelBotones panelBotones1;
    private view.PanelDataUsuarios panelDataUsuarios2;
    // End of variables declaration//GEN-END:variables
}
