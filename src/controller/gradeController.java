/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbmysql.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.attendanceModel;
import model.studentModel;


public class gradeController {
   public static boolean changeGrade(String grade1,String grade2) throws SQLException, ClassNotFoundException {

        String sql = "UPDATE Student SET Grade='"+grade2+"' WHERE Grade like '"+grade1+"'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);;
        return res > 0;
    }
}
