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

		System.out.println("4���� ���� �Է����ּ���");

		System.out.print("1��° �� : ");
		a = input.nextInt();
		System.out.print("2��° �� : ");
		b = input.nextInt();
		System.out.print("3��° �� : ");
		c = input.nextInt();
		System.out.print("4��° �� : ");
		d = input.nextInt();

		int max = max4(a, b, c, d);

		System.out.println("���� ...");

		System.out.println("��� : �ִ� ���� " + max + "�Դϴ�.");

	}

}
