//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A431 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] values = new int[1000];

		for (int i = 0; i < 4 ; i++){
			values[i] = in.nextInt();

	}
		in.nextLine();
		String str = in.nextLine();
		int c =0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i)-'0';
			if(val == 1){
				c+=values[0];
			}
			else if(val == 2){
				c+=values[1];
			}
			else if(val == 3){
				c+=values[2];
			}
			else {
				c+=values[3];
			}

		}
		System.out.println(c);
	}
}
