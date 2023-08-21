import java.util.Arrays;

public class Queue_04_����ť {

	//�迭�� ���������ν� createQueue ������ �� ���̶�� ������ ��
	public static String[] queue = new String[5]; 
	public static int size = queue.length;
	//1���� �迭������ ���簢��ó�� �������� ���� ������ ���� ������� ������ �غ���
	public static int front = 0; // ���������� ������ ���� ��ġ, ������¿� ��ȭ���¸� �����ϱ� ���� ����д�.
	public static int rear = 0; // ������ ���� ��ġ
	
//	public static int front = -1, rear = -1  ���� �ڷ����� ���ؼ��� �̾�� ����.
	
	//front�� rear�� �����ϸ� �������
	//����ť�� �Ȱ���.
	public static boolean isEmpty() {
//		if(front == rear) {
//			return true;
//		} return false;

		return front==rear;
	}
	
	// ��ȭ ���� : rear���� �� ĭ �� ������ ���� front�� ����Ű�� ���̶�� �װ��� ��ȭ�����̴�.
	public static boolean isFull() {
		return (rear+1)%size == front;
	}
	
	//����
	public static void enQueue(String item) {
		//�迭�� ������� �� (���Ḯ��Ʈ�� ������ٸ� ���� ����)
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		// �ִ� ������ �Ϸ���
		queue[(++rear) % size] = item;
	}
	
	//����
	public static String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		return queue[(++front)%size];
	}

	public static void main(String[] args) {
		
		enQueue("������");
		enQueue("������");
		enQueue("���ڼ�");
		enQueue("�̹���");
		System.out.println(deQueue());
		System.out.println(deQueue());
		
		enQueue("������");
		enQueue("������");
		System.out.println(Arrays.toString(queue));
		System.out.println(front);
		System.out.println(rear);
	}
	


		
}
	

