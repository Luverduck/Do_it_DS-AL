package ch01_2;

public class E01_7 {
 
	// 1부터 9까지 곱셈표 출력
	public static void main(String[] args) {
		System.out.println("----- 곱셈표 -----");
		// 열(column)
		for(int i = 1 ; i <= 9 ; i ++) {
			// 행(row)
			for(int j = 1 ; j <= 9 ; j ++) {
				System.out.printf("%3d", j * i);
			}
			// 하나의 행이 끝나면 열 바꿈 
			System.out.println();
		}
	}
}
