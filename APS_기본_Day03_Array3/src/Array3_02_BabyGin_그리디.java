
public class Array3_02_BabyGin_그리디 {

	public static void main(String[] args) {
		int[] cards = {3,4,5,4,4,4};
		//count 배열을 하나 만들건데용~
		
		int[] count = new int [10];
		//개수를 직접 체크해서 넣자
		for(int i=0; i<cards.length; i++) {
			count[cards[i]]++;
			
			//int idx = cards[i];
			//count[idx]++;
		} //카운팅 끝
		
		//해당 i번부터 카드를 검사하겠다.
		int i=0;
		while (i<10) {
			//triplet 검사
			if(count[i]>=3) {
				count[i]-=3;
				System.out.println("triplet이야");
				continue;
			}
			
			//run 검사
			if(i<8 && count[i] >= 1 && count[i+1] >=1 && count[i+2] >=1) {
				count[i]--;
				count[i+1]--;
				count[i+2]--;
				System.out.println("run이야");
				continue;
			}
			
			i++;
		}
		
		
		
	}

}
