//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A118 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		s1 = s1.toLowerCase();
		String s2="";
		s1 =  s1.replaceAll("[aeiouy]","");
		for(int i=0;i<s1.length();i++){
			s2+="."+s1.charAt(i);
		}
		System.out.println(s2);
	}
}
