package answp01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a;

		System.out.println("�ڸ����� ���Ұ�");
		System.out.println("���� �������� �Է�");

		do {
			System.out.print("�Է� �� : ");
			a = input.nextInt();

			if (a <= 0) {
				System.out.println("���� ���� ���� �Է��ض�");
			}

		} while (a <= 0);

		int sum = 0;

		while (a > 0) {
			a /= 10;
			sum++;

		}
		System.out.println("�� ����" + sum + "�ڸ� �� �Դϴ�.");
		/*
		 * if(a>0 && a<10) System.out.println("�� ���� 1�ڸ� �Դϴ�."); else if (a>=10 && a<100)
		 * System.out.println("�� ���� 2�ڸ� �Դϴ�."); else if (a>=100 && a<1000)
		 * System.out.println("�� ���� 3�ڸ� �Դϴ�.");
		 */

	}

}
