package study;

public class _06_NameLengthException extends Exception {
	
	String wrongName;
	
	public _06_NameLengthException(String name) {
		super("�̸��� �߸��Ǿ����ϴ�.");
		wrongName = name;
	}
	
	public void ShowWrongName(){
		System.out.println("�߸��� �̸�: " + wrongName );
	}
}
