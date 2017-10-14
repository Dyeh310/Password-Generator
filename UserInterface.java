package userinterface;

import java.util.Scanner;

import logic.PasswordGenerator;

public class UserInterface {

	private Scanner reader;
	private PasswordGenerator pg;
	
	
	public UserInterface () {
		this.reader = new Scanner(System.in);
		this.pg = new PasswordGenerator();
	}
	
	
	public void start () {
		boolean running = true;
		
		//userinterface begins
		while(running) {
			
			System.out.println("Do you need a password?");
			String userEnter = reader.nextLine();
			
			//password is generated
			if(userEnter.equalsIgnoreCase("yes") || userEnter.equalsIgnoreCase("y")) {
				
				String thePass =  pg.generateRandomChar(); 
				System.out.println("You password is: " + thePass);
				
				
				//insert password begins
				while (running) {
					System.out.println("Please enter the password to continue");
					String input = reader.nextLine();
					
					if (input.equals(thePass)) {
						System.out.println("Correct!");
						running = false;
					} else {
						System.out.println("Incorrect");
					}
					
				
				//inster password ends	
				}
				
				
				
			} else {
				System.out.println("invalid entry");
			}
			
			
			
		//userinterface ends	
		}
		
	}
	
	
	
	
}
