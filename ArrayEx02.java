package study;

import java.util.Arrays;

public class ArrayEx02 {
	
	public static void main(String[] args) {
		
		//for-each : ������� �迭�� ��� ��ҿ� �ݺ�ó���� �� �� ���
		
		int[] nums = {1,2,3,4,5};
		
		for(int values : nums ){
			int result = values + 1;
			System.out.println(result);
		}
		
		//�迭�� ��� ��Ҹ� ����ϴ� ������ ���
		System.out.println(Arrays.toString(nums));
		
	}	
		
}





















