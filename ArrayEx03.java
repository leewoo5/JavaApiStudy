package study;

import java.util.Arrays;

public class ArrayEx03 {
	
	public static void main(String[] args) {
		
		//배열을 정렬하는 법
		
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		
		Arrays.sort(nums); //배열 정렬
		
		//출력
		for(int valuse : nums ){
			System.out.println(valuse);
		}
		
	}	
		
}





















