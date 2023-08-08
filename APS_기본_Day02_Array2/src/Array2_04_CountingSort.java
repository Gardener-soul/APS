import java.util.Arrays;

import javax.security.auth.kerberos.KerberosKey;

public class Array2_04_CountingSort {

	public static void main(String[] args) {
		//양수를 가정하겠다.
		int[] arr = {8,8,24,12,19,3,45,60};
		int N = arr.length;
		
		//1. 데이터 중 가장 큰 값을 알고 있어야한다.
		int K = -1;
		for (int i=0; i<N; i++) {
			if (K<arr[i]) {
				K=arr[i];
			}
		}
		
		int[] cnt = new int [K+1]; //총 61칸 짜리 배열이 만들어짐
	
		//2. 개수 카운팅
		for(int i=0; i<N; i++) {
//			arr[i] //해당 값을 인덱스로 하여 카운트를 증가 시킴
			cnt[arr[i]]++;
		}
		
		//3. 누적합 구하기 (얘를 구함으로써 들어갈 수 있는 위치가 결정이 되고 안정정렬이 가능하게 만들어짐)
		for(int i=1; i<cnt.length; i++) {
			cnt[i]+=cnt[i-1];
		}
		
		//4. 원본배열의 뒤에서부터 순회를 하며 정렬된 배열에 차곡차곡 저장하기
		int[] sortArr = new int[N];
		for(int i=N-1; i>=0; i--) {
			//지금 저장하고 싶은 값은 arr[i]
			//저장하고 싶은 위치는 어디 : count[arr[i]]-1 -> 하고나서 , 한번더 count[arr[i]]--;
			//					--count[arr[i]]
			sortArr[--cnt[arr[i]]] = arr[i];
		}
		System.out.println(Arrays.toString(sortArr));
	}	
}