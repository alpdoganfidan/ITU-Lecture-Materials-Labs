package mat335Labs.Lab1;

public class Lab1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f,k;
		f = 62;
		k = 230;
		
		convertFtoK(f);
		convertKtoF(k);
	}

	public static double convertFtoK(double f) {
		double k;
		k = (f-32)/1.8 + 273.15;
		System.out.format("%.2f Fahrenheit equals to %.2f Kelvin.\n",f,k);
		return k;
	}
	
	public static double convertKtoF(double k) {
		double f;
		f = (k-273.15)*(1.8) + 32;
		System.out.format("%.2f Kelvin equals to %.2f Fahrenheit.\n",k,f);
		return f;
	}
}