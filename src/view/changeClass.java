/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.classController;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import model.changeClassModel;
import model.classModel;

/**
 *
 * @author sachee
 */
public class changeClass extends javax.swing.JFrame {

    String ClassID;
    JTextField f;
    SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat ft3 = new SimpleDateFormat("E");
    SimpleDateFormat ft4 = new SimpleDateFormat("yyyy-MM-");
    SimpleDateFormat ftt2 = new SimpleDateFormat("dd");
    SimpleDateFormat ft = new SimpleDateFormat("H:mm");

    /**
     * Creates new form addGrades
     */
    public changeClass(String ClassID, String date) {
        initComponents();
        setLocationRelativeTo(null);
        datec1.setDateFormat(ft2);
        findDates(date);
        this.ClassID = ClassID;
    }

    private void findDates(String date) {
        int n1 = 0;

        Date t;
        Date dNow = new Date();
        String date2 = ft4.format(dNow);

        loop1:
        for (int i = 1; i <= 31; i++) {
            try {
                t = ft2.parse(date2 + i);

                if (i > 20 && Integer.parseInt(ftt2.format(t)) < 10) {
                    break loop1;
                }

                if (ft3.format(t).equals(date.substring(0, 3))) {
                    if(t.after(new Date())){
                        datecb.addItem(ft2.format(t));
                    }
                }

            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Unparseable using " + ft2, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        datec1 = new datechooser.beans.DateChooserCombo();
        times = new javax.swing.JSpinner(new SpinnerDateModel());
        timee = new javax.swing.JSpinner(new SpinnerDateModel());
        jLabel6 = new javax.swing.JLabel();
        datecb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Change into");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 58, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_f600(0)_32.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, 30));

        jButton2.setText("Change");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton2KeyReleased(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        datec1.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    datec1.setCalendarPreferredSize(new java.awt.Dimension(200, 180));
    datec1.setNavigateFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11));
    getContentPane().add(datec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, -1));

    JSpinner.DateEditor timeEditor2 = new JSpinner.DateEditor(times, "HH:mm");
    times.setEditor(timeEditor2);
    times.setValue(new Date());
    getContentPane().add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 70, -1));

    JSpinner.DateEditor timeEditor1 = new JSpinner.DateEditor(timee, "HH:mm");
    timee.setEditor(timeEditor1);
    timee.setValue(new Date());
    getContentPane().add(timee, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 70, -1));

    jLabel6.setText("to");
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 83, -1, -1));

    getContentPane().add(datecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

    jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 160));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        changeClassModel Mod = new changeClassModel(ClassID, datecb.getItemAt(datecb.getSelectedIndex()), datec1.getText(), ft.format(times.getValue()), ft.format(timee.getValue()));
        try {
            boolean isAdded = classController.changeClass(Mod);

            if (isAdded) {
                JOptionPane.showMessageDialog(changeClass.this, "Added successfully");
            } else {
                JOptionPane.showMessageDialog(changeClass.this, "Adding failed");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(changeClass.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(changeClass.this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(changeClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changeClass("C1", "Monday").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo datec1;
    private javax.swing.JComboBox<String> datecb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner timee;
    private javax.swing.JSpinner times;
    // End of variables declaration//GEN-END:variables
}
