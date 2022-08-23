package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<>(); //ī�带 ���� Hashset����

		int N = in.nextInt(); //����̰� ������ �ִ�  ī���� ���� 
		in.nextLine();

		for (int i = 0; i < N; i++) {
			int a = in.nextInt(); //ī���� ������ HashSet�� ���
			hs.add(a);
		}
		int M = in.nextInt(); //�־��� ī���� ����

		int[] arr = new int[M]; //����� �迭(�־���ī�忡 ����̰� ���� ī�尡 ��ġ�ϸ� 1, �׷��� ������ 0 )
		
		for (int i = 0; i < M; i++) {
			int temp = in.nextInt();//ī���Է�
			if (hs.contains(temp)) { //HashSet �� ī�带 �����ϰ� ������
				arr[i] = 1; // �迭�� ���Ҵ� 1, �������� �ʱ�ȭ �Ǿ������Ƿ� 0

			}
		}

		for (int i = 0; i < M; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
