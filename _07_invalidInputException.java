package study;

public class _07_invalidInputException extends Exception {
	
	int wrongA;
	int wrongB;
	
	public _07_invalidInputException(int a, int b) {
		super("�߸��� �Է��Դϴ�.");
		wrongA = a;
		wrongB = b;
	}
	
	public void WrongInput(){
		System.out.println("�߸��� �Է�: " + wrongA + ", " + wrongB);
	}
	
}
