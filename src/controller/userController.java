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
import model.teacherModel;
import model.userModel;

/**
 *
 * @author sachee
 */
public class userController {

    public static boolean addUser(userModel Mod) throws SQLException, ClassNotFoundException {
        String sql = "Insert into users Values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Mod.getUsername());
        stm.setObject(2, Mod.getPassword());
        stm.setObject(3, Mod.getIsadmin());

        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean searchUser(String username, String password, String usertype) throws SQLException, ClassNotFoundException {
        String sql = "Select * From users where Username like '" + username + "' and Password like '" + password
                + "' and IsAdmin like '" + usertype + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        boolean b = false;
        if (rst.next()) {
            b = true;
        }
        return b;
    }
    
    public static boolean deleteUser(String username, String password, String usertype) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from Users where Username like '" + username + "' and Password like '" + password
                + "' and IsAdmin like '" + usertype + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        java.sql.Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }
    
    public static boolean updateUser(userModel first,userModel second) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE users SET Username=?,Password=?,IsAdmin=? where Username like '" + first.getUsername() + "' and Password like '" + first.getPassword()
                + "' and IsAdmin like '" + first.getIsadmin() + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, second.getUsername());
        stm.setObject(2, second.getPassword());
        stm.setObject(3, second.getIsadmin());
        
        int res = stm.executeUpdate();
        return res > 0;
    }
}
