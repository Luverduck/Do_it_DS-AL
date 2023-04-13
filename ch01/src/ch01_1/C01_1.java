package ch01_1;

import java.util.Scanner;

public class C01_1 {
 
	public static void main(String[] args) {
		
		// Scanner 클래스
		Scanner sc = new Scanner(System.in);
		
		// 0) 판정 입력
		boolean booleanTF = sc.nextBoolean(); // true/false 입력
				
		// 1) 정수 입력
		byte numByte = sc.nextByte(); 		// byte 입력
		short numShort = sc.nextShort(); 	// short 입력
		int numInt = sc.nextInt();			// int 입력
		long numLong = sc.nextLong();		// long 입력
		
		// 2) 실수 입력
		float numFloat = sc.nextFloat();	// float 입력
		double numDouble = sc.nextDouble();	// double 입력

		// 3) 문자 입력
		String text = sc.next();			// 문자열(스페이스, 줄 바꿈 문자로 구분)
		String textLine = sc.nextLine();	// 문자열(1줄)
		
		
		// ** 출력
		// 1) 단순 출력
		System.out.print(booleanTF);		// 괄호 안의 값을 출력, 엔터 입력(\n)을 포함하지 않는다
		System.out.println(booleanTF);		// 괄호 안의 값을 출력, 엔터 입력(\n)을 포함한다
		
		// 2) 형식화된 출력
		System.out.printf(textLine, "%b");	// 괄호 안의 값을 지정된 형식으로 변환하여 출력
		// %n : 줄 바꿈
		// %d : 정수 형식으로 출력
		// %f : 실수 형식으로 출력
		// %t : 날짜 형식으로 출력
		// %o : 8진수 형식으로 출력
		// %x : 16진수 형식으로 출력
		// %c : 문자 형식으로 출력
		// %s : 문자열 형식으로 출력
		// %e : 지수 표현식의 형식으로 출력
		
		sc.close();
	}
}
