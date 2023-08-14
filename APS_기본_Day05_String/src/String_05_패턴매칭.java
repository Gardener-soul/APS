
public class String_05_���ϸ�Ī {
	//Brute Force ������� 
	//�ش� ������ �����ȿ� ����ִ��� / ����ִٸ� �� ��° �ε������� �����ϴ���
	
	public static void main(String[] args) {
//		char[] t = "This iss a book".toCharArray();
//		char[] p = "iss".toCharArray();
		
		String t = "This iss a book";
		String p = "iss";
		
		System.out.println(bruteForce(t,p));
	}
	
	public static int bruteForce(String t, String p) {
		int N = t.length(); //������ ����
		int M = p.length(); //������ ����
		
		for(int i=0; i<= N-M; i++) {
			boolean flag = true;
			for(int j=0; j<M; j++) {
				if(p.charAt(j) != t.charAt(i+j)) {
					flag = false;
					break;
				}
			} //���� ��Ī�� �����ϴ� for��
			if(flag) {
				return i;
			}
		} //���� �˻��� ������ ��ġ
		return -1; //�� ã���� ��� (���� ���)
	}
	
	public static int bruteForceWhile(String t, String p) {
		int N = t.length();
		int M = t.length();  
		
		int i = 0; //������ �ε���
		int j = 0; //������ �ε���
	
		while (j<M&&i<N) {
			if(t.charAt(i) != p.charAt(j)) {
				i-=j;
				j=-1;
			}
			i++;
			j++;
		}
		if(j==M) return i-M;
		return -1;
	}
}
