//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A231 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int j = in.nextInt();
			int k = in.nextInt();
			int l = in.nextInt();
			if(j == 1 && k==1 || k== 1 && l==1 || l==1 && j ==1){
				cnt++;
			}
			else if(j == 1 && k==1 && l ==1){
				cnt++;
			}

		}
		System.out.println(cnt);

	}
}
