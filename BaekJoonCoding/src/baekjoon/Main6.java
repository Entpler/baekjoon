package baekjoon;
//���ϱ� ����Ŭ
//�־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, 
//�� �ڸ��� ���ڸ� ���Ѵ�.
//�� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�.
//N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷�
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int N= A;
		int i =0;
		while(true) {
		A =	((A/ 10) + (A % 10))%10 + (A%10)*10 ; 
			i++;
			if(A==N) {
				break;
			}
			}
		//1.M = A�� 10���� ���� ��  : (A/10) 
				//2.N =A�� 10���� ���� ������ : (A%10)
				//3.M+N = (A/10) + (A%10)
				//S = (M+N)�� 10���� ���� ������ : ((A/10) + (A%10)) %10 
				//D = N ���ϱ� 10  : (A%10) * 10 
		System.out.println(i);

	
	}
}
