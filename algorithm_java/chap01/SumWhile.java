//1부터 n까지의 합을 구하라
package chap01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구하시요");
		System.out.print("n : ");
		//어떤 오류인가?
		try {

			//입력값 a
			int a = input.nextInt();

			//합계
			int sum = 0;
			int i = 1;
			
			//다른값을 입력
			if (a < 0)
				System.out.println("다시입력하세요");
			else if (a == 0)
				System.out.println("0입니다.");

			//합계
			while (i <= a) {
				sum += i;
				i++;
			}

			//출력
			System.out.println("1부터 " + a + "까지의 합은" + sum + "입니다.");
			
			//오류구문
		} catch (InputMismatchException war) {
			System.err.println("에러! 정수가 아닌 실수/문자를 입력하셨군요: " + war);
			System.exit(1);
		}
	}

}
