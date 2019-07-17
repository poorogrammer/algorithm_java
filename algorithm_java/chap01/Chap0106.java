package chap01;

import java.util.Scanner;

public class Chap0106 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n의 값 : ");
			n = input.nextInt();
			if(n<=0)
			{
				System.out.println("다시 입력해주세요");
			}
		} while (n<=0);
		
		int sum = 0;
		
		for (int i =1; i<=n;i++)
			sum += i;
		
		System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다." );
	}

}
