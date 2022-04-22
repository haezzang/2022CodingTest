package 숫자의개수;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] count = new int[10]; // 숫자담기

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		String str=Integer.toString(a*b*c);

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - '0']++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}

	}

}
