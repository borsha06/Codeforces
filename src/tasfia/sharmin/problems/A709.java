//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A709 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long b = in.nextLong();
		long d = in.nextLong();
		long v;
		long c = 0L, c2 = 0L;
		for (int i = 0; i < n; i++) {
			v = in.nextLong();
			if (v <= b) {
				c += v;
				if (c > d) {
					c = 0;
					c2++;
				}
			}
		}
		System.out.println(c2);
	}
}
