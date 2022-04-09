//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A112 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String st1 = in.nextLine();
		String st2 = in.nextLine();
		int first =0, second=0, e=0;
		for(int i=0;i<st1.length();i++){
			st1 = st1.toLowerCase();
			st2 = st2.toLowerCase();
			int n1 = st1.charAt(i);
			int n2 = st2.charAt(i);

			if(n1==n2){
				e++;
			}
			else if(n1<n2){
				first++;
			}
			else {
				second++;
			}
		}
		if(e==st1.length()){
			System.out.println(0);
		}
		else if(first < second){

			System.out.println(-1);
		}
		else{
			System.out.println(1);
		}

	}
}
