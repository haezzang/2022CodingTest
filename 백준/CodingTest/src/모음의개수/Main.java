package 모음의개수;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		String str="" ;

	
		int cnt=0;
		while(true)  {
			str = scan.nextLine();
		
			for(int i=0; i<str.length(); i++) {
				char s=str.toLowerCase().charAt(i); //문자열을 모두 소문자로 변환
				if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u')  //모음 판단
				cnt++;		
			}
			
			if(str.equals("#")) break; //그만 입력받기 
			
			System.out.println(cnt);
			cnt=0; //초기화
		}
	
	
		

	}

}
