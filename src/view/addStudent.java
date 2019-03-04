/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.studentController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.comboModel;
import model.studentModel;

/**
 *
 * @author sachee
 */
public class addStudent extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    public addStudent() {
        initComponents();
        gradecdb();
        scoolcdb();
        initialize();
    }

    public addStudent(String StuID) {
        initComponents();
        gradecdb();
        scoolcdb();
        initialize();
        numberf.setText(StuID);
    }

    public void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/student2.png")));
        jButton6.setEnabled(false);
        setTitle("Add student form");
        setLocationRelativeTo(null);
    }

    private void gradecdb() {
//        String sql = "Select * From grade";
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
//                gradec.addItem(rst.getString("name"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
        try {

            comboModel[] sclM = studentController.addItemcb("grade");
            for (comboModel sclMod : sclM) {
                gradec.addItem(sclMod.getName());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(addStudent.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(addStudent.this, ex.getMessage());
        }
    }

    private void scoolcdb() {
//        String sql = "Select * From school";
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
//                schoolc.addItem(rst.getString("name"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
        try {

            comboModel[] sclM = studentController.addItemcb("school");
            for (comboModel sclMod : sclM) {
                schoolc.addItem(sclMod.getName());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(addStudent.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(addStudent.this, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ad4f = new javax.swing.JTextField();
        numberf = new javax.swing.JTextField();
        namef = new javax.swing.JTextField();
        ad1f = new javax.swing.JTextField();
        ad2f = new javax.swing.JTextField();
        ad3f = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gradec = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dayf = new javax.swing.JTextField();
        monthf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        schoolc = new javax.swing.JComboBox<>();
        yearf = new javax.swing.JTextField();
        telhf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        telmf = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Birthday");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 113, 50, -1));

        ad4f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ad4fMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ad4fMouseExited(evt);
            }
        });
        ad4f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ad4fKeyReleased(evt);
            }
        });
        jPanel1.add(ad4f, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 290, -1));

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
        jPanel1.add(numberf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 210, -1));

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
        jPanel1.add(namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 630, -1));

        ad1f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ad1fMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ad1fMouseExited(evt);
            }
        });
        ad1f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ad1fKeyReleased(evt);
            }
        });
        jPanel1.add(ad1f, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 290, -1));

        ad2f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ad2fMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ad2fMouseExited(evt);
            }
        });
        ad2f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ad2fKeyReleased(evt);
            }
        });
        jPanel1.add(ad2f, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 290, -1));

        ad3f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ad3fMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ad3fMouseExited(evt);
            }
        });
        ad3f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ad3fKeyReleased(evt);
            }
        });
        jPanel1.add(ad3f, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 290, -1));

        jLabel2.setText("Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, 50, -1));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 53, 50, -1));

        gradec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gradecKeyReleased(evt);
            }
        });
        jPanel1.add(gradec, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 220, -1));

        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, 50, -1));

        jLabel5.setText("Grade");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 83, 50, -1));

        dayf.setColumns(2);
        dayf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dayfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dayfMouseExited(evt);
            }
        });
        dayf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dayfKeyReleased(evt);
            }
        });
        jPanel1.add(dayf, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 50, -1));

        monthf.setColumns(2);
        monthf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthfMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monthfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                monthfMouseExited(evt);
            }
        });
        monthf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monthfKeyReleased(evt);
            }
        });
        jPanel1.add(monthf, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 110, 50, -1));

        jLabel6.setText("(H)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 173, -1, -1));

        schoolc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                schoolcKeyReleased(evt);
            }
        });
        jPanel1.add(schoolc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 220, -1));

        yearf.setColumns(4);
        yearf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yearfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yearfMouseExited(evt);
            }
        });
        yearf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearfFocusLost(evt);
            }
        });
        yearf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yearfKeyReleased(evt);
            }
        });
        jPanel1.add(yearf, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 110, -1));

        telhf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                telhfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telhfMouseExited(evt);
            }
        });
        telhf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telhfKeyReleased(evt);
            }
        });
        jPanel1.add(telhf, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 150, -1));

        jLabel7.setText("School");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 143, 50, -1));

        jLabel8.setText("Tel(M)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 173, 50, -1));

        jButton1.setText("Add School");
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 138, 100, -1));

        jButton2.setText("Add Grade");
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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 79, 100, -1));

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
        jPanel1.add(telmf, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 150, -1));

        jButton3.setLabel("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 73, -1));

        jButton5.setLabel("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 500, 73, -1));

        jButton7.setText("Remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 73, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1140, 240));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 70, -1));

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 500, 70, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stulog2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32.png"))); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 190, 105, 23));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_e005(0)_32.png"))); // NOI18N
        jButton9.setText("View");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 190, 105, 23));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addSchool m = new addSchool(schoolc);
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addGrade n = new addGrade(gradec);
        n.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void numberfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            namef.requestFocus();
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            namef.requestFocus();
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            int n=10-numberf.getText().length();
            for(int i=0;i<n;i++){
                numberf.setText("0"+numberf.getText());
            }
            
        }
    }//GEN-LAST:event_numberfKeyReleased

    private void namefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            numberf.requestFocus();
            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            ad1f.requestFocus();
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ad1f.requestFocus();
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_namefKeyReleased

    private void ad1fKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ad1fKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            namef.requestFocus();
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            ad2f.requestFocus();
            ad2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ad2f.requestFocus();
            ad2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_ad1fKeyReleased

    private void ad2fKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ad2fKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            ad1f.requestFocus();
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            ad3f.requestFocus();
            ad3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ad3f.requestFocus();
            ad3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_ad2fKeyReleased

    private void ad3fKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ad3fKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            ad2f.requestFocus();
            ad2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            ad4f.requestFocus();
            ad4f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ad4f.requestFocus();
            ad4f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_ad3fKeyReleased

    private void ad4fKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ad4fKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            ad3f.requestFocus();
            ad3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad4f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            gradec.requestFocus();
            ad4f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            gradec.requestFocus();
            ad4f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_ad4fKeyReleased

    private void gradecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradecKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            ad4f.requestFocus();
            ad4f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton2.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            yearf.requestFocus();
            yearf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
    }//GEN-LAST:event_gradecKeyReleased

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            gradec.requestFocus();

        }
    }//GEN-LAST:event_jButton2KeyReleased

    private void yearfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            gradec.requestFocus();
            yearf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            schoolc.requestFocus();
            yearf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            monthf.requestFocus();
            monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            yearf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            monthf.requestFocus();
            monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            yearf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        
        
    }//GEN-LAST:event_yearfKeyReleased

    private void monthfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            yearf.requestFocus();
            yearf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            schoolc.requestFocus();
            monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            dayf.requestFocus();
            dayf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dayf.requestFocus();
            dayf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_monthfKeyReleased

    private void dayfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            monthf.requestFocus();
            monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            dayf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            schoolc.requestFocus();
            dayf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            schoolc.requestFocus();
            dayf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_dayfKeyReleased

    private void schoolcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schoolcKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            dayf.requestFocus();
            dayf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telmf.requestFocus();
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        }
    }//GEN-LAST:event_schoolcKeyReleased

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            schoolc.requestFocus();
        }
    }//GEN-LAST:event_jButton1KeyReleased

    private void telmfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telmfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telhf.requestFocus();
            telhf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            telhf.requestFocus();
            telhf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            schoolc.requestFocus();
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_telmfKeyReleased

    private void telhfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telhfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            schoolc.requestFocus();
            telhf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton4.requestFocus();
            telhf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            telmf.requestFocus();
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            telhf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_telhfKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        String sql = "Insert into student Values(?,?,?,?,?,?,?,?)";
        int rowc = jTable1.getRowCount();
        int count = 0;
        boolean b = false, c = false;
        for (int row = 0; row < rowc; row++) {
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//            } catch (ClassNotFoundException e) {
//                System.out.println("mysql-java Drvier not found..");
//            }
//            try {
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
//                PreparedStatement stm = conn.prepareStatement(sql);

            String conumber = (String) jTable1.getValueAt(row, 0);
            String coname = (String) jTable1.getValueAt(row, 1);
            String coad = (String) jTable1.getValueAt(row, 2);
            String cograde = (String) jTable1.getValueAt(row, 3);
            String cobday = (String) jTable1.getValueAt(row, 4);
            String cosch = (String) jTable1.getValueAt(row, 5);
            String comob = (String) jTable1.getValueAt(row, 6);
            String cohome = (String) jTable1.getValueAt(row, 7);
            count++;
            studentModel stMod = new studentModel(conumber, coname, coad, cograde, cobday, cosch, comob, cohome);
            try {
                boolean isAdded = studentController.addStudent(stMod);
                studentController.updateStudentinAtt(conumber);
                if (isAdded) {
                    b = true;
                } else {
                    JOptionPane.showMessageDialog(addStudent.this, count + " adding failed");
                    c = true;
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(addStudent.this, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(addStudent.this, ex.getMessage());
            }

//                stm.setObject(1, conumber);
//                stm.setObject(2, coname);
//                stm.setObject(3, coad);
//                stm.setObject(4, cograde);
//                stm.setObject(5, cobday);
//                stm.setObject(6, cosch);
//                stm.setObject(7, comob);
//                stm.setObject(8, cohome);
//                int res = stm.executeUpdate();
//                count++;
//                if (res > 0) {
//                    b = true;
//
//                } else {
//                    JOptionPane.showMessageDialog(addStudent.this, "Record " + count + " Adding failed");
//                    c = true;
//                }
//
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//        }
        }
            if (b == true) {
                
                if (c == true) {
                    JOptionPane.showMessageDialog(addStudent.this, "Other records added successfully");
                } else {
                    JOptionPane.showMessageDialog(addStudent.this, "Added successfully");
                    mod.setRowCount(0);
                }
            
    }//GEN-LAST:event_jButton6ActionPerformed
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        String sql = "Select * From student";
        boolean b1 = true, b11 = true;

        int rowc = jTable1.getRowCount();
        for (int row = 0; row < rowc; row++) {
            if (jTable1.getValueAt(row, 0).equals(numberf.getText())) {
                JOptionPane.showMessageDialog(null, "Duplicate entry for number", "ERROR", JOptionPane.ERROR_MESSAGE);
                b11 = false;
            }
        }

//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("mysql-java Drvier not found..");
//        }
        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
//            java.sql.Statement stm = conn.createStatement();
//            ResultSet rst = stm.executeQuery(sql);

            b1 = studentController.searchID(numberf.getText());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(addStudent.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(addStudent.this, ex.getMessage());
        }
        String emptyf = "";
        if (numberf.getText().isEmpty()) {
            emptyf = emptyf + "Number,";
        }
        if (namef.getText().isEmpty()) {
            emptyf = emptyf + "Name,";
        }
        if (ad1f.getText().isEmpty()) {
            emptyf = emptyf + "Address line 1,";
        }
        if (ad2f.getText().isEmpty()) {
            emptyf = emptyf + "Address line 2,";
        }
        if (yearf.getText().isEmpty() || monthf.getText().isEmpty() || dayf.getText().isEmpty()) {
            emptyf = emptyf + "Birthday,";
        }

        if (telmf.getText().isEmpty() && telhf.getText().isEmpty()) {
            emptyf = emptyf + "Tel number,";
        }

        if (!numberf.getText().isEmpty() && !namef.getText().isEmpty()
                && !ad1f.getText().isEmpty() && !ad2f.getText().isEmpty()
                && !yearf.getText().isEmpty() && !monthf.getText().isEmpty()
                && !dayf.getText().isEmpty() && (!telmf.getText().isEmpty() || !telhf.getText().isEmpty())) {
            if (b1 == true && b11 == true) {
                String nums = numberf.getText();
                String names = namef.getText();
                String adds = ad1f.getText() + "," + ad2f.getText() + "," + ad3f.getText() + "," + ad4f.getText();
                String grades = gradec.getItemAt(gradec.getSelectedIndex());
                String bdays = yearf.getText() + "-" + monthf.getText() + "-" + dayf.getText();
                String schls = schoolc.getItemAt(schoolc.getSelectedIndex());
                String telms = telmf.getText();
                String telhs = telhf.getText();

                String rowmod[] = {nums, names, adds, grades, bdays, schls, telms, telhs};
                mod.addRow(rowmod);
                jButton6.setEnabled(true);

                numberf.setText("");
                namef.setText("");
                ad1f.setText("");
                ad2f.setText("");
                ad3f.setText("");
                ad4f.setText("");
                yearf.setText("");
                monthf.setText("");
                dayf.setText("");
                telmf.setText("");
                telhf.setText("");
                numberf.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usedfull details are empty(" + emptyf + ")", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        numberf.setText("");
        namef.setText("");
        ad1f.setText("");
        ad2f.setText("");
        ad3f.setText("");
        ad4f.setText("");
        yearf.setText("");
        monthf.setText("");
        dayf.setText("");
        telmf.setText("");
        telhf.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int index = jTable1.getSelectedRow();
        if (index >= 0) {
            mod.removeRow(index);
            if (jTable1.getRowCount() == 0) {
                jButton6.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a item to remove", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        viewStudent upStu = new viewStudent();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        updateStudent upStu = new updateStudent();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void numberfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberfActionPerformed

    }//GEN-LAST:event_numberfActionPerformed

    private void monthfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthfMouseClicked

    }//GEN-LAST:event_monthfMouseClicked

    private void monthfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthfMouseEntered
        monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_monthfMouseEntered

    private void monthfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthfMouseExited
        monthf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    }//GEN-LAST:event_monthfMouseExited

    private void numberfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberfMouseEntered
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_numberfMouseEntered

    private void namefMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namefMouseEntered
        namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_namefMouseEntered

    private void ad1fMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad1fMouseEntered
        ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_ad1fMouseEntered

    private void ad2fMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad2fMouseEntered
        ad2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_ad2fMouseEntered

    private void ad3fMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad3fMouseEntered
        ad3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_ad3fMouseEntered

    private void ad4fMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad4fMouseEntered
        ad4f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_ad4fMouseEntered

    private void yearfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearfMouseEntered
        yearf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        
    }//GEN-LAST:event_yearfMouseEntered

    private void dayfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayfMouseEntered
        dayf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_dayfMouseEntered

    private void telmfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telmfMouseEntered
        telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_telmfMouseEntered

    private void telhfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telhfMouseEntered
        telhf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_telhfMouseEntered

    private void numberfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberfMouseExited
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_numberfMouseExited

    private void namefMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namefMouseExited
        namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_namefMouseExited

    private void ad1fMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad1fMouseExited
        ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_ad1fMouseExited

    private void ad2fMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad2fMouseExited
        ad2f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_ad2fMouseExited

    private void ad3fMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad3fMouseExited
        ad3f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_ad3fMouseExited

    private void ad4fMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad4fMouseExited
        ad4f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_ad4fMouseExited

    private void yearfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearfMouseExited
        yearf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_yearfMouseExited

    private void dayfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayfMouseExited
        dayf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    }//GEN-LAST:event_dayfMouseExited

    private void telmfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telmfMouseExited
        telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_telmfMouseExited

    private void telhfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telhfMouseExited
        telhf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_telhfMouseExited

    private void yearfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearfFocusLost
        
    }//GEN-LAST:event_yearfFocusLost

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
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStudent().setVisible(true);
            }
        });
    }
    javax.swing.table.DefaultTableModel mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad1f;
    private javax.swing.JTextField ad2f;
    private javax.swing.JTextField ad3f;
    private javax.swing.JTextField ad4f;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JTextField dayf;
    private javax.swing.JComboBox<String> gradec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField monthf;
    private javax.swing.JTextField namef;
    private javax.swing.JTextField numberf;
    private javax.swing.JComboBox<String> schoolc;
    private javax.swing.JTextField telhf;
    private javax.swing.JTextField telmf;
    private javax.swing.JTextField yearf;
    // End of variables declaration//GEN-END:variables
}
