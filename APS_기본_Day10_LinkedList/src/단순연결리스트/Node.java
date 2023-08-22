package 단순연결리스트;

//데이터 필드와, 다음 노드를 가리키는 링크필드 한개가 존재한다.
public class Node {
	
	public String data; //예시로 문자열을 넣는다. generic을 이용하면 조금 더 포괄적으로
	public Node link; //주소를 저장할 것이라 Node라고 하는 자료형을 사용한다.
	
	//기본 생성자는 습관처럼 만든다. 생성자를 선언하는 순간 기본 생성자가 만들어지지 않으므로
	public Node() {
	}
	
	public Node(String data) {
		this.data = data;
//		this.link = null; //이게 사실은 필요 없는 문장이다. 알아서 null로 초기화하니까
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}
