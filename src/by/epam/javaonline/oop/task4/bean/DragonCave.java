package by.epam.javaonline.oop.task4.bean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import by.epam.javaonline.oop.task4.logic.TreasureLogic;
@XmlRootElement
public class DragonCave implements Comparator<Treasure>{
	
	private Dragon dragon;
	@XmlElement(name="treasure")
	private List<Treasure> treasureList; 
	
	public DragonCave() {
	
		treasureList = new ArrayList<Treasure>();
		dragon = Dragon.getDragon();
	
		TreasureLogic.createTreasure(treasureList);
	}
	
	public Dragon getDragon() {
		return dragon;
	}

	public List<Treasure> getTreasureList() {
		return treasureList;
	}

	@Override
	public int compare(Treasure o1, Treasure o2) {
		return Integer.valueOf(o1.getPrize()).compareTo(o2.getPrize());
	}
	
}
