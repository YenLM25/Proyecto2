/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author Yendry León Matarrita C24251
 */
public class PanelDataCursos extends javax.swing.JPanel {

    /**
     * Creates new form PanelDataCursos
     */
    public PanelDataCursos() {
        initComponents();
        
    }
    
    public void listen(ActionListener controller)
    {
        this.btnBuscar.addActionListener (controller);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNombreCurso = new javax.swing.JLabel();
        jlIdCurso = new javax.swing.JLabel();
        jlSiglas = new javax.swing.JLabel();
        jlBloque = new javax.swing.JLabel();
        jlModalidad = new javax.swing.JLabel();
        jlCreditos = new javax.swing.JLabel();
        jlDescripcion = new javax.swing.JLabel();
        cbModalidad = new javax.swing.JComboBox<>();
        cbBloque = new javax.swing.JComboBox<>();
        txtNombreCurso = new javax.swing.JTextField();
        txtSiglas = new javax.swing.JTextField();
        txtCreditos = new javax.swing.JTextField();
        jsDescripcionCurso = new javax.swing.JScrollPane();
        txaDescripcionCurso = new javax.swing.JTextArea();
        txtIdCurso = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jlNombreCurso.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jlNombreCurso.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreCurso.setText("Nombre de Curso:");

        jlIdCurso.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jlIdCurso.setForeground(new java.awt.Color(255, 255, 255));
        jlIdCurso.setText("Id Curso:");

        jlSiglas.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jlSiglas.setForeground(new java.awt.Color(255, 255, 255));
        jlSiglas.setText("Siglas:");

        jlBloque.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jlBloque.setForeground(new java.awt.Color(255, 255, 255));
        jlBloque.setText("Bloque:");

        jlModalidad.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jlModalidad.setForeground(new java.awt.Color(255, 255, 255));
        jlModalidad.setText("Modalidad del curso:");

        jlCreditos.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jlCreditos.setForeground(new java.awt.Color(255, 255, 255));
        jlCreditos.setText("Creditos:");

        jlDescripcion.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jlDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jlDescripcion.setText("Descripción del curso:");

        cbModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "Presencial", "Virtual", "Bimodal", " " }));

        cbBloque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "I-Bloque", "II-Bloque", "III-Bloque", "IV-Bloque", "V-Bloque", "VI-Bloque", "VII-Bloque", "VIII-Bloque", "IX-Bloque", "X-Bloque", "XI-Bloque", "XII-Bloque", "XIII-Bloque", "XIV-Bloque", "XV-Bloque", "XVI-Bloque", "XVII-Bloque", "XVIII-Bloque", "XIX-Bloque", "XX-Bloque", "XXI-Bloque", "XXII-Bloque", "XXIII-Bloque", "XXIV-Bloque", "XXV-Bloque" }));

        txaDescripcionCurso.setColumns(20);
        txaDescripcionCurso.setRows(5);
        jsDescripcionCurso.setViewportView(txaDescripcionCurso);

        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCreditos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsDescripcionCurso))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlIdCurso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar)
                                        .addGap(45, 45, 45)
                                        .addComponent(jlSiglas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSiglas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlBloque)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbBloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlModalidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlNombreCurso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombreCurso)))
                                .addGap(12, 12, 12)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreCurso)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlIdCurso)
                        .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlSiglas)
                        .addComponent(txtSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBloque)
                    .addComponent(jlModalidad)
                    .addComponent(cbModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCreditos)
                    .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcion)
                    .addComponent(jsDescripcionCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbBloque;
    private javax.swing.JComboBox<String> cbModalidad;
    private javax.swing.JLabel jlBloque;
    private javax.swing.JLabel jlCreditos;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlIdCurso;
    private javax.swing.JLabel jlModalidad;
    private javax.swing.JLabel jlNombreCurso;
    private javax.swing.JLabel jlSiglas;
    private javax.swing.JScrollPane jsDescripcionCurso;
    private javax.swing.JTextArea txaDescripcionCurso;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtIdCurso;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtSiglas;
    // End of variables declaration//GEN-END:variables
}
