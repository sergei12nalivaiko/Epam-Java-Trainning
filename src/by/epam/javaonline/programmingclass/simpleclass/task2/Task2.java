package by.epam.javaonline.programmingclass.simpleclass.task2;

public class Task2 {

	public static void main(String[] args) {
		
		Test2 test1 = new Test2();
		System.out.println("Object test1: " + test1.getA() + "\t\t" + test1.getB());
		Test2 test2 = new Test2(13, 20);
		System.out.println("Object test2: " + test2.getA() + "\t\t" + test2.getB());
		test2.setA(1000);
		test2.setB(2000);
		System.out.println("Object test2: " + test2.getA() + "\t\t" + test2.getB());
		System.out.println("Summa = " + test2.summa(test2.getA(), test2.getB()));
		System.out.println("Max digit = " + test2.max(test2.getA(), test2.getB()));
	}

}
