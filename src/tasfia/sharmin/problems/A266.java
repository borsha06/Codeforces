//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A266 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String str = in.nextLine();
		int c = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				c++;
			}
		}
		System.out.println(c);
	}
}
