package baekjoon;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // �����Է�
		int count = 99; // 1~99 ������ ������ 1�� ���̳��� ��������

		if (N < 100) { // N�� 100���� ������
			System.out.println(N); // N��ü�� �Ѽ�
		} else if (N >= 100 && N <= 1000) { // N�� 100~1000�����϶�,
			for (int i = 100; i <= N; i++) {
				if (((i / 10) % 10 - i / 100 == ((i % 100) % 10 - (i / 10) % 10))) {
					count++; // (10���ڸ���-100���ڸ���)=(1���ڸ���-10���ڸ���)�� ��ġ�Ҷ�
				} // 100���ڸ�: (i/100)
					// 10���ڸ�: (i/10)%10
					// 1�� �ڸ�: (i/100)%100
			}
			System.out.println(count);
		}

	}
}
