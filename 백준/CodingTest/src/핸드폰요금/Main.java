package 핸드폰요금;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		int sum=0;
		int Y=0;
		int M=0;
		while(i!=0) {
			int min=scan.nextInt();
			Y+=((min/30)+1)*10;
			M+=((min/60)+1)*15;
		
			i--;
		}
	
		if(Y>M) System.out.println("M "+ M);
		else if(Y<M) System.out.println("Y "+ Y);
		else System.out.println("Y M "+ M);

	}

}
