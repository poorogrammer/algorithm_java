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

		System.out.println("�� ������ ���� ���� ���ҷ��� �մϴ�.");
		System.out.println("���� �Է��ϼ���");
		System.out.print("a : ");
		int a = input.nextInt();
		System.out.print("b : ");
		int b = input.nextInt();

		System.out.println("�հ� : " + sumof(a, b));

	}

}
