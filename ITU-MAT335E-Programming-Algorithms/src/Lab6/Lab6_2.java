package Lab6;

public class Lab6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber a = new ComplexNumber(2,3);
		ComplexNumber b = new ComplexNumber(3,4);
		
		
		ComplexNumber conj_a = ComplexNumber.conjugate(a);
		
		ComplexNumber add_a_b = ComplexNumber.add(a, b);
		
		ComplexNumber multiply_a_b = ComplexNumber.multiply(a,b);
		
		double abs_a = ComplexNumber.absValue(a);
		
//		System.out.println("Conj of a = "+conj_a.getReal()+" + ("+conj_a.getImag()+")i");
//		System.out.println("Add of a and b = "+add_a_b.getReal()+" + ("+add_a_b.getImag()+")i");
//		System.out.println("Multiple of a and b = "+multiply_a_b.getReal()+" + ("+multiply_a_b.getImag()+")i");
//		System.out.println("Abs value = "+abs_a);
		
		System.out.println("Conj of a = "+conj_a.printComplex());
		System.out.println("Add of a and b = "+add_a_b.printComplex());
		System.out.println("Multiple of a and b = "+multiply_a_b.printComplex());
		System.out.println("Abs value = "+abs_a);
	}

}
