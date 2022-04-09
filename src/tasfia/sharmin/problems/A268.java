//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A268 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		int a1[] = new int[1000];
		int a2[] = new int[1000];
		for (int i = 0; i < value; i++) {
			a1[i] = in.nextInt();
			a2[i] = in.nextInt();
		}
		int c = 0;
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				if (i == j) {
					continue;
				}
				if (a1[i] == a2[j]) {
					c++;

				}
			}
		}
		System.out.println(c);
	}
}
