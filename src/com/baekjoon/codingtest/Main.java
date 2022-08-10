package com.baekjoon.codingtest;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt(); //Scanner를 이용해서 정수 A 대입
		int N = A; //int N의 값을 A로 초기화 
		int i = 0;
		
		// A의 값이 N과 같아지면 멈추고 while문을 닫아준뒤 i 를 출력
		while (true) {
			A = (A / 10) + (A % 10) % 10 + (A % 10) * 10;
			i++; 
			if (A == N) {
				break;
			}
		}
		System.out.println(i);
			
	}
}

