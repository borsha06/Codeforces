//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A791 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = 0;
		int c=0;
		int a = in.nextInt();
		int b = in.nextInt();

		while(true){
			a = a*3;
			b = b*2;

			if(a <= b){
				cnt++;
			}
			else {
				cnt++;
				break;
			}

		}
		System.out.println(cnt);


	}

}
