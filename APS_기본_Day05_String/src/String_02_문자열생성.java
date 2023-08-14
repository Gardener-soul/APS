import java.util.Arrays;

public class String_02_문자열생성 {

	public static void main(String[] args) {
		
		//문자열을 생성하는 방법
		String str1 = "abc"; //기초자료형 만들듯이 만들기 가능
		String str2 = new String("abc"); 
		
		System.out.println(str1);
		System.out.println(str2); 
		//동일한 내용이지만 서로 다른 주소 / == 비교연산시 false.
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
		
		//"abc" -> 문자배열
		System.out.println(str3.charAt(1));//문자열의 요소를 하나씩 가져올 수 있다.
		char[] c = str3.toCharArray(); //문자열을 문자배열로 만들어 반환한다.
		System.out.println(Arrays.toString(c)); 
	}
}
