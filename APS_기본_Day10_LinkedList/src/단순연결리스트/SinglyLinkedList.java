package �ܼ����Ḯ��Ʈ;

public class SinglyLinkedList {

	//�ʵ�� ������ ������ ���� �͵�
	private Node head; //Node�� ������, Head�� ����� �ٲٸ� �ȵǴϱ�
	private int size; // ���� ���Ḯ��Ʈ�� ����� ������ ��Ÿ���� ���� : �̷л� �ʼ��� �ƴ����� ������ ����.
	
	// �ʱ� ������ head�� null�� ����Ű�°� �翬�ϰ� size�� 0�ΰ� �翬�ϴ�.
	// �׷��� �⺻ �����ڸ� ���� �̰͵��� �ʱⰪ�� �������ִ� ������ ���� �ʿ��ұ�? ����.
	
	//�ڹ��� ������ �� �˰� ������ �Ʒ��� �ڵ�� ��� �ʿ����.
	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	//ù ��° ��ġ�� ���� �ֱ�
	public void addFirst(String data) {
		//��带 �����Ѵ�.
		Node node = new Node(data); //�����ڸ� ����� �������� �ν��Ͻ� ���� ����
		//������ �߿�
		node.link = head;
		head = node; //head�� ù ��° ���Ҹ� ����Ű�� �Ŵϱ� �־�
		size++;
	}
	
	//�߰� ���� ����
	public void add(int idx, String data) {
		if(idx < 0 || idx > size) {
			System.out.println("��ȿ���� ���� �ε����� �ۼ��ߴ�.");
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
		Node pre = get(idx-1); //��ȸ �Լ��� ����� �ξ����ϱ� ���� ��带 ã�� ���� ez
		
		Node node = new Node(data);
		node.link = pre.link;
		pre.link = node;
		size++;
	}
	
	//ù ��° ���� ����
	//�����͸� ��ȯ�Ұž�
	public String remove() {
		if(head == null) {return null;}
		
		//�����ϱ� �� �� �����ʹ� Ȯ���� �س��ƾ���.
		String data = head.data;
		head = head.link;
		size--;
		
		return data;
	}
	
	//�߰� ���� ����
	public String remove(int idx) {
		if(idx == 0) {return remove();} //�Լ��� ������ ���� �ƴ϶�, �Լ��� ��ȯŸ��, �Լ��� ����� return�� ��.
	
		//������ ����ٸ�..
		if(idx<0 || idx>=size) return null;
		
		Node pre = get(idx-1);
		Node rmNode = get(idx);
		Node rmNode2 = pre.link; //�� ȿ�����̴�.
		
		String data = rmNode.data;
		String data2 = pre.link.data;
		
		pre.link = rmNode.link;
		pre.link = pre.link.link;
		size--;
		
		return data;
	}
	
	//������ ��ġ�� ���� ����
	public void addLast(String data) {
		Node node = new Node(data);
		Node curr = head;
		
		//head�� null�� �� ���� �߻�. head -> null ==> size�� 0�̰� ���鸮��Ʈ
		if(size == 0) {
			addFirst(data);
			return;
		}
		
		//������ ��带 ã�ư���.
		while(curr.link != null) {
			curr = curr.link;
		}
		curr.link = node;
		size++;
	}
	
	//��ȸ
	public Node get(int idx) {
		// idx�� 0���� �����ϴϱ�, �Ʒ��� ��Ȳ�� ���� ���� ó�� �ʿ�. 
		// 0���� ���� ���� ������, �׳� ù ��° ��� ��ȯ
		// size �̻��� ������ �׳� ������ ��� ��ȯ : ���� �ۼ� Ŀ������ ����.
		if(idx < 0 || idx >= size) {
			return null;
		}
		
		Node curr = head;
		for (int i=0; i < idx; i++) {
			curr = curr.link;
		}
		return curr;
	}
	
	//���Ḯ��Ʈ�� ���빰�� ����ϴ� �޼��带 �ϳ� ����.
	public void printList() {
		Node curr = head; //���� ��ġ ��Ÿ���� ���
		
//		if(size==0)
		if(head == null) {
			System.out.println("������ ���鸮��Ʈ��, ����Ұ� ����");
			return;
		}
		
		// size��� �ʵ带 ����ϰ� �ȴٸ�, �� �� �������� �� �ƴϱ�, for���� �����̾�~
		// size �ʵ带 ������� ������ �� �� ������ ����. -> while ��
		
		while(curr != null) {
			System.out.print(curr.data+" -> ");
			curr=curr.link;
		}
		
		System.out.println();
	}
}
