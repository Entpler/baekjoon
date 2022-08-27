package baekjoon;

import java.util.Scanner;

public class Main8 {
	
	
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		for (int i = 1; i <= N; i++) {
			int s = in.nextInt();
			int j = in.nextInt();

			System.out.println("Case #" + i + ":"+" " +(s + j));
		}

		in.close();
	}
}


}
