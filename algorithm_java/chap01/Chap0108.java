package chap01;
// ����ǥ�� ����մϴ�.

import java.util.Scanner;

public class Chap0108 {
	public static void main(String[] args) {
		System.out.println("----- ����ǥ -----");

		Scanner input = new Scanner(System.in);

		int n;

		System.out.println("�̵ �ﰢ��");

		do {
			System.out.print("����̰�?");
			n = input.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();

		}
	}
}