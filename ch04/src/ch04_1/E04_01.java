package ch04_1;

public class E04_01 {

	// ing형 스택
	static class intStack {
		
		// 필드
		private int max;		// 스택 용량 : 최대로 입력할 수 있는 데이터의 수
		private int ptr;		// 스택 포인터 : 현재 쌓여있는 데이터의 수
		private int[] stk;	// 스택 본체 배열
		
		// 생성자
		public intStack(int capacity) {
			ptr = 0;
			max = capacity;
			try {
				stk = new int[max];		// 스택 본체용 배열 생성
			} catch(OutOfMemoryError e) {	// 생성할 수 없을 경우
				max = 0;
			}
		}
		
		// 실행 시 예외 : 스택이 비어있음
		public class UnderflowStackException extends RuntimeException {
			public UnderflowStackException() {
				System.out.print("스택이 비어있습니다.");
			};
		}
		
		// 실행 시 예외 : 스택이 가득 참
		public class OverflowStackException extends RuntimeException {
			public OverflowStackException() {
				System.out.print("스택이 가득 차있습니다.");
			};
		}
		
		// 스택에 x를 push(삽입)
		public int push(int x) throws OverflowStackException {
			// 스택이 가득 차있을 경우 
			if(ptr >= max) {
				throw new OverflowStackException();	// 오버플로우
			}
			return stk[ptr ++];	// 후위 연산 : 대입하고 값을 증가
		}
		
		// 스택에 x를 pop(삭제)
		public int pop(int x) throws UnderflowStackException {
			// 스택이 비어있을 경우
			if(ptr <= 0) {
				throw new UnderflowStackException();	// 언더플로우
			}
			return stk[-- ptr];	// 전위 연산 : 감소시킨 값을 대입
		}
		
		// 스택에서 peak 데이터 반환
		public int peak() throws UnderflowStackException {
			if(ptr <= 0) {
				throw new UnderflowStackException();
			}
			return stk[ptr - 1]; // 자료가 ptr개 채워져있다면 index는 0부터 ptr-1까지
		}
		
		// 스택에서 x를 찾아 index 반환, 없으면 -1 반환
		public int indexOf(int x) {
			for(int i = 0 ; i < stk.length ; i ++) {
				if(stk[i] == x) {
					return i;
				}
			}
			return -1;
		}
		
		// 스택 비우기 
		// - 스택의 push, pop 등의 모든 작업은 스택 포인터(ptr)을 바탕으로 이루어진다
		// - 배열의 요소를 건드릴 필요 없이 스택 포인터를 0으로 하면 된다.
		// - ptr이 0인 상태에서 pop을 실행하면 언더플로우가 일어남
		public void clear() {
			ptr = 0;
		}
		
		// 스택 용량 확인
		public int capacity() {
			return max;
		}
		
		// 스택에 쌓여있는 데이터의 갯수 확인
		public int size() {
			return ptr;
		}
		
		// 스택이 비어있는지 여부 == ptr(스택 포인터)가 0인가
		public boolean isEmpty() {
			return ptr <= 0;
		}
		
		// 스택이 가득 차있는지 여부
		public boolean isFull() {
			return ptr >= max;
		}
		
		// 스택 안의 모든 데이터를 bottom에서 top 순서로 출력
		public void dump() {
			if(ptr <= 0) {
				System.out.println("스택이 비어 있습니다.");
			} else {
				for(int i = 0 ; i < ptr ; i ++) {
					System.out.print(stk[i] + " ");
				}
				System.out.println();
			}
		}
	}
}
