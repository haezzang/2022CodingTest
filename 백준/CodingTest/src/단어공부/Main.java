package 단어공부;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] count = new int[26]; // 알파벳 담아줄 배열

	
			String str = scan.nextLine();
			str=str.toUpperCase();
			

			for (int i = 0; i < str.length(); i++) {
					count[str.charAt(i) - 'A']++;	
		}

		int i = 1; // 반복문 인덱스
		int key = 0; // 알파벳 인덱스
		int max = count[0]; // 최댓값
		char res; // 결과값

		// 최댓값 구하기
		for (i = 1; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				key = i;
			}
		}
		res=(char)(key + 'A');
		// 처음 최댓값 구하기


		// 최댓값이 여러개이면..
		for (i = 1; i < count.length; i++) {
			if (key == i)
				continue;

			else if (max == count[i]) {
				res='?';

			}
		}

		System.out.println(res);

	}

}
