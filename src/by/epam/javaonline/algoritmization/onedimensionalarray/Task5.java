package by.epam.javaonline.algoritmization.onedimensionalarray;

//���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ��� ������� �i > i. 


public class Task5 {

	public static void main(String[] args) {
		
		int[] ar = new int [20];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * (100 + (-10)) + (-10));
		}
		
		show(ar);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println("---");
		}
		
		
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] > i) {
				System.out.print(ar[i] + "   ");
			}
		}
	}
	
	public static void show(int[] ar) {

		for (int i : ar) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}

}
