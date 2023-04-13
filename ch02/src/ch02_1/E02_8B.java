package ch02_1;

import java.util.Scanner;

public class E02_8B {

	// 10진수 x를 r진수로 변환 후 자릿수 반환
	static int cardConv(int x, int r, char[] d) {
		// 변환표
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// 자릿수
		int digits = 0;
		
		// x를 r진수로 변환한 각 자릿수 변환 (아랫 자리수부터 순차적으로 저장)
		do {
			d[digits] = dchar.charAt(x % r);
			digits ++;
			x /= r;
		} while(x != 0);
		
		// 각 자릿수의 값을 저장한 배열의 요소를 역순으로 정렬
		for(int i = 0 ; i < digits ; i ++) {
			char temp = d[i];
			d[i] = d[(digits-1) - i];
			d[(digits-1) - i] = temp;
		}
		
		// 자릿수 반환
		return digits;
	}
	
	// 사용자로부터 받은 양수 x를 기수 변환
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		// 입력 변수
		int x;
		int r;
		int digits;
		char[] d = new char[32];
		int retry;
		
		do {
			// 1) 변환할 숫자
			do {
				System.out.print("입력 : ");
				x = sc.nextInt();
			} while(x < 0);	// 양수가 입력될 때까지 반복
			// 2) 변환에 사용할 기수
			do {
				System.out.print("기수 : ");
				r = sc.nextInt();
			} while(r < 0);	// 양수가 입력될 때까지 반복
			
			// 기수 변환
			digits = cardConv(x, r, d);
			
			// 변환된 숫자
			System.out.print("변환된 숫자 : ");
			for(int i = 0 ; i < digits ; i ++) {
				System.out.print(d[i]);
			}
			System.out.println();
			
			// 변환된 숫자의 자릿수
			System.out.println("변환된 숫자의 자릿수 : " + digits);
			
			// 재시도 여부
			System.out.print("한 번 더 할까요? (1.예 / 0.아니요) : ");
			retry = sc.nextInt();
		} while(retry == 1);	// 0(아니요)가 입력될 때까지 반복
		
		sc.close();
	}
}
