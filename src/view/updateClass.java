/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.classController;
import controller.studentController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import model.classModel;
import model.comboModel;

/**
 *
 * @author sachee
 */
public class updateClass extends javax.swing.JFrame {

    boolean hallb = false;
    SimpleDateFormat ft = new SimpleDateFormat("H:m");

    /**
     * Creates new form Student
     */
    public updateClass() {

        initComponents();
        setLocationRelativeTo(null);
        subdb();
        halldb();
        gradedb();
        teacherdb();
        initialize();
    }
    
    public updateClass(String ClassID) {

        initComponents();
        setLocationRelativeTo(null);
        subdb();
        halldb();
        gradedb();
        teacherdb();
        initialize();
        numberf.setText(ClassID);
        
    }

    public void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/classico.png")));
        jButton1.setEnabled(false);
        hallc.setEnabled(false);
        hallc.setEnabled(false);
        jButton1.setEnabled(false);
        setTitle("Change class form");
        jButton6.setEnabled(false);
    }

    private void subdb() {
        try {

            comboModel[] cmbM = studentController.addItemcb("subject");
            for (comboModel cmbMod : cmbM) {
                subsc.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        }

    }

    private void teacherdb() {
        try {

            comboModel[] cmbM = studentController.addItemcb("teacher");
            for (comboModel cmbMod : cmbM) {
                teacherc.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        }

    }

    private void teacherdb2() {
        try {

            comboModel[] cmbM = classController.addItemTchrcb(subsc.getItemAt(subsc.getSelectedIndex()));
            for (comboModel cmbMod : cmbM) {
                teacherc.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        }

    }
    
    private void gradedb() {
        try {

            comboModel[] cmbM = studentController.addItemcb("grade");
            for (comboModel cmbMod : cmbM) {
                gradec1.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        }
    }

    private void halldb() {
        try {

            comboModel[] cmbM = studentController.addItemcb("hall");
            for (comboModel cmbMod : cmbM) {
                hallc.addItem(cmbMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        }
    }
    
    public void updateBtn(){
        int j = -1, k = -1, l = -1, m = -1, n = -1, p = -1;

        try {
            if (controller.classController.searchClass(numberf.getText()) != null) {
                classModel Mod = controller.classController.searchClass(numberf.getText());

                numberf.setEditable(false);
                do {

                    j = j + 1;
                    subsc.setSelectedIndex(j);
                } while (!subsc.getItemAt(j).equals(Mod.getSubject()));

                do {

                    l = l + 1;
                    gradec1.setSelectedIndex(l);
                } while (!gradec1.getItemAt(l).equals(Mod.getGrade()));

                do {

                    m = m + 1;
                    datec.setSelectedIndex(m);
                } while (!datec.getItemAt(m).equals(Mod.getDate()));

                do {

                    n = n + 1;
                    teacherc.setSelectedIndex(n);
                } while (!teacherc.getItemAt(n).equals(Mod.getTeacher()));

                if (!(Mod.getHallNo()).isEmpty()) {
                    hallc.setEnabled(true);
                    jButton1.setEnabled(true);
                    hallcb.setSelected(true);
                    hallb = true;

                    do {
                        p = p + 1;
                        hallc.setSelectedIndex(p);
                    } while (!hallc.getItemAt(p).equals(Mod.getHallNo()));
                } else {
                    hallc.setEnabled(false);
                    jButton1.setEnabled(false);
                    hallcb.setSelected(false);
                    hallc.setSelectedIndex(0);
                }

                ///////////////////////////////////
                Date t = new Date();

                try {
                    t = ft.parse(Mod.getTimeStart());
                    times.setValue(t);

                } catch (ParseException e) {

                    JOptionPane.showMessageDialog(null, "Unparseable using " + ft, "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                try {
                    t = ft.parse(Mod.getTimeEnd());
                    timee.setValue(t);

                } catch (ParseException e) {

                    JOptionPane.showMessageDialog(null, "Unparseable using " + ft, "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                ////////////////////////

                feef.setText(Mod.getFee());

            } else {
                JOptionPane.showMessageDialog(null, "Doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        numberf = new javax.swing.JTextField();
        feef = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hallc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hallcb = new javax.swing.JCheckBox();
        subsc = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        datec = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        gradec1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        teacherc = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        timee = new javax.swing.JSpinner(new SpinnerDateModel());
        times = new javax.swing.JSpinner(new SpinnerDateModel());

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
        jPanel1.add(numberf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 210, -1));

        feef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feefMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feefMouseExited(evt);
            }
        });
        feef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                feefKeyReleased(evt);
            }
        });
        jPanel1.add(feef, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 210, -1));

        jLabel2.setText("Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, 50, -1));

        jLabel4.setText("Fee");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 83, 50, -1));

        jLabel6.setText("to");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 53, -1, -1));

        hallc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hallcKeyReleased(evt);
            }
        });
        jPanel1.add(hallc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 190, -1));

        jLabel7.setText("Hall");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 113, 40, -1));

        jLabel8.setText("Time");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 53, 50, -1));

        jButton1.setText("Add Hall");
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 108, 90, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 73, -1));

        jButton5.setLabel("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 500, 73, -1));

        jButton12.setLabel("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 73, -1));

        jButton7.setText("Remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 73, -1));

        jTable1.setModel(mod=new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Subject", "Teacher","Grade", "Date", "Starting Time", "Ending Time", "Fee", "Hall"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 1140, 300));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 70, -1));

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 500, 70, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/classlog.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_229e(0)_32.png"))); // NOI18N
        jButton8.setText("New");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 140, 105, 23));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_e005(0)_32.png"))); // NOI18N
        jButton9.setText("View");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1055, 140, 105, 23));

        jLabel11.setText("Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 113, 50, -1));

        jLabel12.setText("Subject");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 53, 50, -1));

        hallcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallcbActionPerformed(evt);
            }
        });
        jPanel1.add(hallcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 110, -1, -1));

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
        jPanel1.add(subsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 210, -1));

        jButton2.setText("Add Subject");
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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 48, 90, -1));

        jLabel5.setText("Grade");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, 50, -1));

        datec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        datec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                datecKeyReleased(evt);
            }
        });
        jPanel1.add(datec, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 210, -1));

        jButton10.setText("Add Grade");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton10KeyReleased(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 78, 90, -1));

        gradec1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gradec1KeyReleased(evt);
            }
        });
        jPanel1.add(gradec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, -1));

        jLabel13.setText("Teacher");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 23, 50, -1));

        teacherc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teachercKeyReleased(evt);
            }
        });
        jPanel1.add(teacherc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 210, -1));

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
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 18, 90, -1));

        JSpinner.DateEditor timeEditor1 = new JSpinner.DateEditor(timee, "HH:mm");
        timee.setEditor(timeEditor1);
        timee.setValue(new Date());
        jPanel1.add(timee, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 90, -1));

        JSpinner.DateEditor timeEditor2 = new JSpinner.DateEditor(times, "HH:mm");
        times.setEditor(timeEditor2);
        times.setValue(new Date());
        jPanel1.add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addHall m = new addHall(hallc);
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void numberfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            jButton6.requestFocus();
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            subsc.requestFocus();

            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_numberfKeyReleased

    private void feefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feefKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            teacherc.requestFocus();

            feef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jButton4.requestFocus();

            feef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton4.requestFocus();

            feef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_feefKeyReleased

    private void hallcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hallcKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton1.requestFocus();
        }


    }//GEN-LAST:event_hallcKeyReleased

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            hallc.requestFocus();
        }
    }//GEN-LAST:event_jButton1KeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int rowc = jTable1.getRowCount();
        int count = 0;
        boolean b = false, c = false;
        for (int row = 0; row < rowc; row++) {

            String conumber = (String) jTable1.getValueAt(row, 0);
            String cosub = (String) jTable1.getValueAt(row, 1);
            String cotchr = (String) jTable1.getValueAt(row, 2);
            String cogrde = (String) jTable1.getValueAt(row, 3);
            String codate = (String) jTable1.getValueAt(row, 4);
            String cotimes = (String) jTable1.getValueAt(row, 5);
            String cotimee = (String) jTable1.getValueAt(row, 6);
            String cofee = (String) jTable1.getValueAt(row, 7);
            String cohall = (String) jTable1.getValueAt(row, 8);
            
            classModel Mod = new classModel(conumber, cosub, cogrde, codate, cotchr, cotimes, cotimee, cofee, cohall);
            try {
                count++;
                boolean isAdded = classController.updateClass(Mod);
                if (isAdded) {
                    b = true;
                } else {
                    JOptionPane.showMessageDialog(updateClass.this, count + " adding failed");
                    c = true;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
            }
        }
            if (b == true) {
                
                if (c == true) {
                    JOptionPane.showMessageDialog(updateClass.this, "Other records added successfully");
                } else {
                    JOptionPane.showMessageDialog(updateClass.this, "Added successfully");
                    mod.setRowCount(0);
                }
            }
        
        numberf.requestFocus();
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        boolean b1 = true, b11 = true, b111 = false;
        SimpleDateFormat ft = new SimpleDateFormat("H:mm");
        int rowc = jTable1.getRowCount();
        for (int row = 0; row < rowc; row++) {
            if (jTable1.getValueAt(row, 0).equals(numberf.getText())) {
                JOptionPane.showMessageDialog(null, "Duplicate entry for number", "ERROR", JOptionPane.ERROR_MESSAGE);
                b11 = false;
            }
        }
////////////////////////////////////////
        try {

            b111 = classController.searchSuit(teacherc.getItemAt(teacherc.getSelectedIndex()), subsc.getItemAt(subsc.getSelectedIndex()));

            if (b111 == false) {
                JOptionPane.showMessageDialog(null,
                        "Teacher " + teacherc.getItemAt(teacherc.getSelectedIndex()) + " doesn't teach " + subsc.getItemAt(subsc.getSelectedIndex()),
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        }

        ////////////////////////////////////////
        if (b111 == true) {
            if (!numberf.getText().isEmpty()
                    && !feef.getText().isEmpty()) {
                if (b11 == true) {
                    String nums = numberf.getText();
                    String timess = ft.format(times.getValue());
                    String timees = ft.format(timee.getValue());
                    String fees = feef.getText();
                    String dates = datec.getItemAt(datec.getSelectedIndex());
                    String subs = subsc.getItemAt(subsc.getSelectedIndex());
                    String techrs = teacherc.getItemAt(teacherc.getSelectedIndex());
                    String grades = gradec1.getItemAt(gradec1.getSelectedIndex());
                    String halls = "";
                    if (hallb == true) {
                        halls = hallc.getItemAt(hallc.getSelectedIndex());
                    }

                    String rowmod[] = {nums, subs, techrs, grades, dates, timess, timees, fees, halls};
                    mod.addRow(rowmod);
                    jButton6.setEnabled(true);

                    numberf.setText("");

                    feef.setText("");

                    numberf.requestFocus();
                    hallc.setEnabled(false);
                    jButton1.setEnabled(false);
                    hallcb.setSelected(false);
                    subsc.setSelectedIndex(0);
                    gradec1.setSelectedIndex(0);
                    datec.setSelectedIndex(0);
                    teacherc.setSelectedIndex(0);
                    hallc.setSelectedIndex(0);
                    times.setValue(new Date());
                    timee.setValue(new Date());
                    numberf.setEditable(true);
                    numberf.setEditable(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usedfull details are empty", "ERROR", JOptionPane.ERROR_MESSAGE);
                numberf.setEditable(true);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            boolean isAdded = classController.deleteClass(numberf.getText());
            if (isAdded) {
                JOptionPane.showMessageDialog(updateClass.this, "Record deleted successfully");
            } else {
                JOptionPane.showMessageDialog(updateClass.this, "Record deleting failed");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateClass.this, ex.getMessage());
        }

        numberf.setText("");
        feef.setText("");
        numberf.requestFocus();
        hallc.setEnabled(false);
        jButton1.setEnabled(false);
        hallcb.setSelected(false);
        subsc.setSelectedIndex(0);
        gradec1.setSelectedIndex(0);
        datec.setSelectedIndex(0);
        teacherc.setSelectedIndex(0);
        hallc.setSelectedIndex(0);
        times.setValue(new Date());
        timee.setValue(new Date());
        numberf.setEditable(true);
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
        viewClass upStu = new viewClass();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new addClass().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void numberfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberfActionPerformed

    }//GEN-LAST:event_numberfActionPerformed

    private void numberfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberfMouseEntered
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_numberfMouseEntered

    private void feefMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feefMouseEntered
        feef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_feefMouseEntered

    private void numberfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberfMouseExited
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_numberfMouseExited

    private void feefMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feefMouseExited
        feef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_feefMouseExited

    private void hallcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallcbActionPerformed
        if (hallcb.isSelected()) {
            hallc.setEnabled(true);
            jButton1.setEnabled(true);
            hallb = true;

        } else {
            hallc.setEnabled(false);
            jButton1.setEnabled(false);
            hallb = false;

        }
    }//GEN-LAST:event_hallcbActionPerformed

    private void subscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subscKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton2.requestFocus();
        }

        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            numberf.requestFocus();
            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            gradec1.requestFocus();
        }

    }//GEN-LAST:event_subscKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addSubject n = new addSubject(subsc);
        n.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jButton1.requestFocus();
        }
    }//GEN-LAST:event_jButton2KeyReleased

    private void datecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datecKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            gradec1.requestFocus();

        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            teacherc.requestFocus();

        }
    }//GEN-LAST:event_datecKeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        addGrade n = new addGrade(gradec1);
        n.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton10KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            datec.requestFocus();

        }
    }//GEN-LAST:event_jButton10KeyReleased

    private void gradec1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradec1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            subsc.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            datec.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton10.requestFocus();
        }
    }//GEN-LAST:event_gradec1KeyReleased

    private void teachercKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teachercKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            feef.requestFocus();
            feef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            datec.requestFocus();
        }
    }//GEN-LAST:event_teachercKeyReleased

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       updateBtn();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton11KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            numberf.requestFocus();
            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            subsc.requestFocus();
        }
    }//GEN-LAST:event_jButton11KeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        numberf.setText("");
        feef.setText("");
        numberf.requestFocus();
        hallc.setEnabled(false);
        jButton1.setEnabled(false);
        hallcb.setSelected(false);
        subsc.setSelectedIndex(0);
        gradec1.setSelectedIndex(0);
        datec.setSelectedIndex(0);
        teacherc.setSelectedIndex(0);
        hallc.setSelectedIndex(0);
        times.setValue(new Date());
        timee.setValue(new Date());
        numberf.setEditable(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void subscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subscActionPerformed
        teacherc.removeAllItems();
        teacherdb2();
    }//GEN-LAST:event_subscActionPerformed

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
            java.util.logging.Logger.getLogger(updateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateClass().setVisible(true);
            }
        });
    }
    javax.swing.table.DefaultTableModel mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JComboBox<String> datec;
    private javax.swing.JTextField feef;
    private javax.swing.JComboBox<String> gradec1;
    private javax.swing.JComboBox<String> hallc;
    private javax.swing.JCheckBox hallcb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numberf;
    private javax.swing.JComboBox<String> subsc;
    private javax.swing.JComboBox<String> teacherc;
    private javax.swing.JSpinner timee;
    private javax.swing.JSpinner times;
    // End of variables declaration//GEN-END:variables
}
