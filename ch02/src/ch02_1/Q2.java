package ch02_1;

public class Q2 {

	// 배열의 요소를 역순으로 정렬
	static void swap(int[] arr, int idx1, int idx2) {
		
		// 임시 변수 temp에 idx1 번째 요소의 값 저장
		int temp = arr[idx1];
		
		// idx1 요소에 idx2 요소의 값 저장
		arr[idx1] = arr[idx2];
		
		// idx2 요소에 temp의 값 저장
		arr[idx2] = temp;
	}
	
	// 배열의 요소를 역순으로 정렬 (과정 출력)
	public static void main(String[] args) {
		
		// 배열 생성
		int[] arr = {5, 10, 73, 2, -5};
		
		// 정렬 전 배열의 요소 출력
		System.out.print("정렬 전 배열의 요소 : [");
		for(int i = 0 ; i < arr.length; i ++) {
			System.out.print(" " + arr[i] + " ");
		}
		System.out.println("]");
		
		// 배열의 요소를 역순으로 정렬
		for(int i = 0 ; i < arr.length / 2 ; i ++) {
			System.out.println("arr["+ i + "]=" + arr[i] + "와 " + "arr[" + (arr.length - 1 - i) + "]=" + arr[(arr.length - 1 - i)] + "를 교환합니다.");
			swap(arr, i, (arr.length - 1) - i);
		}
		
		// 정렬 후 배열의 요소 출력
		// 정렬 전 배열의 요소 출력
		System.out.print("정렬 후 배열의 요소 : [");
		for(int i = 0 ; i < arr.length; i ++) {
			System.out.print(" " + arr[i] + " ");
		}
		System.out.println("]");
	}
}
