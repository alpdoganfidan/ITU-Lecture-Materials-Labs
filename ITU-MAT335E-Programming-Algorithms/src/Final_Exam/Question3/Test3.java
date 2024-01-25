package Question3;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
        String[] a1 = {"Splinter","Leo","April","Don","Raph"};
        String[] a2 = {"Krang", "Shredder", "Bebop"};

        String[] a3 = longArray(a1, a2);

        System.out.println("Array a1: " + Arrays.toString(a1));
        System.out.println("Array a2: " + Arrays.toString(a2));
        System.out.println("Array a3: " + Arrays.toString(a3));
    }

    public static String[] longArray(String[] a1, String[] a2) {
        int maxLength = Math.max(a1.length, a2.length);
        int minLength = Math.min(a1.length, a2.length);
        
        String[] a3 = new String[maxLength];

        for (int i = 0; i < minLength; i++) {
            if (a1[i].length() >= a2[i].length()) {
                a3[i] = a1[i];
            } else {
                a3[i] = a2[i];
            }
        }
        
        for (int i = minLength; i < maxLength; i++) {
        	a3[i] = "oops";
        }
        
        return a3;
    }

}
