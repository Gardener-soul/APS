import javax.security.auth.kerberos.KerberosKey;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Array3_01_BabyGin_완전검색 {

	public static void main(String[] args) {
		int[]cards = {3,4,5};
		int N=3;
		
		// 순열을 반복문을 이용해서 만들어보자~
		// 첫 번째 카드를 뽑는 경우
		for(int i=0; i<N; i++) {
			//두 번째 카드를 뽑는 경우
			for(int j=0; j<N; j++) {
				//i와 j가 같지 않을 때~
				if(i != j) {
					//세 번째 카드를 뽑는 경우
					for(int k=0; k<N; k++) {
						//k는 i와 j와는 달라야한다.
						if (k != i && k!= j){
							System.out.printf("%d %d %d\n", cards[i], cards[j], cards[k]);
							
							//runCheck
							System.out.println(runCheck(cards[i], cards[j], cards[k]));
						}
						
					}//3
				}//조건문
			}//2
		}//1
	}
	//세개의 숫자가 연속된 숫자인지를 체크
	public static boolean runCheck(int a, int b, int c) {
		if(b == a+1 && c == a+2) 
			return true;
		 	return false;
	}
	
	//triplet : 세개의 숫자가 같은 숫자인지 체크
	
	public boolean tripletCheck(int a, int b, int c) {
		if(a == b && a == c) 
			return true;
		 	return false;
	}
	
}
