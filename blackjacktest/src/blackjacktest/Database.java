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
	 
	 * age integer NOT NULL, 
	 
	 * PRIMARY KEY(id));
	 
	 */
	
		
		Scanner scanner = new Scanner(System.in);
	  	
		int chance= 0;
		
		boolean approved= true;
		
		
		PreparedStatement s = null;
		
		Statement stmt= null;
		
		ResultSet rs= null;
		
		String username = "";
		
		String password = "";
		
		String user;
		
		String testuser= "";
		
		Connection connect = null;
		
		String number;
		
		
		public boolean dbsql() {
		
			
		System.out.print("\nPress 1 if you already registered  or"
				+ "\n\nanother number  if you want to register : ");
		
		number=scanner.next();
	
		
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
	
		
		
	

		
		try { 
				int snumber =Integer.parseInt(number);
		
				if( snumber == 1 ) {
					
					approved=true;
					
				}
				else {
					notreg();
					
				}
							
				

		}		
			
		catch ( Exception e ) {
				System.out.println("\nNumbers Only!");
				dbsql();	
				
				
		}	
		
		
				
		
		
			if(number.equals("1")) {
				System.out.print("\nEnter your username : ");
		
				
		
				try {
					
					testuser = scanner.next();
					
					stmt = connect.createStatement();
					rs= stmt.executeQuery("SELECT * FROM Player WHERE username='"+ testuser +"';" ); // <-- tilldelar rs detta
				
					
					while(rs.next()) {
						approved=false;
						user = rs.getString("username");
						String passw = rs.getString("password");
						int age=rs.getInt("age");
									
						System.out.print("\nExist in the database\n"
						+ "\nYour information is:\n"
										
						+ "\nUsername : " + user + " " + " " + ""
										
						+ "\n\nPassword  : " + passw + " "
										
						+ "\n"
						
						
						+ "\nAge : "+ age+"\n");
								
						//approved=true;
						//System.exit(0);
					
							
					}		
								
						
					if(approved==true) {
						System.out.println(testuser + " was not found in database");
						
					}			
					
			}
				
					 
					
			catch( SQLException e ){
					
				
			
			}
			
				
		}	 
					
				return approved;

}	
		
	
		
	
	public boolean notreg(){
		
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

			} 
			
			catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
			}
			
			
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
					//approved = true;
					
					
						}
						else if( nage < 18 ) {
								
							
								System.out.println("    +18 ONLY     " );
								 
								System.exit(0);
						}

			}		
				
			catch ( Exception e ) {
					System.out.println("\nNumbers Only!");
						
			}

			
			
					


			try {

				s = connect.prepareStatement("insert into  BlackJack1.Player values (default,?, ?, ?)");
				s.setString(1, username);
				s.setString(2, password);
				s.setString(3, gage);
				
				s.executeUpdate();



			} catch ( SQLException e ) {

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
		
			  	
		



	

			return approved;

	}

	
}
		

		
		
