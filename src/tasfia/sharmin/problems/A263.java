//package tasfia.sharmin.problems;

import java.util.Scanner;

import static java.lang.Math.abs;

public class A263 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = 0, l = 0;
		int arr[][] = new int[10][10];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = in.nextInt();
				if (arr[i][j] == 1) {
					k = i;
					l = j;
					break;
				}
			}
		}
		System.out.println(abs(2 - k) + abs(2 - l));
	}
}
