
public class Stack_09_�Ǻ���ġ {

	public static void main(String[] args) {
		
		System.out.println(fibo2(45));
		System.out.println(fibo(45));
	}
	
	//�Ǻ���ġ�� n�� ���Ϸ��� ������ ������ ���� �˰� �־���Ѵ�.
	public static int fibo(int n) {
		//�⺻ ��Ʈ
//		fibo(0) = 0 / fibo(1)=1
		
//		if(n==0) {return 0;}
//		if(n==1 ) {return 1;}
		if(n<=1) return n;
		
		//��� ��Ʈ
		return fibo(n-1) + fibo(n-2);
	}
	//��޽�ų ���� (���� ���� ���v)
	//1. ����� �ص���.
	
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