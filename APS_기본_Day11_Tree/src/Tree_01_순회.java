public class Tree_01_��ȸ {
	
	public static char[] arr = new char[] { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', ' ', ' ', 'H', 'I' };
	public static int N = arr.length;
	
	public static void main(String[] args) {

		preorder(1);
		System.out.println();
		inorder(1);
		System.out.println();
		lastorder(1);
	}

	//i : ���� �湮�ϰ� �ִ� �뵵�� ��ȣ�̴�.
	public static void preorder(int i) {
		//��ȿ�� ��������� ��� üũ�ϳ�?
		if(i < N) {
			if(arr[i] != ' ') System.out.print(arr[i] + " "); //V
			
			preorder(i*2); //L
			preorder(i*2+1); //R
		}
		
	}
	
	public static void inorder(int i) {
		//��ȿ�� ��������� ��� üũ�ϳ�?
		if(i < N) {
			inorder(i*2); //L
			if(arr[i] != ' ') System.out.print(arr[i] + " "); //V
			inorder(i*2+1); //R			
		}
		
	}
	public static void lastorder(int i) {
		//��ȿ�� ��������� ��� üũ�ϳ�?
		if(i < N) {
			lastorder(i*2); //L
			lastorder(i*2+1); //R			
			if(arr[i] != ' ') System.out.print(arr[i] + " "); //V
		}
		
	}
}