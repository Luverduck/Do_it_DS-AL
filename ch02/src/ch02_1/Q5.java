package ch02_1;

import java.util.Scanner;

public class Q5 {

	// 배열 a에 배열 b의 모든 요소를 역순으로 복사
	static void rcopy(int[] a, int[] b) {
		
		// 복사할 횟수 (길이가 짧은 배열의 길이)
		int length = a.length <= b.length ? a.length : b.length;
		
		// 배열 복사
		for(int i = 0 ; i < length ; i ++) {
			a[i] = b[(b.length-1) - i];
		}
	}
	
	// 배열 복사 (역순)
	public static void main(String[] args) {

		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		
		// 배열 a 생성
		System.out.print("배열 a의 길이 : ");
		int[] a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		
		// 배열 b 생성
		System.out.print("배열 b의 길이 : ");
		int[] b = new int[sc.nextInt()];
		for(int i = 0 ; i < b.length ; i ++) {
			System.out.print("b["+i+"] : ");
			b[i] = sc.nextInt();
		}
		
		// 배열 복사
		rcopy(a, b);
		
		// 복사 후 배열 출력
		System.out.print("a[");
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("b[");
		for(int i = 0 ; i < b.length ; i ++) {
			System.out.print(" " + b[i] + " ");
		}
		System.out.println("]");
		
		sc.close();
	}
}
