package study;

import java.util.StringTokenizer;

public class StringTokenizerAndSplit {

	public static void main(String[] args) {
		
		/*
		 * 문자열을 자르는 것은 StringTokenizer와 split을 이용해서 할 수 있다.
		 * StringTokenizer는 "남자,, 서울 강남구"처럼 null값이 있을 경우 null을 무시해 버린다.
		 * 즉, 실제 출력은 "남자, 서울 강남구"가 되어 버린다.
		 * 이 경우는 구분자 앞뒤로 공백을 주어 토큰을 trim 처리해서 공백을 지워버리면 되지만, 
		 * split은 null이 있을 경우에도 무시하지 않으므로 차라리 해당 문자열이 적을 경우 split을 쓰는게 편하다.
		 * 대용량의 작업을 split으로 처리하면 속도가 굉장히 떨어져 비효율적이므로 사황에 따라서 적절히 사용하는게 좋다.  
		 */
		
		String txt = "홍길동,28,남자,서울 강남구";
		
		//StringTokenizer를 통한 문자열 분리
		StringTokenizer tokens = new StringTokenizer(txt);
		
		String name = tokens.nextToken(",");
		String age  = tokens.nextToken(",");
		String sex  = tokens.nextToken(",");
		String loc  = tokens.nextToken(",");
		
		System.out.println("[String Tokenizer 이용]");
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(loc);
		
		System.out.println("");
		
		
		//split을 이용한 문자열 분리
		String[] txtArr = txt.split(",");
		
		System.out.println("[split 이용]");
		for (int i = 0; i < txtArr.length; i++) {
			System.out.println(txtArr[i]);
		}
	}

}














