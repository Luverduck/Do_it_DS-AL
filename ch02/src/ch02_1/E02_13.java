package ch02_1;

import java.util.Scanner;

public class E02_13 {

	// 평년 or 윤년에 따라 다른 날짜수 적용
	static int[][] mdays = {
		//	1	2	3	4	5	6	7	8	9	10	11	12
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}		// 윤년
		};
	
	// 윤년인지 판정
	static int isLeap(int year) {
		// 윤년(Leap Year)
		// 1) 4로 나누어 떨어지는 해를 윤년으로 한다
		// 2) 4, 100으로 나누어 떨어지는 해를 평년으로 한다
		// 3) 4, 100, 400으로 나누어 떨어지는 해를 윤년으로 한다
		return (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) ? 1 : 0;
	}
	
	// y년 m월 d일에 대해 그 해 경과 일 수 반환
	static int dayOfYear(int y, int m, int d) {
		// 반환할 일 수
		int days = d;
		// 일 수 계산
		for(int i = 1 ; i < m ; i ++) {
			// 윤년이면 mdays 0행, 평년이면 mdays 1행에서 일수를 계산
			days += mdays[isLeap(y)][i - 1];
		}
		// 계산한 일 수 반환
		return days;
	}
	
	// 한 해의 오늘까지 경과 일 수 계산
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
