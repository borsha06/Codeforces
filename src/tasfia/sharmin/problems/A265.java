//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A265 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		int j = 0;
		char current = s1.charAt(j);
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == current) {
				j++;
				current = s1.charAt(j);
			}
		}
		System.out.println(j + 1);
	}
}
