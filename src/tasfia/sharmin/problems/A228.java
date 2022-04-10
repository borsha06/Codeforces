//package tasfia.sharmin.problems;

import java.util.*;

public class A228 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Integer> values = new HashSet<Integer>();
		for(int i=0; i<4; i++){
			int n = in.nextInt();
			values.add(n);
		}
		int size = values.size();
		System.out.println(4-size);
	}
}
