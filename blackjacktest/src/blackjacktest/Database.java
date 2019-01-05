package blackjacktest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Database {
	
		boolean approved= false;
		
		
		public boolean dbsql() {
		
		Scanner scanner = new Scanner(System.in);
		
		PreparedStatement s = null;
		
		String username = "";
		
		String password = "";
		
		Connection connect = null;
		
		
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost/BlackJack1?" + "user=foo&password=bar");
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		{
			System.out.println("Please register a Username : ");
			username = scanner.next();
			System.out.println("\nPlease register a Password : ");
			password = scanner.next();
			
			
			System.out.println("\nEnter your age : ");
		
				
			
			
			String age;
			
			
			
			age=scanner.next();
			
			try { 
					int nage =Integer.parseInt(age);
			
					if( nage >= 18 ) {
						
						
					System.out.println("Successful registration");
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
				s.setString(3, age);
				
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
		}
		try {
			s.close();
			
			connect.close();
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
			return approved;
		}

			
	}

