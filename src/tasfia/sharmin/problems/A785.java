//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A785 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int c = 0;
		in.nextLine();
		for (int i = 0; i < v; i++) {
			String s1 = in.nextLine();
			if (s1.charAt(0) == 'T') {
				c += 4;
			} else if (s1.charAt(0) == 'C') {
				c += 6;
			} else if (s1.charAt(0) == 'I') {
				c += 20;
			} else if (s1.charAt(0) == 'O') {
				c += 8;
			} else {
				c += 12;
			}
		}
		System.out.println(c);
	}
}
