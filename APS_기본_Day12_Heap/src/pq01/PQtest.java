package pq01;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQtest {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(100);
		pq.add(2);
//		pq.offer(100); //오, 중복으로 값 입력 가능하다 ㅇㅇ
		pq.offer(15);
		pq.offer(190);
	
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		System.out.println();
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<>();
		
		pq2.offer(-100);
		pq2.add(-2);
//		pq.offer(100); //오, 중복으로 값 입력 가능하다 ㅇㅇ
		pq2.offer(-15);
		pq2.offer(-190);
		
		while(!pq2.isEmpty()) {
			System.out.println(-pq2.poll());
		}
		
		System.out.println();
		
		PriorityQueue<Integer> pq3 = new PriorityQueue<>(Collections.reverseOrder());
		
		pq3.offer(100);
		pq3.add(2);
//		pq.offer(100); //오, 중복으로 값 입력 가능하다 ㅇㅇ
		pq3.offer(15);
		pq3.offer(190);
		
		while(!pq3.isEmpty()) {
			System.out.println(pq3.poll());
		}
		
	}
	
}
