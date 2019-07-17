package answp01;

import java.util.Scanner;

public class Q17 {

	static void spira(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j < n-i+1; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("ют╥б : ");
			n=input.nextInt();
		}while(n<=0);

		spira(n);
		
	}

}
