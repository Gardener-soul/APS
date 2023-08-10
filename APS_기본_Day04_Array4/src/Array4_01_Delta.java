
public class Array4_01_Delta {
	static int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	static int N = arr.length;
	
	//상하좌우 : 문제에서 주어진 방향이 있으면, 그것을 따르고 없으면 편한데로 해~	
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	public static void main(String[] args) {
		
		//현재 나의 좌표
		int r = 2;
		int c = 1;
		for(int d=0; d<4; d++) {
			int nr = r+dr[d]; //현재 d 방향으로 이동한 곳의 값을 알고 싶어
			int nc = c+dc[d];
			
			//현재 내 위치에 따라서 문제가 발생할 수도 있다.
//			System.out.println(arr[nr][nc]);
			//바로 확인하면 안된다.
			//현재 내 위치가 경계인지 아닌지를 체크해야함.
			//1. 내 품안에 들어왔으면 진행시켜
			if(nr >= 0 && nr < N && nc >= 0 && nc < N) {
				System.out.println(arr[nr][nc]);
			}
			
			//2. 내 품안에 들어오지 않았어? 그러면 쳐내!!! 안해!!
			if(nr < 0 || nc < 0 || nr >= N || nc >= N) {
				continue;
			}
			System.out.println(arr[nr][nc]);
			
			//현재 다음 좌표의 값을 비교하고, 범위체크 (위험)
			//범위체크하고 다음 좌표의 값을 비교 (안전)
			
		}
	}
	
	public static boolean isRange(int nr, int nc) {
		if(nr >= 0 && nr < N && nc >= 0 && nc < N) {
			return true;
		} return false;
			
	}
}
