package answp01;

import java.util.Scanner;

public class Q15 {

	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');

			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n-i+1; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("´Ü¼ö´Â £º");
			n = input.nextInt();
		} while (n <= 0);
		
		//triangleLB(n);
		//triangleLU(n);	
		//triangleRU(n);
		triangleRB(n);

	}

}
