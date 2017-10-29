package logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {

	private int passwordLength;
	private Random random;
	private char[] punct = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', ':', '<', '>', '?' };// 14
	private int sbLength;
	private StringBuilder sb;
	private char rpwChar;
	private char rpwP;
	private int rpwNum;

	public PasswordGenerator() {
		this.random = new Random();
		this.sbLength = sbLength;
		this.sb = new StringBuilder("");
		this.rpwChar = rpwChar;
		this.rpwP = rpwP;
		this.rpwNum = rpwNum;
	}

	public int getPasswordLength() {
		return passwordLength;
	}

	public void setPasswordLength(int passwordLength) {
		this.passwordLength = passwordLength;
	}

	public String generateRandomChar() {
		for (int i = 0; i < passwordLength; i++) {
			
			int choice = random.nextInt(3);
			
			rpwChar = (char) (random.nextInt(26) + 'a');
			if (random.nextInt(2) == 1) {
				rpwChar = Character.toUpperCase(rpwChar);
			}
			rpwP = punct[i];
			rpwNum = random.nextInt(10);

			if (sbLength < passwordLength && choice == 0) {
				sb.append(rpwChar);
				sbLength++;
			}
			if (sbLength < passwordLength && choice == 1) {
				sb.append(rpwNum);
				sbLength++;
			}

			if (sbLength < passwordLength && choice == 2) {
				sb.append(rpwP);
				sbLength++;
			}

		}

		Collections.shuffle(Arrays.asList(sb));
		return sb.toString();
	}
}

