
public class String_01_������ǥ�� {

	public static void main(String[] args) {
		
		char a = 'A'; //���� �Ѱ��� �ܵ���ǥ�� �� �� �ִ�.
		//2����Ʈ
		
		System.out.println((int)'A'); //����� �� ��ȯ�� ���� ������ �� ����		
		System.out.println('A');
		
		int b = 'A'; // �ڵ�����ȯ�� �Ͼ��.
		System.out.println(b); //65�� �� ��µ�.
		
		//'0'(48)�� ���� �������� ���ڸ� ���� ����ó�� ��� �����ϴ�.
		System.out.println('9'-48);
		System.out.println('7'-'0');
		
		// �빮��, �ҹ����� ���̴�? 32
		// ��Ʈ �����ڶ�� �ϴ� ���� ����� �ʾҴ�.
		System.out.println((char)('A'^32)); //XOR ����		
		System.out.println((char)('a'^32)); //XOR ����
	}
	
}
