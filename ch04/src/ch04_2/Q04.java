package ch04_2;

public class Q04 {

	// 큐 구현
	static class IntQueue {
		private int max;		// 큐 용량
		private int num;		// 현재 큐에 입력된 데이터의 수
		private int[] que;	// 큐 본체(배열)
		
		// 생성자
		public IntQueue(int capacity) {
			num = 0;
			max = capacity;
			try {
				que = new int[max];
			} catch(OutOfMemoryError e) {
				max = 0;
			}
		}
		
		// 실행 시 예외 : 큐가 비어있음
		public class UnderFlowQueueException extends RuntimeException {
			public UnderFlowQueueException() {};
		}
		
		// 실행 시 예외 : 큐가 가득 차있음
		public class OverFlowQueueException extends RuntimeException {
			public OverFlowQueueException() {};
		}
		
		// 큐에 x를 enqueue
		public int enqueue(int x) throws OverFlowQueueException {
			if(num >= max) { // 큐가 가득 차있다면
				throw new OverFlowQueueException();
			}
			que[num] = x;
			num ++;
			return x;
		}
		
		// 큐에 x를 dequeue
		public int dequeue() throws UnderFlowQueueException {
			if(num <= 0) {
				throw new UnderFlowQueueException();
			}
			int front = que[0];
			for(int i = 0 ; i < que.length ; i ++) {
				que[i] = que[i + 1];
			}
			num --;
			return front;
		}
		
		// 큐에서 맨 앞 데이터를 peek
		// - 큐는 선입 선출의 구조이다.
		// - 프론트를 기준으로 가장 먼저 들어간 데이터가 가장 마지막에 위치하게 된다.
		// - peek는 프론트와 가장 가까운 위치의 데이터를 확인하는 메소드이다.
		public int peek() throws UnderFlowQueueException {
			if(num <= 0) {
				throw new UnderFlowQueueException();
			}
			return que[num - 1];
		}
		
		// 큐에서 x를 찾아 index 반환, 없으면 -1 반환
		public int indexOf(int x) {
			for(int i = 0 ; i < que.length ; i ++) {
				if(que[i] == x) {
					return i;
				}
			}
			return -1;
		}
		
		// 큐 비우기 
		public void clear() {
			num = 0;
		}
		
		// 큐 용량 확인
		public int capacity() {
			return max;
		}
		
		// 큐에 쌓여있는 데이터의 갯수 확인
		public int size() {
			return num;
		}
		
		// 큐이 비어있는지 여부
		public boolean isEmpty() {
			return num <= 0;
		}
		
		// 큐이 가득 차있는지 여부
		public boolean isFull() {
			return num >= max;
		}
		
		// 큐 안의 모든 데이터를 맨 앞부터 맨 뒤까지 출력
		public void dump() {
			if(num <= 0) {
				System.out.println("큐가 비어 있습니다.");
			} else {
				for(int i : que) {
					System.out.print(que[i] + " ");
				}
				System.out.println();
			}
		}
	}
}
