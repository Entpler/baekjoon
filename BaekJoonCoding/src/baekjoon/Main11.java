package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main11 {

	// N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
	//시간초과 나느 코드.
	//ArrayList 를 이용해서 이중 for 문으로 풀어보기.
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //N개의 정수

		ArrayList<Integer> arr = new ArrayList<>();//ArrayList 선언
		ArrayList<Integer> arr2 = new ArrayList<>();//두번째 ArrayList 선언

		for (int i = 0; i < N; i++) {
			int e = in.nextInt();
			arr.add(e); //ArrayList에 정수담기
		}

		int M = in.nextInt();
		for (int i = 0; i < N; i++) {
			int e = in.nextInt();
			arr2.add(e);    //두번쨰 ArrayList에 정수담기
		}
		int count = 0;
		for(Integer x: arr2 ) { //arr2. 가 순회
			if(arr.contains(x)) //arr이 x를 포함하면 count는 1
				count = 1;
			else
		    count = 0; //포함하지 않으면 count 는 0
		System.out.println(count); // 결과 1 1 0 0 1 => 답은 맞으나 시간초과가 나서 이진탐색을 이용해서 풀어야 한다.
		}
	}
}
