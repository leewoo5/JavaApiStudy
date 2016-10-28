package study;

public class _07_invalidInputException extends Exception {
	
	int wrongA;
	int wrongB;
	
	public _07_invalidInputException(int a, int b) {
		super("잘못된 입력입니다.");
		wrongA = a;
		wrongB = b;
	}
	
	public void WrongInput(){
		System.out.println("잘못된 입력: " + wrongA + ", " + wrongB);
	}
	
}
