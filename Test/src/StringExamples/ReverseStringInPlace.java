package StringExamples;

public class ReverseStringInPlace {
	
	public static void main( String [] args) { 
	
		String s = "eminem";
		StringBuilder str = new StringBuilder(s);
		char temp;
		int x = 0;
		int i = s.length() - 1;
		
		while (x <= i) {
			
			temp = (char) str.charAt(x);
			str.setCharAt(x, str.charAt(i));
			str.setCharAt(i, temp);
			x++;
			i--;
		}
		
		System.out.println(str.toString());
		
		
	}

}
