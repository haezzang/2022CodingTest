package ��ҹ��ڹٲٱ�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		
		String s=scan.nextLine(); //���ڿ� �Է¹ޱ�
		String res=""; //����� ����
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)<91) //�빮������ Ȯ��
			res+=s.toLowerCase().charAt(i);
			
			else res+=s.toUpperCase().charAt(i); 
		}
		
		System.out.println(res);
	}

}
