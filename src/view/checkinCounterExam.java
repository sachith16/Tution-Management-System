/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author sachee
 */
public class checkinCounterExam extends javax.swing.JFrame {

    String ExamID;
    
    String Grade;
    Date dNow = new Date();
    SimpleDateFormat ftt
            = new SimpleDateFormat("yyyy-MM-dd");
    
    boolean b1 = false;

    /**
     * Creates new form payCounter
     */
    public checkinCounterExam(String ExamID) {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(677, 250);
        jPanel1.setSize(677, 250);
        numberf.requestFocus();
        this.ExamID = ExamID;
        
        searchm();
     
    }

    public void searchm() {

        String sql = "Select * From Exam where ExamID like '" + ExamID + "'";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("mysql-java Drvier not found..");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
            java.sql.Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            rst.next();
            techrl.setText("  " + rst.getString("Teacher"));
            subl.setText("  " + rst.getString("Subject"));
            gradel.setText("  " + rst.getString("Grade"));
            Grade = rst.getString("Grade");
            timel.setText("  " + rst.getString("TimeStart") + "-" + rst.getString("TimeEnd"));
            
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
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
        numberf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        timel = new javax.swing.JLabel();
        techrl = new javax.swing.JLabel();
        subl = new javax.swing.JLabel();
        gradel = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numberf.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        numberf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberfKeyReleased(evt);
            }
        });
        jPanel1.add(numberf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 640, 40));

        jLabel2.setText("Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, -1, -1));

        timel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timel.setForeground(new java.awt.Color(102, 102, 102));
        timel.setText("13.00-15.00");
        timel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(timel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 330, -1));

        techrl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        techrl.setForeground(new java.awt.Color(102, 102, 102));
        techrl.setText("Sunil Kamal Nimal");
        techrl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(techrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 645, -1));

        subl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        subl.setForeground(new java.awt.Color(102, 102, 102));
        subl.setText("Maths");
        subl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(subl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, -1));

        gradel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gradel.setForeground(new java.awt.Color(102, 102, 102));
        gradel.setText("Grade10");
        gradel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(gradel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 315, -1));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_2328(0)_32.png"))); // NOI18N
        jToggleButton2.setText("Auto");
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 677, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
       public boolean stusearchID() {
        boolean b = false;
        String sql = "Select StID From Student";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("mysql-java Drvier not found..");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
            java.sql.Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery(sql);

            for (int i = 0; rst.next(); i++) {
                if (rst.getString(1).equals(numberf.getText())) {
                    b = true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return b;
    }


    public void setCheck(){
        if(stusearchID()==true){
                   String sql1 = "Insert into Examattendance Values(?,?,?)";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    System.out.println("mysql-java Drvier not found..");
                }
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
                    PreparedStatement stm = conn.prepareStatement(sql1);

                   stm.setObject(1, ExamID);
                    stm.setObject(2, numberf.getText());
                    stm.setObject(3, "");
                    
                    stm.executeUpdate();

                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                   
        }else{
            JOptionPane.showMessageDialog(null, "Not registered", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        numberf.setText("");
    }
    
    private void numberfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_0
                || evt.getKeyCode() == KeyEvent.VK_1
                || evt.getKeyCode() == KeyEvent.VK_2
                || evt.getKeyCode() == KeyEvent.VK_3
                || evt.getKeyCode() == KeyEvent.VK_4
                || evt.getKeyCode() == KeyEvent.VK_5
                || evt.getKeyCode() == KeyEvent.VK_6
                || evt.getKeyCode() == KeyEvent.VK_7
                || evt.getKeyCode() == KeyEvent.VK_8
                || evt.getKeyCode() == KeyEvent.VK_9
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD0
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD1
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD2
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD3
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD4
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD5
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD6
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD7
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD8
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            int c = 0;
            String numbers = numberf.getText();
            c = numbers.length();
            if (c >= 10 && jToggleButton2.isSelected()) {
                setCheck();
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !jToggleButton2.isSelected()) {
           setCheck();
        }
    }//GEN-LAST:event_numberfKeyReleased

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
            java.util.logging.Logger.getLogger(checkinCounterExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkinCounterExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkinCounterExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkinCounterExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkinCounterExam("E1").setVisible(true);
            }
        });
    }
    javax.swing.table.DefaultTableModel mod;
    javax.swing.table.DefaultTableModel mod2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gradel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField numberf;
    private javax.swing.JLabel subl;
    private javax.swing.JLabel techrl;
    private javax.swing.JLabel timel;
    // End of variables declaration//GEN-END:variables
}