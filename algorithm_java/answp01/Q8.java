package answp01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("a�� ���� �Է��Ͻÿ�");
		int a = input.nextInt();
		
		int sum = 0;
		
		if(a%2==0) {
			sum = (1+a)*(a/2);
			
		} else if (a%2==1) {
			sum = (1+a)*(a/2) + (a/2+1);
			
		}
		System.out.println("1����" + a + "������ ������ " + sum + "�Դϴ�.");
	}

}
