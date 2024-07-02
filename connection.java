package bank_management_system;

import java.sql.*;

public class Connection 
{
	 java.sql.Connection c;
	Statement s;
	
	public Connection()
	{
		try {	
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			c = DriverManager.getConnection("jdbc:mysql:///bankManagement_System","root","root");
			s = ((java.sql.Connection) c).createStatement();
			
			
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println("Mysql JDBC Driver not found ");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Connection Failed");
			System.out.println(e);
			e.printStackTrace();
		
		}
	}
	
	 

	   
	   

		public Connection getC() {
			return (Connection) c;
		}

		public void setC(Connection c) {
			this.c = (java.sql.Connection) c;
		}

		public Statement getS() {
			return s;
		}

		public void setS(Statement s) {
			this.s = s;
		}

		 public void closeConnection() {
		        if (c != null) {
		            try {
		            	c.close();
		            } catch (Exception e) {
		                System.err.println("Failed to close the connection.");
		                e.printStackTrace();
		            }
		        }
		    }






		public Object getStatement() {
			// TODO Auto-generated method stub
			return null;
		}

}
