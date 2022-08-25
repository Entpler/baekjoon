package baekjoon;
//더하기 사이클
//주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 
//각 자리의 숫자를 더한다.
//그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램
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
		//1.M = A를 10으로 나눈 몫  : (A/10) 
				//2.N =A를 10으로 나눈 나머지 : (A%10)
				//3.M+N = (A/10) + (A%10)
				//S = (M+N)을 10으로 나눈 나머지 : ((A/10) + (A%10)) %10 
				//D = N 곱하기 10  : (A%10) * 10 
		System.out.println(i);

	
	}
}
