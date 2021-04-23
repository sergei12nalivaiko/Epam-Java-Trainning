package by.epam.javaonline.oop.task4.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import by.epam.javaonline.oop.task4.bean.DragonCave;
import by.epam.javaonline.oop.task4.bean.Treasure;
import by.epam.javaonline.oop.task4.dao.FileAccess;


public class TreasureLogic {

	private FileAccess fileAccess;
	private DragonCave dragonCave;
	
	{
		fileAccess = new FileAccess();
		dragonCave = new DragonCave();
	}	
	
	public TreasureLogic() {
		super();
	}

	

	public FileAccess getFileAccess() {
		return fileAccess;
	}



	public void setFileAccess(FileAccess fileAccess) {
		this.fileAccess = fileAccess;
	}



	public DragonCave getDragonCave() {
		return dragonCave;
	}



	public void setDragonCave(DragonCave dragonCave) {
		this.dragonCave = dragonCave;
	}



	public static void createTreasure(List<Treasure> treasureList) {
		for(int i = 0; i < 100; i++) {
				treasureList.add(new Treasure(i,"treasure " + i, (int)((Math.random() * (100-20))+20)));
		}
	}
	
	public void createFile() {
		fileAccess.writeFile(dragonCave);
	}
	public void readFile() {
		fileAccess.readFile(dragonCave);
	}
	
	public void maxPrize() {
		Collections.sort(dragonCave.getTreasureList(), new DragonCave());
		System.out.println("Dearest treasure - " + dragonCave.getTreasureList().get(dragonCave.getTreasureList().size() - 1)); 
	}
	
	public void buyTreasure(int money){
		int ID;
		int counterMoney = 0;
		Treasure selectedTreasure;
		List<Treasure> boughtTreasures = new ArrayList<Treasure>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID of the treasure");
		System.out.print(">>");
		while(sc.hasNextInt()) {		
			ID = sc.nextInt();
			selectedTreasure = findTreasure(ID);
			if(money  > counterMoney +  (selectedTreasure.getPrize())) {
				boughtTreasures.add(selectedTreasure);
				counterMoney+=selectedTreasure.getPrize();
				System.out.println("Your treasure is - " + selectedTreasure);
				System.out.println("Enter ID of the treasure");
				System.out.print(">>");
			}else {
				System.out.println("Not enought money!");
				break;
			}		
		}	
		sc.close();
	}
	
	public Treasure findTreasure(int ID) {
		Treasure selectedTreasure = dragonCave.getTreasureList().stream()
					.filter(treasure ->Integer.valueOf(ID)
					.equals(treasure.getID()))
					.findAny().orElse(null);
		return selectedTreasure;
	}
}
