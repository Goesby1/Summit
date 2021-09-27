package StringExamples;

public class AnagramCheck {

	public static void main (String [] args) {
		
		int [] array1 = new int[255];
		int [] array2 = new int[255];
		String s = "first";
		String t = "bob";
		int count = 0;
		
		for (char i: s.toCharArray()) {
			array1[(int) i]++;
		}
		
		for (char i: t.toCharArray()) {
			array2[(int) i]++;
		}
		
		for(int i = 0; i < 255; i++) {
			if (array1[i] != array2[i]) {
				count++;
				break;
			}
		}
		
		if (count != 0 ) {
			System.out.print("Not an anagram");
		} else {
			System.out.print("Anagram!!!!");

		}
		
	}
}
