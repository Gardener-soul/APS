import java.util.LinkedList;
import java.util.Queue;

public class Queue_02_API {

	public static void main(String[] args) {
		//Queue는 구현클래스가 없다. (인터페이스)
//		LinkedList 구현클래스로 활용한다.
		
		Queue<String> queue = new LinkedList<>();
		
		//추가 (add, offer)
		//삭제 (remove, poll)
		//조회 (element, peek)
		
		// add,remove,element 예외 발생
		// 나머지 예외 발생하지 않음
		
		queue.add(("박은수"));
		queue.offer(("서만기"));
		
		//FIFO 넣은 순서대로 잘 나왔다.
//		System.out.println(queue.remove()); isEmpty일 때, 에러 발생
//		System.out.println(queue.poll()); 	isEmpty일 때, null발생
		
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
//		queue.isEmpty();
	}
	
}
