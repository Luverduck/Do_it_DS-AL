package ch02_1;

public class E02_11 {

	// 1000 이하의 소수 열거 ver.3
	public static void main(String[] args) {
		int count = 0;				// 곱셈 연산 횟수 + 나눗셈 연산 횟수
		int ptr = 0;					// 찾은 소수의 갯수
		int[] prime = new int[500];	// 소수를 저장하는 배열
		
		prime[ptr ++] = 2;		// 2는 소수 (배열의 0번째에 2를 넣고 index 증가)
		prime[ptr ++] = 3;		// 3은 소수 (배열의 1번째에 3을 넣고 index 증가)
		
		for(int n = 5 ; n <= 1000 ; n += 2) {	// 홀수에 대해서만 판정
			// 소수인지 여부를 저장하는 변수 flag의 값을 false로 초기화
			boolean flag = false;
			
			for(int i = 1 ; prime[i] * prime[i] <= n ; i ++) {
				// n이 소수인지 판정하는 과정에서 총 2회의 연산을 수행한다
				// prime[i]를 제곱하는 곱셈 연산 1회 + n을 prime[i]로 나누는 연산 1회
				count += 2; // 연산 횟수를 2만큼 증가
				if(n % prime[i] == 0) {	// n이 배열의 i번째에 저장된 소수로 나누어 떨어지면
					flag = true;		// n은 소수가 아니므로 flag의 값을 true로 바꾼다
					break;			// n은 소수가 아니므로 이후 연산을 수행할 필요가 없다
				}
			}
			// n이 소수라면 (flag의 값이 false라면 == !flag의 값이 true라면)
			if(!flag) {
				prime[ptr ++] = n;
				count ++;
			}
		}
		
		// 2부터 1000까지 숫자 중 찾아낸 모든 소수 출력
		for(int i = 0 ; i < ptr ; i ++) {
			System.out.println(prime[i]);
		}
		
		// 연산 수행 횟수 출력
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + count);
	}
}
