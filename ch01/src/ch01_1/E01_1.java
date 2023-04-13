package ch01_1;

import java.util.Scanner;
 
public class E01_1 {

	public static void main(String[] args) {
		
		// 3개의 정수 중 최대값 찾기
		// 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 값 : "); int a = sc.nextInt();
		System.out.println("b의 값 : "); int b = sc.nextInt();
		System.out.println("c의 값 : "); int c = sc.nextInt();
		
		// a를 최대값이라고 가정
		int max = a;
		if(b > max) max = b; // 현재 최대값보다 b가 더 크면 최대값을 b로 변경
		if(c > max) max = c; // 현재 최대값보다 c가 더 크면 최대값을 c로 변경
		 
		System.out.println("최대값은 " + max + "입니다.");
		
		sc.close();
	}
}
