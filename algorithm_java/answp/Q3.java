package answp;

import java.util.Scanner;

public class Q3 {

	static int min3(int a, int b, int c, int d) {

		int min = a;

		if (min > b)
			min = b;
		else if (min > c)
			min = c;
		else if (min > d)
			min = d;

		return min;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, c, d;

		System.out.println("3���� ���� �Է����ּ���");

		System.out.print("1��° �� : ");
		a = input.nextInt();
		System.out.print("2��° �� : ");
		b = input.nextInt();
		System.out.print("3��° �� : ");
		c = input.nextInt();
		System.out.print("4��° �� : ");
		d = input.nextInt();

		int max = min3(a, b, c,d);

		System.out.println("���� ...");

		System.out.println("��� : �ּ� ���� " + max + "�Դϴ�.");

	}

}
