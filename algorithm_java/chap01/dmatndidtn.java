//음수인지 양수인지 구해라
package chap01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dmatndidtn {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("값을 입력해주세요");
		
		try { // 1.0 등의 실수를 잘못 입력한 경우 에러 처리
			int a = input.nextInt();

			if (a > 0)
				System.out.println("양수입니다.");
			else if (a == 0)
				System.out.println("0입니다.");
			else if (a < 0)
				System.out.println("음수입니다.");
			else
				System.out.println("에러");
		} catch (InputMismatchException war) {
			System.err.println("에러! 정수가 아닌 실수/문자를 입력하셨군요: " + war);
			System.exit(1);
		}

	}

}
