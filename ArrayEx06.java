package study;

public class ArrayEx06 {
	
	public static void main(String[] args) {
		
		//2���� �迭
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{100, 100, 50}
		};
		
		//Ÿ��Ʋ ���
		System.out.println("====                   ����ǥ                  ====");
		System.out.println("====================================================");
		System.out.println("��ȣ" + "\t" + "����"+ "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");
		System.out.println("====================================================");
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		//��: ��ȣ
		for (int i = 0; i < score.length; i++) {
			
			int sum = 0;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf((i+1) + "\t");
			
			//��: ��������
			for (int j = 0; j < score[j].length; j++) {
				sum += score[i][j];
				System.out.printf(score[i][j] + "\t");
			}

			//��: ����, ���
			System.out.printf(sum + "\t");
			float avg = (float)sum / score[i].length;
			System.out.printf("%3.2f", avg);
			System.out.println();
		}
		
		System.out.println("====================================================");
		System.out.println("�հ�:" + "\t" + korTotal + "\t" + engTotal + "\t" + mathTotal + "\t" );
		
		
		
	}	
		
}





















