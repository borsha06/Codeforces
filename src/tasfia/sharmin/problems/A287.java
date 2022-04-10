//package tasfia.sharmin.problems;

import java.util.Scanner;

public class A287 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] a = new char[10][10];
		for (int i = 0; i < 4; i++) {

			String data = "";
			if (in.hasNext()) { // input from user
				data = in.next();
			} else {
				break;
			}
			for (int j = 0; j < 4; j++) {
				a[i][j] = data.charAt(j);
			}
		}
		int c = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == '#') {
					if ((a[i][j + 1] == '#' && a[i + 1][j] == '.' && a[i + 1][j + 1] == '#') || (a[i][j + 1] == '#' && a[i + 1][j] == '#' && a[i + 1][j + 1] == '#') || (a[i][j + 1] == '.' && a[i + 1][j] == '#' && a[i + 1][j + 1] == '#') || (a[i][j + 1] == '#' && a[i + 1][j] == '#' && a[i + 1][j + 1] == '.')|| (a[i][j + 1] == '.' && a[i + 1][j] == '.' && a[i + 1][j + 1] == '.') ) {
						c++;
						break;
					}
				} else if (a[i][j] == '.') {
					if ((a[i][j + 1] == '#' && a[i + 1][j] == '.' && a[i + 1][j + 1] == '.') || (a[i][j + 1] == '.' && a[i + 1][j] == '#' && a[i + 1][j + 1] == '.') || (a[i][j + 1] == '.' && a[i + 1][j] == '.' && a[i + 1][j + 1] == '#') || (a[i][j + 1] == '.' && a[i + 1][j] == '.' && a[i + 1][j + 1] == '.')|| (a[i][j + 1] == '#' && a[i + 1][j] == '#' && a[i + 1][j + 1] == '#')) {
						c++;
						break;
					}

				}
			}

		}
		if (c >= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}