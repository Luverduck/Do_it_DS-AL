package ch02_1;

public class E02_12 {

	// 2차원 배열 생성
	public static void main(String[] args) {
		
		// 2행 4열의 2차원 배열 생성
		int[][] arr = new int[2][4];
		
		// 초기화
		arr[0][1] = 37;
		arr[0][3] = 54;
		arr[1][2] = 65;
		
		// 2차원 배열의 요소 출력
		for(int i = 0 ; i < 2 ; i ++) {	// 행 번호
			
			System.out.print("[");
			for(int j = 0 ; j < 4 ; j ++) { // 열 번호
				System.out.print(" " + arr[i][j] + " ");
			}
			System.out.println("]");
		}
	}
}
