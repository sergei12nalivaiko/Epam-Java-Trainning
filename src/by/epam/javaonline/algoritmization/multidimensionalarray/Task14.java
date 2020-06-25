package by.epam.javaonline.algoritmization.multidimensionalarray;

//������������ ��������� ������� m x n, ��������� �� ����� � ������, ������ � ������ 
//������� ����� ������ ����� ������ �������. 


public class Task14 {
	
	public static void main(String[] args) {
		
		int[][] ar = new int [10][10];
		taskDecision(ar);
	}
		
	public static void show(int[][] ar) {

		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void taskDecision(int[][] ar) {
				
		for(int i = 0; i < ar.length; i++) {
			
			for(int j = 0; j < ar[i].length; j++) {
				if(i >= j) {
					ar[j][i] = 1;					
				}								
			}
			System.out.println();
		}
		show(ar);		
	}
}
