
public class Stack_07_����Լ� {
	public static int cnt = 0;
	
	public static void main(String[] args) {
//		func1();
		func2(10);
	}
	
	public static void func1() {
		// ������ ȣ��Ǿ���� �� ������,,,
		// ������ �Ҵ����� �޸𸮰� �ִ� �׷���, �װ� ��ġ�ϱ� ����~!~!~!
//		System.out.println("�Լ� ����");
		cnt++;
		System.out.println(cnt);
		func1();
	}

	// ����Լ��� �� �κ����� �ۼ��ϴ� ��찡 ����.
	public static void func2(int num) {
		//1. �⺻��Ʈ : ����Լ��� �����ϴ� ������ �ۼ��ϴ� �κ�
		
		if(num == 0) {
			return;
		}else {
			//2. �����Ʈ : �� �ڽ��� (�ڽ�ó�� ���̴�) �ٽ� ȣ���ϴ� �κ�
			System.out.println(num+" �Լ� ȣ��");
			func2(num-1);
			System.out.println(num+" �Լ� ����");			
		}
		
		
	
	}
	
	
}
