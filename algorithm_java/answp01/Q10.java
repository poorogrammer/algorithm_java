package answp01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("�� ���� ���� ���Ұ�");
		System.out.print("a�� �� :");
		a = input.nextInt();
		
		do {
			System.out.print("b�� �� : ");
			b = input.nextInt();
			if(b<=a)
			{
				System.out.println("a���� ū ���� ��Ź�帳�ϴ�.");
			}
		} while (b<=a);
		
		int sum = 0;
		
		sum = a + b;
		
		System.out.println( a + " + " + b + " ���� " + sum + " �Դϴ�. " );
	}

}
