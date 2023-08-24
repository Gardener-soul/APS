import java.util.Arrays;

//배열을 이용한 Heap을 만들어보자.
// 부등호 방향을 반대로 바꾸면 최소힙으로 만들 수 있다.
// 힙 push를 할 때 값을 부호로 반대로 바꾸어 넣으면 꺼낼때도 반대로 바꿀 것.
// 전부다 한 방에 넣고 한방에 꺼내면 정렬된 모습을 얻을 수 있다. 그것이 바로 힙정렬

public class Tree_02_Heap {
	public static int[] heap = new int[100]; //완전 이진 트리라고 생각할 것. 0번 인덱스는 안 쓴다.
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
	
	//힙에 삽입
	public static void heapPush(int item) {
		heap[++heapSize] = item;
		
		int ch = heapSize; // 자식
		int p = ch/2; 	   // 부모
		
		while(p > 0 && heap[ch] > heap[p]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;			
			
			//부모 자식을 한 레벨 위로 다시 결정.
			ch=p;
			p=ch/2;
		}
	}
	
	//삭제 : 반환타입은 우리가 힙으로 관리하고 있는 것으로 한다.
	public static int heapPop() {
		if(heapSize <= 0) return -1; //주의 요망! (-1이라는 값이 있을 수도 있으니까, 리턴 값은 문제를 보고 결정)
		
		int item = heap[1]; //루트노드
		heap[1] = heap[heapSize--]; //마지막 값을 루트에 덮어 씌우기
		
		int p = 1;
		int ch = p*2; //왼쪽 자식 세팅.
		//앞의 조건은 오른쪽 자식이 있다면
		if(ch + 1 <= heapSize && heap[ch]<heap[ch+1])
			ch+=1; // 만약 오른쪽 자식이 더 크다면 오자로 변경 세팅
		
		//내려갈 수 있는 만큼 내려보내기
		while(ch<=heapSize && heap[p] < heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			p = ch;
			ch = p*2;
			
			if(ch + 1 <= heapSize && heap[ch]<heap[ch+1])
				ch+=1; // 만약 오른쪽 자식이 더 크다면 오자로 변경 세팅
		}
			
		return item;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




}
