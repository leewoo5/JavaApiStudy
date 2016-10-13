package study;

import java.util.Scanner;

public class ArrayEx01 {
	
	public static void main(String[] args) {
		
		//배열생성: 일일히 대입해주거나
		int[] nums = new int[5];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		
		//배열생성: 한번에 대입해주거나
		int[] nums2 = {1,2,3,4,5};
		
		//최소값 찾기
		int[] s = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		int min;
		
		min = s[0];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		System.out.println("최소값은 " + min);
		
		//특정 값 찾기
		int[] s2 = {1,2,3,4,5};
		int key = 4;
		for (int i = 0; i < s2.length; i++) {
			if (key == s2[i] ) {
				System.out.println("찾아낸 특정값은"+s2[i]);
				break;
			}
		}
		
		//성적 5개 입력받아 배열에 담은 후, 합계, 평균, 등급에 따른 학점을 구하기
		
		//점수입력받기
		Scanner input = new Scanner(System.in);
		
		String[] str = new String[5];
		int[] score = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("점수입력>>");
			System.out.println("5개 과목의 성적을 입력하시오");
			str[i] = input.nextLine();
			
			while (true) {
				try {
					score[i] = Integer.parseInt(str[i]);
					break;
				} catch (Exception e) {
					System.out.println("숫자를 입력해 주십시오");
					--i;
					break;
				}
			}
			
		}
		System.out.println("입력완료");
		
		//합계구하기
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("합계는 " + sum + "점");
		
		//평균구하기
		int avg = (sum / 5) / 10;
		
		//등급 구하기
		switch (avg) {
		case  9:    
			System.out.println("A 등급");
			break;
		case  8:    
			System.out.println("B 등급");
			break;
		case  7:    
			System.out.println("C 등급");
			break;
		case  6:    
			System.out.println("D 등급");
			break;
		default:
			System.out.println("F 등급");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}
}





















