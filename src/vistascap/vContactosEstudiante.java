/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistascap;

/**
 *
 * @author aadmon
 */
public class vContactosEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form vContactosEstudiante
     */
    public vContactosEstudiante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscarEstu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIDEstu = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarEstu = new javax.swing.JButton();
        btnEliminarEstu = new javax.swing.JButton();
        btnModificarEstu = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarEstu.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarEstu.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBuscarEstu.setForeground(new java.awt.Color(55, 94, 151));
        btnBuscarEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/find-my-friend.png"))); // NOI18N
        btnBuscarEstu.setBorder(null);
        btnBuscarEstu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscarEstu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstuActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 64, 51));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 94, 151));
        jLabel3.setText("ID: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        txtIDEstu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIDEstu.setBorder(null);
        jPanel1.add(txtIDEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 72, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(55, 94, 151));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 72, 20));

        jPanel3.setBackground(new java.awt.Color(55, 94, 151));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contactos");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(280, 20, 200, 45);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(10, 70, 700, 20);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 80));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 94, 151));
        jLabel2.setText("Contactos Estudiantes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnAgregarEstu.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarEstu.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarEstu.setForeground(new java.awt.Color(55, 94, 151));
        btnAgregarEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/add-contact.png"))); // NOI18N
        btnAgregarEstu.setText("Agregar");
        btnAgregarEstu.setBorder(null);
        btnAgregarEstu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstuActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 137, 56));

        btnEliminarEstu.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarEstu.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminarEstu.setForeground(new java.awt.Color(55, 94, 151));
        btnEliminarEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/rubbish-bin.png"))); // NOI18N
        btnEliminarEstu.setText("Eliminar");
        btnEliminarEstu.setBorder(null);
        btnEliminarEstu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEstuActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 137, 56));

        btnModificarEstu.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarEstu.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnModificarEstu.setForeground(new java.awt.Color(55, 94, 151));
        btnModificarEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/progress-arrows.png"))); // NOI18N
        btnModificarEstu.setText("Modificar");
        btnModificarEstu.setBorder(null);
        btnModificarEstu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEstuActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 137, 56));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(55, 94, 151));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/back-arrow.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarEstuActionPerformed

    private void btnAgregarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarEstuActionPerformed

    private void btnEliminarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEstuActionPerformed

    private void btnModificarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarEstuActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vContactosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vContactosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vContactosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vContactosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vContactosEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarEstu;
    public javax.swing.JButton btnBuscarEstu;
    public javax.swing.JButton btnEliminarEstu;
    public javax.swing.JButton btnModificarEstu;
    public javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField txtIDEstu;
    // End of variables declaration//GEN-END:variables
}
