package ch03_2;

import java.util.Scanner;

public class E03_03 {

	// 선형 검색 후 index 반환 (보초법)
	static int linearSearch(int[] array, int key) {
		int i = 0;
		array[array.length] = key;
		while(true) {
			if(array[i] == key)	// 검색하려는 값을 찾거나 보초값을 찾으면 break
				break;
			i ++;
		}
		return i == array.length ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 요소 수 : "); 
		int n = sc.nextInt();
		
		int[] array = new int[n + 1]; // 보초값이 들어갈 자리 추가
		
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print("array[" + i + "] : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		// key 값이 있는 index
		int idx = linearSearch(array, key);
		
		if(idx == -1) 
			System.out.println("해당 값은 존재하지 않습니다.");
		else
			System.out.println(key + "는 array[" + idx + "]에 있습니다.");
		
		sc.close();
	}
}
