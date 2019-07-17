package chap01;
// °ö¼ÀÇ¥¸¦ Ãâ·ÂÇÕ´Ï´Ù.

import java.util.Scanner;

public class Chap0108 {
	public static void main(String[] args) {
		System.out.println("----- °ö¼ÀÇ¥ -----");

		Scanner input = new Scanner(System.in);

		int n;

		System.out.println("ÀÌµîº¯ »ï°¢Çü");

		do {
			System.out.print("¸î´ÜÀÌ°í?");
			n = input.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();

		}
	}
}