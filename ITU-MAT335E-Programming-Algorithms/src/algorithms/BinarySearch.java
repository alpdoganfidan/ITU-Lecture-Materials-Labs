package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);
		list.add(130);
		list.add(140);
		list.add(150);
		list.add(160);
		list.add(170);
		list.add(180);
		list.add(190);
		list.add(130);
		

		Collections.sort(list);
		int NUMBER_TO_SEARCH = 130;
		
		BinarySearchV0(list, NUMBER_TO_SEARCH);
		
		int i = 0;
		for (int a:list) {
			i++;
			System.out.println(i+". "+a);
		}
		
	}
	
	public static int BinarySearchV0(List<Integer> sortedList, int NUMBER_TO_SEARCH) {
		
		int higherIndex = (sortedList.size()-1);
		int lowerIndex = 0;
		int mediumIndex = (higherIndex+lowerIndex)/2;
		
		int currentNumber = sortedList.get(mediumIndex);
		
		int counter = 0;
		while (currentNumber!=NUMBER_TO_SEARCH) {
			System.out.println("Iter : " + ++counter);
			
			if(currentNumber==NUMBER_TO_SEARCH) {
				break;
			}
			else if (currentNumber < NUMBER_TO_SEARCH){
				lowerIndex = mediumIndex;
				mediumIndex = (higherIndex+lowerIndex)/2;
			}
			else {
				higherIndex = mediumIndex;
				mediumIndex = (higherIndex+lowerIndex)/2;
			}
			currentNumber = sortedList.get(mediumIndex);
		}	
		System.out.println(currentNumber);
		
		return 0;
	}
	
}
