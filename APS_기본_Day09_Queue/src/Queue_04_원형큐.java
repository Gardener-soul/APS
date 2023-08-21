import java.util.Arrays;

public class Queue_04_원형큐 {

	//배열을 선언함으로써 createQueue 연산을 한 것이라고 생각할 것
	public static String[] queue = new String[5]; 
	public static int size = queue.length;
	//1차원 배열이지만 직사각형처럼 생각하지 말고 원형의 도넛 모양으로 생각을 해보자
	public static int front = 0; // 마지막으로 삭제된 원소 위치, 공백상태와 포화상태를 구분하기 위해 비워둔다.
	public static int rear = 0; // 마지막 원소 위치
	
//	public static int front = -1, rear = -1  같은 자료형에 한해서는 이어쓰기 가능.
	
	//front와 rear가 동일하면 공백상태
	//선형큐와 똑같다.
	public static boolean isEmpty() {
//		if(front == rear) {
//			return true;
//		} return false;

		return front==rear;
	}
	
	// 포화 상태 : rear에서 한 칸 더 진행한 곳이 front가 가리키는 곳이라면 그곳은 포화상태이다.
	public static boolean isFull() {
		return (rear+1)%size == front;
	}
	
	//삽입
	public static void enQueue(String item) {
		//배열로 만들었을 때 (연결리스트로 만들었다면 생략 가능)
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		// 넣는 행위를 하려면
		queue[(++rear) % size] = item;
	}
	
	//삭제
	public static String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		return queue[(++front)%size];
	}

	public static void main(String[] args) {
		
		enQueue("박은수");
		enQueue("수은박");
		enQueue("은박수");
		enQueue("이민지");
		System.out.println(deQueue());
		System.out.println(deQueue());
		
		enQueue("이지은");
		enQueue("조영래");
		System.out.println(Arrays.toString(queue));
		System.out.println(front);
		System.out.println(rear);
	}
	


		
}
	

