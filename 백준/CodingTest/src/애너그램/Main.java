package ?ֳʱ׷?;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		String answer="";
		while (i != 0) {
			String a1 = scan.next();
			String a2 = scan.next();

			char[] arr1 = new char[a1.length()];
			char[] arr2 = new char[a2.length()];

			for (int j = 0; j < a1.length(); j++) {
				arr1[j] = a1.charAt(j);
			
			}
			
			for (int j = 0;  j<a2.length(); j++) {
				arr2[j] = a2.charAt(j);

			}

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			String res1 = "";
			String res2 = "";
			
			
			for (int j = 0; j < a1.length(); j++) {
				res1 += arr1[j];
			}
			
			for (int j = 0; j < a2.length(); j++) {
				res2 += arr2[j];
			}
		
			
			if(res1.equals(res2)) answer+=a1+" & "+a2+" are anagrams.";
			else answer+=a1+" & "+a2+" are NOT anagrams.";
			
			answer+="\n";

			i--;
	
		}
		System.out.println(answer);
	}

}
