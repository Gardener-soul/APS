
public class Queue_01_����ť {

	//�迭�� ���������ν� createQueue ������ �� ���̶�� ������ ��
	public static String[] queue = new String[5];
	public static int front = -1; // ���������� ������ ���� ��ġ
	public static int rear = -1; // ������ ���� ��ġ
	
//	public static int front = -1, rear = -1  ���� �ڷ����� ���ؼ��� �̾�� ����.
	
	//front�� rear�� �����ϸ� �������
	public static boolean isEmpty() {
//		if(front == rear) {
//			return true;
//		} return false;

		return front==rear;
	}
	
	//��ȭ���� rear�� ������ �ε��� ��ġ�� �� ������ ��ȭ����
	public static boolean isFull() {
//		if(rear == queue.length-1) {
//			return true;
//		} return false;
	
		return rear == queue.length-1;
	}
	
	//����
	public static void enQueue(String item) {
		//�迭�� ������� �� (���Ḯ��Ʈ�� ������ٸ� ���� ����)
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		// �ִ� ������ �Ϸ���
		queue[++rear] = item;
	}
	
	//����
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
