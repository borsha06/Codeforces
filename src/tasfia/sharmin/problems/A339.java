//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A339 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int arr[] = new int[100];
		str = str.replaceAll("[+]", "");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				arr[i] = str.charAt(i) - '0';
			}
		}
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1) {
				System.out.print(arr[i] + "+");
			} else {
				System.out.print(arr[i]);
				System.out.print("\n");
			}
		}
	}
}
