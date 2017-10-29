package userinterface;

import java.util.Scanner;

import logic.PasswordGenerator;

public class UserInterface {

	private Scanner reader;
	private PasswordGenerator pg;

	public UserInterface() {
		this.reader = new Scanner(System.in);
		this.pg = new PasswordGenerator();
	}

	public void start() {
		boolean running = true;

		// userinterface begins
		while (running) {
			// password is generated
				boolean check = true;
				System.out.println("How many characters do you want your password to be?");
				while (check) {

					try {
						int length = Integer.parseInt(reader.nextLine());
						if (length > 0 && length <= 100) {
							pg.setPasswordLength(length);
							check = false;
						} else {
							System.out.println("Please type a number between 1-100");
						}

					} catch (Exception e) {
						System.out.println("Please type a number between 1-100");
					}

				}
				

				String thePass = pg.generateRandomChar();
				System.out.println("You password is: " + thePass);

				// insert password begins
				while (running) {
					System.out.println("Please enter the password to continue");
					String input = reader.nextLine();

					if (input.equals(thePass)) {
						System.out.println("Correct!");
						running = false;
					} else {
						System.out.println("Incorrect");
					}

					// inster password ends
				}

			}

			// userinterface ends
		}

	}


