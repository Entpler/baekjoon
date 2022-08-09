package com.lnflearn.codingtestString;

import java.util.Scanner;

class Main2 {
	public String solution(String str) { //함수는 String 타입

		
		String answer = ""; // answer 에 빈 값 넣어주기
		
		for (int i = 0; i < str.length(); i++) {
			char num = str.charAt(i); // num이라는 변수에 str의 한글자씩 검사하겠다.
			//여기서 i++을 또 해버리면 값이 이상하게 나옴...주의!!! 
			if(Character.isUpperCase(num)) {// num == 즉 str의 한 글자 검사했을때 대문자일 경우
			answer += Character.toLowerCase(num); // answer를 소문자로 변환한다.
			} else
			answer += Character.toUpperCase(num); // answer를 대문자로 변환한다
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
//				 //아스키 코드에서 대문자일 경우
//				}if(x>=97 && x<=122)
//					answer +=(char)(x-32);//소문자가 대문자로 변환
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
