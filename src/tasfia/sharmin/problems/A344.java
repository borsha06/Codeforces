//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[100000];
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			arr [i] = in.nextInt();
		}
		int c =1;
		for(int i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1]){
				c++;
			}
		}
		System.out.println(c);

	}
}
