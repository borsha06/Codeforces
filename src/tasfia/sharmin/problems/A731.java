//package tasfia.sharmin.problems;

import java.util.Scanner;

import static java.lang.Math.abs;

public class A731 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count = 0;
		int start, step;
		start = 97;
		for (int i = 0; i < str.length(); i++) {
			int current = str.charAt(i);
			step = (abs(current - start));
			if (step <= 13) {
				count += step;
			} else {
				count += abs(step - 26);
			}
			start = current;
		}
		System.out.println(count);
	}
}
