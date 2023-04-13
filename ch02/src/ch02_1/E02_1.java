package ch02_1;

public class E02_1 {

	// 구성요소의 자료형이 int인 배열 생성 (길이 5, new 키워드로 생성)
	public static void main(String[] args) {
		
		// 배열 생성
		// 1) 배열의 참조변수 생성 후 길이 설정 및 초기화
		int[] case1;
		case1 = new int[5];
		
		// 2) 배열 생성과 동시에 길이 설정 및 초기화
		int[] case2 = new int[5];
		
		// 배열 생성 후 구성요소의 값을 지정값으로 초기화
		int[] arr = new int[5];
		// arr[0] = 0;	// 값을 설정하지 않으면 자동으로 0으로 초기화된다
		arr[1] = 37;
		arr[2] = 51;
		// arr[3] = 0; 	// 값을 설정하지 않으면 자동으로 0으로 초기화된다
		arr[4] = 74;
		
		// 배열 구성요소의 값 출력
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
