//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A742 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long value = in.nextLong();
		if(value == 0){
			System.out.println(1);
		}
		else if(value%4 == 1){
			System.out.println(8);
		}
		else if(value%4 == 2){
			System.out.println(4);
		}
		else if(value%4 == 3){
			System.out.println(2);
		}
		else if(value%4 == 0){
			System.out.println(6);
		}
	}

}
