/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import controller.CursoController;

/**
 *
 * @author Maria Alejandra León Matarrita C24250
 */
public class AdmCursos extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public AdmCursos() 
    {
        initComponents();
        CursoController cursoController = new CursoController(this, panelBotones1);
        panelBotones1.listen(cursoController);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        panelBotones1 = new view.PanelBotones();
        panelDataCursos1 = new view.PanelDataCursos();
        jlfondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmOpciones = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        jmVer = new javax.swing.JMenu();
        miRegistroCurso = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administracion y Mantenimiento de Cursos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        panelBotones1.setBackground(new java.awt.Color(0, 0, 0, 150));
        getContentPane().add(panelBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));
        getContentPane().add(panelDataCursos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        jlfondo.setText("jLabel2");
        jlfondo.setMaximumSize(new java.awt.Dimension(600, 600));
        jlfondo.setMinimumSize(new java.awt.Dimension(600, 600));
        jlfondo.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jlfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jmOpciones.setText("Opciones");

        miSalir.setText("Salir");
        jmOpciones.add(miSalir);

        jMenuBar1.add(jmOpciones);

        jmVer.setText("Ver");

        miRegistroCurso.setText("Ver Registro de Cursos");
        jmVer.add(miRegistroCurso);

        jMenuBar1.add(jmVer);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jlfondo;
    private javax.swing.JMenu jmOpciones;
    private javax.swing.JMenu jmVer;
    private javax.swing.JMenuItem miRegistroCurso;
    private javax.swing.JMenuItem miSalir;
    private view.PanelBotones panelBotones1;
    private view.PanelDataCursos panelDataCursos1;
    // End of variables declaration//GEN-END:variables
}
