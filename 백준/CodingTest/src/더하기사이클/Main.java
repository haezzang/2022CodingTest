package 더하기사이클;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int copyNum=n;
		int cnt=0;
		while (true) {
			int left=n/10;
			int right=n%10;
			
			n=right*10+(left+right)%10;
			cnt++;
			
			if(n==copyNum) break;
		}
			
		System.out.println(cnt);
		
	
	}

}
