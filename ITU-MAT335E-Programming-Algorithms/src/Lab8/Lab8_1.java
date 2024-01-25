package Lab8;

import java.util.ArrayList;

public class Lab8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1,3,5,5,2,3};
		
		System.out.println(findDifNumbersInArray(myArray));
		
		
	}
	
	public static int findDifNumbersInArray(int[] array) {
		
		
		ArrayList<Integer> uniqueArr = new ArrayList<Integer>(0);
		
		for (int i=0; i < array.length; i++) {
			if(!uniqueArr.contains(array[i])) {
				uniqueArr.add(array[i]);
			}
		}
		
		return uniqueArr.size();
	}

}
