package com.lnflearn.codingtestString;

import java.util.Scanner;

class Main2 {
	public String solution(String str) { //�Լ��� String Ÿ��

		
		String answer = ""; // answer �� �� �� �־��ֱ�
		
		for (int i = 0; i < str.length(); i++) {
			char num = str.charAt(i); // num�̶�� ������ str�� �ѱ��ھ� �˻��ϰڴ�.
			//���⼭ i++�� �� �ع����� ���� �̻��ϰ� ����...����!!! 
			if(Character.isUpperCase(num)) {// num == �� str�� �� ���� �˻������� �빮���� ���
			answer += Character.toLowerCase(num); // answer�� �ҹ��ڷ� ��ȯ�Ѵ�.
			} else
			answer += Character.toUpperCase(num); // answer�� �빮�ڷ� ��ȯ�Ѵ�
		}
		return answer;
	}
	
//		for (char x : str.toCharArray()) {
//		if(Character.isLowerCase(x)) {
//		answer += Character.toUpperCase(x);
//		}else 
//		answer += Character.toLowerCase(x);
//			}
//			return answer;
//		}
//		 for (char x : str.toCharArray()) {
//				if(Character.isLowerCase(x)) {
//				 //�ƽ�Ű �ڵ忡�� �빮���� ���
//				}if(x>=97 && x<=122)
//					answer +=(char)(x-32);//�ҹ��ڰ� �빮�ڷ� ��ȯ
//				else answer +=(char)(x+32);
//				}
//					return answer;
		 
	public static void main(String[] args) {

		Main2 a = new Main2();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(a.solution(str));

	}
}
