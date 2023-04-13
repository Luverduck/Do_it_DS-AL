package ch01_2;

public class Q13 {

	// 표 형태의 덧셈표 출력
	public static void main(String[] args) {
		// 최상단 행
		System.out.print("   |");
		for(int i = 1 ; i <= 9 ; i ++) {
			System.out.printf("%3d", i);
		}
		// 경계
		System.out.println("\n---+---------------------------");
		// 본문
		for(int i = 1 ; i <= 9 ; i ++) {
			System.out.printf("%2d |", i);
			for(int j = 1 ; j <= 9 ; j ++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
	}
}
