package baekjoon;

import java.util.Scanner;
//a,b,c 가 주어졌을 때 손익분기점을 구하는 프로그램(고정비용, 가변비용, 총비용)
public class BEP {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long FC = in.nextLong(); //고정비 Fixed Cost
		long VC = in.nextLong();  //변동비 
		long C = in.nextLong(); //비용
		
		if(VC>=C) { //변동비 > 비용
			System.out.println(-1); //-1 출력
		}else {
		System.out.println((FC/(C-VC))+1); //손익분기점 출력 
	}

}
}

