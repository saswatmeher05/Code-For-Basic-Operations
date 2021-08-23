package com.mysql.table;
import java.sql.*;
public class OracleConnectionTest {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			st=con.createStatement();
			rs=st.executeQuery("select * from emptab");
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
