import java.util.Arrays;

public class Queue_05_InsertionSort {

	public static void main(String[] args) {
		
		int[] nums = {69,10,30,2,16,8,31,22};
		
		//���������� �����Ұǵ�~ �迭�� �̿��ؼ� ���� �غ��� �Դϴ�.
		for(int i = 1; i<nums.length; i++) {
			
			int key = nums[i]; //�̹��� ������ ��
			int j;
			
			for(j = i-1; j>=0 && key < nums[j]; j-- ) {
				nums[j+1] = nums[j];
			}// ���� ��ġ�� ã�� �ڷ� �̴� �۾����� ���ÿ������ϰڴ�.
			
			nums[j+1] = key;
			System.out.println(Arrays.toString(nums));		
		}//����Ŭ ������
		System.out.println(Arrays.toString(nums));
	}
	
}
