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
public class examAtModel {
    private String StID;
    private String Name;
    private String Marks;

    public examAtModel(String StID, String Name, String Marks) {
        this.StID = StID;
        this.Name = Name;
        this.Marks = Marks;
    }

    public examAtModel() {
    }

    
    
    public String getStID() {
        return StID;
    }

    /**
     * @param StID the StID to set
     */
    public void setStID(String StID) {
        this.StID = StID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Marks
     */
    public String getMarks() {
        return Marks;
    }

    /**
     * @param Marks the Marks to set
     */
    public void setMarks(String Marks) {
        this.Marks = Marks;
    }
}
