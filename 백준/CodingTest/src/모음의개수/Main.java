package �����ǰ���;

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
				char s=str.toLowerCase().charAt(i); //���ڿ��� ��� �ҹ��ڷ� ��ȯ
				if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u')  //���� �Ǵ�
				cnt++;		
			}
			
			if(str.equals("#")) break; //�׸� �Է¹ޱ� 
			
			System.out.println(cnt);
			cnt=0; //�ʱ�ȭ
		}
	
	
		

	}

}
