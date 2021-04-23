package by.epam.javaonline.oop.task4.main;


import by.epam.javaonline.oop.task4.logic.TreasureLogic;

public class Runner {

	public static void main(String[] arg) {
		
		TreasureLogic tl = new TreasureLogic();
		tl.maxPrize();
		tl.createFile();
		tl.readFile();
		tl.buyTreasure(100);
	}
}
