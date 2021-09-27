
public class FlowControlsPatternsC {

	public static void main (String [] args) {
		
		System.out.print("Pattern C\n");
		
		for (int i = 1; i < 7; i++) {
			for (int x = 7; x >= 1; x--) {
				if (i >= x) {
					System.out.print(x+" ");
				} else {
					System.out.print("  ");

				}
				
			}
			System.out.println();
			
		}
	}
}
