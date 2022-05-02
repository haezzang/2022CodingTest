package µÚÁıÈùµ¡¼À;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s1 = scan.next();

		String s2 = scan.next();


		int a = Integer.parseInt( new StringBuffer(s1).reverse().toString());
		int b = Integer.parseInt( new StringBuffer(s2).reverse().toString());
		
		String res=new StringBuffer( Integer.toString(a+b)).reverse().toString();
	

		System.out.println(Integer.parseInt(res));

	}

}
