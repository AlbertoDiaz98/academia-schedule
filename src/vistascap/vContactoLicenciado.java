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
public class vContactoLicenciado extends javax.swing.JFrame {

    /**
     * Creates new form vContactoLicenciado
     */
    public vContactoLicenciado() {
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
        btnBuscarLic = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarLic = new javax.swing.JButton();
        btnEliminarLic = new javax.swing.JButton();
        btnModificarLic = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarLic.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarLic.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBuscarLic.setForeground(new java.awt.Color(55, 94, 151));
        btnBuscarLic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/find-my-friend.png"))); // NOI18N
        btnBuscarLic.setBorder(null);
        btnBuscarLic.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscarLic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarLic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLicActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarLic, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 64, 51));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 94, 151));
        jLabel3.setText("ID: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 72, -1));

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
        jLabel2.setText("Contactos Licenciados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnAgregarLic.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarLic.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarLic.setForeground(new java.awt.Color(55, 94, 151));
        btnAgregarLic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/add-contact.png"))); // NOI18N
        btnAgregarLic.setText("Agregar");
        btnAgregarLic.setBorder(null);
        btnAgregarLic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregarLic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLicActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarLic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 137, 56));

        btnEliminarLic.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarLic.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminarLic.setForeground(new java.awt.Color(55, 94, 151));
        btnEliminarLic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/rubbish-bin.png"))); // NOI18N
        btnEliminarLic.setText("Eliminar");
        btnEliminarLic.setBorder(null);
        btnEliminarLic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarLic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLicActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarLic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 137, 56));

        btnModificarLic.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarLic.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnModificarLic.setForeground(new java.awt.Color(55, 94, 151));
        btnModificarLic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/progress-arrows.png"))); // NOI18N
        btnModificarLic.setText("Modificar");
        btnModificarLic.setBorder(null);
        btnModificarLic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarLic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLicActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarLic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 137, 56));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarLicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarLicActionPerformed

    private void btnAgregarLicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarLicActionPerformed

    private void btnEliminarLicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarLicActionPerformed

    private void btnModificarLicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarLicActionPerformed

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
            java.util.logging.Logger.getLogger(vContactoLicenciado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vContactoLicenciado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vContactoLicenciado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vContactoLicenciado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vContactoLicenciado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarLic;
    public javax.swing.JButton btnBuscarLic;
    public javax.swing.JButton btnEliminarLic;
    public javax.swing.JButton btnModificarLic;
    public javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
