package 이중연결리스트;

public class Node {

	public Object data;
	public Node prev;
	public Node next;
	
	//기본 생성자
	public Node() {
	}
	
	public Node(Object input) {
		this.data = input;
		this.next = null;
	}
	
}
