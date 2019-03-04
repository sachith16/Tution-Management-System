/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbmysql.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.attendanceModel;

/**
 *
 * @author sachee
 */
public class attendanceController {

    public static attendanceModel[] viewAttendance(String ClassID, String monthcode) throws SQLException, ClassNotFoundException {
        String sql = "Select StID,name,Date1,Date2,Date3,Date4,Date5,PayedDate From Attendance natural join Student where ClassID like '"
                + ClassID + "' and MonthCode like '" + monthcode + "'";
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
            Mod[i].setName(rst.getString("name"));
            Mod[i].setDate1(rst.getString("Date1"));
            Mod[i].setDate2(rst.getString("Date2"));
            Mod[i].setDate3(rst.getString("Date3"));
            Mod[i].setDate4(rst.getString("Date4"));
            Mod[i].setDate5(rst.getString("Date5"));
            Mod[i].setPayedDate(rst.getString("PayedDate"));
        }
        return Mod;
    }

    public static attendanceModel[] viewTemp() throws SQLException, ClassNotFoundException {
        String sql = "Select StID,ClassID,Subject,Grade,Teacher,Date From Attendance natural join class where isTemp like 'Yes'";
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
            Mod[i].setClassID(rst.getString("ClassID"));
            Mod[i].setSubject(rst.getString("Subject"));
            Mod[i].setGrade(rst.getString("Grade"));
            Mod[i].setTeacher(rst.getString("Teacher"));
            Mod[i].setDate(rst.getString("Date"));
        }
        return Mod;
    }
}
