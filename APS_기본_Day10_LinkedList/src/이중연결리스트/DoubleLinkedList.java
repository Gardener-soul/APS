package ���߿��Ḯ��Ʈ;

public class DoubleLinkedList {

	private Node head;
	private Node tail;
	private int size;
	
	//�⺻ ������ ����
	public DoubleLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}
	
	// ������ ���ۿ� �߰�
	public void addFirst(Object data) {
		Node newNode = new Node(data);

		newNode.next = head.next;
		newNode.prev = head;
		head.next.prev = newNode;
		head.next = newNode;	
		size++;
	}

	// ���� �߰�
	public void addEnd(Object data) {
		Node newNode = new Node(data);
		
		newNode.next = tail;
		newNode.prev = tail.prev;
		tail.prev.next = newNode;
		tail.prev = newNode;
		size++;
	}
	
	// �ε��� Ž��
	public Node get(int idx) {
		if(idx < 0 || idx >= size) {
			return null;
		}
		
		Node curr = head;
		for(int i=0; i<idx; i++) {
			curr = curr.next; // �̰� �³�? 
		}
		return curr;
	}
	
	
	// �߰��� �߰�
	public void add(int idx, Object data) {
		if(idx < 0 || idx > size) {
			System.out.println("��ȿ���� ���� idx�Դϴ�.");
			return; //return���� �ٷ� ����
		}
		
		if(idx == 0) {
			addFirst(data);
			return;
		} else if (idx == size) {
			addEnd(data);
			return;
		}
		Node pv = get(idx-1); //index�� ���� ����
		Node nt = get(idx+1); //index�� ���� ����� ��?�� �˾ƾ� ��.
		
		Node newNode = new Node(data);
		
		
		size++;
	}
	
	
	// ���
	public void printList() {
		Node curr = head;
		
		if(head == null) {
			System.out.println("������ �Ұ� ����");
			return;
		}
		while(curr != null) {
			System.out.println(curr.data + " -> ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	// ó�� ��� ����
	
	// �߰� ��� ����
	
	// ũ��
	
	// �� ��������
	
	
}
