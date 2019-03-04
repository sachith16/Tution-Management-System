/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.teacherController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.comboModel;
import model.teacherModel;

/**
 *
 * @author sachee
 */
public class updateTeacher extends javax.swing.JFrame {

    boolean dgrb = false;
    boolean sclb = false;

    /**
     * Creates new form Teacher
     */
    public updateTeacher() {

        initComponents();
        scoolcdb();
        initialize();

    }

    public updateTeacher(String TID) {

        initComponents();
        scoolcdb();
        initialize();
        numberf.setText(TID);
    }

    public void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/teacherico.png")));
        dgrf.setEnabled(false);
        addgrbtn.setEnabled(false);
        schoolc.setEnabled(false);
        jButton1.setEnabled(false);
        setTitle("Update teacher form");
        jButton6.setEnabled(false);
        setLocationRelativeTo(null);
    }

    private void scoolcdb() {
        try {

            comboModel[] sclM = teacherController.addItemcb("school");
            for (comboModel sclMod : sclM) {
                schoolc.addItem(sclMod.getName());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateTeacher.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateTeacher.this, ex.getMessage());
        }

    }

    public void updateBtn() {

        int j = -1;
        try {
            if (controller.teacherController.searchTeacher(numberf.getText()) != null) {
                teacherModel tchrMod = controller.teacherController.searchTeacher(numberf.getText());

                namef.setText(tchrMod.getName());
                numberf.setEditable(false);

                if (!(tchrMod.getSchool()).isEmpty()) {
                    schoolc.setEnabled(true);
                    jButton1.setEnabled(true);
                    schcb1.setSelected(true);
                    sclb = true;
                    do {

                        j = j + 1;
                        schoolc.setSelectedIndex(j);
                    } while (!schoolc.getItemAt(j).equals(tchrMod.getSchool()));
                } else {
                    schoolc.setEnabled(false);
                    jButton1.setEnabled(false);
                    schcb1.setSelected(false);
                    schoolc.setSelectedIndex(0);
                }

                if (!(tchrMod.getDegrees()).isEmpty()) {
                    dgrf.setEnabled(true);
                    addgrbtn.setEnabled(true);
                    dgrcb.setSelected(true);
                    dgrf.setText(tchrMod.getDegrees());
                    dgrb = true;
                } else {
                    dgrf.setEnabled(false);
                    addgrbtn.setEnabled(false);
                    dgrcb.setSelected(false);
                    dgrf.setText(tchrMod.getDegrees());
                }

                ad1f.setText(tchrMod.getAddress());
                gradesf.setText(tchrMod.getGrades());
                subsf.setText(tchrMod.getSubjects());

                telmf.setText(tchrMod.getTelM());
                telhf.setText(tchrMod.getTelH());

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
        namef = new javax.swing.JTextField();
        ad1f = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        schoolc = new javax.swing.JComboBox<>();
        telhf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        gradesf = new javax.swing.JTextField();
        adgrdbtn = new javax.swing.JButton();
        subsf = new javax.swing.JTextField();
        adsubbtn = new javax.swing.JButton();
        dgrf = new javax.swing.JTextField();
        addgrbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dgrcb = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        schcb1 = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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
        jPanel1.add(namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 740, -1));

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
        jPanel1.add(ad1f, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 740, -1));

        jLabel2.setText("Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, 50, -1));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 53, -1, -1));

        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, 50, -1));

        jLabel6.setText("(H)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 173, -1, -1));

        schoolc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                schoolcKeyReleased(evt);
            }
        });
        jPanel1.add(schoolc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 200, -1));

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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 143, 40, -1));

        jLabel8.setText("Tel(M)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 173, 50, -1));

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

        jButton3.setText("Delete");
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
        jScrollPane1.setViewportView(jTable1);

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teacherlog.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entypo_229e(0)_32.png"))); // NOI18N
        jButton8.setText("Add");
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
        jPanel1.add(gradesf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 694, -1));

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
        jPanel1.add(adgrdbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 109, 40, 21));

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
        jPanel1.add(subsf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 280, -1));

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
        jPanel1.add(adsubbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 139, 40, 22));

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
        jPanel1.add(dgrf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 260, -1));

        addgrbtn.setText("+");
        addgrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgrbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addgrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 169, 40, 22));

        jLabel11.setText("Grades");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 113, 50, -1));

        jLabel12.setText("Subjects");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 143, 50, -1));

        dgrcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgrcbActionPerformed(evt);
            }
        });
        jPanel1.add(dgrcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 170, 20, -1));

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
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 18, -1, -1));

        schcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schcb1ActionPerformed(evt);
            }
        });
        jPanel1.add(schcb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 140, -1, -1));

        jButton10.setLabel("Clear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 73, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Degree");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 173, 40, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("abbreviations");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addSchool m = new addSchool(schoolc);
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
            namef.requestFocus();
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
            adgrdbtn.requestFocus();
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            adgrdbtn.requestFocus();
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_ad1fKeyReleased

    private void schoolcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schoolcKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jButton1.requestFocus();
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
            adsubbtn.requestFocus();
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
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

        int rowc = jTable1.getRowCount();
        int count = 0;
        boolean b = false, c = false;
        for (int row = 0; row < rowc; row++) {

            String conumber = (String) jTable1.getValueAt(row, 0);
            String coname = (String) jTable1.getValueAt(row, 1);
            String codgr = (String) jTable1.getValueAt(row, 2);
            String coad = (String) jTable1.getValueAt(row, 3);
            String cograde = (String) jTable1.getValueAt(row, 4);
            String cosub = (String) jTable1.getValueAt(row, 5);
            String cosch = (String) jTable1.getValueAt(row, 6);
            String comob = (String) jTable1.getValueAt(row, 7);
            String cohome = (String) jTable1.getValueAt(row, 8);
            teacherModel tchrMod = new teacherModel(conumber, coname, cosch, codgr, coad, cograde, cosub, comob, cohome);
            try {

                count++;
                boolean isAdded = teacherController.updateTeacher(tchrMod);
                if (isAdded) {
                    b = true;
                } else {
                    c = true;
                    JOptionPane.showMessageDialog(updateTeacher.this, count + " adding failed");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(updateTeacher.this, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(updateTeacher.this, ex.getMessage());
            }
        }
        if (b == true) {
            
            if (c == true) {
                JOptionPane.showMessageDialog(updateTeacher.this, "Other records added successfully");
            } else {
                JOptionPane.showMessageDialog(updateTeacher.this, "Added successfully");
                mod.setRowCount(0);
            }
        }
        numberf.requestFocus();
        numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        boolean b11 = true;

        int rowc = jTable1.getRowCount();
        for (int row = 0; row < rowc; row++) {
            if (jTable1.getValueAt(row, 0).equals(numberf.getText())) {
                JOptionPane.showMessageDialog(null, "Duplicate entry for number", "ERROR", JOptionPane.ERROR_MESSAGE);
                b11 = false;
            }
        }

        if (!numberf.getText().isEmpty() && !namef.getText().isEmpty()
                && !ad1f.getText().isEmpty() && !gradesf.getText().isEmpty() && !subsf.getText().isEmpty()
                && !telmf.getText().isEmpty()) {
            if (b11 == true) {
                String nums = numberf.getText();
                String names = namef.getText();
                String adds = ad1f.getText();
                String grades = gradesf.getText();
                String subs = subsf.getText();
                String schls = "";
                if (sclb == true) {
                    schls = schoolc.getItemAt(schoolc.getSelectedIndex());
                }
                String dgrs = "";
                if (dgrb == true) {
                    dgrs = dgrf.getText();
                }
                String telms = telmf.getText();
                String telhs = telhf.getText();

                String rowmod[] = {nums, names, dgrs, adds, grades, subs, schls, telms, telhs};
                mod.addRow(rowmod);
                jButton6.setEnabled(true);

                numberf.setText("");
                namef.setText("");
                ad1f.setText("");
                gradesf.setText("");
                subsf.setText("");
                dgrf.setText("");

                telmf.setText("");
                telhf.setText("");
                numberf.requestFocus();
                dgrf.setEnabled(false);
                addgrbtn.setEnabled(false);
                schoolc.setEnabled(false);
                jButton1.setEnabled(false);
                dgrcb.setSelected(false);
                schcb1.setSelected(false);
                numberf.setEditable(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usedfull details are empty", "ERROR", JOptionPane.ERROR_MESSAGE);
            numberf.setEditable(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("mysql-java Drvier not found..");
//        }
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tution", "root", "1234");
//            java.sql.Statement stm = conn.createStatement();
//
//            String sql = "DELETE from Teacher where TeacherID='" + numberf.getText() + "'";
//
//            int res = stm.executeUpdate(sql);
//
//            if (res > 0) {
//                JOptionPane.showMessageDialog(updateTeacher.this, "Record deleted successfully");
//
//            } else {
//                JOptionPane.showMessageDialog(updateTeacher.this, "Record deleting failed");
//
//            }
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            boolean isAdded = teacherController.deleteTeacher(numberf.getText());
            if (isAdded) {
                JOptionPane.showMessageDialog(updateTeacher.this, "Record deleted successfully");
            } else {
                JOptionPane.showMessageDialog(updateTeacher.this, "Record deleting failed");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(updateTeacher.this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(updateTeacher.this, ex.getMessage());
        }

        numberf.setText("");
        namef.setText("");
        ad1f.setText("");
        gradesf.setText("");
        subsf.setText("");
        dgrf.setText("");

        telmf.setText("");
        telhf.setText("");
        numberf.requestFocus();
        dgrf.setEnabled(false);
        addgrbtn.setEnabled(false);
        schoolc.setEnabled(false);
        jButton1.setEnabled(false);
        dgrcb.setSelected(false);
        schcb1.setSelected(false);
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
        viewTeacher upStu = new viewTeacher();
        upStu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        updateTeacher adT = new updateTeacher();
        adT.setVisible(true);
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

    private void ad1fMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad1fMouseEntered
        ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_ad1fMouseEntered

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

    private void telmfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telmfMouseExited
        telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_telmfMouseExited

    private void telhfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telhfMouseExited
        telhf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_telhfMouseExited

    private void gradesfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesfMouseEntered
        gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
    }//GEN-LAST:event_gradesfMouseEntered

    private void gradesfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesfMouseExited
        gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_gradesfMouseExited

    private void gradesfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradesfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            adsubbtn.requestFocus();
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            ad1f.requestFocus();
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            adgrdbtn.requestFocus();
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_gradesfKeyReleased

    private void subsfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subsfMouseEntered
        subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));        // TODO add your handling code here:
    }//GEN-LAST:event_subsfMouseEntered

    private void subsfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subsfMouseExited
        subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_subsfMouseExited

    private void subsfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subsfKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            telmf.requestFocus();
            telmf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            adgrdbtn.requestFocus();
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            adsubbtn.requestFocus();
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_subsfKeyReleased

    private void dgrfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgrfMouseEntered
        dgrf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));        // TODO add your handling code here:
    }//GEN-LAST:event_dgrfMouseEntered

    private void dgrfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgrfMouseExited
        dgrf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));        // TODO add your handling code here:
    }//GEN-LAST:event_dgrfMouseExited

    private void dgrfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dgrfKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_dgrfKeyReleased

    private void adgrdbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adgrdbtnKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            ad1f.requestFocus();
            ad1f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            adsubbtn.requestFocus();
            subsf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            gradesf.requestFocus();
            gradesf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }

    }//GEN-LAST:event_adgrdbtnKeyReleased

    private void adsubbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adsubbtnKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
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
            jButton1.setEnabled(true);
            sclb = true;
        } else {
            schoolc.setEnabled(false);
            jButton1.setEnabled(false);
            sclb = false;
        }
    }//GEN-LAST:event_schcb1ActionPerformed

    private void adgrdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adgrdbtnActionPerformed
        addGrades n = new addGrades(gradesf);
        n.setVisible(true);
    }//GEN-LAST:event_adgrdbtnActionPerformed

    private void adsubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adsubbtnActionPerformed
        addSubjects n = new addSubjects(subsf);
        n.setVisible(true);
    }//GEN-LAST:event_adsubbtnActionPerformed

    private void addgrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgrbtnActionPerformed
        addDegrees n = new addDegrees(dgrf);
        n.setVisible(true);
    }//GEN-LAST:event_addgrbtnActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        updateBtn();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton11KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            numberf.requestFocus();
            numberf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            namef.requestFocus();
            namef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        }
    }//GEN-LAST:event_jButton11KeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        numberf.setText("");
        namef.setText("");
        ad1f.setText("");
        gradesf.setText("");
        subsf.setText("");
        dgrf.setText("");

        telmf.setText("");
        telhf.setText("");
        numberf.requestFocus();
        dgrf.setEnabled(false);
        addgrbtn.setEnabled(false);
        schoolc.setEnabled(false);
        jButton1.setEnabled(false);
        dgrcb.setSelected(false);
        schcb1.setSelected(false);
        numberf.setEditable(true);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(updateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new updateTeacher().setVisible(true);
            }
        });
    }
    javax.swing.table.DefaultTableModel mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad1f;
    private javax.swing.JButton addgrbtn;
    private javax.swing.JButton adgrdbtn;
    private javax.swing.JButton adsubbtn;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JCheckBox dgrcb;
    private javax.swing.JTextField dgrf;
    private javax.swing.JTextField gradesf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namef;
    private javax.swing.JTextField numberf;
    private javax.swing.JCheckBox schcb1;
    private javax.swing.JComboBox<String> schoolc;
    private javax.swing.JTextField subsf;
    private javax.swing.JTextField telhf;
    private javax.swing.JTextField telmf;
    // End of variables declaration//GEN-END:variables
}
