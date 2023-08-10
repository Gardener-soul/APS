import java.util.Scanner;

public class Problem_사과나무영양분2 {
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
			
			//델타를 정리 (상하좌우)
			int[] dr = {-1,1,0,0};
			int[] dc = {0,0,-1,1};
			int[] di = {-1,-1,1,1};
			int[] dj = {-1,1,-1,1};
			
			for(int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					int sum = farm[i][j];
					
					for(int d=0; d<4; d++) {
						
						int nr = i+dr[d];
						int nc = j+dc[d];
						
						if(nr>=0&&nr<N&&nc>=0&&nc<N) {
							sum+=farm[nr][nc];
						}
						ans = Math.max(ans, sum);
					}
				}
			}
			System.out.println(ans);
		} //tc를 위한 for문
		
	}
	
}