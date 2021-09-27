package StringExamples;

import java.util.Scanner;

public class LongestSubstring {
	
	public static void main (String [] args) {
		String s = new String();
		
		Scanner sc = new Scanner(System.in);
		String input;
		int counter = 0;
		System.out.print("Enter new String: ");
		input = sc.next();
		System.out.println(input);

		for(int i = 0; i < input.length(); i++) {
			String st = new String() ;
			st = st + input.charAt(i);
			
			if (s.isEmpty()) {
				s = s + (input.charAt(i));
				counter++;
			} else if (s.contains(st) ) {
				s = s.substring(s.indexOf(st));
			} else {
				s = s + input.charAt(i);
			}
			
			
			counter = Math.max(s.length(), counter);
		}
		
		System.out.println(counter);
		
	}
	
	

}
