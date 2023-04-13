package ch02_1;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	// 키의 최대값 구하기
	static int maxOf(int[] arr) {
		
		// 배열의 0번째 요소를 최대값으로 가정
		int max = arr[0];
		
		// 배열의 모든 요소를 검사하여 최대값 교체
		for(int i = 0 ; i < arr.length ; i ++) {
			// 만약 배열의 i번째 요소가 현재 최대값보다 크다면
			if(arr[i] > max)
				max = arr[i]; // 최대값 교체
		}
		
		// 최대값 반환
		return max;
	}
	
	// 인원이 1~20 사이의 난수일 경우 최대값 구하기
	public static void main(String[] args) {		
		
		// 인원수 설정
		Random r = new Random();
		int n = r.nextInt(20);
		
		// 랜덤 길이의 배열 생성
		int[] arr = new int[n];
		
		// 인원수(배열의 길이) 출력
		System.out.println("인원수는 " + n + "명 입니다");
		
		// 랜덤으로 키 설정 및 배열 출력
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = r.nextInt(100) + 100;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		// 최대값 출력
		System.out.println("배열의 최대값은 " + maxOf(arr) + "입니다.");
	}
}
