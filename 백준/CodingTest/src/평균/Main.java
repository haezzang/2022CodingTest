package ????;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] s = new int[n];
		
		double avg = 0;
		double max = 0;
		
		for (int i = 0; i < n; i++) {
			int score = scan.nextInt();
			s[i] = score;
			
			if (max < s[i])
				max = s[i];
		}


		for (int i = 0; i < n; i++) {
			avg += (double) ((s[i] / max) * 100);
		}
		

		System.out.println(avg/n);

	

	}

}
