package study;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		
		map.put("id1", "pw1");
		map.put("id2", "pw2");
		map.put("id3", "pw3");
		map.put("id4", "pw4");
		map.put("id5", "pw5");
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���!!");
			
			System.out.println("���̵�: ");
			String id = scan.nextLine();
			
			System.out.println("��й�ȣ: ");
			String pw = scan.nextLine();
			
			System.out.println();
			
			if (map.containsKey(id)) {
				
				if (map.get(id).equals(pw)) {
					
					System.out.println("�α��� ����");
					return;
					
				} else {
					
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					
				}
				
			} else {
				
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
			
			}
			
		}
		
	}

}
