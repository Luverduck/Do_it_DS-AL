package ch04_1;

public class IntStack {
	// 필드
	private int max;		// 스택 용량 : 최대로 입력할 수 있는 데이터의 수
	private int ptr;		// 스택 포인터 : 현재 쌓여있는 데이터의 수
	private int[] stk;	// 스택 본체 배열
	
	// 생성자
	public IntStack(int capacity) {
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
		public UnderflowStackException() {};
	}
	
	// 실행 시 예외 : 스택이 가득 참
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {};
	}
	
	// 스택에 x를 push(삽입)
	public int push(int x) throws OverflowStackException {
		// 스택이 가득 차있을 경우 
		if(ptr >= max) {
			throw new OverflowStackException();	// 오버플로우
		}
		stk[ptr] = x;
		ptr ++;
		return stk[ptr];
	}
	
	// 스택에 x를 pop(삭제)
	public int pop() throws UnderflowStackException {
		// 스택이 비어있을 경우
		if(ptr <= 0) {
			throw new UnderflowStackException();	// 언더플로우
		}
		ptr --;
		return stk[ptr];
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
		for(int i = stk.length - 1 ; i >= 0  ; i --) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	// 스택 비우기 
	// - 스택 포인터(ptr)을 0으로 바꾸면 스택을 비운 효과와 같다.
	// - push의 경우 배열의 0번째 위치부터 값을 다시 채운다
	// - pop, peek의 경우 언더플로우가 발생한다.
	// - 그 외 메소드는 ptr = 0일 때의 결과가 반환된다.
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
