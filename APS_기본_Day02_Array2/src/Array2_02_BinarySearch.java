import java.util.Arrays;

public class Array2_02_BinarySearch {

	public static int[] arr = {2,4,7,9,11,19,23};
	
	public static void main(String[] args) {
		
		//이미 만들어진게 있음
		System.out.println(Arrays.binarySearch(arr, 7));
		
	}
	//이진검색은 항상 자료가 정렬된 상태여야만 하다.
	//검색 범위를 절반씩 (logN 관련있어보임) 줄여나간다.
	public static boolean binarySearch(int key) {
		int st = 0;
		int ed = arr.length-1;
		
		while(st<=ed) {
			int mid = (st+ed) / 2;
			if(arr[mid]== key)
				return true;
			else if(arr[mid] > key) {
				ed = mid-1;
		} else {st = mid+1;}
		
	}
		return false;
}
}
