//�������� ������� ���ض�
package chap01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dmatndidtn {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("���� �Է����ּ���");
		
		try { // 1.0 ���� �Ǽ��� �߸� �Է��� ��� ���� ó��
			int a = input.nextInt();

			if (a > 0)
				System.out.println("����Դϴ�.");
			else if (a == 0)
				System.out.println("0�Դϴ�.");
			else if (a < 0)
				System.out.println("�����Դϴ�.");
			else
				System.out.println("����");
		} catch (InputMismatchException war) {
			System.err.println("����! ������ �ƴ� �Ǽ�/���ڸ� �Է��ϼ̱���: " + war);
			System.exit(1);
		}

	}

}
