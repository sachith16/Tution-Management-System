/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sachee
 */
public class userModel {
    private String username;
    private String password;
    private String isadmin;

    public userModel() {
    }

    public userModel(String username, String password, String isadmin) {
        this.username = username;
        this.password = password;
        this.isadmin = isadmin;
    }

    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the isadmin
     */
    public String getIsadmin() {
        return isadmin;
    }

    /**
     * @param isadmin the isadmin to set
     */
    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }
}
