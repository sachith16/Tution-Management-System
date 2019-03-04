package model;
public class classModel{
	private String ClassID;
	private String Subject;	
	private String Grade;
        private String Date;
        private String Teacher;
        private String TimeStart;
        private String TimeEnd;
        private String Fee;
        private String HallNo;	
	
	public classModel(){}
	public classModel(String ClassID, String Subject, String Grade,String Date,String Teacher, String TimeStart,
                String TimeEnd,String Fee,String HallNo){
		this.ClassID=ClassID;
		this.Teacher=Teacher;
		this.Subject=Subject;
		this.TimeStart=TimeStart;
                this.Date=Date;
                this.TimeEnd=TimeEnd;
                this.Grade=Grade;
                this.Fee=Fee;
                this.HallNo=HallNo;
        }
	public void setClassID(String ClassID){
		this.ClassID=ClassID;
	}
	public void setSubject(String Subject){
		this.Subject=Subject;
	}	
	public void setTeacher(String Teacher){
		this.Teacher=Teacher;
	}	
	public void setTimeStart(String TimeStart){
		this.TimeStart=TimeStart;
	}
        public void setDate(String Date){
		this.Date=Date;
	}
        public void setTimeEnd(String TimeEnd){
		this.TimeEnd=TimeEnd;
	}
        public void setGrade(String Grade){
		this.Grade=Grade;
	}
        public void setFee(String Fee){
		this.Fee=Fee;
	}
        public void setHallNo(String HallNo){
		this.HallNo=HallNo;
	}
	public String getClassID(){
		return ClassID;
	}	
	public String getSubject(){
		return Subject;
	}		
	public String getTeacher(){
		return Teacher;
	}		
	public String getTimeStart(){
		return TimeStart;
	}
        public String getTimeEnd(){
		return TimeEnd;
	}
        public String getGrade(){
		return Grade;
	}
        public String getFee(){
		return Fee;
	}
        public String getHallNo(){
		return HallNo;
	}
        public String getDate(){
		return Date;
	}
}
