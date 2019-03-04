package controller;

import java.sql.SQLException;
import dbmysql.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.comboModel;
import model.teacherModel;

public class teacherController {

    public static boolean addTeacher(teacherModel tchrMod) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Teacher Values(?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, tchrMod.getTeacherID());
        stm.setObject(2, tchrMod.getName());
        stm.setObject(3, tchrMod.getSchool());
        stm.setObject(4, tchrMod.getDegrees());
        stm.setObject(5, tchrMod.getAddress());
        stm.setObject(6, tchrMod.getGrades());
        stm.setObject(7, tchrMod.getSubjects());
        stm.setObject(8, tchrMod.getTelM());
        stm.setObject(9, tchrMod.getTelH());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean updateTeacher(teacherModel tchrMod) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE teacher SET TeacherID=?,Name=?,School=?,Degree=?,Address=?,Grades=?,Subjects=?,School=?,TelM=?,TelH=? WHERE TeacherID='" + tchrMod.getTeacherID() + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, tchrMod.getTeacherID());
        stm.setObject(2, tchrMod.getName());
        stm.setObject(3, tchrMod.getSchool());
        stm.setObject(4, tchrMod.getDegrees());
        stm.setObject(5, tchrMod.getAddress());
        stm.setObject(6, tchrMod.getGrades());
        stm.setObject(7, tchrMod.getSubjects());
        stm.setObject(8, tchrMod.getTelM());
        stm.setObject(9, tchrMod.getTelH());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static teacherModel[] viewTeacher(boolean tp, boolean sclb, boolean dgrb, teacherModel tchrMod) throws SQLException, ClassNotFoundException {
        String sql1 = "Select * From Teacher where TeacherID like '%" + tchrMod.getTeacherID() + "%' and Name like '%" + tchrMod.getName() + "%' and Degree like '%"
                + tchrMod.getDegrees() + "%' and School like '%" + tchrMod.getSchool() + "%' and Subjects like '%" + tchrMod.getSubjects() + "%' and Grades like '%" + tchrMod.getGrades()
                + "%' and TelM like '%" + tchrMod.getTelM() + "%'";
        String sql2 = "Select * From Teacher where TeacherID like '%" + tchrMod.getTeacherID() + "%' and Name like '%" + tchrMod.getName() + "%' and Subjects like '%" + tchrMod.getSubjects() + "%' and Grades like '%" + tchrMod.getGrades()
                + "%' and School like '%" + tchrMod.getSchool() + "%' and TelM like '%" + tchrMod.getTelM() + "%'";
        String sql3 = "Select * From Teacher where TeacherID like '%" + tchrMod.getTeacherID() + "%' and Name like '%" + tchrMod.getName() + "%' and Subjects like '%" + tchrMod.getSubjects() + "%' and Grades like '%" + tchrMod.getGrades()
                + "%' and Degree like '%"
                + tchrMod.getDegrees() + "%' and TelM like '%" + tchrMod.getTelM() + "%";
        String sql4 = "Select * From Teacher where TeacherID like '%" + tchrMod.getTeacherID() + "%' and Name like '%" + tchrMod.getName() + "%' and Subjects like '%" + tchrMod.getSubjects() + "%' and Grades like '%" + tchrMod.getGrades()
                + "%' and TelM like '%" + tchrMod.getTelM() + "%'";
//////////////////////
        String sql6 = "Select * From Teacher where TeacherID like '%" + tchrMod.getTeacherID() + "%' and Name like '%" + tchrMod.getName() + "%' and Degree like '%"
                + tchrMod.getDegrees() + "%' and School like '%" + tchrMod.getSchool() + "%' and Subjects like '%" + tchrMod.getSubjects() + "%' and Grades like '%" + tchrMod.getGrades()
                + "%' and TelH like '%" + tchrMod.getTelM() + "%'";
        String sql7 = "Select * From Teacher where TeacherID like '%" + tchrMod.getTeacherID() + "%' and Name like '%" + tchrMod.getName() + "%' and Subjects like '%" + tchrMod.getSubjects() + "%' and Grades like '%" + tchrMod.getGrades()
                + "%' and School like '%" + tchrMod.getSchool() + "%' and TelH like '%" + tchrMod.getTelM() + "%'";
        String sql8 = "Select * From Teacher where TeacherID like '%" + tchrMod.getTeacherID() + "%' and Name like '%" + tchrMod.getName() + "%' and Subjects like '%" + tchrMod.getSubjects() + "%' and Grades like '%" + tchrMod.getGrades()
                + "%' and Degree like '%"
                + tchrMod.getDegrees() + "%' and TelH like '%" + tchrMod.getTelM() + "%";
        String sql9 = "Select * From Teacher where TeacherID like '%" + tchrMod.getTeacherID() + "%' and Name like '%" + tchrMod.getName() + "%' and Subjects like '%" + tchrMod.getSubjects() + "%' and Grades like '%" + tchrMod.getGrades()
                + "%' and TelH like '%" + tchrMod.getTelM() + "%'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql4);
        int count = 0;

        if (tp == true) {
            if (sclb == true && dgrb == true) {
                rst = stm.executeQuery(sql1);
            }
            if (sclb == true && dgrb == false) {
                rst = stm.executeQuery(sql2);
            }
            if (sclb == false && dgrb == true) {
                rst = stm.executeQuery(sql3);
            }
            if (sclb == false && dgrb == false) {
                rst = stm.executeQuery(sql4);
            }
        } else {
            if (sclb == true && dgrb == true) {
                rst = stm.executeQuery(sql6);
            }
            if (sclb == true && dgrb == false) {
                rst = stm.executeQuery(sql7);
            }
            if (sclb == false && dgrb == true) {
                rst = stm.executeQuery(sql8);
            }
            if (sclb == false && dgrb == false) {
                rst = stm.executeQuery(sql9);
            }
        }

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        teacherModel[] tchrM = new teacherModel[count];
        for (int i = 0; rst.next(); i++) {
            tchrM[i] = new teacherModel(rst.getString("TeacherID"), rst.getString("Name"), rst.getString("School"), rst.getString("Degree"),
                    rst.getString("Address"), rst.getString("Grades"),
                    rst.getString("Subjects"), rst.getString("TelM"), rst.getString("TelH"));
        }
        return tchrM;
    }

    public static boolean deleteTeacher(String id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from Teacher where TeacherID='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static teacherModel searchTeacher(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select * From teacher";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        teacherModel tchrMod = null;
        for (int i = 0; rst.next(); i++) {
            if (rst.getString("TeacherID").equals(id)) {
                tchrMod = new teacherModel(id, rst.getString("Name"), rst.getString("School"), rst.getString("Degree"),
                        rst.getString("Address"), rst.getString("Grades"),
                        rst.getString("Subjects"), rst.getString("TelM"), rst.getString("TelH"));
            }
        }
        return tchrMod;
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
        String sql = "Select TeacherID From teacher";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        boolean b1 = true;
        for (int i = 0; rst.next(); i++) {
            if (rst.getString("TeacherID").equals(id)) {
                JOptionPane.showMessageDialog(null, "Duplicate entry for number", "ERROR", JOptionPane.ERROR_MESSAGE);
                b1 = false;
            }
        }
        return b1;
    }
}
