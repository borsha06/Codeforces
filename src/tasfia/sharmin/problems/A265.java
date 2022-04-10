package tasfia.sharmin.problems;

import java.util.Scanner;

public class A265 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		int c =1;
		for(int i=0; i<s2.length();i++)
		{
			if(s2.charAt(i)== s1.charAt(i)){
				c++;
			}
		}

		System.out.println(c);
	}
}
