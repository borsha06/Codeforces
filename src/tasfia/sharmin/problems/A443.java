//package tasfia.sharmin.problems;

import java.util.*;

public class A443 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Character> chars = new HashSet<Character>();
		String str = in.nextLine();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) >='a' && str.charAt(i)<='z'){
				chars.add(str.charAt(i));
			}
		}
		System.out.println(chars.size());
	}
}
