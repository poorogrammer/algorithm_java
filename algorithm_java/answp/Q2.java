package answp;

import java.util.Scanner;

public class Q2 {
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		

		if (min > b)
			min = b;
		else if (min > c)
			min = c;
		return min;
		
	}

	public static void main(String[] args) {

		
			Scanner input = new Scanner(System.in);

			int a, b, c;

			System.out.println("3개의 값을 입력해주세요");

			System.out.print("1번째 값 : ");
			a = input.nextInt();
			System.out.print("2번째 값 : ");
			b = input.nextInt();
			System.out.print("3번째 값 : ");
			c = input.nextInt();

			int max = min3(a, b, c);

			System.out.println("비교중 ...");

			System.out.println("결과 : 최소 값은 " + max + "입니다.");

		
	}

}
