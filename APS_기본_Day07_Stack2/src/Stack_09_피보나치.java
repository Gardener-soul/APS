
public class Stack_09_ÇÇº¸³ªÄ¡ {

	public static void main(String[] args) {
		
		System.out.println(fibo2(45));
		System.out.println(fibo(45));
	}
	
	//ÇÇº¸³ªÄ¡´Â nÀ» ±¸ÇÏ·Á¸é ÀÌÀü°ú ÀÌÀÌÀü °ªÀ» ¾Ë°í ÀÖ¾î¾ßÇÑ´Ù.
	public static int fibo(int n) {
		//±âº» ÆÄÆ®
//		fibo(0) = 0 / fibo(1)=1
		
//		if(n==0) {return 0;}
//		if(n==1 ) {return 1;}
		if(n<=1) return n;
		
		//Àç±Í ÆÄÆ®
		return fibo(n-1) + fibo(n-2);
	}
	//°í±Ş½ºÅ³ Àü¼ö (¾ÆÁ÷ ¸ô¶óµµ ±¦­v)
	//1. ±â·ÏÀ» ÇØµÎÀÚ.
	
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