package controller;

import java.sql.SQLException;
import dbmysql.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.comboModel;
import model.studentModel;

public class studentController {

    public static boolean addStudent(studentModel stMod) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Student Values(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, stMod.getStID());
        stm.setObject(2, stMod.getName());
        stm.setObject(3, stMod.getAddress());
        stm.setObject(4, stMod.getGrade());
        stm.setObject(5, stMod.getBday());
        stm.setObject(6, stMod.getSchool());
        stm.setObject(7, stMod.getTelM());
        stm.setObject(8, stMod.getTelH());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean updateStudent(studentModel stMod) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE student SET StID=?,Name=?,Address=?,Grade=?,Birthday=?,School=?,TelM=?,TelH=? WHERE StID='" + stMod.getStID() + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, stMod.getStID());
        stm.setObject(2, stMod.getName());
        stm.setObject(3, stMod.getAddress());
        stm.setObject(4, stMod.getGrade());
        stm.setObject(5, stMod.getBday());
        stm.setObject(6, stMod.getSchool());
        stm.setObject(7, stMod.getTelM());
        stm.setObject(8, stMod.getTelH());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static void updateStudentinAtt(String id) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE attendance SET isTemp='' where StID like '" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();

        stm.executeUpdate(sql);
    }

    public static studentModel[] viewStudent(boolean tp, boolean schoolb, boolean gradeb, studentModel stMod) throws SQLException, ClassNotFoundException {
        String sql1 = "Select * From student where StID like '%" + stMod.getStID() + "%' and Name like '%" + stMod.getName() + "%' and Grade like '"
                + stMod.getGrade() + "' and School like '" + stMod.getSchool() + "' and TelM like '%" + stMod.getTelM() + "%'";
        String sql2 = "Select * From student where StID like '%" + stMod.getStID() + "%' and Name like '%" + stMod.getName() + "%' and School like '"
                + stMod.getSchool() + "' and TelM like '%" + stMod.getTelM() + "%'";
        String sql3 = "Select * From student where StID like '%" + stMod.getStID() + "%' and Name like '%" + stMod.getName() + "%' and Grade like '"
                + stMod.getGrade() + "' and TelM like '%" + stMod.getTelM() + "%'";
        String sql4 = "Select * From student where StID like '%" + stMod.getStID() + "%' and Name like '%" + stMod.getName()
                + "%' and TelM like '%" + stMod.getTelM() + "%'";
//////////////////////
        String sql6 = "Select * From student where StID like '%" + stMod.getStID() + "%' and Name like '%" + stMod.getName() + "%' and Grade like '"
                + stMod.getGrade() + "' and School like '" + stMod.getSchool() + "' and TelH like '%" + stMod.getTelM() + "%'";
        String sql7 = "Select * From student where StID like '%" + stMod.getStID() + "%' and Name like '%" + stMod.getName() + "%' and School like '"
                + stMod.getSchool() + "' and TelH like '%" + stMod.getTelM() + "%'";
        String sql8 = "Select * From student where StID like '%" + stMod.getStID() + "%' and Name like '%" + stMod.getName() + "%' and Grade like '"
                + stMod.getGrade() + "' and TelH like '%" + stMod.getTelM() + "%'";
        String sql9 = "Select * From student where StID like '%" + stMod.getStID() + "%' and Name like '%" + stMod.getName()
                + "%' and TelH like '%" + stMod.getTelM() + "%'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql4);
        int count = 0;

        if (tp == true) {
            if (schoolb == true && gradeb == true) {
                rst = stm.executeQuery(sql1);
            }
            if (schoolb == true && gradeb == false) {
                rst = stm.executeQuery(sql2);
            }
            if (schoolb == false && gradeb == true) {
                rst = stm.executeQuery(sql3);
            }
            if (schoolb == false && gradeb == false) {
                rst = stm.executeQuery(sql4);
            }
        } else {
            if (schoolb == true && gradeb == true) {
                rst = stm.executeQuery(sql6);
            }
            if (schoolb == true && gradeb == false) {
                rst = stm.executeQuery(sql7);
            }
            if (schoolb == false && gradeb == true) {
                rst = stm.executeQuery(sql8);
            }
            if (schoolb == false && gradeb == false) {
                rst = stm.executeQuery(sql9);
            }
        }

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        studentModel[] stM = new studentModel[count];
        for (int i = 0; rst.next(); i++) {
            stM[i] = new studentModel(rst.getString("StID"), rst.getString("Name"), rst.getString("Address"), rst.getString("Grade"),
                    rst.getString("Birthday"), rst.getString("School"), rst.getString("TelM"), rst.getString("TelH"));
        }
        return stM;
    }

    public static boolean deleteStudent(String id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from Student where StID='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static studentModel searchStudent(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select * from Student where StID like '" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        studentModel stMod = null;
        
            if (rst.next()) {
                stMod = new studentModel(id, rst.getString("Name"), rst.getString("Address"), rst.getString("Grade"),
                        rst.getString("Birthday"), rst.getString("School"), rst.getString("TelM"), rst.getString("TelH"));
            }
        
        return stMod;
    }

//    public static gradeModel[] gradecb() throws SQLException, ClassNotFoundException {
//        String sql = "Select name From grade";
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        java.sql.Statement stm = conn.createStatement();
//        ResultSet rst = stm.executeQuery(sql);
//        int count = 0;
//
//        for (int i = 0; rst.next(); i++) {
//            count++;
//        }
//        rst.beforeFirst();
//        gradeModel[] grdM = new gradeModel[count];
//        for (int i = 0; rst.next(); i++) {
//            grdM[i] = new gradeModel(rst.getString("name"));
//        }
//        return grdM;
//    }
//
//    public static schoolModel[] schoolcb() throws SQLException, ClassNotFoundException {
//        String sql = "Select * From school";
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        java.sql.Statement stm = conn.createStatement();
//        ResultSet rst = stm.executeQuery(sql);
//        int count = 0;
//
//        for (int i = 0; rst.next(); i++) {
//            count++;
//        }
//        rst.beforeFirst();
//        schoolModel[] sclM = new schoolModel[count];
//        for (int i = 0; rst.next(); i++) {
//            sclM[i] = new schoolModel(rst.getString("name"));
//        }
//        return sclM;
//    }
    public static comboModel[] addItemcb(String type) throws SQLException, ClassNotFoundException {
        String sql = "Select name From " + type;
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        comboModel[] cbM = new comboModel[count];
        for (int i = 0; rst.next(); i++) {
            cbM[i] = new comboModel(rst.getString("name"));
        }
        return cbM;
    }

    public static boolean searchID(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select StID From student";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        boolean b1 = true;
        for (int i = 0; rst.next(); i++) {
            if (rst.getString("StID").equals(id)) {
                JOptionPane.showMessageDialog(null, "Duplicate entry for number", "ERROR", JOptionPane.ERROR_MESSAGE);
                b1 = false;
            }
        }
        return b1;
    }
}
