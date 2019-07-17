package chap04;
import java.util.Scanner;
// int�� ������ ��� ��

class Chap0402 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Chap0401 s = new Chap0401(64);	// �ִ� 64���� Ǫ���� �� �ִ� ����

		while (true) {
			System.out.println("���� ������ ����" + s.size() + " / "
															  + s.capacity());
			System.out.print("(1)Ǫ�á�(2)�ˡ�(3)��ũ��" +
								  "(4)������(0)���᣺");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// Ǫ��
				System.out.print("�����ͣ�");
				x = stdIn.nextInt();
				try {
					s.push(x);
			 	} catch (Chap0401.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			 case 2: 							// ��
				try {
			 		x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
			 	} catch (Chap0401.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 3: 							// ��ũ
				try {
			 		x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
			 	} catch (Chap0401.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 4: 							// ����
				s.dump();
				break;
			}
		}
	}
}