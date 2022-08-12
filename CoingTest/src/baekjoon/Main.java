package baekjoon;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // 정수입력
		int count = 99; // 1~99 까지는 무조건 1씩 차이나는 등차수열

		if (N < 100) { // N이 100보다 작을때
			System.out.println(N); // N자체로 한수
		} else if (N >= 100 && N <= 1000) { // N이 100~1000사이일때,
			for (int i = 100; i <= N; i++) {
				if (((i / 10) % 10 - i / 100 == ((i % 100) % 10 - (i / 10) % 10))) {
					count++; // (10의자리수-100의자리수)=(1의자리수-10의자리수)가 일치할때
				} // 100의자리: (i/100)
					// 10의자리: (i/10)%10
					// 1의 자리: (i/100)%100
			}
			System.out.println(count);
		}

	}
}
