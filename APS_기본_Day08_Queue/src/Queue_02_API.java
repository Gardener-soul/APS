import java.util.LinkedList;
import java.util.Queue;

public class Queue_02_API {

	public static void main(String[] args) {
		//Queue�� ����Ŭ������ ����. (�������̽�)
//		LinkedList ����Ŭ������ Ȱ���Ѵ�.
		
		Queue<String> queue = new LinkedList<>();
		
		//�߰� (add, offer)
		//���� (remove, poll)
		//��ȸ (element, peek)
		
		// add,remove,element ���� �߻�
		// ������ ���� �߻����� ����
		
		queue.add(("������"));
		queue.offer(("������"));
		
		//FIFO ���� ������� �� ���Դ�.
//		System.out.println(queue.remove()); isEmpty�� ��, ���� �߻�
//		System.out.println(queue.poll()); 	isEmpty�� ��, null�߻�
		
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
//		queue.isEmpty();
	}
	
}
