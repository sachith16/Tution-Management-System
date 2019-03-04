/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.teacherController;
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
import model.teacherModel;

/**
 *
 * @author sachee
 */
public class viewTeacher extends javax.swing.JFrame {

    boolean dgrb = false;
    boolean sclb = false;
    JPopupMenu jPopupMenu1 = new JPopupMenu();

    /**
     * Creates new form Teacher
     */
    public viewTeacher() {

        initComponents();
        scoolcdb();
        initialize();

    }

    public void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/teacherico.png")));
        dgrf.setEnabled(false);
        schoolc.setEnabled(false);
        setTitle("View teacher form");
        setLocationRelativeTo(null);
    }

    private void scoolcdb() {
        try {

            comboModel[] sclM = teacherController.addItemcb("school");
            for (comboModel sclMod : sclM) {
                schoolc.addItem(sclMod.getName());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewTeacher.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewTeacher.this, ex.getMessage());
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
        schoolc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telmf = new javax.swing.JTextField();
        addgrbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        gradesf = new javax.swing.JTextField();
        subsf = new javax.swing.JTextField();
        dgrf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dgrcb = new javax.swing.JCheckBox();
        schcb1 = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        adsubbtn = new javax.swing.JButton();
        adgrdbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 23, -1, -1));

        schoolc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                schoolcKeyReleased(evt);
            }
        });
        jPanel1.add(schoolc, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 200, -1));

        jLabel7.setText("School");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 83, 40, -1));

        jLabel8.setText("Tel");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 83, 50, -1));

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
        jPanel1.add(telmf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 150, -1));

        addgrbtn.setText("+");
        addgrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgrbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addgrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 78, 40, 22));

        jTable1.setModel(mod=new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Degrees","Address", "Grades", "Subjects", "School", "Mobile", "Home"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1140, 340));

        gradesf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradesfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gradesfMouseExited(evt);
            }
        });
        gradesf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gradesfKeyReleased(evt);
            }
        });
        jPanel1.add(gradesf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 310, -1));

        subsf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subsfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subsfMouseExited(evt);
            }
        });
        subsf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subsfKeyReleased(evt);
            }
        });
        jPanel1.add(subsf, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 310, -1));

        dgrf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dgrfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dgrfMouseExited(evt);
            }
        });
        dgrf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dgrfKeyReleased(evt);
            }
        });
        jPanel1.add(dgrf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 220, -1));

        jLabel11.setText("Grades");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 53, 50, -1));

        jLabel12.setText("Subjects");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 53, 50, -1));

        dgrcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgrcbActionPerformed(evt);
            }
        });
        jPanel1.add(dgrcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 80, 20, -1));

        schcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schcb1ActionPerformed(evt);
            }
        });
        jPanel1.add(schcb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 80, -1, -1));

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
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 110, -1, -1));

        adsubbtn.setText("+");
        adsubbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adsubbtnActionPerformed(evt);
            }
        });
        adsubbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adsubbtnKeyReleased(evt);
            }
        });
        jPanel1.add(adsubbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 48, 40, 22));

        adgrdbtn.setText("+");
        adgrdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adgrdbtnActionPerformed(evt);
            }
        });
        adgrdbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adgrdbtnKeyReleased(evt);
            }
        });
        jPanel1.add(adgrdbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 48, 40, 21));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teacherico2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 80, 110));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_229e(0)_32.png"))); // NOI18N
        jButton10.setText("Add");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 50, 105, 23));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_d83d(0)_32.png"))); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 80, 105, 23));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Degree");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 83, 40, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("abbreviations");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 95, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void searchm() {
        mod.setRowCount(0);
        boolean tp = false;
        teacherModel tchrMod = new teacherModel();
        tchrMod.setTeacherID(numberf.getText());
        tchrMod.setName(namef.getText());
        tchrMod.setGrades(gradesf.getText());
        tchrMod.setDegrees(dgrf.getText());
        tchrMod.setSubjects(subsf.getText());
        tchrMod.setSchool(schoolc.getItemAt(schoolc.getSelectedIndex()));
        tchrMod.setTelM(telmf.getText());

        if (telmf.getText().length() >= 2 && telmf.getText().substring(0, 2).equals("07")) {
            tp = true;
        }
        try {
            teacherModel[] tchrM = controller.teacherController.viewTeacher(tp, sclb, dgrb, tchrMod);

            for (int i = 0; i < tchrM.length; i++) {
                String rowmod[] = {tchrM[i].getTeacherID(), tchrM[i].getName(), tchrM[i].getDegrees(), tchrM[i].getAddress(),
                    tchrM[i].getGrades(), tchrM[i].getSubjects(), tchrM[i].getSchool(),
                    tchrM[i].getTelM(), tchrM[i].getTelH()};
                mod.addRow(rowmod);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewTeacher.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(viewTeacher.this, ex.getMessage());
        }
    }
    private void numberfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberfKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }

    }//GEN-LAST:event_numberfKeyReleased

    private void namefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefKeyReleased

        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }


    }//GEN-LAST:event_namefKeyReleased

    private void schoolcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schoolcKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telmf.requestFocus();
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        }
    }//GEN-LAST:event_schoolcKeyReleased

    private void telmfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telmfKeyReleased

        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }

    }//GEN-LAST:event_telmfKeyReleased

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

    private void gradesfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesfMouseEntered
        gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_gradesfMouseEntered

    private void gradesfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesfMouseExited
        gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_gradesfMouseExited

    private void gradesfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradesfKeyReleased

        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }
        /////////////////////////////////////////////

    }//GEN-LAST:event_gradesfKeyReleased

    private void subsfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subsfMouseEntered
        subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));        // TODO add your handling code here:
    }//GEN-LAST:event_subsfMouseEntered

    private void subsfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subsfMouseExited
        subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_subsfMouseExited

    private void subsfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subsfKeyReleased

        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }


    }//GEN-LAST:event_subsfKeyReleased

    private void dgrfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgrfMouseEntered
        dgrf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));        // TODO add your handling code here:
    }//GEN-LAST:event_dgrfMouseEntered

    private void dgrfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgrfMouseExited
        dgrf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_dgrfMouseExited

    private void dgrfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dgrfKeyReleased

        if (evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_RIGHT
                && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_UP) {
            searchm();
        }
    }//GEN-LAST:event_dgrfKeyReleased

    private void dgrcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgrcbActionPerformed
        if (dgrcb.isSelected()) {
            dgrf.setEnabled(true);
            addgrbtn.setEnabled(true);
            dgrb = true;
        } else {
            dgrf.setEnabled(false);
            addgrbtn.setEnabled(false);
            dgrb = false;
        }
    }//GEN-LAST:event_dgrcbActionPerformed

    private void schcb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schcb1ActionPerformed
        if (schcb1.isSelected()) {
            schoolc.setEnabled(true);

            sclb = true;
        } else {
            schoolc.setEnabled(false);

            sclb = false;
        }
    }//GEN-LAST:event_schcb1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        searchm();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton11KeyReleased

    }//GEN-LAST:event_jButton11KeyReleased

    private void adsubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adsubbtnActionPerformed
        addSubjects n = new addSubjects(subsf);
        n.setVisible(true);
    }//GEN-LAST:event_adsubbtnActionPerformed

    private void adsubbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adsubbtnKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            namef.requestFocus();
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            adgrdbtn.requestFocus();
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            telmf.requestFocus();
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            subsf.requestFocus();
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
    }//GEN-LAST:event_adsubbtnKeyReleased

    private void adgrdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adgrdbtnActionPerformed
        addGrades n = new addGrades(gradesf);
        n.setVisible(true);
    }//GEN-LAST:event_adgrdbtnActionPerformed

    private void adgrdbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adgrdbtnKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            numberf.requestFocus();
            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            telmf.requestFocus();
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            gradesf.requestFocus();
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            adsubbtn.requestFocus();
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_adgrdbtnKeyReleased

    private void addgrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgrbtnActionPerformed
        addDegrees n = new addDegrees(dgrf);
        n.setVisible(true);
    }//GEN-LAST:event_addgrbtnActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        addTeacher upStu = new addTeacher();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        updateTeacher upStu = new updateTeacher();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
                        updateTeacher n = new updateTeacher(conumber);
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
            java.util.logging.Logger.getLogger(viewTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewTeacher().setVisible(true);
            }
        });
    }
    javax.swing.table.DefaultTableModel mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addgrbtn;
    private javax.swing.JButton adgrdbtn;
    private javax.swing.JButton adsubbtn;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JCheckBox dgrcb;
    private javax.swing.JTextField dgrf;
    private javax.swing.JTextField gradesf;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namef;
    private javax.swing.JTextField numberf;
    private javax.swing.JCheckBox schcb1;
    private javax.swing.JComboBox<String> schoolc;
    private javax.swing.JTextField subsf;
    private javax.swing.JTextField telmf;
    // End of variables declaration//GEN-END:variables
}
