package answp01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a;

		System.out.println("자릿수를 구할겨");
		System.out.println("양의 정수값을 입력");

		do {
			System.out.print("입력 값 : ");
			a = input.nextInt();

			if (a <= 0) {
				System.out.println("양의 정수 값을 입력해라");
			}

		} while (a <= 0);

		int sum = 0;

		while (a > 0) {
			a /= 10;
			sum++;

		}
		System.out.println("그 수는" + sum + "자리 수 입니다.");
		/*
		 * if(a>0 && a<10) System.out.println("그 수는 1자리 입니다."); else if (a>=10 && a<100)
		 * System.out.println("그 수는 2자리 입니다."); else if (a>=100 && a<1000)
		 * System.out.println("그 수는 3자리 입니다.");
		 */

	}

}
