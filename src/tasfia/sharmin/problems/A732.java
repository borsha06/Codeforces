//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A732 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int price = in.nextInt();
		int coin = in.nextInt();
		int value=0;
		int i = 0;
		while(true){
			i++;
			value = price*i;
			if(value%10 == coin || value %10 ==0){
				break;
			}
		}
		System.out.println(i);
	}
}
