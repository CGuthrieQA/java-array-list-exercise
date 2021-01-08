package com.qa.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
		
		// question 1
		
		List<Integer> myArray = new ArrayList<Integer>();
		
		// question 2
		
		myArray.add(1);
		myArray.add(20);
		myArray.add(77);
		
		// question 3
		
		System.out.println(myArray);
		
		// question 4
		
		for (int i=0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}
		
		for (int i : myArray) {
			System.out.println(i);
		}
		
		// question 5
		
		myArray.get(1);
		
		// question 6
		
		myArray.set(2, 42);
		
		// question 7
		
		myArray.remove(1);
		
		// question 8
		
		List<Integer> backwardsNums = new ArrayList<Integer>();
		
		backwardsNums.add(9);
		backwardsNums.add(5);
		backwardsNums.add(2);
		
		Collections.sort(backwardsNums);
		
		for (int i : backwardsNums){
        	System.out.println(i);
		}
		
		List<String> backwardsStrings = new ArrayList<String>();
		
		backwardsStrings.add("zob");
		backwardsStrings.add("nart");
		backwardsStrings.add("clim");
		
		Collections.sort(backwardsStrings);
		
		for (String i : backwardsStrings){
        	System.out.println(i);
		}
		
		List<Character> backwardsChar = new ArrayList<Character>();
		
		backwardsChar.add('q');
		backwardsChar.add('h');
		backwardsChar.add('5');
		
		Collections.sort(backwardsChar);
		
		for (char i : backwardsChar){
        	System.out.println(i);
		}
		
		// question 9
		
		List<Character> muteList = new ArrayList<Character>();
		
		muteList.add('a');
		muteList.add('b');
		muteList.add('c');
		
		System.out.println(muteList);
		
		Collections.reverse(muteList);

		System.out.println(muteList);
		
		Collections.swap(muteList, 0, 2);
		
		System.out.println(muteList);
		
		// can't get this working or find documentation on it
		//Collections.clone();
		
		List<Character> copiedList = new ArrayList(muteList);
		
		System.out.println(copiedList);
		
	}

}
