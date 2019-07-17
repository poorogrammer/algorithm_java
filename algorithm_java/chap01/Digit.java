package chap01;

import java.util.Scanner;

class Digit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int no;
		
		System.out.println("2자리 정수 입력");
		
		do {
			System.out.print("입력 : ");
			no = input.nextInt();
		}while(no<10||no>99);
		System.out.println("변수 no 값 " + no + "가 되었슴");
	}

} 
