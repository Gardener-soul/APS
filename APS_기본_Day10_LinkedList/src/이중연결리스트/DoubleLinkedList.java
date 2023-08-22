package 이중연결리스트;

public class DoubleLinkedList {

	private Node head;
	private Node tail;
	private int size;
	
	//기본 생성자 구현
	public DoubleLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}
	
	// 데이터 시작에 추가
	public void addFirst(Object data) {
		Node newNode = new Node(data);

		newNode.next = head.next;
		newNode.prev = head;
		head.next.prev = newNode;
		head.next = newNode;	
		size++;
	}

	// 끝에 추가
	public void addEnd(Object data) {
		Node newNode = new Node(data);
		
		newNode.next = tail;
		newNode.prev = tail.prev;
		tail.prev.next = newNode;
		tail.prev = newNode;
		size++;
	}
	
	// 인덱스 탐색
	public Node get(int idx) {
		if(idx < 0 || idx >= size) {
			return null;
		}
		
		Node curr = head;
		for(int i=0; i<idx; i++) {
			curr = curr.next; // 이게 맞나? 
		}
		return curr;
	}
	
	
	// 중간에 추가
	public void add(int idx, Object data) {
		if(idx < 0 || idx > size) {
			System.out.println("유효하지 않은 idx입니다.");
			return; //return으로 바로 종료
		}
		
		if(idx == 0) {
			addFirst(data);
			return;
		} else if (idx == size) {
			addEnd(data);
			return;
		}
		Node pv = get(idx-1); //index상 전의 노드와
		Node nt = get(idx+1); //index상 다음 노드의 값?을 알아야 함.
		
		Node newNode = new Node(data);
		
		
		size++;
	}
	
	
	// 출력
	public void printList() {
		Node curr = head;
		
		if(head == null) {
			System.out.println("지금은 할거 없어");
			return;
		}
		while(curr != null) {
			System.out.println(curr.data + " -> ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	// 처음 노드 삭제
	
	// 중간 노드 삭제
	
	// 크기
	
	// 값 가져오기
	
	
}
