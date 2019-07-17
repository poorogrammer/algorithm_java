package chap05;
import java.util.Scanner;

import chap04.Chap0401;
// ���� ��Ͱ� ���� ��� �Լ� �����ϱ�

class Chap0505 {
	// ���� ��͸� �����߽��ϴ�. 
	static void recur(int n) {
		Chap0401 s = new Chap0401(n);

		while (true) {
			if (n > 0) {
				s.push(n);						// n�� ���� Ǫ��
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) {			// ������ ��� ���� �ʴٸ�
				n = s.pop();					// �����ϰ� �ִ� ������ ���� ��
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���.��");
		int x = stdIn.nextInt();

		recur(x);
	}
}
