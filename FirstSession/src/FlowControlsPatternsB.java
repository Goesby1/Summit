
public class FlowControlsPatternsB {

	public static void main (String [] args) {
		
		System.out.print("Pattern B\n");
		
		for (int i = 6; i >= 0; i--) {
			for (int x = 1; x < (i + 1); x++) {
				System.out.print(x + " ");
				
			}
			System.out.println();
		}
		
	}
}
