package study;

public class _06_AgeInputException extends Exception {
	
	int wrongAge;
	
	public _06_AgeInputException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
	public _06_AgeInputException(int age) {
		super("유효하지 않은 나이가 입력되었습니다.");
		wrongAge = age;
	}
	
	public void showWrongAge(){
		System.out.println("잘못된 나이: "+wrongAge);
	}
	
}
