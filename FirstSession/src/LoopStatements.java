
public class LoopStatements {

	public static void main (String [] args ) {
		
		for (int i = 1; i < 8; i++) {
			for (int x = 1; x < (i+1); x++) {
				System.out.print(x);
			}
			for (int x = 1; x < (8-i); x++) {
				System.out.print("*");

			}
			System.out.println();
		}
		
	}
}
