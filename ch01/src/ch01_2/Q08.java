package ch01_2;

import java.util.Scanner;

public class Q08 {
 
	// 가우스 덧셈을 이용하여 1부터 n까지 정수의 합 구하기
	// 가우스 덧셈
	// - 수열(sequence)의 합을 구하는 방법 
	// - 수열의 합은 숫자 쌍의 수(number of pairs)과 숫자 쌍의 합(sum of each pair)을 곱한 값과 같다
	// - ex) 1부터 n까지 정수의 합을 구할 때 합 sum = (n/2) * (n+1)
	
	// 1부터 n까지 가우스 합계 반환
	static int gaussSum1(int n) {
		// 가우스 덧셈
		int gaussSum = (n / 2) * (n + 1);
		// 합계 반환
		return gaussSum;
	}
	
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : "); int n = sc.nextInt();
		
		// 합계 출력
		System.out.print("1부터 " + n + "까지의 합 = " + gaussSum1(n));
		
		sc.close();
	}
	
	// ** 내가 푼 방법 - 반복문을 통해 최소 n/2번의 덧셈 연산을 해야하므로 비효율적
	static int gaussSum2(int n) {
		// 초기화
		int sum = 0;
		// 합계 반환
		for(int i = 1 ; i <= n/2 ; i ++) {
			sum += i + (n - i + 1);
		};
		// n이 홀수일 경우 중앙값은 짝이 없게 되므로 합계에 한 번 더해준다
		if(n % 2 == 1) sum += (n/2) + 1;
		return sum;
	}
}
