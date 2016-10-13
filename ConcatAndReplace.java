package study;

public class ConcatAndReplace {
	public static void main(String[] args) {
		
		/*
		 * 기본적인 문자열 처리 방법들
		 * 
		 */
	
		String str = "A barking Dog";
		String number = "12345";
		String s1, s2, s3, s4, s5;
		int s6;
		int s7 = 5;
		
		str.length(); //문자열의 길이를 구함
		System.out.println(str.length());
		s1 = str.concat(" never Bites!"); //문자열을 결합
		s2 = str.replace("B", "b"); //B(old)를 b(new)로 변환
		s3 = str.substring(2, 5); //2번 인덱스부터 5번 인덱스까지의 문자열 추출
		s4 = str.toUpperCase(); //대문자로 변환
		s5 = str.toLowerCase(); //소문자로 변환
		
		s6 = Integer.parseInt(number); //문자형을 숫자형으로 변환(문자형을 숫자형으로 변환하려면 wrapper 클래스를 사용)
		
		String result = s7+""; //숫자형을 문자형으로 변환(숫자형을 문자형으로 변환하려면 숫자형을 문자열과 결합)
		System.out.println(result); 
	}
}
