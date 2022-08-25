package baekjoon;

//알파벳 대소문자로 된 단어가 주어지면,이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toUpperCase(); // 알파벳을 모두 대문자로 변환

		int count = 0;
		int[] abc = new int[26];
		int max = -1; //최대값 초기화
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			for (char x : str.toCharArray()) {
				if (x == i+65) {//대문자 A: 65 문자에 d알페벳이 포함되어있으면 
					abc[i]++;//배열에 str에서 받은 알파벳의 수 저장

				}
			}
		}

			for (int j = 0; j < 26; j++) {
				if (abc[j] > max) {
					max = abc[j];
					ch = (char) (j + 65);
				} else if (abc[j] == max) {//가장 많이 나온 문자 찾기
					ch = '?';
				}
			}
			System.out.println(ch);

		}

	}