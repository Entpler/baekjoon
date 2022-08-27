package baekjoon;
import java.util.Scanner;
public class Main7 {



		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int N = in.nextInt();
			in.nextLine();
			String str = in.nextLine();
			int sum = 0;
			for (char x : str.toCharArray()) {
				x -= 48;
				sum += x;
			}
			System.out.println(sum);

		}
	}
}
