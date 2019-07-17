package answp01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("a의 값을 입력하시요");
		int a = input.nextInt();
		
		int sum = 0;
		
		if(a%2==0) {
			sum = (1+a)*(a/2);
			
		} else if (a%2==1) {
			sum = (1+a)*(a/2) + (a/2+1);
			
		}
		System.out.println("1부터" + a + "까지의 총합은 " + sum + "입니다.");
	}

}
