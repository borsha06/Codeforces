//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A474 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String chars = "qwertyuiopasdfghjkl;zxcvbnm,./";

		String st1 = in.nextLine();
		String st2 = in.nextLine();

		StringBuilder newstr = new StringBuilder();

		for (int i = 0; i < st2.length(); i++) {
			for (int j = 0; j < chars.length(); j++) {

				if (st2.charAt(i) == chars.charAt(j)) {
					if (st1.charAt(0) == 'R') {
						newstr.append(chars.charAt(j - 1));
					} else {
						newstr.append(chars.charAt(j + 1));
					}
				}
			}
		}
		System.out.println(newstr);
		
	}
}
			



