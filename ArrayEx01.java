package study;

import java.util.Scanner;

public class ArrayEx01 {
	
	public static void main(String[] args) {
		
		//�迭����: ������ �������ְų�
		int[] nums = new int[5];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		
		//�迭����: �ѹ��� �������ְų�
		int[] nums2 = {1,2,3,4,5};
		
		//�ּҰ� ã��
		int[] s = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		int min;
		
		min = s[0];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		System.out.println("�ּҰ��� " + min);
		
		//Ư�� �� ã��
		int[] s2 = {1,2,3,4,5};
		int key = 4;
		for (int i = 0; i < s2.length; i++) {
			if (key == s2[i] ) {
				System.out.println("ã�Ƴ� Ư������"+s2[i]);
				break;
			}
		}
		
		//���� 5�� �Է¹޾� �迭�� ���� ��, �հ�, ���, ��޿� ���� ������ ���ϱ�
		
		//�����Է¹ޱ�
		Scanner input = new Scanner(System.in);
		
		String[] str = new String[5];
		int[] score = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("�����Է�>>");
			System.out.println("5�� ������ ������ �Է��Ͻÿ�");
			str[i] = input.nextLine();
			
			while (true) {
				try {
					score[i] = Integer.parseInt(str[i]);
					break;
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��� �ֽʽÿ�");
					--i;
					break;
				}
			}
			
		}
		System.out.println("�Է¿Ϸ�");
		
		//�հ豸�ϱ�
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("�հ�� " + sum + "��");
		
		//��ձ��ϱ�
		int avg = (sum / 5) / 10;
		
		//��� ���ϱ�
		switch (avg) {
		case  9:    
			System.out.println("A ���");
			break;
		case  8:    
			System.out.println("B ���");
			break;
		case  7:    
			System.out.println("C ���");
			break;
		case  6:    
			System.out.println("D ���");
			break;
		default:
			System.out.println("F ���");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}
}





















