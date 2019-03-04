package controller;

import java.sql.SQLException;
import dbmysql.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.comboModel;
import model.classModel;
import model.examAtModel;
import model.examModel;

public class examController {

    public static boolean addExam(examModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Exam Values(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getExamID());
        stm.setObject(2, Mod.getSubject());
        stm.setObject(3, Mod.getGrade());
        stm.setObject(4, Mod.getDate());
        stm.setObject(5, Mod.getTeacher());
        stm.setObject(6, Mod.getTimeStart());
        stm.setObject(7, Mod.getTimeEnd());
        stm.setObject(8, Mod.getHallNo());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean updateExam(examModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE exam SET ExamID=?,Subject=?,Grade=?,Date=?,Teacher=?,TimeStart=?,TimeEnd=?,HallNo=? WHERE ExamID='" + Mod.getExamID() + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getExamID());
        stm.setObject(2, Mod.getSubject());
        stm.setObject(3, Mod.getGrade());
        stm.setObject(4, Mod.getDate());
        stm.setObject(5, Mod.getTeacher());
        stm.setObject(6, Mod.getTimeStart());
        stm.setObject(7, Mod.getTimeEnd());
        stm.setObject(8, Mod.getHallNo());
        int res = stm.executeUpdate();
        return res > 0;
    }
    
    public static boolean updateExamAt(examAtModel Mod,String id) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE Examattendance SET Marks=? where ExamID like '"+id+"' and StID like '"+Mod.getStID()+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getMarks());
        
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static examModel[] viewExam(examModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "Select * From Exam where ExamID like '%" + Mod.getExamID() + "%' and Subject like '%" + Mod.getSubject() + "%' and Grade like '%"
                + Mod.getGrade() + "%' and Date like '%" + Mod.getDate() + "%' and Teacher like '%" + Mod.getTeacher() + "%' and TimeStart like '%" + Mod.getTimeStart()
                + "%' and TimeEnd like '%" + Mod.getTimeEnd() + "%' and HallNo like '%" + Mod.getHallNo() + "%'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        examModel[] cMod = new examModel[count];
        for (int i = 0; rst.next(); i++) {
            cMod[i] = new examModel(rst.getString("ExamID"), rst.getString("Subject"), rst.getString("Grade"), rst.getString("Date"),
                    rst.getString("Teacher"), rst.getString("TimeStart"),
                    rst.getString("TimeEnd"),  rst.getString("HallNo"));
        }
        return cMod;
    }
    
    public static examAtModel[] viewExamAt(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select StID,Name,Marks From Examattendance natural join student where ExamID like '" + id + "'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        examAtModel[] cMod = new examAtModel[count];
        for (int i = 0; rst.next(); i++) {
            cMod[i] = new examAtModel(rst.getString("StID"), rst.getString("Name"),rst.getString("Marks"));
        }
        return cMod;
    }
    
    public static examAtModel[] viewExamAtName(String id,String name) throws SQLException, ClassNotFoundException {
        String sql = "Select StID,Name,Marks From Examattendance natural join student where ExamID like '" + id + "' and name like '%"+name+"%'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        examAtModel[] cMod = new examAtModel[count];
        for (int i = 0; rst.next(); i++) {
            cMod[i] = new examAtModel(rst.getString("StID"), rst.getString("Name"),rst.getString("Marks"));
        }
        return cMod;
    }

    public static boolean deleteExam(String id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from Exam where ExamID='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static examModel searchExam(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select * From exam";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        examModel Mod = null;
        for (int i = 0; rst.next(); i++) {
            if (rst.getString("ExamID").equals(id)) {
                Mod = new examModel(id, rst.getString("Subject"), rst.getString("Grade"), rst.getString("Date"),
                        rst.getString("Teacher"), rst.getString("TimeStart"),
                        rst.getString("TimeEnd"), rst.getString("HallNo"));
            }
        }
        return Mod;
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
        String sql = "Select ClassID From class";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        boolean b1 = true;
        for (int i = 0; rst.next(); i++) {
            if (rst.getString("ClassID").equals(id)) {
                JOptionPane.showMessageDialog(null, "Duplicate entry for number", "ERROR", JOptionPane.ERROR_MESSAGE);
                b1 = false;
            }
        }
        return b1;
    }

    public static boolean searchSuit(String teacher, String subject) throws SQLException, ClassNotFoundException {
        String sql = "Select Name From teacher where Subjects like '%" + subject + "%'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        boolean b1 = false;
        for (int i = 0; rst.next(); i++) {
            if (rst.getString("Name").equals(teacher)) {
                b1 = true;
            }
        }
        return b1;
    }

}
