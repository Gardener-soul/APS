import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//������ ������ �ֱ�
// �� �� ���� ����� ���Ӱ� ���� ����, ������ ���� �纸�� �Ѱ� �� �޾� �� �ֵ�.
//����� ���� ���� ���ο� ����� �ͼ� ���� ���� �ȴ�.

public class Queue_03_������ {
	static class Person {
		//�ʵ�� ������ ������ ������ ������.
		int num; //	 t����� ��ȣ
		int cnt;// ���� ������ �� �ִ� ������ ī��Ʈ
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
		int N = 20; //�� �������� ����
		int pNum = 1;
		
		Queue<Person> queue= new LinkedList<>();
		//ù ��° ����� �־����.
		queue.add(new Person(pNum,1, "������"));
		
		//��Ȯ�ϰ� �� �� ������ �� �� �����Ƿ� while ��
		while(N>0) {
			Person p = queue.poll();
			N -= p.cnt;
			if(N <= 0) {
				System.out.println(p.num+"�� ������ �����鸦 ì�ܰ���.");
			} else {
				System.out.println(p.num + "�� " + p.name +"�̰�" + p.cnt);
				p.cnt++;
				System.out.println("���� ������ : " + N + "��");
				queue.add(p);
				queue.add(new Person(pNum++,1,scanner.next()));
			}
		}
		
		
		
		
		
		
		
		
		
	}

	
}
