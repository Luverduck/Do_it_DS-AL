package ch02_1;

public class E02_10 {

	// 1000 이하의 소수 열거 ver.2
	public static void main(String[] args) {
		int count = 0;	// 나눗셈 횟수
		int ptr = 0;		// 찾은 소수의 갯수
		int[] prime = new int[500];	// 소수를 저장하는 배열
		
		// 2는 소수이므로 배열에 저장
		prime[ptr] = 2;
		// 배열 index 증가
		ptr ++;
		
		// 소수 탐색
		// - 모든 짝수는 2의 배수이므로 소수가 아니다
		// - 홀수에 대해서만 소수 탐색
		for(int n = 3 ; n <= 1000 ; n += 2) { // 홀수에 대해서만 소수 탐색
			// 소수를 저장한 배열의 index
			int i;
			// 나눗셈 연산
			// - prime[0]에는 2가 들어있다
			// - 홀수 n에 대한 소수 탐색을 하므로 연산 수를 줄이기 위해 prime[1]부터 시작한다 
			for(i = 1 ; i < ptr ; i ++) { 
				count ++;	// 나눗셈 연산 횟수 증가
				if(n % prime[i] == 0) // n을 이미 찾은 소수들로 나눠본다
					break;
			}
			// 찾은 소수의 수만큼 나눗셈을 했다면(나눠지는 수가 없다면)
			if(ptr == i) {
				prime[ptr] = n;	// n은 소수이므로 배열에 저장
				ptr ++; // 배열의 index 증가
			}
		}
		
		// 소수 출력
		for(int i = 0 ; i < ptr ; i ++) {
			System.out.println(prime[i]);
		}
		
		// 총 나눗셈 횟수 출력
		System.out.println("총 나눗셈 횟수 : " + count);
	}
}
