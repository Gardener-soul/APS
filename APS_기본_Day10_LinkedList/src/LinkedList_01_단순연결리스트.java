import �ܼ����Ḯ��Ʈ.SinglyLinkedList;

//�׽�Ʈ
public class LinkedList_01_�ܼ����Ḯ��Ʈ {

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.printList();
		list.addFirst("������");
		list.printList();
		
		list.addFirst("�ڹξ�");
		list.printList();
		
		list.addFirst("������");
		list.printList();
		
		list.addLast("���ٿ�");
		list.printList();
		
		list.add(2, "��ÿ�");
		list.add(2, "���ֿ�");
		list.add(2, "�輼��");
	
		list.printList();
	
		list.remove();
		list.printList();
		
		System.out.println(list.get(3));
		
	}
	
}
