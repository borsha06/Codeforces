//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A427 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] values = new int[100000];
		for (int i = 0; i < n; i++) {
			values[i] = in.nextInt();
		}
		int c = 0, p = 0;
		for (int i = 0; i < n; i++) {
			if (values[i] > 0) {
				c += values[i];

			} else {
				if (values[i] < 0 && c == 0) {
					p++;

				} else if (values[i] < 0 && c > 0) {
					c--;
				}
			}
		}
		System.out.println(p);

	}
}
