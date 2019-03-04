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
import model.classModel;
import model.comboModel;

/**
 *
 * @author sachee
 */
public class otherController {

    public static comboModel[] viewName(String type) throws SQLException, ClassNotFoundException {
        String sql = "Select * From " + type;

        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        int count = 0;

        for (int i = 0; rst.next(); i++) {
            count++;
        }
        rst.beforeFirst();
        comboModel[] Mod = new comboModel[count];
        for (int i = 0; rst.next(); i++) {
            Mod[i] = new comboModel(rst.getString("Name"));
        }
        return Mod;
    }

    public static boolean addName(String type, String name) throws SQLException, ClassNotFoundException {
        String sql = "Insert into " + type + " Values(?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);

        int res = stm.executeUpdate();
        return res > 0;
    }
    
    public static boolean deleteName(String type, String name) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from "+type+" where name='" + name + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }
    
}
