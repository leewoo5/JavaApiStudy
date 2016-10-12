package study;

public class contains {

	public static void main(String[] args) {
		/*
		 * contains()는 대상 문자열이 특정 문자열과 완전히 일치하는 놈을 갖고 있는지를 
		 * 판별할 수 있는 메소드이다.
		 * 리턴 타입은 boolean이다.
		 * 기본적으로 특정 문자열과 완전히 일치하는 문자열을 포함하면 true를 리턴하지만
		 * 완전히 일치하는 부분이 전체가 아닌 부분이라도 true를 리턴한다.
		 */

		String s = "leet code";
		String[] dict = {"leet", "code", "leet code", "leetcode"};
		
		boolean result = false;
		
		System.out.println("s = leet code");
		System.out.println("dict = leet, code, leet code");
	
		System.out.println("=====================================================");
		
		for (int i = 0; i < dict.length; i++) {
			result = dict[i].contains(s);
			System.out.println("dict["+i+"]은 'leet code'를 포함하고 있는가? " + result);
		}

		System.out.println("=====================================================");
		
		for (int i = 0; i < dict.length; i++) {
			result = dict[i].contains("leetcode");
			System.out.println("dict["+i+"]은 'leetcode'를 포함하고 있는가? " + result);
		}

		System.out.println("=====================================================");
		
		for (int i = 0; i < dict.length; i++) {
			result = dict[i].contains("leet");
			System.out.println("dict["+i+"]은 'leet'을 포함하고 있는가? " + result);
		}

		System.out.println("=====================================================");

		for (int i = 0; i < dict.length; i++) {
			result = dict[i].contains("code");
			System.out.println("dict["+i+"]은 'code'를 포함하고 있는가? " + result);
		}
	}

}
