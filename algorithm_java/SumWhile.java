//1���� n������ ���� ���϶�
package chap01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���Ͻÿ�");
		System.out.print("n : ");
		//� �����ΰ�?
		try {

			//�Է°� a
			int a = input.nextInt();

			//�հ�
			int sum = 0;
			int i = 1;
			
			//�ٸ����� �Է�
			if (a < 0)
				System.out.println("�ٽ��Է��ϼ���");
			else if (a == 0)
				System.out.println("0�Դϴ�.");

			//�հ�
			while (i <= a) {
				sum += i;
				i++;
			}

			//���
			System.out.println("1���� " + a + "������ ����" + sum + "�Դϴ�.");
			
			//��������
		} catch (InputMismatchException war) {
			System.err.println("����! ������ �ƴ� �Ǽ�/���ڸ� �Է��ϼ̱���: " + war);
			System.exit(1);
		}
	}

}
