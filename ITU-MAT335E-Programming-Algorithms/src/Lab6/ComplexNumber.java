package Lab6;
import java.lang.Math;

public class ComplexNumber {
	private double real;
	private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public String printComplex() {
    	return getReal()+" + ("+getImag()+")i";
    }
    
    public static ComplexNumber conjugate(ComplexNumber z) {
    	ComplexNumber temp = new ComplexNumber(z.getReal(),-z.getImag());
    	return temp;
    }
    
    public static double absValue(ComplexNumber z) {
    	return Math.sqrt(Math.pow(z.getReal(), 2)+Math.pow(z.getImag(), 2));
    }

    public static ComplexNumber add(ComplexNumber z1,ComplexNumber z2) {
    	double real = z1.getReal()+z2.getReal();
    	double imag = z1.getImag()+z2.getImag();
      	ComplexNumber temp = new ComplexNumber(real,imag);
      	return temp;
    }
    
    public static ComplexNumber multiply(ComplexNumber z1,ComplexNumber z2) {
    	double real = z1.getReal()*z2.getReal() - z1.getImag()*z2.getImag();
    	double imag = z1.getReal()*z2.getImag() + z1.getImag()*z2.getReal();
    	ComplexNumber temp = new ComplexNumber(real,imag);
    	return temp;
    }
    
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
}
