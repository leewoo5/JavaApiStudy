package study;

public class contains {

	public static void main(String[] args) {
		/*
		 * contains()�� ��� ���ڿ��� Ư�� ���ڿ��� ������ ��ġ�ϴ� ���� ���� �ִ����� 
		 * �Ǻ��� �� �ִ� �޼ҵ��̴�.
		 * ���� Ÿ���� boolean�̴�.
		 * �⺻������ Ư�� ���ڿ��� ������ ��ġ�ϴ� ���ڿ��� �����ϸ� true�� ����������
		 * ������ ��ġ�ϴ� �κ��� ��ü�� �ƴ� �κ��̶� true�� �����Ѵ�.
		 */

		String s = "leet code";
		String[] dict = {"leet", "code", "leet code", "leetcode"};
		
		boolean result = false;
		
		System.out.println("s = leet code");
		System.out.println("dict = leet, code, leet code");
	
		System.out.println("=====================================================");
		
		for (int i = 0; i < dict.length; i++) {
			result = dict[i].contains(s);
			System.out.println("dict["+i+"]�� 'leet code'�� �����ϰ� �ִ°�? " + result);
		}

		System.out.println("=====================================================");
		
		for (int i = 0; i < dict.length; i++) {
			result = dict[i].contains("leetcode");
			System.out.println("dict["+i+"]�� 'leetcode'�� �����ϰ� �ִ°�? " + result);
		}

		System.out.println("=====================================================");
		
		for (int i = 0; i < dict.length; i++) {
			result = dict[i].contains("leet");
			System.out.println("dict["+i+"]�� 'leet'�� �����ϰ� �ִ°�? " + result);
		}

		System.out.println("=====================================================");

		for (int i = 0; i < dict.length; i++) {
			result = dict[i].contains("code");
			System.out.println("dict["+i+"]�� 'code'�� �����ϰ� �ִ°�? " + result);
		}
	}

}
