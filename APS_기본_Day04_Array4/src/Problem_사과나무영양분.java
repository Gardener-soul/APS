import java.util.Scanner;

public class Problem_사과나무영양분 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc=1; tc<=T; tc++) {
			int ans = 0;
			
			int N = sc.nextInt();//정사각형 크기의 농장
			int[][] farm = new int[N][N];
			
			//입력을 받아보자.
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					farm[i][j]=sc.nextInt();
				}
			} // 입력 끝
			
			//상하좌우를 위한 델타 배열을 정리
			int[] dr = new int[] {-1,-1,1,1};
			int[] dc = {-1,1,-1,1};
			
			//전체 농장을 순회하면서, 상하좌우의 값을 구해보아야한다.
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					//해당 자리의 중간결과
					int sum = farm[i][j]; //자신을 포함한 영양분
					//상하좌우 탐색을 해서 갈 수 있는 친구들만 포함하자.
					for(int d=0; d<4; d++) {
						int nr = i + dr[d];
						int nc = j + dc[d];
						
						//1. 포함하면
						if(nr >= 0 && nr<N && nc>=0&&nc<N) {
							sum+=farm[nr][nc];
						}
						
					if(ans<sum) ans = sum;
					}
				}
			}
			System.out.println("#" + tc + " " + ans);
//			System.out.printf("#3d %d\n", tc, ans);
		} //tc를 위한 for문
		
	}
	
}