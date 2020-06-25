package by.epam.javaonline.algoritmization.onedimensionalarray;

public class Task4 {

	public static void main(String[] args) {
		
		double max;
		double min;
		int maxPosition = 0;
		int minPosition = 0;
	
		double[] ar = new double[20];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (Math.random() * (100 - (-10)) + (-10));
		}

		show(ar);
		
		max = max(ar);
		min = min(ar);
		
		System.out.println("Максимум = " + max);
		System.out.println("Минимум = " + min);
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == max) {
				maxPosition = i;
			}
			if(ar[i] == min) {
				minPosition = i;
			}
		}
		
		ar[maxPosition] = min;
		ar[minPosition] = max;
		
		show(ar);
	}
	
	public static void show(double[] ar) {

		for (double i : ar) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}
	
	public static double max(double[] ar) {
		
		double max = ar[0];
		
		for (int i = 0; i < ar.length - 1; i++) {
			if((ar[i + 1]) > max) {
				max = ar[i + 1];
			} 			
		}		
		return max;
	}
	
	public static double min(double[] ar) {
		
		double min = ar[0];
		
		for (int i = 0; i < ar.length - 1; i++) {
			if((ar[i + 1]) < min) {
				min = ar[i + 1];
			} 			
		}		
		return min;
	}
	
	

}
