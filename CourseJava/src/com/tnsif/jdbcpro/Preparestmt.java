package com.tnsif.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Preparestmt {
public static void main(String[] args) {
		
		 
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyd11","root","root");
			
 			
			Statement st=conn.createStatement();
			
			 
			String strselect="select booktitle,price,qty from books";
			
			System.out.println("the sql stament is"+strselect);
			
			 
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("the records are");
			
			int rowcout=0;
			while(rst.next()) {
				String booktitle=rst.getString("booktitle");
				int price=rst.getInt("price");
				int qty=rst.getInt("qty");
				
				System.out.println(booktitle+" "+price+" "+qty);
				++rowcout;
			}
			}
		 catch (SQLException e) {
 			e.printStackTrace();
		}
		
	}
}
