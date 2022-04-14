//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A770 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String str = "",new_str="";
		int c =0;
		for(int i ='a';i<='z';i++){
			str+= (char)(i);
			c++;
			if(c==k){
				break;
			}
		}
		for(int i =0;i<n;i++){
			for(int j =0;j <str.length();j++){
				if(new_str.length()<n){
					new_str += str.charAt(j);
				}
				else {
					break;
				}
			}
		}
		System.out.println(new_str);
	}
}
