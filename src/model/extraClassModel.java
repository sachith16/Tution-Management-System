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
public class extraClassModel {
    private String ClassID;
    private String Date;
    private String TimeStart;
    private String TimeEnd;

    public extraClassModel(String ClassID, String Date, String TimeStart, String TimeEnd) {
        this.ClassID = ClassID;
        this.Date = Date;
        this.TimeStart = TimeStart;
        this.TimeEnd = TimeEnd;
    }

    public extraClassModel() {
    }

    
    /**
     * @return the ClassID
     */
    public String getClassID() {
        return ClassID;
    }

    /**
     * @param ClassID the ClassID to set
     */
    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the TimeStart
     */
    public String getTimeStart() {
        return TimeStart;
    }

    /**
     * @param TimeStart the TimeStart to set
     */
    public void setTimeStart(String TimeStart) {
        this.TimeStart = TimeStart;
    }

    /**
     * @return the TimeEnd
     */
    public String getTimeEnd() {
        return TimeEnd;
    }

    /**
     * @param TimeEnd the TimeEnd to set
     */
    public void setTimeEnd(String TimeEnd) {
        this.TimeEnd = TimeEnd;
    }
}
