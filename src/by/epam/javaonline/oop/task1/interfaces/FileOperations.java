package by.epam.javaonline.oop.task1.interfaces;

import by.epam.javaonline.oop.task1.bean.File;

public interface FileOperations<T extends File> {
	void create();
	void rename(String newName);
	void addFile(String content);
	void delete();
	void display();
}
