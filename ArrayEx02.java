package study;

import java.util.Arrays;

public class ArrayEx02 {
	
	public static void main(String[] args) {
		
		//for-each : 순차대로 배열의 모든 요소에 반복처리를 할 때 사용
		
		int[] nums = {1,2,3,4,5};
		
		for(int values : nums ){
			int result = values + 1;
			System.out.println(result);
		}
		
		//배열의 모든 요소를 출력하는 간편한 방법
		System.out.println(Arrays.toString(nums));
		
	}	
		
}





















