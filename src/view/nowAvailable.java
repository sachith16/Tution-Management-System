/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author sachee
 */
public class nowAvailable extends javax.swing.JFrame {

    SimpleDateFormat ft = new SimpleDateFormat("H");
    SimpleDateFormat ft2 = new SimpleDateFormat("E");
    Date d = new Date();
    int classHour = 0;

    /**
     * Creates new form nowAvailable
     */
    public nowAvailable() {
        initComponents();
        setLocationRelativeTo(null);

        searchm();
        SimpleDateFormat ft2
                = new SimpleDateFormat("yyyy MMMM dd");
        Date dMonth = new Date();
        SimpleDateFormat ft
                = new SimpleDateFormat("MMMM");
        monthl.setText(ft.format(dMonth));
        Date dDay = new Date();
        ft = new SimpleDateFormat("dd");
        dayl.setText(ft.format(dDay));
        Date dYear = new Date();
        ft = new SimpleDateFormat("yyyy");
        yearl.setText(ft.format(dYear));
        Date dTitle = new Date();
        setTitle("Now availables (" + ft2.format(dTitle) + ")");

        try {
            Class.forName("ClockLabel");
        } catch (ClassNotFoundException e) {
            //System.out.println(e.getMessage());
        }
        ClockLabel dateLable = new ClockLabel("hour");
        ClockLabel timeLable = new ClockLabel("minute");
        ClockLabel dayLable = new ClockLabel("ampm");

        jPanel2.add(dateLable);
        jPanel2.add(timeLable);
        jPanel2.add(dayLable);

    }

    public void searchm() {

        String sql = "Select * From Class";
        Date dNow = new Date();

        SimpleDateFormat ftH
                = new SimpleDateFormat("H");
        int hour = Integer.parseInt(ftH.format(dNow));

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("mysql-java Drvier not found..");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
            java.sql.Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            Date t = new Date();

            for (int i = 0; rst.next(); i++) {
                try {
                    t = ft.parse(rst.getString("TimeStart"));
                    String givenHour = ft.format(t);
                    int classHour = Integer.parseInt(givenHour);
                    String rowmod[] = {rst.getString("ClassID"), rst.getString("Subject"), rst.getString("Grade"), rst.getString("Teacher"),
                        rst.getString("TimeStart") + "-" + rst.getString("TimeEnd")};

                    if ((classHour - 1 == hour || classHour == hour || classHour + 1 == hour) && ft2.format(d).equals(rst.getString("Date").subSequence(0, 3))) {
                        mod.addRow(rowmod);

                    }

                } catch (ParseException e) {

                    JOptionPane.showMessageDialog(null, "Unparseable using " + ft, "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void searchm2() {

        String sql = "Select * From Class";

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

                String rowmod[] = {rst.getString("ClassID"), rst.getString("Subject"), rst.getString("Grade"), rst.getString("Teacher"),
                    rst.getString("TimeStart") + "-" + rst.getString("TimeEnd")};

                if (ft2.format(d).equals(rst.getString("Date").subSequence(0, 3))) {
                    mod.addRow(rowmod);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        monthl = new javax.swing.JLabel();
        yearl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dayl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setLabel("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 73, 23));

        jTable2.setModel(mod=new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID","Subject", "Grade", "Teacher", "Time"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, 20));

        monthl.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        monthl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        monthl.setText("September");
        jPanel1.add(monthl, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 50, 130, 20));

        yearl.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        yearl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearl.setText("2016");
        jPanel1.add(yearl, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 30, 50, 20));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 20, 2, 60));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.GridLayout(3, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 22, 24, 54));

        dayl.setFont(new java.awt.Font("Calibri", 0, 55)); // NOI18N
        dayl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayl.setText("31");
        jPanel1.add(dayl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 16, 80, 70));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 760, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_e75e(0)_28.png"))); // NOI18N
        jButton1.setText("Open    ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, 23));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_e744(0)_26.png"))); // NOI18N
        jButton2.setText("More");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 580, 90, 23));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 657));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        ImageIcon I = new ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32_2.png"));
        jLabel1.setIcon(I);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        ImageIcon I = new ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32_1.png"));
        jLabel1.setIcon(I);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        mod.setRowCount(0);
        searchm();
        ImageIcon I = new ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32_1.png"));
        jLabel1.setIcon(I);
    }//GEN-LAST:event_jLabel1MouseClicked

//    public boolean searchtable(String tablename) {
//        String sql = "show tables";
//        boolean b2 = true;
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("mysql-java Drvier not found..");
//        }
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tutiondb", "root", "1234");
//            java.sql.Statement stm = conn.createStatement();
//            ResultSet rst = stm.executeQuery(sql);
//
//            for (int i = 0; rst.next(); i++) {
//                if (rst.getString(1).equals(tablename.toLowerCase())) {
//                    b2 = false;
//
//                }
//            }
//
//        } catch (SQLException e) {
//
//        }
//        return b2;
//
//    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int index = jTable2.getSelectedRow();
        if (index >= 0) {
            String conumber = (String) jTable2.getValueAt(index, 0);
//            Date dNow = new Date();
//
//            SimpleDateFormat ftt
//                    = new SimpleDateFormat("yyyy-MM-dd");
//            SimpleDateFormat ftt2
//                    = new SimpleDateFormat("dd");
//            SimpleDateFormat ft3
//                    = new SimpleDateFormat("E");
//            SimpleDateFormat ft4
//                    = new SimpleDateFormat("yyyy-MM-");
//            SimpleDateFormat ft5
//                    = new SimpleDateFormat("yyyyMMMM");
//            SimpleDateFormat ft6
//                    = new SimpleDateFormat("yyyy_MM_dd");
//            int n1 = 0;
//
//            Date t;
//            String dayst[] = new String[5];
//            dayst[4] = "Empty";
//
//            loop1:
//            for (int i = 1; i <= 31; i++) {
//                try {
//                    t = ftt.parse(ft4.format(dNow) + i);
//                    if (i > 20 && Integer.parseInt(ftt2.format(t)) < 10) {
//                        break loop1;
//                    }
//                    if (ft3.format(t).equals(ft3.format(dNow))) {
//                        dayst[n1] = ft6.format(t);
//                        n1++;
//                    }
//
//                } catch (ParseException e) {
//                    JOptionPane.showMessageDialog(null, "Unparseable using " + ftt, "ERROR", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//            String tablename=conumber + ft5.format(dNow);
//            
//            
//            ///////////////////////  
//            if(searchtable(tablename)==true){
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//            } catch (ClassNotFoundException e) {
//                System.out.println("mysql-java Drvier not found..");
//            }
//            try {
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tutiondb", "root", "1234");
//                java.sql.Statement stm = conn.createStatement();
//                   
//                   
//                String sql = "CREATE TABLE "+tablename+" (\n"
//                        + "StID VARCHAR(10) NOT NULL,\n"
//                        + "Name VARCHAR(30) NOT NULL,\n"
//                        + "PayedDate VARCHAR(10),\n"
//                        + "IsPayed VARCHAR(10),\n"
//                        + "IsBalanced VARCHAR(10),\n"
//                        + "payedAmount VARCHAR(10),\n"
//                        + "Balance VARCHAR(10),\n"
//                        + "IsTemporary VARCHAR(10),\n"
//                        + dayst[0]+" VARCHAR(10),\n"
//                        + dayst[1]+" VARCHAR(10),\n"
//                        + dayst[2]+" VARCHAR(10),\n"
//                        + dayst[3]+" VARCHAR(10),\n"
//                        + dayst[4]+" VARCHAR(10),\n"
//                        + "CONSTRAINT PRIMARY KEY (StID)\n"
//                        + ")ENGINE=InnoDB DEFAULT CHARSET=latin1";
//                
//                int res = stm.executeUpdate(sql);
//
//                if (res >= 0) {
            payCounter new1 = new payCounter(conumber);
            new1.setVisible(true);
//                } else {
//                    JOptionPane.showMessageDialog(nowAvailable.this, "Error");
//
//                }
//
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//            }else{
//                payCounter new1=new payCounter(conumber, tablename);
//                        new1.setVisible(true);
//            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a class to open", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         mod.setRowCount(0);
        searchm2();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(nowAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nowAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nowAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nowAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nowAvailable().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel hour;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel ampm;
    javax.swing.table.DefaultTableModel mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dayl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel monthl;
    private javax.swing.JLabel yearl;
    // End of variables declaration//GEN-END:variables
}
