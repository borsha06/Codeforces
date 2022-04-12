//package tasfia.sharmin.problems;

import java.util.*;

public class A520 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Character> v =  new HashSet<Character>();
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		s = s.toLowerCase();
		for(int i =0;i<n;i++){
			v.add(s.charAt(i));
		}
		if(v.size() == 26){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
}
