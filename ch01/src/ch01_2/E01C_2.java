package ch01_2;

import java.util.Scanner;

public class E01C_2 {
 
	// 2자리 양수만 입력받기
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		int input;
		
		// 판정
		do {
			System.out.print("입력 : ");
			input = sc.nextInt();
		} while(input < 10 || input > 100); // () 안이 false가 될 때 반복문 탈출
		
		// 입력값이 10~99 사이일 때 출력
		System.out.println("변수 input의 값은 " + input + "이 되었습니다.");
		
		sc.close();
	}
}
