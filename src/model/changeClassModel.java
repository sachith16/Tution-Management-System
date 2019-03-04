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
public class changeClassModel {
    private String ClassID;
    private String Date1;
    private String Date2;
    private String TimeStart;
    private String TimeEnd;

    public changeClassModel(String ClassID, String Date1, String Date2, String TimeStart, String TimeEnd) {
        this.ClassID = ClassID;
        this.Date1 = Date1;
        this.Date2 = Date2;
        this.TimeStart = TimeStart;
        this.TimeEnd = TimeEnd;
    }

    public changeClassModel() {
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
     * @return the Date1
     */
    public String getDate1() {
        return Date1;
    }

    /**
     * @param Date1 the Date1 to set
     */
    public void setDate1(String Date1) {
        this.Date1 = Date1;
    }

    /**
     * @return the Date2
     */
    public String getDate2() {
        return Date2;
    }

    /**
     * @param Date2 the Date2 to set
     */
    public void setDate2(String Date2) {
        this.Date2 = Date2;
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
