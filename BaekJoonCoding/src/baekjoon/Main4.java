package baekjoon;
//�μ��� ���� ���ϴ� ����

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//������ ũ��
		
		
		int[] arr = new int[n]; //������ ���� �迭���� 
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();//�迭�� n����ŭ �� �ֱ�
		}

		int x = in.nextInt();// �μ��� ���� �� ����
		int lt = n - 1; //������ ���� (������) =�迭����-1
		int rt = 0, count = 0;

		Arrays.sort(arr); //�������� ����

		while (rt < lt) { 
			int sum = arr[rt++] + arr[lt--];//�հ�� �տ��������ϰ� �ڿ��� �����ؼ�
			if (sum == x) { //x�� ��ġ�ϸ� count++
				count++;
			} else if (sum > x) { //sum�� x���� ũ�� ���� �����͸� �ø���. 
				rt--;
			} else {
				lt++; //sum�� x���� ������ ���� �����͸� ���δ�.
			}
		}

		System.out.println(count);

	}
}
