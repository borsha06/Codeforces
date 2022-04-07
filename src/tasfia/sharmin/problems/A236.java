//package tasfia.sharmin.problems;

import java.util.*;

public class A236 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Set<Character> chars = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			chars.add(str.charAt(i));
		}
		int value = chars.size();
		if (value % 2 == 0) {

			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}

	}
}
