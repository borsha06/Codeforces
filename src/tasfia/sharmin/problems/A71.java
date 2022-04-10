//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A71 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i =0;i<n;i++){
			String str = in.nextLine();
			if(str.length() <=10){
				System.out.println(str);
			}
			else{
				String newstr = str.substring(1,str.length()-1);
				System.out.println(str.substring(0,1)+newstr.length()+str.charAt(str.length()-1));
			}
		}
	}
}
