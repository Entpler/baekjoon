package baekjoon;

//���ĺ� ��ҹ��ڷ� �� �ܾ �־�����,�� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷�
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toUpperCase(); // ���ĺ��� ��� �빮�ڷ� ��ȯ

		int count = 0;
		int[] abc = new int[26];
		int max = -1; //�ִ밪 �ʱ�ȭ
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			for (char x : str.toCharArray()) {
				if (x == i+65) {//�빮�� A: 65 ���ڿ� d���亪�� ���ԵǾ������� 
					abc[i]++;//�迭�� str���� ���� ���ĺ��� �� ����

				}
			}
		}

			for (int j = 0; j < 26; j++) {
				if (abc[j] > max) {
					max = abc[j];
					ch = (char) (j + 65);
				} else if (abc[j] == max) {//���� ���� ���� ���� ã��
					ch = '?';
				}
			}
			System.out.println(ch);

		}

	}