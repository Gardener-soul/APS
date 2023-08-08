
public class Array1_01_배열순회 {

	public static void main(String[] args) {
		
		int[] nums = {0,1,2,3,4,5};

		//1. 정방향 순회
		//1-1. 일반적인 for문 사용
		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
		}
		
		//1-2. foreach : 값을 복사해서 쓰는 것이므로 readonly
		for(int i : nums) { //실제 요소값이 그대로 출력됨.
//			System.out.println(i);
		}
		
		//2. 역방향 순회
		//2-1. 마지막 인덱스부터 0까지 거꾸로 반복문 순회
		for(int i = nums.length-1; i>=0; i--) {
//			System.out.println(nums[i]);
		}
		
		//2-2. 인덱스를 직접 조정하여 순회
		int N = nums.length;
		for(int i=0; i<N; i++) {
//			System.out.println(nums[N-1-i]);
		}
	
		//3. 어느 한 지점부터 양옆으로 퍼져나가면서 순회 
		// while문
		int st = 3; //시작 포인트 3 2 4 1 5 0
		int i=1; //증가 포인트
		//코드 한번 작성해보기~
		System.out.println(st);
		while(st+i<nums.length||st-i>=0) {
			if(st+i==nums.length) { } 
			else System.out.println(nums[st+i]);
				 System.out.println(nums[st-i]);
			i++;
		}
	}
}