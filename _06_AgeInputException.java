package study;

public class _06_AgeInputException extends Exception {
	
	int wrongAge;
	
	public _06_AgeInputException() {
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
	public _06_AgeInputException(int age) {
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
		wrongAge = age;
	}
	
	public void showWrongAge(){
		System.out.println("�߸��� ����: "+wrongAge);
	}
	
}
