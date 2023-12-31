
public class Stack_09_피보나치 {

	public static void main(String[] args) {
		
		System.out.println(fibo2(45));
		System.out.println(fibo(45));
	}
	
	//피보나치는 n을 구하려면 이전과 이이전 값을 알고 있어야한다.
	public static int fibo(int n) {
		//기본 파트
//		fibo(0) = 0 / fibo(1)=1
		
//		if(n==0) {return 0;}
//		if(n==1 ) {return 1;}
		if(n<=1) return n;
		
		//재귀 파트
		return fibo(n-1) + fibo(n-2);
	}
	//고급스킬 전수 (아직 몰라도 괜춚)
	//1. 기록을 해두자.
	
	public static int[] memo = new int [150];
	//memo[0] = 0; memo[1]=1;
	static {
		memo[0]=0;
		memo[1]=1;
	}
	
	public static int fibo2(int n) {
		
		if(n>=2&&memo[n]==0) {
			memo[n] = fibo2(n-1) + fibo(n-2);
		}
		
		return memo[n];
		
	}


}