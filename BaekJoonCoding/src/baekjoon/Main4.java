package baekjoon;
//두수의 합을 구하는 문제

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//수열의 크기
		
		
		int[] arr = new int[n]; //수열을 담을 배열선언 
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();//배열에 n개만큼 값 넣기
		}

		int x = in.nextInt();// 두수의 합이 될 숫자
		int lt = n - 1; //포인터 선언 (마지막) =배열길이-1
		int rt = 0, count = 0;

		Arrays.sort(arr); //오름차순 정렬

		while (rt < lt) { 
			int sum = arr[rt++] + arr[lt--];//합계는 앞에서증가하고 뒤에서 감소해서
			if (sum == x) { //x와 일치하면 count++
				count++;
			} else if (sum > x) { //sum이 x보다 크면 앞의 포인터를 늘린다. 
				rt--;
			} else {
				lt++; //sum이 x보다 작으면 앞의 포인터를 줄인다.
			}
		}

		System.out.println(count);

	}
}
