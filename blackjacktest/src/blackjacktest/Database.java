
package blackjacktest;


import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.Scanner;

import java.sql.DriverManager;

import java.sql.ResultSet;

public class Database {
	
		
		
	/* CREATE database BlackJack1;
	 
	 * CREATE TABLE Player (id INT NOT NULL AUTO_INCREMENT,
	 
	 * username VARCHAR(30) NOT NULL,
	 
	 * password VARCHAR(30) NOT NULL, 
	 
	 * age integer NOT NULL, PRIMARY KEY(id));
	 
	 */
	
		
		
		Scanner scanner = new Scanner(System.in);
	  	
		int chance= 0;
		
		boolean approved= false;
		
		
		public boolean dbsql() {
		
		Scanner scanner = new Scanner(System.in);
		
		PreparedStatement s = null;
		
		Statement stmt= null;
		
		ResultSet rs= null;
		
		String username = "";
		
		String password = "";
		
		String user;
		
		
		
		String testuser= "";
		
		
		
		
		
		Connection connect = null;
		
		
		
		int number;
		
		
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} 
		
		catch (Exception e) {
		
		e.printStackTrace();
		
		}
		
		
		try {
		connect = DriverManager.getConnection("jdbc:mysql://localhost/BlackJack1?" + "user=foo&password=bar");
		
		
		
		
		} 		
		
		
		catch (SQLException e1) {

			e1.printStackTrace();
		}
	
		
		
		
		System.out.print("\nPress 1 if you are a customer or 0 if your not a customer : ");
		
		number=scanner.nextInt();
		
		
		if(number==1) {
		
			System.out.print("\nEnter your username : ");
			
			testuser = scanner.next();
		 
			try {
			
				stmt = connect.createStatement();
				rs= stmt.executeQuery("SELECT * FROM Player WHERE username='"+ testuser +"';" ); // <-- tilldelar rs detta
				
					
					while(rs.next()) {
	
							user = rs.getString("username");
							String passw = rs.getString("password");
							int age=rs.getInt("age");
							if(testuser.equals(rs.getString("username"))) {
								
								System.out.print("\nExist in the database\n"
										+ "\nYour information is:\n"
										+ "\nUsername : " + user + " " + " " + ""
										+ "\n\nPassword  : " + passw + " "
										+ "\n"+ "\n"
										+ "\nAge : "+ age);
								approved=true;
							}
								
							/*
							else { 	
									
								System.out.println("Not found in the database");
								stmt.close();
								rs.close();
								
							}*/	
						
					}
			}		
			catch( SQLException e ){
		
		
			
			}
					
				
		
		
		}
		
		
	
		
		else { 
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

			} 
			
			catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
			}
			/*
			try {
			//connect = DriverManager.getConnection("jdbc:mysql://localhost/BlackJack1?" + "user=foo&password=bar");
			
			} 		
			
			
			catch (Exception e) {

				e.printStackTrace();
			}
		
		*/
			
				System.out.println("\nPlease register a Username : ");
				
				username = scanner.next();
				
				System.out.println("\nPlease register a Password : ");
				
				password = scanner.next();
				
				System.out.println("\nEnter your age : "); 
				
				String gage;
				
				gage =scanner.next();
			
			try { 
					int nage =Integer.parseInt(gage);
			
					if( nage >= 18 ) {
						
						
					System.out.println("\nSuccessful registration\n");
					approved = true;
					
					
					}
					else if( nage < 18 ) {
								
							
								System.out.println("    +18 ONLY     " );
								 
								System.exit(0);
					}

			}		
				
			catch ( Exception e ) {
					System.out.println("Numbers Only!");
						
			}

			
			
					


			try {

				s = connect.prepareStatement("insert into  BlackJack1.Player values (default,?, ?, ?)");
				s.setString(1, username);
				s.setString(2, password);
				s.setString(3, gage);
				
				s.executeUpdate();
				// s.executeUpdate("create table Player (username VARCHAR(30), password VARCHAR(30), age
				// integer)");
				// workbench:
				// use BlackJack1;
				// create table BlackJack1 (username VARCHAR(30), password VARCHAR(30), age integer);



			} catch (SQLException e) {

				e.printStackTrace();
				scanner.close();
			}
		
		
		
			try {
					s.close();
			
					connect.close();
		
			} 
		
			catch (	Exception e	) {

				  e.printStackTrace();
			}
		
			  	
		


		}
		
			return approved;	

} // method boolean dbsql close bracket




}

		
