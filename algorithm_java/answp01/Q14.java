package answp01;
// ����ǥ�� ����մϴ�.

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a;
		
		System.out.println("----- ����ǥ -----");
		
		System.out.print("�� �� : ");
		
		a = input.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++)
				System.out.printf("*");
			System.out.println();
		}
	}
}