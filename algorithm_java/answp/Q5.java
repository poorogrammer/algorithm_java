package answp;

import java.util.Scanner;

public class Q5 {
//ȿ���� �������� ����?
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�� ������ �߾Ӱ��� ���ҷ��� �մϴ�.");
		System.out.println("���� �Է��� �ּ���");

		System.out.print("a�� �� : ");
		int a = input.nextInt();

		System.out.print("b�� �� : ");
		int b = input.nextInt();

		System.out.print("c�� �� : ");
		int c = input.nextInt();

		System.out.println("������...");
		System.out.println("�߾Ӱ��� " + med3(a, b, c) + "�Դϴ�.");

	}

}
