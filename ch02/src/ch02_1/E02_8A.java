package ch02_1;

import java.util.Scanner;

public class E02_8A {
	
	// 입력받은 10진수 x를 r진수로 변환한 값의 자릿수 구하기
	static int cardConv(int x, int r, char[] d) {
		
		// 36진법까지의 변환표 문자열
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// 변환 후 자릿수
		int digits = 0;
		
		// r진법 변환 - 낮은 자릿수의 숫자부터 순차적으로 저장
		do {
			// x를 r로 나눈 나머지가 해당 자릿수의 값이 된다
			d[digits] = dchar.charAt(x % r);
			// 자릿수 증가
			digits ++;
			// 다음 자릿수의 값 연산을 위해 x를 r로 나눈 몫을 x에 저장한다
			x /= r;
		} while(x != 0); // x가 0이 될때까지 반복한다
		
		// 배열의 요소를 역순으로 정렬 
		// - r진법으로 변환할 때 낮은 자릿수의 숫자부터 저장되어 있으므로
		for(int i = 0 ; i < digits/2 ; i ++) {
			char temp = d[i];
			d[i] = d[(digits - 1) - i];
			d[(digits - 1) - i] = temp;
		}
		
		// x가 0이 될 때의 digits(자릿수)를 반환한다
		return digits;
	}
	
	// 기수 변환
	public static void main(String[] args) {
		
		// 입력 변수
		int x;						// 변환할 10진수
		int r;						// 기수
		int digits;					// 변환한 수의 자릿수
		char[] d = new char[32];	// 변환한 수의 각 자릿수를 저장하는 배열
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		// 변환할 10진수 입력 (양수)
		do {
			System.out.print("입력값 : "); x = sc.nextInt();
		} while(x < 0);
		
		// 변환에 사용할 기수 입력 (양수)
		do {
			System.out.print("기수(2~36) : "); r = sc.nextInt();
		} while(r < 0);
		
		// 기수 변환
		System.out.println(x +"를 "+ r + "진수로 변환합니다.");
		digits = cardConv(x, r, d);
		
		// 변환한 값 출력
		System.out.print("변환한 값 : ");
		for(int i = 0 ; i < digits ; i ++) {
			System.out.print(d[i]);
		}
		System.out.println();
		
		// 변환한 값의 자릿수 출력
		System.out.println("변환한 값의 자릿수 : " + digits);
		
		sc.close();
	}
}
