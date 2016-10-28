package study;

public class _06_PersonInfo {
	String name;
	int age;
	
	public _06_PersonInfo(){}
	
	public _06_PersonInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println("이름: "+name+" 나이: "+age);
	}
}
