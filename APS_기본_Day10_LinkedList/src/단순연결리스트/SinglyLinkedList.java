package 단순연결리스트;

public class SinglyLinkedList {

	//필드로 가지고 있으면 좋은 것들
	private Node head; //Node의 시작점, Head를 맘대로 바꾸면 안되니까
	private int size; // 현재 연결리스트의 노드의 개수를 나타내는 변수 : 이론상 필수는 아니지만 있으면 편함.
	
	// 초기 생성시 head는 null을 가리키는게 당연하고 size는 0인게 당연하다.
	// 그래서 기본 생성자를 통해 이것들의 초기값을 지정해주는 과정이 굳이 필요할까? 없다.
	
	//자바의 성질만 잘 알고 있으면 아래의 코드는 사실 필요없다.
	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	//첫 번째 위치에 원소 넣기
	public void addFirst(String data) {
		//노드를 생성한다.
		Node node = new Node(data); //생성자를 만들어 놓았으니 인스턴스 생성 가능
		//순서가 중요
		node.link = head;
		head = node; //head가 첫 번째 원소를 가리키는 거니까 넣어
		size++;
	}
	
	//중간 원소 삽입
	public void add(int idx, String data) {
		if(idx < 0 || idx > size) {
			System.out.println("유효하지 않은 인덱스를 작성했다.");
			return;
			}
		
		if(idx == 0) {
			addFirst(data);
			return;
		}
		if (idx == size) {
			addLast(data);
			return;
		}
		Node pre = get(idx-1); //조회 함수를 만들어 두었으니까 이전 노드를 찾는 것은 ez
		
		Node node = new Node(data);
		node.link = pre.link;
		pre.link = node;
		size++;
	}
	
	//첫 번째 원소 삭제
	//데이터를 반환할거야
	public String remove() {
		if(head == null) {return null;}
		
		//삭제하기 전 이 데이터는 확보를 해놓아야함.
		String data = head.data;
		head = head.link;
		size--;
		
		return data;
	}
	
	//중간 원소 삭제
	public String remove(int idx) {
		if(idx == 0) {return remove();} //함수를 리턴한 것이 아니라, 함수의 반환타입, 함수의 결과를 return한 것.
	
		//범위를 벗어났다면..
		if(idx<0 || idx>=size) return null;
		
		Node pre = get(idx-1);
		Node rmNode = get(idx);
		Node rmNode2 = pre.link; //더 효율적이다.
		
		String data = rmNode.data;
		String data2 = pre.link.data;
		
		pre.link = rmNode.link;
		pre.link = pre.link.link;
		size--;
		
		return data;
	}
	
	//마지막 위치에 원소 삽입
	public void addLast(String data) {
		Node node = new Node(data);
		Node curr = head;
		
		//head가 null일 때 오류 발생. head -> null ==> size가 0이고 공백리스트
		if(size == 0) {
			addFirst(data);
			return;
		}
		
		//마지막 노드를 찾아가자.
		while(curr.link != null) {
			curr = curr.link;
		}
		curr.link = node;
		size++;
	}
	
	//조회
	public Node get(int idx) {
		// idx는 0부터 시작하니까, 아래의 상황에 대한 예외 처리 필요. 
		// 0보다 작은 값이 들어오면, 그냥 첫 번째 노드 반환
		// size 이상이 들어오면 그냥 마지막 노드 반환 : 직접 작성 커스텀의 참맛.
		if(idx < 0 || idx >= size) {
			return null;
		}
		
		Node curr = head;
		for (int i=0; i < idx; i++) {
			curr = curr.link;
		}
		return curr;
	}
	
	//연결리스트에 내용물을 출력하는 메서드를 하나 구현.
	public void printList() {
		Node curr = head; //현재 위치 나타내는 노드
		
//		if(size==0)
		if(head == null) {
			System.out.println("지금은 공백리스트야, 출력할건 없어");
			return;
		}
		
		// size라는 필드를 사용하게 된다면, 몇 번 돌려야할 지 아니까, for문도 가능이야~
		// size 필드를 사용하지 않으면 몇 번 돌릴지 몰라. -> while 문
		
		while(curr != null) {
			System.out.print(curr.data+" -> ");
			curr=curr.link;
		}
		
		System.out.println();
	}
}
