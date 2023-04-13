package ch01_1;

import java.util.Scanner;

public class E01_3 {

	// 입력 정수값이 양수인지 음수인지 판정
	public static void main(String[] args) {
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		// 사용자 입력
		int input = sc.nextInt();
		// 부호 판정
		if(input > 0) {
			System.out.print("양수입니다");
		} else if(input < 0) {
			System.out.print("음수입니다");
		} else {
			System.out.print("0 입니다");
		}
		
		sc.close();
	}
}
