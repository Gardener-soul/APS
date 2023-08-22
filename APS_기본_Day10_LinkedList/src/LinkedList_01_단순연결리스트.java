import 단순연결리스트.SinglyLinkedList;

//테스트
public class LinkedList_01_단순연결리스트 {

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.printList();
		list.addFirst("박은수");
		list.printList();
		
		list.addFirst("박민아");
		list.printList();
		
		list.addFirst("장현승");
		list.printList();
		
		list.addLast("차다운");
		list.printList();
		
		list.add(2, "김시영");
		list.add(2, "이주원");
		list.add(2, "김세진");
	
		list.printList();
	
		list.remove();
		list.printList();
		
		System.out.println(list.get(3));
		
	}
	
}
