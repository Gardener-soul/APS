public class Stack_01_구현 {
	
	// int 자료형을 stack으로 만들어 보았는데 다양한 자료형도 해보자~~
	public static int[] stack = new int[5];
	public static int top = -1;

	public static void main(String[] args) {
		//예시를 한번 작성해보고 확인도 해보자~~
	}

	// 삽입
	public static void push(int value) {
		// 배열로 만든 스택이므로 작업한개가 추가 된다.
		if (isFull()) {
			System.out.println("가득 차서 더 이상 넣을 수 없어!");
		} else {
//			top++;
//			stack[top] = value;
			stack[++top] = value;
		}
//		return; 생략되어있음.
	}

	// 삽입
	public static void push2(int value) {
		// 배열로 만든 스택이므로 작업한개가 추가 된다.
		if (isFull()) {
			System.out.println("가득 차서 더 이상 넣을 수 없어!");
			// 새로운 배열을 만들어서 복사하는 작업을 넣을 수도 있겠다.
			return;
		}
		stack[++top] = value;
	}

	public static int pop() {
		if (isEmpty()) {
			System.out.println("자료가 텅텅 비어가 꺼낼 것이 없어!");
			return -1; // 이건 주의 요망
		}
		// Python 스러운 코드이다.
//		int value = stack[top];
//		top--;
//		return value;
		// 어차피 top 변수가 다시 데이터를 덮게끔 도와줄것이니까 놔둔다.
		return stack[top--];
	}
	//top이 가르키고 있는 위치 값 확인
	public static int peek() {
		if (isEmpty()) {
			System.out.println("자료가 텅텅 비어가 꺼낼 것이 없어!");
			return -1; // 이건 주의 요망
		}
		return stack[top];
	}

	// 포화상태 체크
	public static boolean isFull() {
		return top == stack.length - 1;
	}

	// 공백상태 체크
	public static boolean isEmpty() {
//		if(top == -1) return true;
//		else return false;

//		if(top == -1) return true;
//		return false;

		return top == -1;
	}

}
