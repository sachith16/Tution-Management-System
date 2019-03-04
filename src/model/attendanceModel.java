/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class attendanceModel {

    private String StID;
    private String ClassID;
    private String MonthCode;
    private String IsPayed;
    private String PayedAmount;
    private String Balance;
    private String PayedDate;
    private String IsTemp;
    private String IsBalanced;
    private String Date1;
    private String Date2;
    private String Date3;
    private String Date4;
    private String Date5;
    private String Name;
    private String Subject;
    private String Grade;
    private String Teacher;
    private String Date;

    public attendanceModel() {
    }

    public attendanceModel(String StID, String ClassID, String MonthCode, String IsPayed, String PayedAmount, String Balance, String PayedDate, String IsTemp, String IsBalanced, String Date1, String Date2, String Date3, String Date4, String Date5, String Name) {
        this.StID = StID;
        this.ClassID = ClassID;
        this.MonthCode = MonthCode;
        this.IsPayed = IsPayed;
        this.PayedAmount = PayedAmount;
        this.Balance = Balance;
        this.PayedDate = PayedDate;
        this.IsTemp = IsTemp;
        this.IsBalanced = IsBalanced;
        this.Date1 = Date1;
        this.Date2 = Date2;
        this.Date3 = Date3;
        this.Date4 = Date4;
        this.Date5 = Date5;
        this.Name = Name;
    }

    public attendanceModel(String StID, String ClassID, String MonthCode, String IsPayed, String PayedAmount, String Balance, String PayedDate, String IsTemp, String IsBalanced, String Date1, String Date2, String Date3, String Date4, String Date5) {
        this.StID = StID;
        this.ClassID = ClassID;
        this.MonthCode = MonthCode;
        this.IsPayed = IsPayed;
        this.PayedAmount = PayedAmount;
        this.Balance = Balance;
        this.PayedDate = PayedDate;
        this.IsTemp = IsTemp;
        this.IsBalanced = IsBalanced;
        this.Date1 = Date1;
        this.Date2 = Date2;
        this.Date3 = Date3;
        this.Date4 = Date4;
        this.Date5 = Date5;
    }

    
    /**
     * @return the StID
     */
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
     * @return the MonthCode
     */
    public String getMonthCode() {
        return MonthCode;
    }

    /**
     * @param MonthCode the MonthCode to set
     */
    public void setMonthCode(String MonthCode) {
        this.MonthCode = MonthCode;
    }

    /**
     * @return the IsPayed
     */
    public String getIsPayed() {
        return IsPayed;
    }

    /**
     * @param IsPayed the IsPayed to set
     */
    public void setIsPayed(String IsPayed) {
        this.IsPayed = IsPayed;
    }

    /**
     * @return the PayedAmount
     */
    public String getPayedAmount() {
        return PayedAmount;
    }

    /**
     * @param PayedAmount the PayedAmount to set
     */
    public void setPayedAmount(String PayedAmount) {
        this.PayedAmount = PayedAmount;
    }

    /**
     * @return the Balance
     */
    public String getBalance() {
        return Balance;
    }

    /**
     * @param Balance the Balance to set
     */
    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    /**
     * @return the PayedDate
     */
    public String getPayedDate() {
        return PayedDate;
    }

    /**
     * @param PayedDate the PayedDate to set
     */
    public void setPayedDate(String PayedDate) {
        this.PayedDate = PayedDate;
    }

    /**
     * @return the IsTemp
     */
    public String getIsTemp() {
        return IsTemp;
    }

    /**
     * @param IsTemp the IsTemp to set
     */
    public void setIsTemp(String IsTemp) {
        this.IsTemp = IsTemp;
    }

    /**
     * @return the IsBalanced
     */
    public String getIsBalanced() {
        return IsBalanced;
    }

    /**
     * @param IsBalanced the IsBalanced to set
     */
    public void setIsBalanced(String IsBalanced) {
        this.IsBalanced = IsBalanced;
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
     * @return the Date3
     */
    public String getDate3() {
        return Date3;
    }

    /**
     * @param Date3 the Date3 to set
     */
    public void setDate3(String Date3) {
        this.Date3 = Date3;
    }

    /**
     * @return the Date4
     */
    public String getDate4() {
        return Date4;
    }

    /**
     * @param Date4 the Date4 to set
     */
    public void setDate4(String Date4) {
        this.Date4 = Date4;
    }

    /**
     * @return the Date5
     */
    public String getDate5() {
        return Date5;
    }

    /**
     * @param Date5 the Date5 to set
     */
    public void setDate5(String Date5) {
        this.Date5 = Date5;
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
}
