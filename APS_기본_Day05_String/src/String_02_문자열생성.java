import java.util.Arrays;

public class String_02_���ڿ����� {

	public static void main(String[] args) {
		
		//���ڿ��� �����ϴ� ���
		String str1 = "abc"; //�����ڷ��� ������� ����� ����
		String str2 = new String("abc"); 
		
		System.out.println(str1);
		System.out.println(str2); 
		//������ ���������� ���� �ٸ� �ּ� / == �񱳿���� false.
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
			
		String str3 = "abc";
		String str4 = str2;
		String str5 = str3;
		System.out.println(str1 == str3);
		System.out.println(str2 == str4);
		System.out.println(str3 == str5);
		
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str3.equals(str5));
		
		//"abc" -> ���ڹ迭
		System.out.println(str3.charAt(1));//���ڿ��� ��Ҹ� �ϳ��� ������ �� �ִ�.
		char[] c = str3.toCharArray(); //���ڿ��� ���ڹ迭�� ����� ��ȯ�Ѵ�.
		System.out.println(Arrays.toString(c)); 
	}
}
