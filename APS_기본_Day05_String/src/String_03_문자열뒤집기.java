import java.util.Arrays;

public class String_03_문자열뒤집기 {

	public static void main(String[] args) {
		
		//뒤집을 문자 하나 준비해보자.
		String text = "조용히관리하겠습니다"; //다니습겠하리관히용조
		// 문자열 뒤집기 
		// 1. 거꾸로 읽어~
		char[] str = new char[text.length()];
		for(int i = text.length()-1, idx=0; i>=0; i--, idx++) {
			str[idx] = text.charAt(i);
		}
		System.out.println(Arrays.toString(str));
		
		// 2. swap 방식
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
		
		//회문을 해결할 수 있을 것 같다고,,?
	}
}
