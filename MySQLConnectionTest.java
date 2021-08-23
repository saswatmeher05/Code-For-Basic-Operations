package com.mysql.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnectionTest {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root");
			st=con.createStatement();
			rs=st.executeQuery("select * from empdata");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				st.close();
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}
}
