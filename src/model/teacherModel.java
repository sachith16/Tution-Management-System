package model;
public class teacherModel{
	private String TeacherID;
	private String Name;	
	private String Address;
        private String Degrees;
        private String Grades;
        private String Subjects;
        private String School;
        private String TelM;
        private String TelH;	
	
	public teacherModel(){}
	public teacherModel(String TeacherID, String Name, String School,String Degrees,String Address, String Grades,
                String Subjects,String TelM,String TelH){
		this.TeacherID=TeacherID;
		this.Address=Address;
		this.Name=Name;
		this.Grades=Grades;
                this.Degrees=Degrees;
                this.Subjects=Subjects;
                this.School=School;
                this.TelM=TelM;
                this.TelH=TelH;
        }
	public void setTeacherID(String TeacherID){
		this.TeacherID=TeacherID;
	}
	public void setName(String Name){
		this.Name=Name;
	}	
	public void setAddress(String Address){
		this.Address=Address;
	}	
	public void setGrades(String Grades){
		this.Grades=Grades;
	}
        public void setDegrees(String Degrees){
		this.Degrees=Degrees;
	}
        public void setSubjects(String Subjects){
		this.Subjects=Subjects;
	}
        public void setSchool(String School){
		this.School=School;
	}
        public void setTelM(String TelM){
		this.TelM=TelM;
	}
        public void setTelH(String TelH){
		this.TelH=TelH;
	}
	public String getTeacherID(){
		return TeacherID;
	}	
	public String getName(){
		return Name;
	}		
	public String getAddress(){
		return Address;
	}		
	public String getGrades(){
		return Grades;
	}
        public String getSubjects(){
		return Subjects;
	}
        public String getSchool(){
		return School;
	}
        public String getTelM(){
		return TelM;
	}
        public String getTelH(){
		return TelH;
	}
        public String getDegrees(){
		return Degrees;
	}
}
