package �ܼ����Ḯ��Ʈ;

//������ �ʵ��, ���� ��带 ����Ű�� ��ũ�ʵ� �Ѱ��� �����Ѵ�.
public class Node {
	
	public String data; //���÷� ���ڿ��� �ִ´�. generic�� �̿��ϸ� ���� �� ����������
	public Node link; //�ּҸ� ������ ���̶� Node��� �ϴ� �ڷ����� ����Ѵ�.
	
	//�⺻ �����ڴ� ����ó�� �����. �����ڸ� �����ϴ� ���� �⺻ �����ڰ� ��������� �����Ƿ�
	public Node() {
	}
	
	public Node(String data) {
		this.data = data;
//		this.link = null; //�̰� ����� �ʿ� ���� �����̴�. �˾Ƽ� null�� �ʱ�ȭ�ϴϱ�
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}
