package ?Ӹ????Ҽ?;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
			String str="" ;
			String res="";

			while(!(str.equals("0"))) {
				str = scan.nextLine();
				String reverse = new StringBuffer(str).reverse().toString();
				
				if(str.equals("0")) continue;
				else if(str.equals(reverse)) res+="yes\n";		
				else res+="no\n";
				
			}
		
		
			System.out.println(res);
		
		
	
		
	}

}
