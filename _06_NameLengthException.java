package study;

public class _06_NameLengthException extends Exception {
	
	String wrongName;
	
	public _06_NameLengthException(String name) {
		super("이름이 잘못되었습니다.");
		wrongName = name;
	}
	
	public void ShowWrongName(){
		System.out.println("잘못된 이름: " + wrongName );
	}
}
