package ch01_2;

import java.util.Scanner;

public class Q09 {

	// 정수 a, b를 포함하여 그 사이에 있는 모든 정수의 합 구하기
	static int sumof(int a, int b) {
		// 정수의 대소 비교
		int min, max;
		if(a < b) {
			min = a; max = b;
		} else {
			min = b; max = a;
		}
		// 초기화
		int sum = 0;
		// 합계 반환
		for(int i = min ; i <= max ; i ++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("a : "); int a = sc.nextInt();
		System.out.print("b : "); int b = sc.nextInt();
		
		// 정수 a, b를 포함하여 그 사이에 있는 모든 정수의 합 반환
		System.out.print("합계 : " + sumof(a,b));
		
		sc.close();
	}
}
