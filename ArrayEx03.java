package study;

import java.util.Arrays;

public class ArrayEx03 {
	
	public static void main(String[] args) {
		
		//�迭�� �����ϴ� ��
		
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		
		Arrays.sort(nums); //�迭 ����
		
		//���
		for(int valuse : nums ){
			System.out.println(valuse);
		}
		
	}	
		
}





















