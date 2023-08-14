import java.util.Arrays;

public class String_03_���ڿ������� {

	public static void main(String[] args) {
		
		//������ ���� �ϳ� �غ��غ���.
		String text = "�����������ϰڽ��ϴ�"; //�ٴϽ����ϸ���������
		// ���ڿ� ������ 
		// 1. �Ųٷ� �о�~
		char[] str = new char[text.length()];
		for(int i = text.length()-1, idx=0; i>=0; i--, idx++) {
			str[idx] = text.charAt(i);
		}
		System.out.println(Arrays.toString(str));
		
		// 2. swap ���
		char[] str2 = text.toCharArray();
		int len = str2.length;
		
		for(int i=0; i<len/2; i++) {
			char temp = str2[i];
			str2[i] = str2[len-1-i];
			str2[len-1-i] = temp;
		}
		System.out.println(Arrays.toString(str2));
		
		//3. StringBuilder / StringBuffer
		StringBuilder sb = new StringBuilder();
		sb.append(text);
		sb.reverse();
		System.out.println(sb);
		
		//ȸ���� �ذ��� �� ���� �� ���ٰ�,,?
	}
}
