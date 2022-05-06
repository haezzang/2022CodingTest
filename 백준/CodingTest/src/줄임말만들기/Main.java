package 줄임말만들기;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String res = "";
		String input = scan.nextLine();

		StringTokenizer st = new StringTokenizer(input);
		
		int i=0;
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			
			if (word.equals("i") || word.equals("pa") || word.equals("te") || word.equals("ni") || word.equals("niti")
					|| word.equals("a") || word.equals("ali") || word.equals("nego") || word.equals("no")
					|| word.equals("ili")) {
				if(i==0) {
					res +=  word.toUpperCase().charAt(0);
				}
				continue;
			}

			else {
		
				res +=  word.toUpperCase().charAt(0);
			}
			i++;
		}
		System.out.println(res);

	}

}
