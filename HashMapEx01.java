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
			
			System.out.println("아이디와 비밀번호를 입력하세요!!");
			
			System.out.println("아이디: ");
			String id = scan.nextLine();
			
			System.out.println("비밀번호: ");
			String pw = scan.nextLine();
			
			System.out.println();
			
			if (map.containsKey(id)) {
				
				if (map.get(id).equals(pw)) {
					
					System.out.println("로그인 성공");
					return;
					
				} else {
					
					System.out.println("비밀번호가 일치하지 않습니다.");
					
				}
				
			} else {
				
				System.out.println("존재하지 않는 아이디 입니다.");
			
			}
			
		}
		
	}

}
