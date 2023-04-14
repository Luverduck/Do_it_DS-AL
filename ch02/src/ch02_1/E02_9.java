package ch02_1;

public class E02_9 {

	// 1000 이하의 소수 열거
	public static void main(String[] args) {
		// 나눗셈 연산의 횟수
		int count = 0;
		
		// 소수 탐색
		// - 소수는 1과 자기 자신만을 약수로 갖는 수로 그 외 숫자에 대해 나누어 떨어지면 안된다.
		for(int n = 2 ; n <= 1000 ; n ++) {	// 소수임을 판정하려는 수
			int i;	// 나누는 수
			for(i = 2 ; i < n ; i ++) {	
				count ++;		// 나누기 전 나눗셈 연산 카운트 증가
				if(n % i == 0)	// 나머지가 0인 경우 (나누어 떨어지는 경우)
					break;		// 자기 자신인지 확인하기 위해 반복문 break
			}
			if(n == i) {			// 나누어 떨어진 수가 자기 자신이라면
				System.out.println(n);	// 그 수는 소수이므로 출력
			}
		}
		
		// 나눗셈을 수행한 횟수
		System.out.println("나눗셈 횟수 : " + count);
	}
}
