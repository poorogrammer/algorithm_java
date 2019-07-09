//구구단을 만들어 봐라
package chap01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class rnrneks {

	public static void main(String[] args) {
	
		try {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇단을 입력하실 겁니까? : " );
		
		int a = input.nextInt();
		
		for (int i=1;i<=a;i++)
		{
			for (int j=1; j<10; j++) {
				
				System.out.printf("%5d",i*j);
				
			}
			System.out.println();
		}
		} catch (Exception e) {
			System.err.println("에러 : " + e);
		}
	}

}
