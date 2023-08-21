import java.util.Arrays;

public class Queue_05_InsertionSort {

	public static void main(String[] args) {
		
		int[] nums = {69,10,30,2,16,8,31,22};
		
		//삽입정렬을 구현할건데~ 배열을 이용해서 구현 해보자 입니다.
		for(int i = 1; i<nums.length; i++) {
			
			int key = nums[i]; //이번에 정렬할 값
			int j;
			
			for(j = i-1; j>=0 && key < nums[j]; j-- ) {
				nums[j+1] = nums[j];
			}// 넣을 위치를 찾고 뒤로 미는 작업까지 동시에진행하겠다.
			
			nums[j+1] = key;
			System.out.println(Arrays.toString(nums));		
		}//사이클 돌리기
		System.out.println(Arrays.toString(nums));
	}
	
}
