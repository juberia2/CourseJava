package com.tnsif.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcselect {
	public static void main(String[] args) {
		
		 
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sri_indu","root","manager");
			
			 
			
			Statement st=conn.createStatement();
			
			 
			
			String strselect="Select booktitle,bookprice,bookqun from book";
			
			 
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("The records are");
			int rowcount=0;
			while(rst.next()) {
				String booktitle=rst.getString("booktitle");
				int bookprice=rst.getInt("bookprice");
				int bookqun=rst.getInt("bookqun");
				
				System.out.println(booktitle+" "+bookprice+" "+bookqun);
				++rowcount;
			}
			
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
}
}
