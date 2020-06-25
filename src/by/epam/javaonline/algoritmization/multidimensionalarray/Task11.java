package by.epam.javaonline.algoritmization.multidimensionalarray;

//ћатрицу 10x20 заполнить случайными числами от 0 до 15. ¬ывести на экран саму матрицу и 
//номера строк, в которых число 5 встречаетс€ три и более раз. 

public class Task11 {

	public static void main(String[] args) {
				
		int [][] ar = new int[10][20];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int)(Math.random() * 15);
			}
			System.out.println();
		}
		
		show(ar);
		taskDecision(ar);
	}
	
	public static void show(int[][] ar) {

		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}		
		
	}
	
	public static void taskDecision(int[][] ar) {
		
		int counter = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length;j++) {				
				if(ar[i][j] == 5) {
					counter++;					
				}
			}
			if(counter > 2) {
				System.out.println("Ќомер строки = " + i);
			}
			counter = 0;
		}
	}

}
