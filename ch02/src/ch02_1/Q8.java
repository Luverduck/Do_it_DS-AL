package ch02_1;

import java.util.Scanner;

public class Q8 {

	// 평년 or 윤년에 따라 다른 날짜수 적용
	static int[][] mdays = {
		//	1	2	3	4	5	6	7	8	9	10	11	12
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}		// 윤년
		};
		
	// 윤년인지 판정
	static int isLeap(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1 : 0;
	}	
	
	// y년 m월 d일에 대해 그 해 경과 일 수 반환
	// - i와 days 없이 구현 (while문 사용)
	static int dayOfYear(int y, int m, int d) {
		// m월의 일자는 d일이므로 m-1월부터 계산한다
		m --;
		while(m > 0) {	// m이 0보다 큰 동안만 반복
			d += mdays[isLeap(y)][m - 1];
			m --;
		}
		// 전위 연산자를 이용한 코드
/*		while(m -- > 0) {
 * 			d += mdays[isLeap(y)][m - 1];
 * 		}
*/
		// 최종값 d를 반환
		return d;
	}
	
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		// 입력 변수
		int year;
		int month;
		int day;
		int retry;
		// 경과 일 수 계산
		System.out.println("그 해 경과 일 수 를 구합니다.");
		do {
			// 사용자 입력
			System.out.print("년 : "); year = sc.nextInt();
			System.out.print("월 : "); month = sc.nextInt();
			System.out.print("일 : "); day = sc.nextInt();
			// 경과 일 수 계산
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			// 재실행 여부
			System.out.print("한 번 더 할까요?"); retry = sc.nextInt();
		} while(retry == 1);
		
		sc.close();
	}
}
