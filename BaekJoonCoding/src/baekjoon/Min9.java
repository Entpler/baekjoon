package baekjoon;

import java.util.Scanner; //사분면 고르기

public class Min9 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
        
		if(A>0 && B>0) System.out.println(1);
		else if(A>0 && B<0) System.out.println(4);
		else if(A<0 && B>0) System.out.println(2);
		else if(A<0 && B<0) System.out.println(3);
 
	}
 
}

