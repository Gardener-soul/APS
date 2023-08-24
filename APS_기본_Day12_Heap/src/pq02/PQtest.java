package pq02;

import java.util.PriorityQueue;

public class PQtest {

	public static void main(String[] args) {
		
		PriorityQueue<Person> pq = new PriorityQueue<>();
		
		pq.offer(new Person("�ڱ���" , 56));
		pq.offer(new Person("������" , 40));
		pq.offer(new Person("ī����" , 20));
		pq.offer(new Person("������" , 27));
		pq.offer(new Person("������" , 26));
		pq.offer(new Person("�輺��" , 28));
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}
	
}
