//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();

		String s3 ="";
		for(int i=s2.length()-1;i>=0;i--){
			s3+=(s2.charAt(i));
		}

		if(s1.equals(s3)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
