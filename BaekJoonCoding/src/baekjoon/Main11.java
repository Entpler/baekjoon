package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main11 {

	// N���� ���� A[1], A[2], ��, A[N]�� �־��� ���� ��, �� �ȿ� X��� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
	//�ð��ʰ� ���� �ڵ�.
	//ArrayList �� �̿��ؼ� ���� for ������ Ǯ���.
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //N���� ����

		ArrayList<Integer> arr = new ArrayList<>();//ArrayList ����
		ArrayList<Integer> arr2 = new ArrayList<>();//�ι�° ArrayList ����

		for (int i = 0; i < N; i++) {
			int e = in.nextInt();
			arr.add(e); //ArrayList�� �������
		}

		int M = in.nextInt();
		for (int i = 0; i < N; i++) {
			int e = in.nextInt();
			arr2.add(e);    //�ι��� ArrayList�� �������
		}
		int count = 0;
		for(Integer x: arr2 ) { //arr2. �� ��ȸ
			if(arr.contains(x)) //arr�� x�� �����ϸ� count�� 1
				count = 1;
			else
		    count = 0; //�������� ������ count �� 0
		System.out.println(count); // ��� 1 1 0 0 1 => ���� ������ �ð��ʰ��� ���� ����Ž���� �̿��ؼ� Ǯ��� �Ѵ�.
		}
	}
}
