import java.util.Arrays;

public class Array2_01_SequentailSearch {

	public static int[] arr = {4,9,11,23,2,19,7};
	
	public static void main(String[] args) {
		
		System.out.println(searchForNoSort(2));
		System.out.println(searchWhileNoSort(2));
		
		Arrays.sort(arr);
//		System.out.println(searchForSort(20));
//		System.out.println(searchWhileSort(20));
		
	}
	
	//index를 반환할 수도 있고, 찾았다 못 찾았다의 boolean을 반환할 수도 있고.
	//index는 직접 해볼 것
	//중복된 원소가 있을 때나, 기타 상황을 고려하진 않았고 무조건 있는지 없는지만 체크
	public static boolean searchForNoSort(int Key) {

		for(int i=0; i<arr.length; i++) {
			if(arr[i]==Key) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean searchWhileNoSort(int Key) {
		int idx = 0;
		while(idx<arr.length) {
			if(arr[idx]==Key) {
				return true;
			}
			idx++;
		}
			return false;
	}
	
	public static boolean searchWhileNoSort2(int Key) {
		int idx = 0;
		while(idx<arr.length && arr[idx]!=Key) {
			idx++;
		}
		if(idx < arr.length) return true;
		return false;
	}
	
	//직접 작성해볼 것.	
//	public static boolean searchForSort(int Key) {
//		
//	}
	
//	public static boolean searchWhileSort(int Key) {
//		
//	}
	
}
