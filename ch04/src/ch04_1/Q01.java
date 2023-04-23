package ch04_1;

import java.util.Scanner;

public class Q01 {

	// Stack의 모든 메소드를 사용하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntStack intStack = new IntStack(64);
		
		int x;
		while(true) {
			System.out.println("현재 데이터 수 : " + intStack.size() + " / " + intStack.capacity()); 
			System.out.print("(1) 푸시		(2) 팝		(3) 피크		(4) 덤프\n");
			System.out.print("(5) 인덱스	(6) 출력		(7) 비우기 	(0) 종료 : ");
			
			int menu = sc.nextInt();
			
			if(menu == 0) break;
			
			switch(menu) {
				case 1:
					System.out.print("데이터 : ");
					x = sc.nextInt();
					try {
						intStack.push(x);
						System.out.println("push한 데이터는 " + x + "입니다.");
					} catch(IntStack.OverflowStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 2:
					try {
						x = intStack.pop();
						System.out.println("push한 데이터는 " + x + "입니다.");
					} catch(IntStack.UnderflowStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 3:
					try {
						x = intStack.peak();
						System.out.println("peak한 데이터는 " + x + "입니다.");
					} catch(IntStack.UnderflowStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 4:
					try {
						intStack.dump();
					} catch(IntStack.UnderflowStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 5:
					System.out.print("찾을 데이터 : ");
					x = sc.nextInt();
					int index = intStack.indexOf(x);
					if(index >= 0) {
						System.out.println(x + "는 꼭대기에서 " + (intStack.size() - index) + "번째에 있습니다.");
					} else {
						System.out.println("Stack에 해당 원소가 존재하지 않습니다.");
					}
					break;
				case 6:
					System.out.println("용량 : " + intStack.capacity());
					System.out.println("데이터 수 : " + intStack.size());
					System.out.println("비어 " + (intStack.isEmpty() ? "있습니다." : "있지 않습니다."));
					System.out.println("가득 차 " + (intStack.isFull() ? "있습니다." : "있지 않습니다."));
					break;
				case 7:
					intStack.clear();
					System.out.println("Stack을 비웠습니다.");
					break;
			}
			
			System.out.println();
		}
	}
}
