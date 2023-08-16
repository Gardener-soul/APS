import java.util.Arrays;

public class Stack_04_함수호출 {
	
	public static void main(String[] args) {
		System.out.println("메인함수 실행");
		func1();
		System.out.println("메인함수 종료");
	}
	
	public static void func1() {
		int a = 10;
		String name = "조현수";
		int[] nums = {1,2,3};
		System.out.println("함수1 실행");
		a = func2(a, name, nums);
		System.out.println(a);
		System.out.println(name);
		System.out.println(Arrays.toString(nums));
		System.out.println("함수1 종료");
	}
	
	public static int func2(int a, String name, int[] nums) {
//		int a = 10;
		a = 20;
		name = "이건희";
		nums[1] = 10;
		System.out.println("함수2 실행");
		System.out.println("함수2 종료");
		return a;
	}
}
