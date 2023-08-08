
public class Array2_03_SelectionSort {

	public static void main(String[] args) {
		int[] nums = {64,25,10,22,11};
		int N = nums.length;
		
		//몇 사이클을 돌아야 하는가, 한 사이클이 종료될 때마다 정렬이 되므로 N-1번
		for(int i=0; i<N-1; i++) {
			int minIdx = i; //i 번째 자리가 가장 작은 값이라고 초기화를 시켜둔 상태
			// i 이후에 등장하는 친구들과 비교하여 갱신을 해야함
			for(int j = i+1; j<N; j++) {
				//현재 내가 보고 있는 j번째 값이 minIdx 값보다 작다면
				if(nums[j]<nums[minIdx]) {
					minIdx = j;
				}
			} //minIdx 찾는 for 문
			//여기까지 왔다면 최솟값을 가리키는 idx는 확보한 상태
			int tmp = nums[i];
			nums[i] = nums[minIdx];
			nums[minIdx] = tmp;
		} //사이클 for문
		System.out.println();
	}
	
}
