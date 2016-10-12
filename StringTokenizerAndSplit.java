package study;

import java.util.StringTokenizer;

public class StringTokenizerAndSplit {

	public static void main(String[] args) {
		
		/*
		 * ���ڿ��� �ڸ��� ���� StringTokenizer�� split�� �̿��ؼ� �� �� �ִ�.
		 * StringTokenizer�� "����,, ���� ������"ó�� null���� ���� ��� null�� ������ ������.
		 * ��, ���� ����� "����, ���� ������"�� �Ǿ� ������.
		 * �� ���� ������ �յڷ� ������ �־� ��ū�� trim ó���ؼ� ������ ���������� ������, 
		 * split�� null�� ���� ��쿡�� �������� �����Ƿ� ���� �ش� ���ڿ��� ���� ��� split�� ���°� ���ϴ�.
		 * ��뷮�� �۾��� split���� ó���ϸ� �ӵ��� ������ ������ ��ȿ�����̹Ƿ� ��Ȳ�� ���� ������ ����ϴ°� ����.  
		 */
		
		String txt = "ȫ�浿,28,����,���� ������";
		
		//StringTokenizer�� ���� ���ڿ� �и�
		StringTokenizer tokens = new StringTokenizer(txt);
		
		String name = tokens.nextToken(",");
		String age  = tokens.nextToken(",");
		String sex  = tokens.nextToken(",");
		String loc  = tokens.nextToken(",");
		
		System.out.println("[String Tokenizer �̿�]");
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(loc);
		
		System.out.println("");
		
		
		//split�� �̿��� ���ڿ� �и�
		String[] txtArr = txt.split(",");
		
		System.out.println("[split �̿�]");
		for (int i = 0; i < txtArr.length; i++) {
			System.out.println(txtArr[i]);
		}
	}

}














