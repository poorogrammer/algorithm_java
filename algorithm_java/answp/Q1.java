package answp;

import java.util.Scanner;

public class Q1 {

	static int max4(int a, int b, int c, int d) {

		int max = a;

		if (max < b)
			max = b;
		else if (max < c)
			max = c;
		else if (max < d)
			max = d;

		return max;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, c, d;

		System.out.println("4개의 값을 입력해주세요");

		System.out.print("1번째 값 : ");
		a = input.nextInt();
		System.out.print("2번째 값 : ");
		b = input.nextInt();
		System.out.print("3번째 값 : ");
		c = input.nextInt();
		System.out.print("4번째 값 : ");
		d = input.nextInt();

		int max = max4(a, b, c, d);

		System.out.println("비교중 ...");

		System.out.println("결과 : 최대 값은 " + max + "입니다.");

	}

}
