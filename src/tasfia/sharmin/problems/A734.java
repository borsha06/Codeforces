//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A734 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		in.nextLine();
		int anton = 0;
		int danik = 0;
		String str = in.nextLine();
		for (int i =0; i<str.length();i++){
			if(str.charAt(i) == 'A'){
				anton++;
			}
			else {
				danik++;
			}
		}
		if(anton > danik){
			System.out.println("Anton");
		}
		else if(anton < danik){
			System.out.println("Danik");
		}
		else {
			System.out.println("Friendship");
		}
	}
}
