
public class String_05_패턴매칭 {
	//Brute Force 방식으로 
	//해당 패턴이 본문안에 들어있는지 / 들어있다면 몇 번째 인덱스부터 시작하는지
	
	public static void main(String[] args) {
//		char[] t = "This iss a book".toCharArray();
//		char[] p = "iss".toCharArray();
		
		String t = "This iss a book";
		String p = "iss";
		
		System.out.println(bruteForce(t,p));
	}
	
	public static int bruteForce(String t, String p) {
		int N = t.length(); //본문의 길이
		int M = p.length(); //패턴의 길이
		
		for(int i=0; i<= N-M; i++) {
			boolean flag = true;
			for(int j=0; j<M; j++) {
				if(p.charAt(j) != t.charAt(i+j)) {
					flag = false;
					break;
				}
			} //패턴 매칭을 수행하는 for문
			if(flag) {
				return i;
			}
		} //패턴 검사의 시작점 위치
		return -1; //못 찾았을 경우 (없을 경우)
	}
	
	public static int bruteForceWhile(String t, String p) {
		int N = t.length();
		int M = t.length();  
		
		int i = 0; //본문의 인덱스
		int j = 0; //패턴으 인덱스
	
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
