package controller;

import java.sql.SQLException;
import dbmysql.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.attendanceModel;
import model.changeClassModel;
import model.classModel;
import model.examModel;

public class payController {

    public static classModel[] viewClass() throws SQLException, ClassNotFoundException {
        String sql = "Select * From Class";

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
    
    public static examModel[] viewExam() throws SQLException, ClassNotFoundException {
        String sql = "Select * From Exam";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        examModel[] Mod = new examModel[count];
        for (int i = 0; rst.next(); i++) {
            Mod[i] = new examModel(rst.getString("ExamID"), rst.getString("Subject"), rst.getString("Grade"), 
                    rst.getString("Date"),
                    rst.getString("Teacher"), rst.getString("TimeStart"),
                    rst.getString("TimeEnd"),  rst.getString("HallNo"));
        }
        return Mod;
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

    public static boolean stusearchMain(String monthcode, String ClassID, String SID) throws SQLException, ClassNotFoundException {
        boolean b = true;
        String sql = "Select StID From Attendance where IsPayed like 'Yes' and MonthCode like '"
                + monthcode + "' and ClassID like '" + ClassID + "'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        for (int i = 0; rst.next(); i++) {
            if (rst.getString(1).equals(SID)) {
                b = false;
            }
        }
        return b;
    }

    public static boolean stusearchID(String SID) throws SQLException, ClassNotFoundException {
        boolean b = false;
        String sql = "Select StID From Student";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        for (int i = 0; rst.next(); i++) {
            if (rst.getString(1).equals(SID)) {
                b = true;
            }
        }
        return b;
    }

    public static boolean stusearchSec(String monthcode, String ClassID, String SID) throws SQLException, ClassNotFoundException {
        boolean b = true;
        String sql = "Select StID From Attendance where MonthCode like '"
                + monthcode + "' and ClassID like '" + ClassID + "'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        for (int i = 0; rst.next(); i++) {
            if (rst.getString(1).equals(SID)) {
                b = false;
            }
        }
        return b;
    }

    public static boolean stusearchRemove(String monthcode, String ClassID, String SID) throws SQLException, ClassNotFoundException {
        boolean b = true;
        String sql = "Select StID From Attendance where IsPayed like 'Yes' and MonthCode like '"
                + monthcode + "' and ClassID like '" + ClassID
                + "' and Date1 like '' and Date2 like '' and Date3 like '' and Date4 like '' and Date5 like ''";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        for (int i = 0; rst.next(); i++) {
            if (rst.getString(1).equals(SID)) {
                b = false;
            }
        }
        return b;
    }

    public static boolean addStudent(attendanceModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "Insert into Attendance Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getStID());
        stm.setObject(2, Mod.getClassID());
        stm.setObject(3, Mod.getMonthCode());
        stm.setObject(4, Mod.getIsPayed());
        stm.setObject(5, Mod.getPayedAmount());
        stm.setObject(6, Mod.getBalance());
        stm.setObject(7, Mod.getPayedDate());
        stm.setObject(8, Mod.getIsTemp());
        stm.setObject(9, Mod.getIsBalanced());
        stm.setObject(10, Mod.getDate1());
        stm.setObject(11, Mod.getDate2());
        stm.setObject(12, Mod.getDate3());
        stm.setObject(13, Mod.getDate4());
        stm.setObject(14, Mod.getDate5());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean upStudent(attendanceModel Mod) throws SQLException, ClassNotFoundException {

        String sql = "UPDATE Attendance SET PayedDate='" + Mod.getPayedDate()
                + "',IsPayed='Yes',IsBalanced='" + Mod.getIsBalanced() + "',payedAmount='" + Mod.getPayedAmount()
                + "',Balance='" + Mod.getBalance() + "'  WHERE StID='" + Mod.getStID() + "' and IsPayed='No' and MonthCode like '"
                + Mod.getMonthCode() + "' and ClassID like '" + Mod.getClassID() + "'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);;
        return res > 0;
    }
    
    public static void setCheck(String sqlCode) throws SQLException, ClassNotFoundException {

        String sql = sqlCode;

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);;
        
    }

    public static attendanceModel[] viewAttendance1(String monthcode, String ClassID) throws SQLException, ClassNotFoundException {
        String sql = "Select * From Attendance where IsBalanced like 'Yes' and MonthCode like '" + monthcode + "' and ClassID like '" + ClassID + "'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        attendanceModel[] Mod = new attendanceModel[count];
        for (int i = 0; rst.next(); i++) {
            Mod[i] = new attendanceModel();
            Mod[i].setStID(rst.getString("StID"));
            Mod[i].setPayedAmount(rst.getString("payedAmount"));
            Mod[i].setBalance(rst.getString("Balance"));
            Mod[i].setIsTemp(rst.getString("IsTemp"));
        }
        return Mod;
    }

    public static attendanceModel[] viewAttendance2(String monthcode, String ClassID) throws SQLException, ClassNotFoundException {
        String sql = "Select * From Attendance where IsBalanced like 'No' and MonthCode like '" + monthcode + "' and ClassID like '" + ClassID + "'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        attendanceModel[] Mod = new attendanceModel[count];
        for (int i = 0; rst.next(); i++) {
            Mod[i] = new attendanceModel();
            Mod[i].setStID(rst.getString("StID"));
            Mod[i].setPayedAmount(rst.getString("payedAmount"));
            Mod[i].setBalance(rst.getString("Balance"));
            Mod[i].setIsTemp(rst.getString("IsTemp"));
        }
        return Mod;
    }
    
    public static boolean upIsBalance(attendanceModel Mod) throws SQLException, ClassNotFoundException {

        String sql = "UPDATE Attendance SET IsBalanced='Yes' WHERE StID='" 
                + Mod.getStID() + "' and IsBalanced like 'No' and MonthCode like '" 
                + Mod.getMonthCode() + "' and ClassID like '" + Mod.getClassID() + "'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);;
        return res > 0;
    }
    
    public static boolean deleteStudent(String StID,String monthcode,String ClassID) throws SQLException, ClassNotFoundException {

        String sql = "DELETE from Attendance WHERE StID='" + StID + 
                "' and MonthCode like '"+ monthcode + 
                "' and ClassID like '" + ClassID + "' and IsPayed like 'Yes'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);;
        return res > 0;
    }
    
    public static changeClassModel[] viewChangeClass() throws SQLException, ClassNotFoundException {
        String sql = "Select * From changeClass";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        changeClassModel[] cMod = new changeClassModel[count];
        for (int i = 0; rst.next(); i++) {
            cMod[i] = new changeClassModel(rst.getString("ClassID"), rst.getString("Date1"), rst.getString("Date2"), rst.getString("TimeStart"),
                    rst.getString("TimeEnd"));
        }
        return cMod;
    }
    
    public static changeClassModel searchChangeClass(String ClassID,String Date1) throws SQLException, ClassNotFoundException {
        String sql = "Select * From changeClass where ClassID like '"+ClassID+"' and Date1 like '"+Date1+"'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        changeClassModel cMod=null;
        if(rst.next()){
        cMod = new changeClassModel(rst.getString("ClassID"), rst.getString("Date1"), rst.getString("Date2"), rst.getString("TimeStart"),
                    rst.getString("TimeEnd"));
        }
        return cMod;
    }
}
