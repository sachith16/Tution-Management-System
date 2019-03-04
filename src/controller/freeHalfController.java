/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbmysql.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.comboModel;
import model.studentModel;

/**
 *
 * @author sachee
 */
public class freeHalfController {
    public static studentModel[] viewStudentFree(String ClassID) throws SQLException, ClassNotFoundException {
        String sql = "Select StID,name,address,school,TelM,TelH From freeHalf natural join Student where IsFree like 'Yes' and ClassID like '"+ClassID+"'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        studentModel[] Mod = new studentModel[count];
        for (int i = 0; rst.next(); i++) {
            Mod[i] = new studentModel();
            Mod[i].setStID(rst.getString("StID"));
            Mod[i].setName(rst.getString("Name"));
            Mod[i].setAddress(rst.getString("Address"));
            Mod[i].setSchool(rst.getString("School"));
            Mod[i].setTelM(rst.getString("TelM"));
            Mod[i].setTelH(rst.getString("TelH"));
        }
        return Mod;
    }
    
    public static studentModel[] viewStudentHalf(String ClassID) throws SQLException, ClassNotFoundException {
        String sql = "Select StID,name,address,school,TelM,TelH From freeHalf natural join Student where IsHalf like 'Yes' and ClassID like '"+ClassID+"'";

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        studentModel[] Mod = new studentModel[count];
        for (int i = 0; rst.next(); i++) {
            Mod[i] = new studentModel();
            Mod[i].setStID(rst.getString("StID"));
            Mod[i].setName(rst.getString("Name"));
            Mod[i].setAddress(rst.getString("Address"));
            Mod[i].setSchool(rst.getString("School"));
            Mod[i].setTelM(rst.getString("TelM"));
            Mod[i].setTelH(rst.getString("TelH"));
        }
        return Mod;
    }
    
    public static boolean addNameFree(String ClassID, String StID) throws SQLException, ClassNotFoundException {
        String sql = "Insert into freehalf Values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, ClassID);
        stm.setObject(2, StID);
        stm.setObject(3, "Yes");
        stm.setObject(4, "");

        int res = stm.executeUpdate();
        return res > 0;
    }
    
    public static boolean addNameHalf(String ClassID, String StID) throws SQLException, ClassNotFoundException {
        String sql = "Insert into freehalf Values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, ClassID);
        stm.setObject(2, StID);
        stm.setObject(3, "");
        stm.setObject(4, "Yes");

        int res = stm.executeUpdate();
        return res > 0;
    }
    
    public static boolean deleteName(String ClassID, String StID) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from freeHalf where ClassID='" + ClassID + "' and StID='"+StID+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }
    
}
