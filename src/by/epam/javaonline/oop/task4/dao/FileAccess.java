package by.epam.javaonline.oop.task4.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import by.epam.javaonline.oop.task4.bean.DragonCave;

public class FileAccess {
	
	
	public FileAccess() {
		super();
		
	}

	public void writeFile(DragonCave dragonCave) {
		try {
			JAXBContext context= JAXBContext.newInstance(DragonCave.class);
			Marshaller m = context.createMarshaller();
			m.marshal(dragonCave, new FileOutputStream("src\\by\\epam\\javaonline\\oop\\task4\\treasure.xml"));
		}catch(FileNotFoundException e){
			System.out.println("XML-файл не может быть создан: " + e);
		}catch (JAXBException e) {
			 System.out.println("JAXB-контекст ошибочен " + e);
		}
	}
	
	public void readFile(DragonCave dragonCave) {
		try {
			JAXBContext context= JAXBContext.newInstance(DragonCave.class);
			Unmarshaller um = context.createUnmarshaller();
			FileReader reader = new FileReader("src\\by\\epam\\javaonline\\oop\\task4\\treasure.xml");
			dragonCave = (DragonCave)um.unmarshal(reader);
			//System.out.println(dragonCave.getTreasureList());
		}catch (JAXBException e) {
			 e.printStackTrace();
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 }
	}

}
