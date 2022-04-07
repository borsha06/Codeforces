//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A405 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10000];
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if(i<n-1){
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.print(arr[i]);
				System.out.print("\n");
			}


		}
	}
}
