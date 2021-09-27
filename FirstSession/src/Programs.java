
public class Programs {

	public static void main (String [] args) {
	
		
		for (int i = 0; i < 5; i++) {
			for (int x = 5; x >= 0; x--) {
				if (i >= x) {
					System.out.print("* ");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}
}
