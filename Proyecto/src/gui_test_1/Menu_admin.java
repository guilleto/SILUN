package gui_test_1;

import java.awt.Image;
import java.awt.Toolkit;

public class Menu_admin extends javax.swing.JFrame {

    public Menu_admin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btGuiaDeUso = new javax.swing.JButton();
        btAdministrarUsuarios = new javax.swing.JButton();
        btAdministrarLabs = new javax.swing.JButton();
        btRegistroActividades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 173, 175));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/title.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/dot.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/dot.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/dot.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/dot.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ancizar Sans Black", 2, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Administrar Usuarios");

        jLabel9.setFont(new java.awt.Font("Ancizar Sans Black", 2, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Guia de Uso");

        jLabel12.setFont(new java.awt.Font("Ancizar Sans Black", 2, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Administrar Laboratorios");

        jLabel13.setFont(new java.awt.Font("Ancizar Sans Black", 2, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Registro de Actividades");

        btGuiaDeUso.setBackground(new java.awt.Color(91, 173, 175));
        btGuiaDeUso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/guide.png"))); // NOI18N
        btGuiaDeUso.setBorder(null);
        btGuiaDeUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuiaDeUsoActionPerformed(evt);
            }
        });

        btAdministrarUsuarios.setBackground(new java.awt.Color(91, 173, 175));
        btAdministrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/users.png"))); // NOI18N
        btAdministrarUsuarios.setBorder(null);
        btAdministrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdministrarUsuariosActionPerformed(evt);
            }
        });

        btAdministrarLabs.setBackground(new java.awt.Color(91, 173, 175));
        btAdministrarLabs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/lab_s.png"))); // NOI18N
        btAdministrarLabs.setBorder(null);
        btAdministrarLabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdministrarLabsActionPerformed(evt);
            }
        });

        btRegistroActividades.setBackground(new java.awt.Color(91, 173, 175));
        btRegistroActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_test_1/Images/log.png"))); // NOI18N
        btRegistroActividades.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(btAdministrarLabs))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(btRegistroActividades))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAdministrarUsuarios)
                                    .addComponent(btGuiaDeUso))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btGuiaDeUso)
                        .addGap(18, 18, 18)
                        .addComponent(btAdministrarUsuarios)
                        .addGap(18, 18, 18)
                        .addComponent(btAdministrarLabs))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btRegistroActividades))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13)
                        .addGap(19, 84, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuiaDeUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuiaDeUsoActionPerformed
        Guia g = new Guia();
        g.setVisible(true);
        g.setLocationRelativeTo(null);

        java.net.URL url = ClassLoader.getSystemResource("gui_test_1/Images/icon_c.png");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        g.setIconImage(img);
    }//GEN-LAST:event_btGuiaDeUsoActionPerformed

    private void btAdministrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdministrarUsuariosActionPerformed
        Usuarios user = new Usuarios();
        user.setVisible(true);
        user.setLocationRelativeTo(null);

        java.net.URL url = ClassLoader.getSystemResource("gui_test_1/Images/icon_c.png");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        user.setIconImage(img);
    }//GEN-LAST:event_btAdministrarUsuariosActionPerformed

    private void btAdministrarLabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdministrarLabsActionPerformed
        Admin_labs ab = new Admin_labs();
        ab.setVisible(true);
        ab.setLocationRelativeTo(null);

        java.net.URL url = ClassLoader.getSystemResource("gui_test_1/Images/icon_c.png");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        ab.setIconImage(img);
    }//GEN-LAST:event_btAdministrarLabsActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdministrarLabs;
    private javax.swing.JButton btAdministrarUsuarios;
    private javax.swing.JButton btGuiaDeUso;
    private javax.swing.JButton btRegistroActividades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
