package chap05;
import java.util.Scanner;
// ���� ��Ͱ� ���� ��� �Լ� �����ϱ�

class Chap0504 {
	// ���� ��͸� �����߽��ϴ�. 
	static void recur(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���.��");
		int x = stdIn.nextInt();

		recur(x);
	}
}
