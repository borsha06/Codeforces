//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int yakko = in.nextInt();
		int wakko = in.nextInt();
		int cnt =0;
		int max = Math.max(yakko,wakko);
		for(int i = max;i<=6;i++ ){
			cnt++;
		}
		if(6%cnt == 0){
			System.out.println((cnt/cnt)+"/" +(6/cnt));
		}
		else if(cnt%2 == 0 && 6%2 ==0){
			System.out.println((cnt/2)+"/" +(6/2));
		}
		else if(6==cnt)
		{
			System.out.println(1+"/"+1);
		}
		else if(6%cnt != 0 && cnt%2 !=0){
			System.out.println(cnt+"/"+6);
		}
		else{
			System.out.println(0+"/"+1);
		}
	}
}
