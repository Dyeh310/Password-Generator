package logic;

import java.util.Random;

public class PasswordGenerator {

	private int passwordLength = 6;
	private Random random;

	public PasswordGenerator() {
		this.random = new Random();
	}

	public String generateRandomChar() {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < passwordLength;i++) {
			char rpwChar = (char) (random.nextInt(26)+'a');
			int rpwNum = random.nextInt(10);
			sb.append(rpwChar);
			sb.append(rpwNum);
			
		}
		return sb.toString();
	}

}
