
public class String_04_atoi_itoa {

	public static void main(String[] args) {
		
		String sNum = "1234";
//		String sNum = "  1234   "; //���� �ȵ�.
		int num = Integer.parseInt(sNum.trim()); //trim �޼ҵ带 ����Ͽ� ������ �����ؾ��Ѵ�.		
		String snum2 = "-1234"; // ������ ����
		
//		int num = Integer.parseInt(sNum); //������� ������ ��ȯ�ȵ�.
		System.out.println(num);
		
		//���ڸ� ���ڿ��� �ٲٷ���.
		String sNum2 = String.valueOf(num);
		System.out.println(sNum2);
		
		String sNum3 = num+"";
		System.out.println(sNum3);	
		
		System.out.println(atoi(sNum3));
	}

	//��ư� ������� ��� �����ϴ����� �����غ���.
	
	//���ڿ��� ������ �ٲٰڴ�. (���ڷθ� �̷���� ���ڿ��� ���´�.)
	public static int atoi(String text) {
		int value = 0;
		int digit = 0;
		//�տ������� ���ʷ� �����鼭 ���ڸ� ���ڷ� �ٲٰ�, �ڸ����� �÷��ش�.
		for(int i=0; i<text.length(); i++) {
			char num = text.charAt(i); //i��° �ڸ��� ���ڸ� �о���ڴ�.
			if(num >= '0' && num <= '9') {
				//�̰� ���ھ�
				digit = num - '0';
			} else {
				//���⿡ ������ �̰� ���ڰ� �ƴ� �̻��� ���� ���ִ�.
				//�̰��� �ʿ��� �۾��� �� �� �ִ�.
			}
			value= (value * 10) + digit;
		}
		
		return value;
	}
	
	public static String itoa(int value) {
		
	}
}
