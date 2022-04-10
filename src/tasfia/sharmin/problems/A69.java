//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A69 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();


		int c =0,d =0,e=0;
		for(int i =0;i<n;i++){
			int j = in.nextInt();
			int k = in.nextInt();
			int l = in.nextInt();
			c+=j;
			d+=k;
			e+=l;

		}
		if(c==0 && d==0 && e ==0){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
