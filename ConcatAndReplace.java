package study;

public class ConcatAndReplace {
	public static void main(String[] args) {
		
		/*
		 * �⺻���� ���ڿ� ó�� �����
		 * 
		 */
	
		String str = "A barking Dog";
		String number = "12345";
		String s1, s2, s3, s4, s5;
		int s6;
		int s7 = 5;
		
		str.length(); //���ڿ��� ���̸� ����
		System.out.println(str.length());
		s1 = str.concat(" never Bites!"); //���ڿ��� ����
		s2 = str.replace("B", "b"); //B(old)�� b(new)�� ��ȯ
		s3 = str.substring(2, 5); //2�� �ε������� 5�� �ε��������� ���ڿ� ����
		s4 = str.toUpperCase(); //�빮�ڷ� ��ȯ
		s5 = str.toLowerCase(); //�ҹ��ڷ� ��ȯ
		
		s6 = Integer.parseInt(number); //�������� ���������� ��ȯ(�������� ���������� ��ȯ�Ϸ��� wrapper Ŭ������ ���)
		
		String result = s7+""; //�������� ���������� ��ȯ(�������� ���������� ��ȯ�Ϸ��� �������� ���ڿ��� ����)
		System.out.println(result); 
	}
}
