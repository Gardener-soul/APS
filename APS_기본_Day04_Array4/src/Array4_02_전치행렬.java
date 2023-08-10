import java.util.Arrays;

public class Array4_02_전치행렬 {
	static int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	static int N = arr.length;
	
	public static void main(String[] args) {

//		배열 표현법		
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				System.out.printf("%3d", arr[i][j]);
//			}
//		}
//		System.out.println();
//		
//		for(int[] a : arr) {
//			System.out.println(Arrays.toString(a));
//		}
//		
		
		//전치 행렬 (엥,,? 그대로 출력되네;;)
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				int tmp = arr[i][j];
//				arr[i][j] = arr[j][i];
//				arr[j][i] = tmp;
//			}
//		}

		//진짜 전치행렬
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				if(i<j) {
//				int tmp = arr[i][j];
//				arr[i][j] = arr[j][i];
//				arr[j][i] = tmp;
//				}
//			}
//		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}
		
		for(int[] a : arr) {
		System.out.println(Arrays.toString(a));
		}
		
	}
}
