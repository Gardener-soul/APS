
public class Queue_01_선형큐 {

	//배열을 선언함으로써 createQueue 연산을 한 것이라고 생각할 것
	public static String[] queue = new String[5];
	public static int front = -1; // 마지막으로 삭제된 원소 위치
	public static int rear = -1; // 마지막 원소 위치
	
//	public static int front = -1, rear = -1  같은 자료형에 한해서는 이어쓰기 가능.
	
	//front와 rear가 동일하면 공백상태
	public static boolean isEmpty() {
//		if(front == rear) {
//			return true;
//		} return false;

		return front==rear;
	}
	
	//포화상태 rear가 마지막 인덱스 위치에 가 있으면 포화상태
	public static boolean isFull() {
//		if(rear == queue.length-1) {
//			return true;
//		} return false;
	
		return rear == queue.length-1;
	}
	
	//삽입
	public static void enQueue(String item) {
		//배열로 만들었을 때 (연결리스트로 만들었다면 생략 가능)
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		// 넣는 행위를 하려면
		queue[++rear] = item;
	}
	
	//삭제
	public static String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		return queue[++front];
	}

	public static void main(String[] args) {
		
	}
	
}
