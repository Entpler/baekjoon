package baekjoon;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		// ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����.
		// ù° �ٿ� �ܾ��� ������ ����Ѵ�.
		
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

