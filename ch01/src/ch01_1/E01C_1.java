package ch01_1;

import java.util.Scanner;
 
public class E01C_1 {

	// 세 정수 중 중앙값 구하기 
	static int med3(int a, int b, int c) {	
		// * 결정 트리(decision tree)
		// a와 b의 관계를 먼저 가정한 후 c가 존재할 수 있는 자리로 경우를 나눈다
		// i) a가 b 이상인 경우
		if(a >= b)
			if(b >= c)	 	// a-b-c 순이 되며 중앙값 b를 반환
				return b;
			else if(c >= a) // c-a-b 순이 되며 중앙값 a를 반환
				return a;
			else 
				return c;	// a-c-b 순이 되며 중앙값 b를 반환
		// ii) a가 b 미만인 경우
		else if(a > c)		// b-a-c 순이 되며 중앙값 a를 반환
			return a;
		
		else if(b > c)		// b-c-a 순이 되며 중앙값 c를 반환
			return c;
		
		else
			return b;		// c-b-a 순이 되며 중앙값 b를 반환
	}
	
	public static void main(String[] args) {
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력 변수
		int a, b, c;
		
		// 사용자 입력
		System.out.print("a : "); a = sc.nextInt();
		System.out.print("b : "); b = sc.nextInt();
		System.out.print("c : "); c = sc.nextInt();
		
		// 중앙값 출력
		System.out.print("med3(a,b,c) : " + med3(a,b,c));
		
		sc.close();
	}
}
