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
public class vAgregarDeportista extends javax.swing.JFrame {

    /**
     * Creates new form v
     */
    public vAgregarDeportista() {
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
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cBoxAño = new javax.swing.JComboBox();
        cBoxDeporte = new javax.swing.JComboBox();
        cBoxGenero = new javax.swing.JComboBox();
        cBoxDia = new javax.swing.JComboBox();
        cBoxMes = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtApellidoP = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtApellidoM = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtCelular = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtCasa = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(55, 94, 151));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contactos");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 20, 200, 45);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 70, 700, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 80));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 94, 151));
        jLabel1.setText("*Nombre(s): ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 94, 151));
        jLabel4.setText("Apellido Materno: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 94, 151));
        jLabel5.setText("*Apellido Paterno: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(55, 94, 151));
        jLabel6.setText("Año:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(55, 94, 151));
        jLabel7.setText("*Genero: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(55, 94, 151));
        jLabel8.setText("*Deporte: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(55, 94, 151));
        jLabel9.setText("Medios Contacto: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 260, -1));

        cBoxAño.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cBoxAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", " " }));
        cBoxAño.setBorder(null);
        getContentPane().add(cBoxAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        cBoxDeporte.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cBoxDeporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Futbol", "Basektbol", "Beisbol" }));
        cBoxDeporte.setBorder(null);
        getContentPane().add(cBoxDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        cBoxGenero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        cBoxGenero.setBorder(null);
        cBoxGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(cBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        cBoxDia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cBoxDia.setBorder(null);
        getContentPane().add(cBoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        cBoxMes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cBoxMes.setBorder(null);
        getContentPane().add(cBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 102, 102));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(55, 94, 151));
        jLabel10.setText("Fecha Nacimiento: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 102, 102));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(55, 94, 151));
        jLabel11.setText("E-mail:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 102, 102));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(55, 94, 151));
        jLabel12.setText("Mes:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 102, 102));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(55, 94, 151));
        jLabel13.setText("Dia:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 102, 102));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(55, 94, 151));
        jLabel14.setText("No. Celular:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 102, 102));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(55, 94, 151));
        jLabel15.setText("No. Casa:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(55, 94, 151));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 260, 20));

        txtApellidoP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtApellidoP.setBorder(null);
        getContentPane().add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 260, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(55, 94, 151));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 260, 20));

        txtApellidoM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtApellidoM.setBorder(null);
        getContentPane().add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 260, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(55, 94, 151));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 260, 20));

        txtCelular.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCelular.setBorder(null);
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 170, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(55, 94, 151));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 170, 20));

        txtCasa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCasa.setBorder(null);
        getContentPane().add(txtCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 170, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(55, 94, 151));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 170, 20));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setBorder(null);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 170, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator7.setForeground(new java.awt.Color(55, 94, 151));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 170, 20));

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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 80, 60));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 94, 151));
        jLabel2.setText("Contactos Deportistas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(55, 94, 151));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/add-contact.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 137, 56));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(55, 94, 151));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistascap/img/progress-arrows.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 137, 56));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(vAgregarDeportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vAgregarDeportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vAgregarDeportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vAgregarDeportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vAgregarDeportista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox cBoxAño;
    public javax.swing.JComboBox cBoxDeporte;
    public javax.swing.JComboBox cBoxDia;
    public javax.swing.JComboBox cBoxGenero;
    public javax.swing.JComboBox cBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JTextField txtApellidoM;
    public javax.swing.JTextField txtApellidoP;
    public javax.swing.JTextField txtCasa;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
