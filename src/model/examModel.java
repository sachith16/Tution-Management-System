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
public class examModel {

    private String ExamID;
    private String Subject;
    private String Grade;
    private String Date;
    private String Teacher;
    private String TimeStart;
    private String TimeEnd;
    private String HallNo;

    public examModel(String ExamID, String Subject, String Grade, String Date, String Teacher, String TimeStart, String TimeEnd, String HallNo) {
        this.ExamID = ExamID;
        this.Subject = Subject;
        this.Grade = Grade;
        this.Date = Date;
        this.Teacher = Teacher;
        this.TimeStart = TimeStart;
        this.TimeEnd = TimeEnd;
        this.HallNo = HallNo;
    }

    public examModel() {
    }

    
    /**
     * @return the ExamID
     */
    public String getExamID() {
        return ExamID;
    }

    /**
     * @param ExamID the ExamID to set
     */
    public void setExamID(String ExamID) {
        this.ExamID = ExamID;
    }

    /**
     * @return the Subject
     */
    public String getSubject() {
        return Subject;
    }

    /**
     * @param Subject the Subject to set
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * @return the Grade
     */
    public String getGrade() {
        return Grade;
    }

    /**
     * @param Grade the Grade to set
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
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
     * @return the Teacher
     */
    public String getTeacher() {
        return Teacher;
    }

    /**
     * @param Teacher the Teacher to set
     */
    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
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

    /**
     * @return the HallNo
     */
    public String getHallNo() {
        return HallNo;
    }

    /**
     * @param HallNo the HallNo to set
     */
    public void setHallNo(String HallNo) {
        this.HallNo = HallNo;
    }
}
