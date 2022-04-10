//package tasfia.sharmin.problems;

import java.util.*;

public class A136 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10000];
		int[] b = new int[10000];
		int p = in.nextInt();
		for(int i =1;i<=p;i++) {
			 a[i] = in.nextInt();
			 b[a[i]] = i;
		}
		for(int i =1;i<=p;i++) {
			b[a[i]] = i;
			if(i<p){
				System.out.print(b[i]+" ");
			}
			else{
				System.out.print(b[i]);
				System.out.println("\n");
			}

		}

	}
}
