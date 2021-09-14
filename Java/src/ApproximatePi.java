/*
 * Ares Ton-That
 * This program is designed to approximate pi using a series.
 */

public class ApproximatePi {

	public static void main(String[] args) {

		// Initialize i and pi.
		int i = 1;
		double pi = 0;

		// Use a loop to approximate pi.
		while (i <= 100000) {
			pi = pi + (4 * (Math.pow(-1, i + 1) / ((2 * (double)i) - (double)(1.0))));
			if (i == 10000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 20000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 30000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 40000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 50000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 60000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 70000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 80000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 90000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			
			else if (i == 100000) {
				System.out.println("when i == " + i + ", PI = " + pi);
			}
			i++;
		}
		
	}

}