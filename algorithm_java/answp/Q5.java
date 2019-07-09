package answp;

import java.util.Scanner;

public class Q5 {
//효율이 떨어지는 이유?
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을 구할려고 합니다.");
		System.out.println("값을 입력해 주세요");

		System.out.print("a의 값 : ");
		int a = input.nextInt();

		System.out.print("b의 값 : ");
		int b = input.nextInt();

		System.out.print("c의 값 : ");
		int c = input.nextInt();

		System.out.println("진행중...");
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");

	}

}
