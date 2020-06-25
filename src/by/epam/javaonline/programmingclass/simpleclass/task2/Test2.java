package by.epam.javaonline.programmingclass.simpleclass.task2;

public class Test2 {

	private int a;
	private int b;

	public Test2() {
		this.a = 0;
		this.b = 0;
	}

	public Test2(int x, int y) {
		this.a = x;
		this.b = y;
	}

	public void setA(int x) {
		this.a = x;
	}

	public int getA() {
		return a;
	}

	public void setB(int x) {
		this.b = x;
	}

	public int getB() {
		return b;
	}

	public int summa(int a, int b) {
		return a + b;
	}

	public int max(int a, int b) {
		return a > b ? a : b;
	}
}
