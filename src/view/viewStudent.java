/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.studentController;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import model.comboModel;
import model.studentModel;

/**
 *
 * @author sachee
 */
public class viewStudent extends javax.swing.JFrame {
JPopupMenu jPopupMenu1 = new JPopupMenu();
    boolean gradeb = false;
    boolean schoolb = false;

    public viewStudent() {
        initComponents();
        gradecdb();
        scoolcdb();
        initialize();
    }

    public void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/student2.png")));
        gradec.setEnabled(false);
        schoolc.setEnabled(false);
        setTitle("View student form");
        setLocationRelativeTo(null);
    }

    private void gradecdb() {
       try {

            comboModel[] sclM = studentController.addItemcb("grade");
            for (comboModel sclMod : sclM) {
                gradec.addItem(sclMod.getName());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewStudent.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewStudent.this, ex.getMessage());
        }

    }

    private void scoolcdb() {
        try {

            comboModel[] sclM = studentController.addItemcb("school");
            for (comboModel sclMod : sclM) {
                schoolc.addItem(sclMod.getName());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewStudent.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewStudent.this, ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        numberf = new javax.swing.JTextField();
        namef = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gradec = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        schoolc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telmf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numberf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                numberfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numberfMouseExited(evt);
            }
        });
        numberf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberfActionPerformed(evt);
            }
        });
        numberf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberfKeyReleased(evt);
            }
        });
        jPanel1.add(numberf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 160, -1));

        namef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                namefMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                namefMouseExited(evt);
            }
        });
        namef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namefKeyReleased(evt);
            }
        });
        jPanel1.add(namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 560, -1));

        jLabel2.setText("Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, 50, -1));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 23, 40, -1));

        gradec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gradecKeyReleased(evt);
            }
        });
        jPanel1.add(gradec, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, -1));

        jLabel5.setText("Grade");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 53, 30, -1));

        schoolc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                schoolcKeyReleased(evt);
            }
        });
        jPanel1.add(schoolc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 220, -1));

        jLabel7.setText("School");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 53, 40, -1));

        jLabel8.setText("Tel");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 53, 50, -1));

        telmf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                telmfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telmfMouseExited(evt);
            }
        });
        telmf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telmfKeyReleased(evt);
            }
        });
        jPanel1.add(telmf, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 260, -1));

        jTable1.setModel(mod=new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Address", "Grade", "Birthday", "School", "Mobile", "Home"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(5);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setMinWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setMinWidth(40);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setMinWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(4).setMinWidth(20);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setMinWidth(30);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(6).setMinWidth(30);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(7).setMinWidth(30);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1140, 370));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32.png"))); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 65, 105, 23));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_229e(0)_32.png"))); // NOI18N
        jButton10.setText("Add");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 35, 105, 23));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/searchbut.png"))); // NOI18N
        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jButton11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton11KeyReleased(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 80, -1, -1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 50, -1, -1));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/studentlog2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 80, 80));

        jButton1.setText("Change grades");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 500, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberfKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }

        
    }//GEN-LAST:event_numberfKeyReleased

    private void namefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP
                && !namef.getText().isEmpty()) {
            searchm();
        }

        

    }//GEN-LAST:event_namefKeyReleased

    private void gradecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradecKeyReleased
       
    }//GEN-LAST:event_gradecKeyReleased

    private void schoolcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schoolcKeyReleased
       
    }//GEN-LAST:event_schoolcKeyReleased

    private void telmfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telmfKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }

        
    }//GEN-LAST:event_telmfKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        updateStudent upStu = new updateStudent();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void numberfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberfActionPerformed

    }//GEN-LAST:event_numberfActionPerformed

    private void numberfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberfMouseEntered
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_numberfMouseEntered

    private void namefMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namefMouseEntered
        namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_namefMouseEntered

    private void telmfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telmfMouseEntered
        telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_telmfMouseEntered

    private void numberfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberfMouseExited
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_numberfMouseExited

    private void namefMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namefMouseExited
        namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_namefMouseExited

    private void telmfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telmfMouseExited
        telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_telmfMouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        addStudent upStu = new addStudent();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed
    public void searchm() {
        boolean tp = false;
        mod.setRowCount(0);
        studentModel stMod = new studentModel();
        stMod.setStID(numberf.getText());
        stMod.setName(namef.getText());
        stMod.setGrade(gradec.getItemAt(gradec.getSelectedIndex()));
        stMod.setSchool(schoolc.getItemAt(schoolc.getSelectedIndex()));
        stMod.setTelM(telmf.getText());
//        String nums = numberf.getText();
//        String names = namef.getText();
//        String grades = gradec.getItemAt(gradec.getSelectedIndex());
//        String schls = schoolc.getItemAt(schoolc.getSelectedIndex());
//        String telms = telmf.getText();
        if (telmf.getText().length() >= 2 && telmf.getText().substring(0, 2).equals("07")) {
            tp = true;
        }

        try {
            studentModel[] stM = controller.studentController.viewStudent(tp, schoolb, gradeb, stMod);

            for (int i = 0; i < stM.length; i++) {
                String rowmod[] = {stM[i].getStID(), stM[i].getName(), stM[i].getAddress(), stM[i].getGrade(),
                    stM[i].getBday(), stM[i].getSchool(), stM[i].getTelM(), stM[i].getTelH()};
                mod.addRow(rowmod);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewStudent.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewStudent.this, ex.getMessage());
        }
//        String sql1 = "Select * From student where StID like '%" + nums + "%' and Name like '%" + names + "%' and Grade like '"
//                + grades + "' and School like '" + schls + "' and TelM like '%" + telms + "%'";
//        String sql2 = "Select * From student where StID like '%" + nums + "%' and Name like '%" + names + "%' and School like '" + schls + "' and TelM like '%" + telms + "%'";
//        String sql3 = "Select * From student where StID like '%" + nums + "%' and Name like '%" + names + "%' and Grade like '"
//                + grades + "' and TelM like '%" + telms + "%'";
//        String sql4 = "Select * From student where StID like '%" + nums + "%' and Name like '%" + names
//                + "%' and TelM like '%" + telms + "%'";
////////////////////////
//        String sql6 = "Select * From student where StID like '%" + nums + "%' and Name like '%" + names + "%' and Grade like '"
//                + grades + "' and School like '" + schls + "' and TelH like '%" + telms + "%'";
//        String sql7 = "Select * From student where StID like '%" + nums + "%' and Name like '%" + names + "%' and School like '" + schls + "' and TelH like '%" + telms + "%'";
//        String sql8 = "Select * From student where StID like '%" + nums + "%' and Name like '%" + names + "%' and Grade like '"
//                + grades + "' and TelH like '%" + telms + "%'";
//        String sql9 = "Select * From student where StID like '%" + nums + "%' and Name like '%" + names
//                + "%' and TelH like '%" + telms + "%'";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("mysql-java Drvier not found..");
//        }
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
//            java.sql.Statement stm = conn.createStatement();
//            ResultSet rst = stm.executeQuery(sql4);
//            if (tp == true) {
//                if (schoolb == true && gradeb == true) {
//                    rst = stm.executeQuery(sql1);
//                }
//                if (schoolb == true && gradeb == false) {
//                    rst = stm.executeQuery(sql2);
//                }
//                if (schoolb == false && gradeb == true) {
//                    rst = stm.executeQuery(sql3);
//                }
//                if (schoolb == false && gradeb == false) {
//                    rst = stm.executeQuery(sql4);
//                }
//            } else {
//                if (schoolb == true && gradeb == true) {
//                    rst = stm.executeQuery(sql6);
//                }
//                if (schoolb == true && gradeb == false) {
//                    rst = stm.executeQuery(sql7);
//                }
//                if (schoolb == false && gradeb == true) {
//                    rst = stm.executeQuery(sql8);
//                }
//                if (schoolb == false && gradeb == false) {
//                    rst = stm.executeQuery(sql9);
//                }
//            }

//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        searchm();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton11KeyReleased

    }//GEN-LAST:event_jButton11KeyReleased

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            gradec.setEnabled(true);
            gradeb = true;
        } else {
            gradec.setEnabled(false);
            gradeb = false;
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            schoolc.setEnabled(true);
            schoolb = true;
        } else {
            schoolc.setEnabled(false);
            schoolb = false;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            int index = jTable1.getSelectedRow();
            if (index >= 0) {
                final String conumber = (String) jTable1.getValueAt(index, 0);

                JMenuItem item = new JMenuItem("Change");

                jPopupMenu1.removeAll();
                jPopupMenu1.add(item);
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       updateStudent n=new updateStudent(conumber);
                       n.setVisible(true);
                       n.updateBtn();
                    }
                });
                jPopupMenu1.show(jTable1, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new changeGrades().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewStudent().setVisible(true);
            }
        });
    }
    javax.swing.table.DefaultTableModel mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JComboBox<String> gradec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namef;
    private javax.swing.JTextField numberf;
    private javax.swing.JComboBox<String> schoolc;
    private javax.swing.JTextField telmf;
    // End of variables declaration//GEN-END:variables
}
