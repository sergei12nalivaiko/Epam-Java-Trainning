package by.epam.javaonline.oop.task1.main;

import by.epam.javaonline.oop.task1.bean.Directory;
import by.epam.javaonline.oop.task1.bean.File;
import by.epam.javaonline.oop.task1.interfaces.FileOperations;

public class RunProgramm {

	public static void main(String[] args) {
		
		Directory directory = new Directory("src\\by\\epam\\javaonline\\oop\\task1");
		FileOperations<File> file = new File(directory,"file.txt");
		file.create();
		file.rename("12.txt");
		file.addFile("wugfciyoewgv");
		file.display();
		file.delete();
	}
}
