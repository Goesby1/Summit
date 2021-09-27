
public class FlowControlPatternsD {
	public static void main(String [] args) {
		
		System.out.print("Pattern D \n");
	
		for (int i = 7; i > 0; i--) {
			for (int x = 0; x < 7 - i; x++)  {
				System.out.print("  ");
			}
			
			for (int x = 1; x < i; x++) {
				System.out.print(x+ " ");
			}
			
			System.out.println();
		}
	}
}
