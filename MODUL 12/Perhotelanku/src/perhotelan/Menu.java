/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhotelan;

/**
 *
 * @author ASUS
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
         setTitle("Menu");
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
        jLabel1 = new javax.swing.JLabel();
        jButtonKamar = new javax.swing.JButton();
        jButtonTamu = new javax.swing.JButton();
        jButtonTransaksi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("RED HOTEL's");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 50));

        jButtonKamar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jButtonKamar.setText("Daftar Kamar");
        jButtonKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKamarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 140, -1));

        jButtonTamu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jButtonTamu.setText("Daftar Tamu");
        jButtonTamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTamuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTamu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 140, -1));

        jButtonTransaksi.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jButtonTransaksi.setText("Transaksi");
        jButtonTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 140, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\1 PAID PROMOTE PARTI\\Logo.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKamarActionPerformed
        // TODO add your handling code here:
        new Kamar().setVisible(true);
         new Kamar().setDefaultCloseOperation(new Kamar().DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonKamarActionPerformed

    private void jButtonTamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTamuActionPerformed
        // TODO add your handling code here:
        new Tamu().setVisible(true);
         new Tamu().setDefaultCloseOperation(new Tamu().DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonTamuActionPerformed

    private void jButtonTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransaksiActionPerformed
        // TODO add your handling code here:
        new Transaksi().setVisible(true);
         new Transaksi().setDefaultCloseOperation(new Transaksi().DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonKamar;
    private javax.swing.JButton jButtonTamu;
    private javax.swing.JButton jButtonTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
