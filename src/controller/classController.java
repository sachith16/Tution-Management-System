package controller;

import java.sql.SQLException;
import dbmysql.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.attendanceModel;
import model.changeClassModel;
import model.comboModel;
import model.classModel;
import model.extraClassModel;

public class classController {

    public static boolean addClass(classModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Class Values(?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getClassID());
        stm.setObject(2, Mod.getSubject());
        stm.setObject(3, Mod.getGrade());
        stm.setObject(4, Mod.getDate());
        stm.setObject(5, Mod.getTeacher());
        stm.setObject(6, Mod.getTimeStart());
        stm.setObject(7, Mod.getTimeEnd());
        stm.setObject(8, Mod.getFee());
        stm.setObject(9, Mod.getHallNo());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean updateClass(classModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE class SET ClassID=?,Subject=?,Grade=?,Date=?,Teacher=?,TimeStart=?,TimeEnd=?,Fee=?,HallNo=? WHERE ClassID='" + Mod.getClassID() + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getClassID());
        stm.setObject(2, Mod.getSubject());
        stm.setObject(3, Mod.getGrade());
        stm.setObject(4, Mod.getDate());
        stm.setObject(5, Mod.getTeacher());
        stm.setObject(6, Mod.getTimeStart());
        stm.setObject(7, Mod.getTimeEnd());
        stm.setObject(8, Mod.getFee());
        stm.setObject(9, Mod.getHallNo());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static classModel[] viewClass(classModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "Select * From Class where ClassID like '%" + Mod.getClassID() + "%' and Subject like '%" + Mod.getSubject() + "%' and Grade like '%"
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
        classModel[] cMod = new classModel[count];
        for (int i = 0; rst.next(); i++) {
            cMod[i] = new classModel(rst.getString("ClassID"), rst.getString("Subject"), rst.getString("Grade"), rst.getString("Date"),
                    rst.getString("Teacher"), rst.getString("TimeStart"),
                    rst.getString("TimeEnd"), rst.getString("Fee"), rst.getString("HallNo"));
        }
        return cMod;
    }

    public static boolean deleteClass(String id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from Class where ClassID='" + id + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static classModel searchClass(String id) throws SQLException, ClassNotFoundException {
        String sql = "Select * From class";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        classModel Mod = null;
        for (int i = 0; rst.next(); i++) {
            if (rst.getString("ClassID").equals(id)) {
                Mod = new classModel(id, rst.getString("Subject"), rst.getString("Grade"), rst.getString("Date"),
                        rst.getString("Teacher"), rst.getString("TimeStart"),
                        rst.getString("TimeEnd"), rst.getString("Fee"), rst.getString("HallNo"));
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

    public static comboModel[] addItemTchrcb(String Sub) throws SQLException, ClassNotFoundException {
        String sql = "Select name From Teacher where Subjects like '%" + Sub + "%'";
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

    public static boolean changeClass(changeClassModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "Insert into changeClass Values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getClassID());
        stm.setObject(2, Mod.getDate1());
        stm.setObject(3, Mod.getDate2());
        stm.setObject(4, Mod.getTimeStart());
        stm.setObject(5, Mod.getTimeEnd());

        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean extraClass(changeClassModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "Insert into extraClass Values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getClassID());
        stm.setObject(2, Mod.getDate1());
        stm.setObject(3, Mod.getTimeStart());
        stm.setObject(4, Mod.getTimeEnd());

        int res = stm.executeUpdate();
        return res > 0;
    }
    
    public static extraClassModel[] viewExtraClass(String ClassID) throws SQLException, ClassNotFoundException {
        String sql = "Select * From extraClass where ClassID like '" + ClassID + "'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        extraClassModel[] cMod = new extraClassModel[count];
        for (int i = 0; rst.next(); i++) {
            cMod[i] = new extraClassModel(rst.getString("ClassID"), rst.getString("Date"),rst.getString("TimeStart"),
                    rst.getString("TimeEnd"));
        }
        return cMod;
    }
    
    public static attendanceModel[] viewExtraClassAt(String ClassID,String Date) throws SQLException, ClassNotFoundException {
        String sql = "Select StID,Name From extraClassAttendance natural join Student where ClassID like '" + ClassID + "' and Date like '"+Date+"'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        attendanceModel[] cMod = new attendanceModel[count];
        for (int i = 0; rst.next(); i++) {
            cMod[i] = new attendanceModel();
            cMod[i].setStID(rst.getString("StID"));
            cMod[i].setName(rst.getString("Name"));
        }
        return cMod;
    }
    
}
