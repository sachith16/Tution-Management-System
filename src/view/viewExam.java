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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import model.classModel;
import model.comboModel;
import model.examModel;

/**
 *
 * @author sachee
 */
public class viewExam extends javax.swing.JFrame {

    SimpleDateFormat ft = new SimpleDateFormat("H:m");
    SimpleDateFormat ft2 = new SimpleDateFormat("YYYY-MM-dd");

    /**
     * Creates new form Student
     */
    public viewExam() {

        initComponents();
        setLocationRelativeTo(null);
        subdb();
        halldb();
        gradedb();
        teacherdb();
        initialize();
        setTitle("View exam form");

    }

    public void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/examico2.png")));
        datec.setEnabled(false);
        subsc.setEnabled(false);
        hallc.setEnabled(false);
        gradec1.setEnabled(false);
        teacherc.setEnabled(false);
        times.setEnabled(false);
        timee.setEnabled(false);
        datec.setDateFormat(ft2);
    }

    private void subdb() {
        try {

            comboModel[] cmbM = studentController.addItemcb("subject");
            for (comboModel cmbMod : cmbM) {
                subsc.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        }

    }

    private void teacherdb() {
        try {

            comboModel[] cmbM = studentController.addItemcb("teacher");
            for (comboModel cmbMod : cmbM) {
                teacherc.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        }

    }

    private void gradedb() {
        try {

            comboModel[] cmbM = studentController.addItemcb("grade");
            for (comboModel cmbMod : cmbM) {
                gradec1.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        }
    }

    private void halldb() {
        try {

            comboModel[] cmbM = studentController.addItemcb("hall");
            for (comboModel cmbMod : cmbM) {
                hallc.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        numberf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hallc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        timecb = new javax.swing.JCheckBox();
        gradecb = new javax.swing.JCheckBox();
        subcb = new javax.swing.JCheckBox();
        datecb = new javax.swing.JCheckBox();
        subsc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        gradec1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        teacherc = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        hallcb = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        times = new javax.swing.JSpinner(new SpinnerDateModel());
        jLabel9 = new javax.swing.JLabel();
        timee = new javax.swing.JSpinner(new SpinnerDateModel());
        techrcb1 = new javax.swing.JCheckBox();
        datec = new datechooser.beans.DateChooserCombo();

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
        numberf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numberfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberfFocusLost(evt);
            }
        });
        numberf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberfKeyReleased(evt);
            }
        });
        jPanel1.add(numberf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 160, -1));

        jLabel2.setText("Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, 50, -1));

        hallc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hallcKeyReleased(evt);
            }
        });
        jPanel1.add(hallc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));

        jLabel7.setText("Hall");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, 43, -1));

        jLabel8.setText("Time");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 53, 50, -1));

        jButton6.setText("View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 500, 80, -1));

        jTable1.setModel(mod=new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Subject", "Teacher","Grade", "Date", "Starting Time", "Ending Time",  "Hall"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1140, 370));

        jLabel11.setText("Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 53, 50, -1));

        jLabel12.setText("Subject");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 23, 50, -1));

        timecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timecbActionPerformed(evt);
            }
        });
        jPanel1.add(timecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 50, -1, -1));

        gradecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradecbActionPerformed(evt);
            }
        });
        jPanel1.add(gradecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 50, -1, -1));

        subcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subcbActionPerformed(evt);
            }
        });
        jPanel1.add(subcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 20, -1, -1));

        datecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datecbActionPerformed(evt);
            }
        });
        jPanel1.add(datecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 50, -1, -1));

        subsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subscMouseClicked(evt);
            }
        });
        subsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subscActionPerformed(evt);
            }
        });
        subsc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subscKeyReleased(evt);
            }
        });
        jPanel1.add(subsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 190, -1));

        jLabel5.setText("Grade");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 53, 50, -1));

        gradec1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gradec1KeyReleased(evt);
            }
        });
        jPanel1.add(gradec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 190, -1));

        jLabel13.setText("Teacher");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 23, 50, -1));

        teacherc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teachercKeyReleased(evt);
            }
        });
        jPanel1.add(teacherc, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 190, -1));

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
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        hallcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallcbActionPerformed(evt);
            }
        });
        jPanel1.add(hallcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/examlog2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 20, 90, 80));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_229e(0)_32.png"))); // NOI18N
        jButton10.setText("New");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 35, 105, 23));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32.png"))); // NOI18N
        jButton8.setText("Change");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 65, 105, 23));

        JSpinner.DateEditor timeEditor2 = new JSpinner.DateEditor(times, "HH:mm");
        times.setEditor(timeEditor2);
        times.setValue(new Date());
        jPanel1.add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 80, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("to");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 53, -1, -1));

        JSpinner.DateEditor timeEditor1 = new JSpinner.DateEditor(timee, "HH:mm");
        timee.setEditor(timeEditor1);
        timee.setValue(new Date());
        jPanel1.add(timee, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 80, -1));

        techrcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                techrcb1ActionPerformed(evt);
            }
        });
        jPanel1.add(techrcb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 20, -1, -1));

        datec.setNavigateFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11));
        jPanel1.add(datec, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberfKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }

    }//GEN-LAST:event_numberfKeyReleased

    private void hallcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hallcKeyReleased


    }//GEN-LAST:event_hallcKeyReleased

    private void numberfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberfActionPerformed

    }//GEN-LAST:event_numberfActionPerformed

    private void numberfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberfMouseEntered
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_numberfMouseEntered

    private void numberfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberfMouseExited
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_numberfMouseExited

    private void datecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datecbActionPerformed
        if (datecb.isSelected()) {
            datec.setEnabled(true);
        } else {
            datec.setEnabled(false);
        }
    }//GEN-LAST:event_datecbActionPerformed

    private void subscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subscKeyReleased

    }//GEN-LAST:event_subscKeyReleased

    private void gradec1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradec1KeyReleased

    }//GEN-LAST:event_gradec1KeyReleased

    private void teachercKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teachercKeyReleased

    }//GEN-LAST:event_teachercKeyReleased
    public void searchm() {
        mod.setRowCount(0);
        String nums = numberf.getText();
        String times_s = "";
        String timee_s = "";
        String sub_s = "";
        if (timecb.isSelected()) {
            times_s = ft.format(times.getValue());
            timee_s = ft.format(timee.getValue());
        }
        if (subcb.isSelected()) {
            sub_s = subsc.getItemAt(subsc.getSelectedIndex());
        }
        String tchr_s = "";
        if (techrcb1.isSelected()) {
            tchr_s = teacherc.getItemAt(teacherc.getSelectedIndex());
        }
        String date_s = "";
        if (datecb.isSelected()) {
            date_s = datec.getText();
        }
        String grade_s = "";
        if (gradecb.isSelected()) {
            grade_s = gradec1.getItemAt(gradec1.getSelectedIndex());
        }
        String hall_s = "";
        if (hallcb.isSelected()) {
            hall_s = hallc.getItemAt(hallc.getSelectedIndex());
        }

        examModel Mod = new examModel(nums, sub_s, grade_s, date_s, tchr_s, times_s, timee_s, hall_s);

        try {
            examModel[] clsM = controller.examController.viewExam(Mod);

            for (int i = 0; i < clsM.length; i++) {
                String rowmod[] = {clsM[i].getExamID(), clsM[i].getSubject(), clsM[i].getTeacher(), clsM[i].getGrade(),
                    clsM[i].getDate(), clsM[i].getTimeStart(), clsM[i].getTimeEnd(),
                    clsM[i].getHallNo()};
                mod.addRow(rowmod);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewExam.this, ex.getMessage());
        }
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        searchm();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton11KeyReleased


    }//GEN-LAST:event_jButton11KeyReleased

    private void hallcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallcbActionPerformed
        if (datecb.isSelected()) {
            hallc.setEnabled(true);

        } else {
            hallc.setEnabled(false);

        }
    }//GEN-LAST:event_hallcbActionPerformed

    private void subcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subcbActionPerformed
        if (subcb.isSelected()) {
            subsc.setEnabled(true);
        } else {
            subsc.setEnabled(false);
        }
    }//GEN-LAST:event_subcbActionPerformed

    private void gradecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradecbActionPerformed
        if (gradecb.isSelected()) {
            gradec1.setEnabled(true);
        } else {
            gradec1.setEnabled(false);
        }
    }//GEN-LAST:event_gradecbActionPerformed

    private void timecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timecbActionPerformed
        if (timecb.isSelected()) {
            times.setEnabled(true);
            timee.setEnabled(true);
            jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        } else {
            times.setEnabled(false);
            timee.setEnabled(false);
            jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_timecbActionPerformed

    private void subscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subscActionPerformed

    }//GEN-LAST:event_subscActionPerformed

    private void subscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subscMouseClicked

    }//GEN-LAST:event_subscMouseClicked

    private void numberfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberfFocusGained


    }//GEN-LAST:event_numberfFocusGained

    private void numberfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberfFocusLost


    }//GEN-LAST:event_numberfFocusLost

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        addExam upStu = new addExam();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new updateExam().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void techrcb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_techrcb1ActionPerformed
        if (techrcb1.isSelected()) {
            teacherc.setEnabled(true);
        } else {
            teacherc.setEnabled(false);
        }
    }//GEN-LAST:event_techrcb1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int index = jTable1.getSelectedRow();
        if (index >= 0) {
            String conumber = (String) jTable1.getValueAt(index, 0);
            new examSheet(conumber).setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
                       updateExam n=new updateExam(conumber);
                       n.setVisible(true);
                       n.updateBtn();
                    }
                });
                jPopupMenu1.show(jTable1, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(viewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new viewExam().setVisible(true);
            }
        });
    }
    JPopupMenu jPopupMenu1 = new JPopupMenu();
    javax.swing.table.DefaultTableModel mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserCombo datec;
    private javax.swing.JCheckBox datecb;
    private javax.swing.JComboBox<String> gradec1;
    private javax.swing.JCheckBox gradecb;
    private javax.swing.JComboBox<String> hallc;
    private javax.swing.JCheckBox hallcb;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numberf;
    private javax.swing.JCheckBox subcb;
    private javax.swing.JComboBox<String> subsc;
    private javax.swing.JComboBox<String> teacherc;
    private javax.swing.JCheckBox techrcb1;
    private javax.swing.JCheckBox timecb;
    private javax.swing.JSpinner timee;
    private javax.swing.JSpinner times;
    // End of variables declaration//GEN-END:variables
}
