package ch02_1;

import java.util.Scanner;

public class Q7 {

	// 기수 변환 (과정 출력)
	static int cardConv(int x, int r, char[] d) {
		// 변환표
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// 변환 전 숫자의 자릿수
		int n = ((Integer)x).toString().length();
		
		// 자릿수 초기화
		int digits = 0;
		
		// 기수 변환
		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do {
			// 나눗셈 경계 출력
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();
			
			// 나누는 과정 출력
			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    ... %%d\n", n), x / r, x % r);
			
			// 기수 변환
			d[digits] = dchar.charAt(x % r);
			x /= r;
			digits ++;
		} while(x != 0);
		
		// 각 자릿수의 값을 저장한 배열의 요소를 역순으로 정렬
		for(int i = 0 ; i < digits ; i ++) {
			char temp = d[i];
			d[i] = d[(digits-1) - i];
			d[(digits-1) - i] = temp;
		}
		
		return digits;
	}
	
	// 기수 변환
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		
		// 입력 변수
		int x;
		int r; 
		char[] d = new char[32];
		int digits;
		int retry;
		
		System.out.println("10진수를 기수로 변환합니다.");
				
		do {
			// 변환할 숫자
			do {
				System.out.print("변환하려는 음이 아닌 정수 : ");
				x = sc.nextInt();
			} while(x < 0);
			
			// 기수
			do {
				System.out.print("어떤 진수로 변환할까요?(2-36) : ");
				r = sc.nextInt();
			} while(r < 0);
			
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
