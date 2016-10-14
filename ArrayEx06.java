package study;

public class ArrayEx06 {
	
	public static void main(String[] args) {
		
		//2차원 배열
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{100, 100, 50}
		};
		
		//타이틀 출력
		System.out.println("====                   성적표                  ====");
		System.out.println("====================================================");
		System.out.println("번호" + "\t" + "국어"+ "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
		System.out.println("====================================================");
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		//행: 번호
		for (int i = 0; i < score.length; i++) {
			
			int sum = 0;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf((i+1) + "\t");
			
			//열: 과목점수
			for (int j = 0; j < score[j].length; j++) {
				sum += score[i][j];
				System.out.printf(score[i][j] + "\t");
			}

			//열: 총점, 평균
			System.out.printf(sum + "\t");
			float avg = (float)sum / score[i].length;
			System.out.printf("%3.2f", avg);
			System.out.println();
		}
		
		System.out.println("====================================================");
		System.out.println("합계:" + "\t" + korTotal + "\t" + engTotal + "\t" + mathTotal + "\t" );
		
		
		
	}	
		
}





















