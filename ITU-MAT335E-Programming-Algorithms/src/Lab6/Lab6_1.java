package Lab6;

import java.util.Random;

public class Lab6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		char a = (char) rand.nextInt(0,128); // Casting
		System.out.println("Random character is : " + a);
		System.out.println("ASCII code is : "+(int) a);
		if(isAlphabet(a)) {
			System.out.println("Character is alphabet");
		}
		else {
			System.out.println("Character is not alphabet");
		}


	}
	
	static boolean isAlphabet(char c) {
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
