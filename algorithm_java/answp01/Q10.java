package answp01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("두 값의 합을 구할겨");
		System.out.print("a의 값 :");
		a = input.nextInt();
		
		do {
			System.out.print("b의 값 : ");
			b = input.nextInt();
			if(b<=a)
			{
				System.out.println("a보다 큰 값을 부탁드립니다.");
			}
		} while (b<=a);
		
		int sum = 0;
		
		sum = a + b;
		
		System.out.println( a + " + " + b + " 합은 " + sum + " 입니다. " );
	}

}
