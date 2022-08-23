package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<>(); //카드를 담을 Hashset선언

		int N = in.nextInt(); //상근이가 가지고 있는  카드의 개수 
		in.nextLine();

		for (int i = 0; i < N; i++) {
			int a = in.nextInt(); //카드의 개수를 HashSet에 담기
			hs.add(a);
		}
		int M = in.nextInt(); //주어진 카드의 개수

		int[] arr = new int[M]; //출력할 배열(주어진카드에 상근이가 가진 카드가 일치하면 1, 그렇지 않으면 0 )
		
		for (int i = 0; i < M; i++) {
			int temp = in.nextInt();//카드입력
			if (hs.contains(temp)) { //HashSet 이 카드를 포함하고 있으면
				arr[i] = 1; // 배열의 원소는 1, 나머지는 초기화 되어있으므로 0

			}
		}

		for (int i = 0; i < M; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
