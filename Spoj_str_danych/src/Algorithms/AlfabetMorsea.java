package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class AlfabetMorsea {
	
	
	
	
	

	public static void main(String[] args) {
		HashMap<Character, String> newMap = new HashMap<Character, String>();
		newMap.put('A', ".-/");
		newMap.put('a', ".-/");
		newMap.put('B', "-.../");
		newMap.put('b', "-.../");
		newMap.put('C', "-.-./");
		newMap.put('c', "-.-./");
		newMap.put('D', "-../");
		newMap.put('d', "-../");
		newMap.put('E', "./");
		newMap.put('e', "./");
		newMap.put('F', ".-../");
		newMap.put('f', ".-../");
		newMap.put('G', "--./");
		newMap.put('g', "--./");
		newMap.put('H', "..../");
		newMap.put('h', "..../");
		newMap.put('I', "../");
		newMap.put('i', "../");
		newMap.put('J', ".---/");
		newMap.put('j', ".---/");
		newMap.put('K', "-.-/");
		newMap.put('k', "-.-/");
		newMap.put('L', "..-./");
		newMap.put('l', "..-./");
		newMap.put('M', "--/");
		newMap.put('m', "--/");
		newMap.put('N', "-./");
		newMap.put('n', "-./");
		newMap.put('O', "---/");
		newMap.put('o', "---/");
		newMap.put('P', ".--./");
		newMap.put('p', ".--./");
		newMap.put('Q', "--.-/");
		newMap.put('q', "--.-/");
		newMap.put('R', ".-./");
		newMap.put('r', ".-./");
		newMap.put('S', ".../");
		newMap.put('s', ".../");
		newMap.put('T', "-/");
		newMap.put('t', "-/");
		newMap.put('U', "..-/");
		newMap.put('u', "..-/");
		newMap.put('V', "...-/");
		newMap.put('v', "...-/");
		newMap.put('W', ".--/");
		newMap.put('w', ".--/");
		newMap.put('X', "-..-/");
		newMap.put('x', "-..-/");
		newMap.put('Y', "-.--/");
		newMap.put('y', "-.--/");
		newMap.put('Z', "--../");
		newMap.put('z', "--../");
		newMap.put(' ', "/");
		
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()){
			
			String lineString  = in.nextLine();
			char[] charArray = lineString.toCharArray();
			
			for (int i = 0; i< lineString.length();i++){
				
				System.out.print(newMap.get(charArray[i]));
				
			}
			System.out.println(" ");
			
		}
		in.close();
		
	}

}
