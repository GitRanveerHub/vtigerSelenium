package VrigerGenericUtilities;

import java.util.Random;

public class JavaUtilities {
	
	
	
	/**
	 * It is used to generate the random number within the range of 1000
	 * @return
	 * author Ranveer
	 */
	
	public int getRandomNum() {
		Random ranNum = new Random();
        int ranNumber = ranNum.nextInt(1000);
		return ranNumber;
	}

	
}
