package dbmysql;
import java.sql.*;
public class DBConnection{
	private static DBConnection dbConnection;
	private Connection conn;
	private DBConnection()throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/tution","root","1234");
	}
	public static DBConnection getDBConnection()throws ClassNotFoundException,SQLException{
		if(dbConnection==null){
			dbConnection=new DBConnection();
		}
		return dbConnection;
	}	
	public Connection getConnection(){
		return conn;
	}
}
