
public class Stack_08_���丮�� {

	public static void main(String[] args) {
		
		System.out.println(fact(4));
		
		int ans = 1; 
		int N = 10;
		for(int i=1; i<N; i++) {
			ans*=i;
		}
		System.out.println(ans);
		
	}
	
	public static int fact(int n) {
		//�⺻ �κ�
		if(n==1) return 1;
		
		//��� �κ�
		return n * fact(n-1);
		
		
	}
	
	
}
