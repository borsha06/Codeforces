package tasfia.sharmin.problems;

import java.util.Scanner;

public class A427 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] values = new int[1000];
		for (int i = 0; i < n ; i++){
			values[i] = in.nextInt();
		}
		int c =0;
		for (int i = 0; i < n ; i++){
			if(values[i] > 0){
				c++;
			}
			else {
				for(int j =0 ;j< values[i];j++){
					if(values[j+i] >0){
						break;
					}
					else{
						i++;
					}

				}
			}
		}
		System.out.println(c);

	}
}
