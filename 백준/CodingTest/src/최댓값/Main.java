package 최댓값;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[9][9];
		int x = 0, y = 0;
		// 입력받기
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int max = arr[0][0];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					x = i+1;
					y = j+1;
				}

			}
		}

		System.out.println(max);
		System.out.println(x + " " + y);

	}

}
