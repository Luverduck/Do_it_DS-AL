package ch02_1;

import java.util.Scanner;

public class Q11 {
	
	// 평년 or 윤년
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 	// 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}		// 윤년
		};
	
	// 윤년인지 여부 판별
	static int isLeap(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
	}
	
	// YMD 클래스
	public static class YMD {
		// 필드
		int y;	// 년 
		int m;	// 월 (1~12)
		int d;	// 일 (1~31)
		
		// 생성자
		YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		// n일 뒤 날짜 반환
		YMD after(int n) {
			// 계산된 날짜 인스턴스 생성
			YMD temp = new YMD(this.y, this.m, this.d);
			// n이 음수일 경우 n일 전 날짜를 구한다
			if(n < 0) {
				before(-n);
			}
			// 일 더하기
			temp.d += n;
			// 일이 m월의 최대 일보다 큰 경우 (월이 다음 달로 넘어간 경우)
			while(temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
				// 일 조정
				temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
				// 월 조정
				temp.m ++;
				// 월이 12월을 넘는 경우
				if(temp.m > 12) {
					// 년에 +1을 한다
					temp.y ++;
					// 월을 1로 바꾼다
					temp.m = 1;
				}
			}
			// 계산된 날짜 반환
			return temp;
		}
		
		// n일 전 날짜 반환
		public YMD before(int n) {
			// 계산된 날짜 인스턴스 생성
			YMD temp = new YMD(this.y, this.m, this.d);
			// n이 음수일 경우 n일 후 날짜를 구한다
			if(n < 0) {
				after(-n);
			}
			// 일 빼기
			temp.d -= n;
			// 일이 1보다 작은 경우 (월이 전 달로 넘어간 경우)
			while(temp.d < 1) {
				// 월 조정
				temp.m --;
				// 월이 1보다 작아지면 (년이 전 년으로 넘어간 경우)
				if(temp.m < 1) {
					// 년에 -1을 한다
					temp.y --;
					// 월을 12로 바꾼다
					temp.m = 12;
				}
				// 일 계산
				temp.d += mdays[isLeap(temp.y)][temp.m - 1];
			}
			// 계산된 날짜 반환	
			return temp;
		}
	}

	// y년 m월 d일의 n일 앞/뒤의 날짜 구하기
	public static void main(String[] args) {
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		// 날짜 입력
		System.out.println("날짜를 입력하세요.");
		System.out.print("년 : "); int y = sc.nextInt();
		System.out.print("월 : "); int m = sc.nextInt();
		System.out.print("일 : "); int d = sc.nextInt();
		
		// 날짜 인스턴스 생성
		YMD date = new YMD(y, m, d);
		
		// n일 전/후 날짜 계산
		System.out.print("몇일 전/후 날짜? : "); int n = sc.nextInt();
		
		YMD after = date.after(n);
		System.out.printf("%d일 후 날짜는 %d년%d월%d일 입니다.\n", n, after.y, after.m, after.d);
		
		YMD before = date.before(n);
		System.out.printf("%d일 전 날짜는 %d년%d월%d일 입니다.\n", n, before.y, before.m, before.d);
		
		sc.close();
	}
}
