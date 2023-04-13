package ch02_1;

import java.util.Scanner;

public class E02_8A {
	
	// 입력한 정수 x를 r진수로 변환할 때 자릿수
	static int cardConv(int x, int r, char[] d) {
		// 입력한 정수 x를 r진수로 변환하여 배열 d에 아랫 자리부터 넣어두고 자릿수 변환
		
		// 36진법까지의 변환표 문자열
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// 자릿수 초기화
		int digits = 0;
		
		// 진법 변환 - 아랫 자리부터
		do {
			// 자릿수 증가
			digits ++;
			// x를 r로 나눈 나머지가 해당 자릿수의 값이 된다
			d[digits] = dchar.charAt(x % r);
			// 다음 자릿수의 값 연산을 위해 x를 r로 나눈 몫을 x에 저장한다
			x = x / r;
		} while(x != 0); // x가 0이 될때까지 반복한다
		
		// x가 0이 될 때의 digits(자릿수)를 반환한다
		return digits;
	}
	
	// 기수 변환
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : "); int x = sc.nextInt();
		System.out.print("기수 : "); int r = sc.nextInt();
		
		// 기수 변환 후 자릿수 출력
		System.out.println("입력한 " + x + "를 " + r + "진법으로 변환할 때 변환값의 자릿수 : " + cardConv(x, r, null));
		
		sc.close();
	}
}
