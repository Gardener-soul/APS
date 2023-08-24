import java.util.Arrays;

//�迭�� �̿��� Heap�� ������.
// �ε�ȣ ������ �ݴ�� �ٲٸ� �ּ������� ���� �� �ִ�.
// �� push�� �� �� ���� ��ȣ�� �ݴ�� �ٲپ� ������ �������� �ݴ�� �ٲ� ��.
// ���δ� �� �濡 �ְ� �ѹ濡 ������ ���ĵ� ����� ���� �� �ִ�. �װ��� �ٷ� ������

public class Tree_02_Heap {
	public static int[] heap = new int[100]; //���� ���� Ʈ����� ������ ��. 0�� �ε����� �� ����.
	public static int heapSize = 0;
	
	public static void main(String[] args) {
	
		heapPush(5);
		heapPush(22);
		heapPush(17);
		heapPush(4038);
		heapPush(34);
		
		System.out.println(Arrays.toString(heap));
		
		while(heapSize != 0) {
			System.out.println(heapPop());
		}
		
		
	} //main
	
	//���� ����
	public static void heapPush(int item) {
		heap[++heapSize] = item;
		
		int ch = heapSize; // �ڽ�
		int p = ch/2; 	   // �θ�
		
		while(p > 0 && heap[ch] > heap[p]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;			
			
			//�θ� �ڽ��� �� ���� ���� �ٽ� ����.
			ch=p;
			p=ch/2;
		}
	}
	
	//���� : ��ȯŸ���� �츮�� ������ �����ϰ� �ִ� ������ �Ѵ�.
	public static int heapPop() {
		if(heapSize <= 0) return -1; //���� ���! (-1�̶�� ���� ���� ���� �����ϱ�, ���� ���� ������ ���� ����)
		
		int item = heap[1]; //��Ʈ���
		heap[1] = heap[heapSize--]; //������ ���� ��Ʈ�� ���� �����
		
		int p = 1;
		int ch = p*2; //���� �ڽ� ����.
		//���� ������ ������ �ڽ��� �ִٸ�
		if(ch + 1 <= heapSize && heap[ch]<heap[ch+1])
			ch+=1; // ���� ������ �ڽ��� �� ũ�ٸ� ���ڷ� ���� ����
		
		//������ �� �ִ� ��ŭ ����������
		while(ch<=heapSize && heap[p] < heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			p = ch;
			ch = p*2;
			
			if(ch + 1 <= heapSize && heap[ch]<heap[ch+1])
				ch+=1; // ���� ������ �ڽ��� �� ũ�ٸ� ���ڷ� ���� ����
		}
			
		return item;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




}
