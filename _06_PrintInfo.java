package study;

import java.util.Scanner;

public class _06_PrintInfo {

	public static void main(String[] args) {
		
		try {
			_06_PersonInfo readInfo = readPersonInfo();
			readInfo.showPersonInfo();
		} catch (_06_NameLengthException e) {
			System.out.println(e.getMessage());
			e.ShowWrongName();
			
		} catch (_06_AgeInputException e) {
			System.out.println(e.getMessage());
			e.showWrongAge();
		}
	}
	
	static _06_PersonInfo readPersonInfo() throws _06_NameLengthException, _06_AgeInputException{
		String name = readName();
		int age = readAge();
		_06_PersonInfo pInfo = new _06_PersonInfo(name, age);
		return pInfo;
	}
	
	static Scanner input = new Scanner(System.in);

	static String readName() throws _06_NameLengthException{
		System.out.printf("이름입력: ");
		String name = input.nextLine();
		if (name.length() < 2) {
			throw new _06_NameLengthException(name);
		}
		return name;
	}
	
	static int readAge() throws _06_AgeInputException{
		System.out.printf("나이입력: ");
		int age = input.nextInt();
		if (age < 0 ) {
			throw new _06_AgeInputException(age);
		}
		return age;
	}
}
