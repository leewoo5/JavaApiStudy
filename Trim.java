package study;

public class Trim {
	public static void main(String[] args) {
		
		/*
		 * 문자열을 처리하다보면 앞뒤의 공백을 제거해야 하는 경우가 있다.
		 * 이때 trim()을 사용하면 쉽게 처리할 수 있다.
		 * trim()은 문자열의 처음과 마지막에 위치한 공백을 제거한 값을 리턴한다. 
		 */
	
		String temp = " 서울 특별시 강남구 ";
		temp = temp.trim();
		System.out.println(temp);
	}
}
