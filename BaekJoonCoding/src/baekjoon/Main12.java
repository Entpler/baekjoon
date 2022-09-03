package baekjoon;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
		// 첫째 줄에 단어의 개수를 출력한다.
		
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		String[] arr = str.split(" ");
		int count = 0;
	
		
			for (String x : arr) {
				int result = x.charAt(Integer.parseInt(x));
				if (result!=0 && x!=" ")
					count++;
				else if (result==0 && x!= " ")
					count++;
					count =count - result;
				
			}
			System.out.println(count);
		}

	}

