/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhotelan;
import koneksi.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Tamu extends javax.swing.JFrame {
    private static Connection mysqlkonek;
    private DefaultTableModel model;
    /**
     * Creates new form Tamu
     */
     private void kosongkan_form(){
        
        nomor.setText(null);
        nama.setText(null);
        ttl.setText(null);
        alamat.setText(null);
        
    }
    public void TampilData() {
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("TTL");
        model.addColumn("Alamat");
        tabeltamu.setModel(model);
        
       
        try {
            int no=1;
            String sql = "select * from tamu";
            java.sql.Connection conn;
            conn = (Connection)Koneksi.getConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
            }
            tabeltamu.setModel(model);
        } catch (SQLException e) {
             System.out.println("Error : " + e.getMessage());
        }
    }
    public Tamu() {
         setTitle("Data Tamu");
        initComponents();
        TampilData();
        kosongkan_form();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomor = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        ttl = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltamu = new javax.swing.JTable();
        jButtonHome = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("RED HOTEL's");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TTL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));
        jPanel1.add(nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 180, 30));
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 180, 30));
        jPanel1.add(ttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 180, 30));

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 180, 30));

        Simpan.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Simpan.setText("SAVE");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 80, -1));

        Hapus.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Hapus.setText("DELETE");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 80, -1));

        Update.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        tabeltamu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        tabeltamu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIK", "Nama", "TTL", "Alamat"
            }
        ));
        tabeltamu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltamuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltamu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 530, 170));

        jButtonHome.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\1 PAID PROMOTE PARTI\\images (1).jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -50, 330, 440));

        jLabel6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DAFTAR TAMU.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
         new Menu().setVisible(true);
         new Menu().setDefaultCloseOperation(new Menu().DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "INSERT INTO tamu VALUES ('"+nomor.getText()+"','"+nama.getText()+
                    "','"+ttl.getText()+"','"+alamat.getText()+"')";
            java.sql.Connection conn = (Connection)Koneksi.getConnection();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diSave");
            TampilData();
            kosongkan_form();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
          try{
            String sql = "DELETE FROM tamu WHERE id_tamu='"+nomor.getText()+"'";
            java.sql.Connection conn = (Connection)Koneksi.getConnection();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diDelete");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        TampilData();
        kosongkan_form();        
    }//GEN-LAST:event_HapusActionPerformed

    private void tabeltamuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltamuMouseClicked
        // TODO add your handling code here:
         nomor.setText(tabeltamu.getValueAt(tabeltamu.getSelectedRow(), 0).toString());
         nama.setText(tabeltamu.getValueAt(tabeltamu.getSelectedRow(), 1).toString());
         ttl.setText(tabeltamu.getValueAt(tabeltamu.getSelectedRow(), 2).toString());
         alamat.setText(tabeltamu.getValueAt(tabeltamu.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabeltamuMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "UPDATE tamu SET id_tamu='"+nomor.getText()+"',nama='"+nama.getText()+"',"
                    + "ttl='"+ttl.getText()+"',alamat='"+alamat.getText()+"'WHERE id_tamu = '"+
                    nomor.getText()+"'";
            java.sql.Connection conn = (Connection)Koneksi.getConnection();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diEdit");
        }catch( SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        TampilData();
        kosongkan_form();
    }//GEN-LAST:event_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tamu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Simpan;
    private javax.swing.JButton Update;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nomor;
    private javax.swing.JTable tabeltamu;
    private javax.swing.JTextField ttl;
    // End of variables declaration//GEN-END:variables
}
