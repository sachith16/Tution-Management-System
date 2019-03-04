package model;
public class studentModel{
	private String StID;
	private String Name;	
	private String Address;
        private String Grade;
        private String Bday;
        private String School;
        private String TelM;
        private String TelH;	
	
	public studentModel(){}
	public studentModel(String StID, String Name, String Address, String Grade,
                String Bday,String School,String TelM,String TelH){
		this.StID=StID;
		this.Address=Address;
		this.Name=Name;
		this.Grade=Grade;
                this.Bday=Bday;
                this.School=School;
                this.TelM=TelM;
                this.TelH=TelH;
        }
	public void setStID(String StID){
		this.StID=StID;
	}
	public void setName(String Name){
		this.Name=Name;
	}	
	public void setAddress(String Address){
		this.Address=Address;
	}	
	public void setGrade(String Grade){
		this.Grade=Grade;
	}
        public void setBday(String Bday){
		this.Bday=Bday;
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
	public String getStID(){
		return StID;
	}	
	public String getName(){
		return Name;
	}		
	public String getAddress(){
		return Address;
	}		
	public String getGrade(){
		return Grade;
	}
        public String getBday(){
		return Bday;
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
}
