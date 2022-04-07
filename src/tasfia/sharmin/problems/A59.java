//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A59 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c1 = 0;
		int c2 = 0;
		String str = in.nextLine();
		for(int i =0;i<str.length();i++){
			if(str.charAt(i) >='a' && str.charAt(i) <= 'z'){
				c1++;
			}
			else{
				c2++;
			}
		}
		if(c1>=c2){
			System.out.println(str.toLowerCase());
		}
		else {
			System.out.println(str.toUpperCase());
		}
	}
}
