//package tasfia.sharmin.problems;

import java.util.*;

public class A469 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Integer> v = new HashSet<Integer>();
		int n = in.nextInt();
		int p = in.nextInt();
		for(int i =0;i<p;i++){
			int n1 = in.nextInt();
			v.add(n1);
		}
		int q = in.nextInt();
		for(int i =0;i<q;i++){
			int n1 = in.nextInt();
			v.add(n1);
		}
		if(v.size() == n){
			System.out.println("I become the guy.");
		}
		else{
			System.out.println("Oh, my keyboard!");
		}

	}
}
