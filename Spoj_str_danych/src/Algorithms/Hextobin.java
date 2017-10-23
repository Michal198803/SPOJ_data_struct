package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 class Hextobin {
	ArrayList <Integer> tab = new ArrayList <Integer>();
	String binStr = null;
	
	public String toBinary(int decimal) {
	
		while (decimal != 0) {
			tab.add (decimal % 2) ;
			decimal /= 2;
		}
		
		 if(tab.size()==1){
			
			binStr = "000";

			for(int j = tab.size()-1; j >= 0; j--){
			
				binStr += tab.get(j);
			}
		}
		
		
		
		else if(tab.size()==2){
		
			binStr = "00";
			
			for(int j = tab.size()-1; j >= 0; j--){
				
				binStr += tab.get(j);
			}
		}
		
		else if (tab.size()==3){
			
	binStr = "0";
			
	for(int j = tab.size()-1; j >= 0; j--){
		
		binStr += tab.get(j);
	}}
			
			else if (tab.size()==4){

		for (int k = tab.size()-1; k >= 0; k--) {

			if (binStr == null) {

				binStr = Integer.toString(tab.get(k));
				continue;
			}
			binStr += Integer.toString(tab.get(k));

		}}

		return binStr;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> newMap = new HashMap<String, Integer>();

		newMap.put("0", 0);
		newMap.put("1", 1);
		newMap.put("2", 2);
		newMap.put("3", 3);
		newMap.put("4", 4);
		newMap.put("5", 5);
		newMap.put("6", 6);
		newMap.put("7", 7);
		newMap.put("8", 8);
		newMap.put("9", 9);
		newMap.put("A", 10);
		newMap.put("B", 11);
		newMap.put("C", 12);
		newMap.put("D", 13);
		newMap.put("E", 14);
		newMap.put("F", 15);

		Hextobin sample = new Hextobin();

		Scanner x = new Scanner(System.in);
		 String r = x.nextLine();
		 x.close();
		
		
	int decimal = newMap.get(r);


		System.out.println(sample.toBinary(decimal));

	}

}