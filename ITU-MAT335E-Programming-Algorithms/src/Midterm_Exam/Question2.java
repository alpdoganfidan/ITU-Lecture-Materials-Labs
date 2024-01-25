// Name, Surname: Alp Doğan Fidan
// Student ID: 090180320
// Question no: 2

package Midterm_Exam;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		narcosis(2,"female");
	}
	
	public static void narcosis(double duration,String gender) {
		
		double effectiveness = 100;
		double doseEffect;
		
		switch (gender) {
		case "male":
			doseEffect = 2.8;
			break;
		case "female":
			doseEffect = 2.6;
			break;
		default:
			throw new IllegalArgumentException("Invalid gender.");
		}
		
		double minutes = duration*60;
		
		for (int i = 0; i<minutes; i++) {
			effectiveness = effectiveness*(100-doseEffect)/100;
			System.out.printf("Minute : %d \tEffectiveness : %f \tDose : 1 %s\n",
					i,
					effectiveness, 
					(effectiveness > 30)? "" : "RISK OF AWAKENING");
		}

	}
}
