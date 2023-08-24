package pq02;

import java.util.PriorityQueue;

public class PQtest {

	public static void main(String[] args) {
		
		PriorityQueue<Person> pq = new PriorityQueue<>();
		
		pq.offer(new Person("박광진" , 56));
		pq.offer(new Person("전지현" , 40));
		pq.offer(new Person("카리나" , 20));
		pq.offer(new Person("이은진" , 27));
		pq.offer(new Person("박은수" , 26));
		pq.offer(new Person("김성은" , 28));
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}
	
}
