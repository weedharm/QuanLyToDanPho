/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.finalui.UI;
import org.jdesktop.layout.GroupLayout;

/**
 *
 * @author ducng
 */
public class Home extends javax.swing.JFrame {

    /** Creates new form Home */
    public Home() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttomAdd = new javax.swing.JButton();
        buttomEdit = new javax.swing.JButton();
        buttomDelete = new javax.swing.JButton();
        buttomSave = new javax.swing.JButton();
        buttomExit = new javax.swing.JButton();
        showListPanel = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        tuychon = new javax.swing.JMenu();
        switchAccount = new javax.swing.JMenu();
        logOut = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();
        thongtin = new javax.swing.JMenu();
        showInfo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttomAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttomAdd.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\JAVA\\MyApp\\src\\icon\\Icojam-Blue-Bits-Math-add-0.png")); // NOI18N
        buttomAdd.setText("Thêm");

        buttomEdit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttomEdit.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\JAVA\\MyApp\\src\\icon\\edit-validated-icon.png")); // NOI18N
        buttomEdit.setText("Chỉnh sửa hồ sơ");

        buttomDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttomDelete.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\JAVA\\MyApp\\src\\icon\\Hopstarter-Soft-Scraps-File-Delete-0.png")); // NOI18N
        buttomDelete.setText("Xoá hồ sơ");

        buttomSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttomSave.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\JAVA\\MyApp\\src\\icon\\Paomedia-Small-N-Flat-Floppy-0.png")); // NOI18N
        buttomSave.setText("Lưu");
        buttomSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomSaveActionPerformed(evt);
            }
        });

        buttomExit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttomExit.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\JAVA\\MyApp\\src\\icon\\Awicons-Vista-Artistic-Delete-0.png")); // NOI18N
        buttomExit.setText("Đăng xuất & Thoát");

        showListPanel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        dataTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "CMND/CCCD", "Họ tên", "Địa chỉ", "Mức độ tiếp xúc", "Thời gian cách ly", "Kết quả xét nghiệm"
            }
        ));
        showListPanel.setViewportView(dataTable);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(showListPanel)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(buttomAdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(buttomEdit)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(buttomDelete)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(buttomSave)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(buttomExit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttomAdd)
                    .add(buttomEdit)
                    .add(buttomDelete)
                    .add(buttomSave)
                    .add(buttomExit))
                .add(29, 29, 29)
                .add(showListPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tuychon.setText("Tuỳ chọn");
        tuychon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        switchAccount.setText("Chuyển tài khoản");
        switchAccount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tuychon.add(switchAccount);

        logOut.setText("Đăng xuất");
        logOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tuychon.add(logOut);

        exit.setText("Thoát");
        exit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tuychon.add(exit);

        menuBar.add(tuychon);

        thongtin.setText("Thông tin");
        thongtin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        showInfo.setText("Giới thiệu nhóm");
        showInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thongtin.add(showInfo);

        menuBar.add(thongtin);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttomSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttomSaveActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttomAdd;
    private javax.swing.JButton buttomDelete;
    private javax.swing.JButton buttomEdit;
    private javax.swing.JButton buttomExit;
    private javax.swing.JButton buttomSave;
    private javax.swing.JTable dataTable;
    private javax.swing.JMenu exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu logOut;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu showInfo;
    private javax.swing.JScrollPane showListPanel;
    private javax.swing.JMenu switchAccount;
    private javax.swing.JMenu thongtin;
    private javax.swing.JMenu tuychon;
    // End of variables declaration//GEN-END:variables

}