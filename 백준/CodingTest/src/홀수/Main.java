package È¦¼ö;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] num = new int[7];
		int sum = 0;
		int min=101;

		for (int i = 0; i < num.length; i++) {
			num[i] = 0;
		}

		for (int i = 0; i < 7; i++) {
			int a = scan.nextInt();

			if (a % 2 == 1) {
				num[i] = a;
				sum += a;
				
				if(min>a) min=a;
			}
		}


		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
			
		}

	}

}
