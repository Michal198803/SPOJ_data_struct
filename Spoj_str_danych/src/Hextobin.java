import java.util.HashMap;
import java.util.Map;

public class Hextobin {


	

	
	
	
	
	public int toBinary(int decimal) {
		String binStr = null;
		int bin;
		int i = 0;
		int tab[] = new int[31];

		while (decimal != 0) {

			tab[i++] = decimal % 2;
			decimal /= 2;

		}

		for (int j = i - 1; j >= 0; j--) {

			if (binStr == null) {

				binStr = Integer.toString(tab[j]);
				continue;
			}
			binStr += Integer.toString(tab[j]);

		}

		return bin = Integer.parseInt(binStr);
	}

	public static void main(String[] args) {

		HashMap<String, Integer> myMap = new HashMap <String, Integer>();
		
		myMap.put("1", 1);
	
		
		Hextobin sample = new Hextobin();

		sample.toBinary(3);

		System.out.println(sample.toBinary(3));

	}

}