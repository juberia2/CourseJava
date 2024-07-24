package com.tnsif.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Preparestmt {
public static void main(String[] args) {
		
		 
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sri_indu","root","manager");
			
 			
			Statement st=conn.createStatement();
			
			 
			String strselect="select booktitle,bookprice,bookqun from book";
			
			System.out.println("the sql stament is"+strselect);
			
			 
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("the records are");
			
			int rowcout=0;
			while(rst.next()) {
				String booktitle=rst.getString("booktitle");
				int bookprice=rst.getInt("bookprice");
				int bookqun=rst.getInt("bookqun");
				
				System.out.println(booktitle+" "+bookprice+" "+bookqun);
				++rowcout;
			}
			}
		 catch (SQLException e) {
 			e.printStackTrace();
		}
		
	}
}
