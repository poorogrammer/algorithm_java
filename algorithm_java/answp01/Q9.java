package answp01;

import java.util.Scanner;

public class Q9 {

	static int sumof(int a, int b) {

		int sum = 0;

		int min = 0;
		int max = 0;

		if (a < b) {
			min = a;
			max = b;
		} else if (a > b) {
			min = b;
			max = a;
		}

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("두 사이의 값의 합을 구할려고 합니다.");
		System.out.println("값을 입력하세요");
		System.out.print("a : ");
		int a = input.nextInt();
		System.out.print("b : ");
		int b = input.nextInt();

		System.out.println("합계 : " + sumof(a, b));

	}

}
