package answp01;

import java.util.Scanner;

public class Q2 {
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		

		if (min > b)
			min = b;
		else if (min > c)
			min = c;
		return min;
		
	}

	public static void main(String[] args) {

		
			Scanner input = new Scanner(System.in);

			int a, b, c;

			System.out.println("3���� ���� �Է����ּ���");

			System.out.print("1��° �� : ");
			a = input.nextInt();
			System.out.print("2��° �� : ");
			b = input.nextInt();
			System.out.print("3��° �� : ");
			c = input.nextInt();

			int max = min3(a, b, c);

			System.out.println("���� ...");

			System.out.println("��� : �ּ� ���� " + max + "�Դϴ�.");

		
	}

}
