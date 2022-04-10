//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A686 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long n1 = in.nextLong();
		Long n2 = in.nextLong();
		in.nextLine();
		Long c = 0L;
		c += n2;
		int d = 0;
		for (int i = 0; i < n1; i++) {

			String ln = in.nextLine();

			ln = ln.replaceAll(" ", "");
			int v = Integer.parseInt(ln.substring(1));
			if (ln.charAt(0) == '+') {
				c += v;
			}
			else if((ln.charAt(0) == '-')) {

				if (v <= c) {
					c -= v;
				} else {
					d++;
				}
			}
		}
		System.out.println(c + " " + d);
	}
}