//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A677 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int c = 0;
		int n = in.nextInt();
		int h = in.nextInt();
		for(int i = 0; i < n; i++){
			int j = in.nextInt();
			if(j<=h){
				c+=1;
			}
			else {
				c+=2;
			}
		}
		System.out.println(c);
	}
}
