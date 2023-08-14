
public class String_01_문자의표현 {

	public static void main(String[] args) {
		
		char a = 'A'; //문자 한개는 외따옴표로 쓸 수 있다.
		//2바이트
		
		System.out.println((int)'A'); //명시적 형 변환을 통해 저장할 수 있음		
		System.out.println('A');
		
		int b = 'A'; // 자동형변환이 일어난다.
		System.out.println(b); //65가 잘 출력됨.
		
		//'0'(48)의 값을 빼버리면 문자를 실제 숫자처럼 사용 가능하다.
		System.out.println('9'-48);
		System.out.println('7'-'0');
		
		// 대문자, 소문자의 차이는? 32
		// 비트 연산자라고 하는 것을 배우진 않았다.
		System.out.println((char)('A'^32)); //XOR 연산		
		System.out.println((char)('a'^32)); //XOR 연산
	}
	
}
