//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A158 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k =in.nextInt();
		int arr[] = new int[1000];
		for(int i =0;i<n;i++){
			arr[i] = in.nextInt();
		}
		int c =0;
		int value = arr[k-1];
		for(int i =0;i<n;i++){
			if(arr[i]>=value && arr[i]>0){
				c++;
			}
		}
		System.out.println(c);
	}
}
