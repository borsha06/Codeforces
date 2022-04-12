//package tasfia.sharmin.problems;

import java.util.*;

public class A365 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = 0;
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n1; i++) {

			Set<Integer> value = new HashSet<Integer>();
			String v = in.nextLine();

			for (int j = 0; j < v.length(); j++) {
				if (v.charAt(j) - '0' <= n2 || v.charAt(j) - '0' == 0) {
					value.add(v.charAt(j) - '0');
				}

			}
			if (value.size()==n2+1) {
				c++;

			}
		}
		System.out.println(c);

	}
}
