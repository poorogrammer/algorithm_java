package answp04;
import java.util.Scanner;

import chap04.Chap0401;

class Q1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Chap0401 s = new Chap0401(15); // ����

		while (true) {
			System.out.println("������ ������ ����" + s.size() + " / " + s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ " + "(4)���� (5)�˻� (6)���  " + "(7)����ǥ�� (0)���᣺");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // Ǫ��
				System.out.print("�����ͣ�");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (Chap0401.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2: // ��
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (Chap0401.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;

			case 3: // ��ũ
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (Chap0401.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;

			case 4: // ����
				s.dump();
				break;

			case 5: // �˻�
				System.out.print("ã�� �����ͣ�");
				x = stdIn.nextInt();
				int n = s.indexOf(x);
				if (n >= 0) {
					System.out.println("�������� " + (s.size() - n) + "�� °�� �ֽ��ϴ�.");
				}
				else
					System.out.println("�� �����Ͱ� �����ϴ�.");
				break;

			case 6: // ���
				s.clear();
				break;

			case 7: // ����ǥ��
				System.out.println("�뷮��" + s.capacity());
				System.out.println("������ ����" + s.size());
				System.out.println("��� " + (s.isEmpty() ? "�ֽ��ϴ�." : "���� �ʽ��ϴ�."));
				System.out.println("���� " + (s.isFull() ? "á���ϴ�." : "���� �ʾҽ��ϴ�."));
				break;
			}
		}
	}
}
