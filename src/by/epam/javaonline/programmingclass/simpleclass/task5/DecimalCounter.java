package by.epam.javaonline.programmingclass.simpleclass.task5;

import java.util.Scanner;

public class DecimalCounter {

	private int counter;
	private int increaseIndex;
	private int decreaseIndex;

	public DecimalCounter() {
		this.counter = 0;
		this.increaseIndex = 1;
		this.decreaseIndex = 1;
	}

	public DecimalCounter(int counter, int increaseIndex, int decreaseIndex) {
		this.counter = counter;
		this.increaseIndex = increaseIndex;
		this.decreaseIndex = decreaseIndex;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setIncreaseIndex(int increaseIndex) {
		this.increaseIndex = increaseIndex;
	}

	public int getIncreaseIndex(int increaseIndex) {
		return this.increaseIndex;
	}

	public void setDecreaseIndex(int decreaseIndex) {
		this.decreaseIndex = decreaseIndex;
	}

	public int getDecreaseIndex(int decreaseIndex) {
		return this.decreaseIndex;
	}

	public void increaseCounter() {
		int increaseCounterIndex = 0;
		boolean flag = true;
		Scanner in = new Scanner(System.in);
		while (flag == true) {
			System.out.println("Enter value:");

			while (!in.hasNextInt()) {
				in.next();

				System.out.println("Enter value:");
			}
			increaseCounterIndex = in.nextInt();
			flag = false;
		}
		counter += increaseCounterIndex;
		
		//in.close();
	}

	public void decreaseCounter() {
		int decreaseCounterIndex = 0;
		boolean flag = true;
		Scanner in = new Scanner(System.in);
		while (flag == true) {
			System.out.println("Enter value:");

			while (!in.hasNextInt()) {
				in.next();

				System.out.println("Enter value:");
			}
			decreaseCounterIndex = in.nextInt();
			flag = false;
		}
		//in.close();
		counter -= decreaseCounterIndex;
	}

	public int currentState() {
		return counter;
	}
}
