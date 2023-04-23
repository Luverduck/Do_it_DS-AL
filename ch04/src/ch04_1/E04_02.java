package ch04_1;

import java.util.Scanner;

public class E04_02 {
	
	// int형 스택의 사용 예
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// int형 스택의 인스턴스 생성
		IntStack intStack = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + intStack.size() + " / " + intStack.capacity()); 
			System.out.print("(1) 푸시		(2) 팝		(3) 피크		(4) 덤프		(0) 종료 : "); int menu = sc.nextInt();
			if(menu == 0) break;	// 0을 입력하면 반복문 탈출(종료)
			
			int x;
			switch(menu) {
				case 1 :	// 푸시(push)
					System.out.print("데이터 : ");
					x = sc.nextInt();
					try {
						intStack.push(x);	// x를 대입
						System.out.println("push한 데이터는 " + x + "입니다.");
					} catch(IntStack.OverflowStackException e) { // 스택이 가득 찼다면
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 2 : // 팝(pop)
					try {
						x = intStack.pop();
						System.out.println("pop한 데이터는 " + x + "입니다.");
					} catch(IntStack.UnderflowStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 3 : // 피크(peak) : top 요소 출력
					try {
						x = intStack.peak();
						System.out.println("peak한 데이터는 " + x + "입니다.");
					} catch(IntStack.UnderflowStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 4 : // 덤프(dump) : bottom -> top 순으로 요소 출력
					intStack.dump();
					break;
			}
			
			System.out.println();
		}
	}
}
