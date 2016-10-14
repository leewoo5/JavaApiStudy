package study;

import java.util.Arrays;

public class ArrayEx04 {
	
	public static void main(String[] args) {
		
		//2차원 배열
		int [][] nums = {
				{10, 20},
				{30, 40},
				{50, 60}
		};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(nums[i][j]+" ");
				if (j==1) {
					System.out.println();
				}
			}
		}
		
		//2차원 배열의 합계와 평균 구하기
		
		//선언
		int[][] array = {
				{90,95,80,89,98},
				{98,87,89,86,79},
				{87,89,88,85,92}
		};  
		
		//각 행의 합계와 평균 구하기
		int[] sum = new int[array.length];
		float[] avg = new float[array.length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum[i] += array[i][j];
				avg[i] = sum[i] / array.length;
			}
		}
		System.out.println(Arrays.toString(sum));
		System.out.println(Arrays.toString(avg));
		
		for (float f : avg) {
			System.out.printf("%3.2f", f);
			System.out.println();
		}
	}	
		
}





















