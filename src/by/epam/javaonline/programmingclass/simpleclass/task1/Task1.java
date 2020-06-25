package by.epam.javaonline.programmingclass.simpleclass.task1;

public class Task1 {

	public static void main(String[] args) {

		Test1 test1 = new Test1();
		System.out.println("Object test1: " + test1.getA() + "\t\t" + test1.getB());
		Test1 test2 = new Test1(5, 10);
		System.out.println("Object test2: " + test2.getA() + "\t\t" + test2.getB());
		test2.setA(200);
		test2.setB(300);
		System.out.println("Object test2: " + test2.getA() + "\t\t" + test2.getB());
		System.out.println("Summa = " + test2.summa(test2.getA(), test2.getB()));
		System.out.println("Max digit = " + test2.max(test2.getA(), test2.getB()));
	}

}
