package StringExamples;

public class PrintDuplicate {
	
	public static void main (String [] args) {
		
		byte [] lst = new byte[255];
		String s = "cat in the hat";
		char [] str = s.toCharArray();
		
		for (char ch : str) {
			lst[(int) ch]++;
			if (lst[(int) ch] == 2) {
				System.out.print(ch +" ");
			}
		}
		
		
	
		
	}

}
