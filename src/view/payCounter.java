/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author sachee
 */
public class payCounter extends javax.swing.JFrame {

    String ClassID;
    String tablename;
    int fee;
    int balance;
    String Grade;
    Date dNow = new Date();
    SimpleDateFormat ftt
            = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat ft5
            = new SimpleDateFormat("yyyyMMMM");
    boolean b1 = false;

    /**
     * Creates new form payCounter
     */
    public payCounter(String ClassID) {
        initComponents();
        setLocationRelativeTo(null);
        setSize(677, 250);
        jPanel1.setSize(677, 250);
        numberf.requestFocus();
        this.ClassID = ClassID;
        this.tablename = tablename;
        searchm();
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);

    }

    public void searchm() {

        String sql = "Select * From Class where ClassID like '" + ClassID + "'";

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
            feel.setText("  " + "Rs." + rst.getString("Fee"));
            fee = Integer.parseInt(rst.getString("Fee"));

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
        balancef = new javax.swing.JTextField();
        payedf = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        uBtn = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timel = new javax.swing.JLabel();
        techrl = new javax.swing.JLabel();
        subl = new javax.swing.JLabel();
        gradel = new javax.swing.JLabel();
        feel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jPanel1.add(numberf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 330, 40));

        balancef.setEditable(false);
        balancef.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jPanel1.add(balancef, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 130, 150, 40));

        payedf.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        payedf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payedfActionPerformed(evt);
            }
        });
        payedf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                payedfKeyReleased(evt);
            }
        });
        jPanel1.add(payedf, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 130, 150, 40));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tempico.png"))); // NOI18N
        jToggleButton1.setText("Temporary");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 180, -1, 28));

        uBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_e742(0)_32.png"))); // NOI18N
        uBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uBtnActionPerformed(evt);
            }
        });
        jPanel1.add(uBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 28, 28));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_2b07(0)_32.png"))); // NOI18N
        jButton1.setText("Not balanced");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 180, 150, 28));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_28.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 544, 28, 23));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32_3.png"))); // NOI18N
        jButton2.setText("Balanced");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 180, 150, 28));

        jLabel1.setText("Balance");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel2.setText("Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, -1, -1));

        jLabel3.setText("Payed amount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

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

        feel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        feel.setForeground(new java.awt.Color(102, 102, 102));
        feel.setText("Rs.400");
        feel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(feel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 71, 315, -1));

        jTable1.setModel(mod=new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Payed amount", "Balance", "Temp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(2).setMinWidth(5);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(3).setMinWidth(1);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(1);
        }

        jTabbedPane1.addTab("Balanced", jScrollPane1);

        jTable2.setModel(mod2=new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Payed amount", "Balance", "Temp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setMinWidth(5);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTable2.getColumnModel().getColumn(2).setMinWidth(5);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable2.getColumnModel().getColumn(3).setMinWidth(1);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(1);
        }

        jTabbedPane1.addTab("Not balanced", jScrollPane2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 650, 310));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_28_1.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 544, 28, 23));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_2615(0)_32.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 180, 30, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 677, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean stusearchMain() {
        boolean b = true;
        String sql = "Select StID From Attendance where IsPayed like 'Yes' and MonthCode like '" + ft5.format(dNow) + "' and ClassID like '" + ClassID + "'";

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
                    b = false;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return b;
    }

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

    public boolean stusearchSec() {
        boolean b = true;
        String sql = "Select StID From Attendance where MonthCode like '" + ft5.format(dNow) + "' and ClassID like '" + ClassID + "'";

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
                    b = false;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return b;
    }

    public boolean stusearchRemove() {
        boolean b = true;
        String sql = "Select StID From Attendance where IsPayed like 'Yes' and MonthCode like '" + ft5.format(dNow) + "' and ClassID like '" + ClassID
                + "' and Date1 like '' and Date2 like '' and Date3 like '' and Date4 like '' and Date5 like ''";

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
                    b = false;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return b;
    }

//    public boolean stusearchNo() {
//        boolean b = false;
//        String sql = "Select StID From " + tablename + " where IsPayed like 'No'";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("mysql-java Drvier not found..");
//        }
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
//            java.sql.Statement stm = conn.createStatement();
//            ResultSet rst = stm.executeQuery(sql);
//
//            for (int i = 0; rst.next(); i++) {
//                if (rst.getString(1).equals(numberf.getText())) {
//                    b = true;
//                }
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return b;
//    }
//    public String searchByGrade() {
//        String sql = "Select StID,Name From student where Grade like '" + Grade + "'";
//        String stname = "";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("mysql-java Drvier not found..");
//        }
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
//            java.sql.Statement stm = conn.createStatement();
//            ResultSet rst = stm.executeQuery(sql);
//
//            for (int i = 0; rst.next(); i++) {
//                if (rst.getString(1).equals(numberf.getText())) {
//                    stname = rst.getString(2);
//                }
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return stname;
//    }
    public void methodPayed(boolean balnc) {
        if (stusearchID() == true || (stusearchID() == false && jToggleButton1.isSelected())) {
            if (stusearchMain() == true) {
                if (stusearchSec() == true) {

                    String indexmod[] = {numberf.getText(), payedf.getText(), balancef.getText(), jToggleButton1.isSelected() ? "Yes" : ""};
                    if (balnc == true) {
                        mod.addRow(indexmod);
                    } else {
                        mod2.addRow(indexmod);
                    }

                    String sql1 = "Insert into Attendance Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException e) {
                        System.out.println("mysql-java Drvier not found..");
                    }
                    try {
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
                        PreparedStatement stm = conn.prepareStatement(sql1);

                        stm.setObject(1, numberf.getText());
                        stm.setObject(2, ClassID);
                        stm.setObject(3, ft5.format(dNow));
                        stm.setObject(4, "Yes");
                        stm.setObject(5, payedf.getText());
                        stm.setObject(6, balancef.getText());
                        stm.setObject(7, ftt.format(dNow));
                        stm.setObject(8, jToggleButton1.isSelected() ? "Yes" : "");
                        stm.setObject(9, balnc == true ? "Yes" : "No");
                        stm.setObject(10, "");
                        stm.setObject(11, "");
                        stm.setObject(12, "");
                        stm.setObject(13, "");
                        stm.setObject(14, "");
                        int res = stm.executeUpdate();

                        if (res > 0) {

                        } else {
                            JOptionPane.showMessageDialog(payCounter.this, "Record adding failed");

                        }

                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }

                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException e) {
                        System.out.println("mysql-java Drvier not found..");
                    }
                    try {
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
                        java.sql.Statement stm = conn.createStatement();
                        String sql = "UPDATE Attendance SET PayedDate='" + ftt.format(dNow)
                                + "',IsPayed='Yes',IsBalanced='" + (balnc == true ? "Yes" : "") + "',payedAmount='" + payedf.getText()
                                + "',Balance='" + balancef.getText() + "'  WHERE StID='" + numberf.getText() + "' and IsPayed='No' and MonthCode like '"
                                + ft5.format(dNow) + "' and ClassID like '" + ClassID + "'";

                        stm.executeUpdate(sql);

                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
                numberf.setText("");
                payedf.setText("");
                balancef.setText("");
                numberf.requestFocus();
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Payed student", "ERROR", JOptionPane.ERROR_MESSAGE);
                numberf.setText("");
                payedf.setText("");
                balancef.setText("");
                numberf.requestFocus();
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Temporary student", "ERROR", JOptionPane.ERROR_MESSAGE);
            jToggleButton1.setSelected(true);
        }
    }
    private void payedfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payedfKeyReleased

        boolean b2 = false;

        String balast = "";

        if ((evt.getKeyCode() == KeyEvent.VK_0
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
                || evt.getKeyCode() == KeyEvent.VK_NUMPAD9
                || evt.getKeyCode() == KeyEvent.VK_ENTER
                || evt.getKeyCode() == KeyEvent.VK_UP
                || evt.getKeyCode() == KeyEvent.VK_DOWN
                || evt.getKeyCode() == KeyEvent.VK_LEFT
                || evt.getKeyCode() == KeyEvent.VK_RIGHT) && !payedf.getText().isEmpty()) {
            int payed = Integer.parseInt(payedf.getText());

            if (payed >= fee) {
                if (payed > fee) {
                    balance = payed - fee;
                    balancef.setText(balance + "");

                }
                b1 = true;
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);

            } else {
                balancef.setText("");
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                b1 = false;
            }
        } else {
            balancef.setText("");
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jButton1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            numberf.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !numberf.getText().isEmpty() && b1 == true) {
            methodPayed(true);
        }
    }//GEN-LAST:event_payedfKeyReleased

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
            if (c >= 10) {
                payedf.requestFocus();
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            payedf.requestFocus();
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            int n = 10 - numberf.getText().length();
            for (int i = 0; i < n; i++) {
                numberf.setText("0" + numberf.getText());
            }
        }
    }//GEN-LAST:event_numberfKeyReleased

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            payedf.requestFocus();
        }
    }//GEN-LAST:event_jButton1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!numberf.getText().isEmpty() && b1 == true) {
            methodPayed(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        String tempst = "";
//        if (jToggleButton1.isSelected()) {
//            tempst = "Yes";
//        }
//        String indexmod[] = {numberf.getText(), payedf.getText(), balancef.getText(), tempst};
//        mod2.addRow(indexmod);

        if (!numberf.getText().isEmpty() && b1 == true) {
            methodPayed(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void payedfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payedfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payedfActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mod.setRowCount(0);
        mod2.setRowCount(0);
        String sql = "Select * From Attendance where IsBalanced like 'Yes' and MonthCode like '" + ft5.format(dNow) + "' and ClassID like '" + ClassID + "'";
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
                String indexmod[] = {rst.getString("StID"), rst.getString("payedAmount"), rst.getString("Balance"), rst.getString("IsTemp")};
                mod.addRow(indexmod);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sql2 = "Select * From Attendance where IsBalanced like 'No' and MonthCode like '" + ft5.format(dNow) + "' and ClassID like '" + ClassID + "'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("mysql-java Drvier not found..");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
            java.sql.Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery(sql2);
            for (int i = 0; rst.next(); i++) {
                String indexmod[] = {rst.getString("StID"), rst.getString("payedAmount"), rst.getString("Balance"), rst.getString("IsTemp")};
                mod2.addRow(indexmod);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void uBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uBtnActionPerformed
        if (uBtn.isSelected()) {
            setSize(677, 600);
            jPanel1.setSize(677, 600);
        } else {
            setSize(677, 250);
            jPanel1.setSize(677, 250);
        }

    }//GEN-LAST:event_uBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int index = jTable2.getSelectedRow();
        if (index >= 0) {
            String conumber = (String) jTable2.getValueAt(index, 0);
            String copayed = (String) jTable2.getValueAt(index, 1);
            String cobalance = (String) jTable2.getValueAt(index, 2);
            String cotemp = (String) jTable2.getValueAt(index, 3);
            mod2.removeRow(index);
            String indexmod[] = {conumber, copayed, cobalance, cotemp};
            mod.addRow(indexmod);
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("mysql-java Drvier not found..");
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
                java.sql.Statement stm = conn.createStatement();
                String sql = "UPDATE Attendance SET IsBalanced='Yes' WHERE StID='" + conumber + "' and IsBalanced like 'No' and MonthCode like '" + ft5.format(dNow) + "' and ClassID like '" + ClassID + "'";

                stm.executeUpdate(sql);

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (stusearchRemove() == false) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("mysql-java Drvier not found..");
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
                java.sql.Statement stm = conn.createStatement();

                String sql = "DELETE from Attendance WHERE StID='" + numberf.getText() + "' and MonthCode like '"
                        + ft5.format(dNow) + "' and ClassID like '" + ClassID + "' and IsPayed like 'Yes'";

                int res = stm.executeUpdate(sql);

                if (res > 0) {
                    JOptionPane.showMessageDialog(payCounter.this, "Removed successfully");
                    numberf.setText("");
                    payedf.setText("");
                    balancef.setText("");
                    numberf.requestFocus();
                    jButton1.setEnabled(false);
                    jButton2.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(payCounter.this, "Removing failed");

                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(payCounter.this, "Can't refund");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(payCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new payCounter("C1", "c12016january").setVisible(true);
            }
        });
    }
    javax.swing.table.DefaultTableModel mod;
    javax.swing.table.DefaultTableModel mod2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balancef;
    private javax.swing.JLabel feel;
    private javax.swing.JLabel gradel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField numberf;
    private javax.swing.JTextField payedf;
    private javax.swing.JLabel subl;
    private javax.swing.JLabel techrl;
    private javax.swing.JLabel timel;
    private javax.swing.JToggleButton uBtn;
    // End of variables declaration//GEN-END:variables
}
