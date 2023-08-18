import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//마이쮸 나누어 주기
// 한 번 받은 사람은 새롭게 줄을 서고, 기존의 받은 양보다 한개 더 받알 수 있따.
//사람이 줄을 서면 새로운 사람이 와서 줄을 서게 된다.

public class Queue_03_마이쮸 {
	static class Person {
		//필드로 무엇을 가지고 있으면 좋은가.
		int num; //	 t사람의 번호
		int cnt;// 현재 가져갈 수 있는 마이쭈 카운트
		private String name;
		
		public Person(int num, String name) {
			this.num = num;
			this.cnt = 1;
			this.name = name;
		}
		
		public Person(int num, int cnt, String name) {
			this.num = num;
			this.cnt = cnt;
			this.name = name;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 20; //총 마이쮸의 개수
		int pNum = 1;
		
		Queue<Person> queue= new LinkedList<>();
		//첫 번째 사람은 넣어놓자.
		queue.add(new Person(pNum,1, "박은수"));
		
		//정확하게 몇 번 돌릴지 알 수 없으므로 while 문
		while(N>0) {
			Person p = queue.poll();
			N -= p.cnt;
			if(N <= 0) {
				System.out.println(p.num+"이 마지막 마이쮸를 챙겨갔다.");
			} else {
				System.out.println(p.num + "번 " + p.name +"이가" + p.cnt);
				p.cnt++;
				System.out.println("남은 마이쮸 : " + N + "개");
				queue.add(p);
				queue.add(new Person(pNum++,1,scanner.next()));
			}
		}
		
		
		
		
		
		
		
		
		
	}

	
}
