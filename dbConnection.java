package storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnection {
	String connectionUrl = "jdbc:mysql://localhost:3306/myDB";
	String connectionUser = "root";
	String connectionPassword = "";
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	
	public boolean SignIn(String uName, String Passwd){
		try{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(connectionUrl, connectionUser,
						connectionPassword);
				stmt = conn.createStatement();
			}catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
		String sql = ("SELECT * FROM account");
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			
			String user = rs.getString("username");
			String pwd = rs.getString("pass");
			int flag = rs.getInt("flag");
			if(pwd.equals(Passwd) && user.equals(uName)&& flag==1) {
				
				Main.adm_flag=true;
			}
			
			if(pwd.equals(Passwd) && user.equals(uName))
			{
				
				
				
				return true;
			}//end if
			
		}
		
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return false;
	}
	
}