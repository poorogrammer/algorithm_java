package chap01;

import java.util.Scanner;

class Digit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int no;
		
		System.out.println("2�ڸ� ���� �Է�");
		
		do {
			System.out.print("�Է� : ");
			no = input.nextInt();
		}while(no<10||no>99);
		System.out.println("���� no �� " + no + "�� �Ǿ���");
	}

} 
