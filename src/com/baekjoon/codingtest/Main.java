package com.baekjoon.codingtest;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt(); //Scanner�� �̿��ؼ� ���� A ����
		int N = A; //int N�� ���� A�� �ʱ�ȭ 
		int i = 0;
		
		// A�� ���� N�� �������� ���߰� while���� �ݾ��ص� i �� ���
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

