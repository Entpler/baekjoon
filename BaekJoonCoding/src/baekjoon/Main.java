package baekjoon; //시험성적을 구하는 조건문 



import java.util.Scanner;

public class Main {
	
	
	 
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int score = in.nextInt();
					
			in.close();
	        
			if(score>=90 && score<=100) 
			System.out.println("A");
			else if(score>=80 && score<=89)
				System.out.println("B");
			else if(score>=70 && score<=79)
				System.out.println("C");
			else if(score>=60 && score<=69)
				System.out.println("D");
			else{
				System.out.println("F");
			}
		}
	 
	}