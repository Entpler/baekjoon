package baekjoon;

import java.util.Scanner;
//a,b,c �� �־����� �� ���ͺб����� ���ϴ� ���α׷�(�������, �������, �Ѻ��)
public class BEP {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long FC = in.nextLong(); //������ Fixed Cost
		long VC = in.nextLong();  //������ 
		long C = in.nextLong(); //���
		
		if(VC>=C) { //������ > ���
			System.out.println(-1); //-1 ���
		}else {
		System.out.println((FC/(C-VC))+1); //���ͺб��� ��� 
	}

}
}

