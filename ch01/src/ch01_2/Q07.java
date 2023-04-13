package ch01_2;

public class Q07 {

	// 1부터 7까지 합계 구하기
	public static void main(String[] args) {
		 
		// 1부터 7까지의 합계
		int sum = 0;
		int i = 1;
		while(i <= 7) {
			sum += i;
			i ++;
		}
		
		// 합계 출력
		System.out.print("sum = " + sum);
	}
}
