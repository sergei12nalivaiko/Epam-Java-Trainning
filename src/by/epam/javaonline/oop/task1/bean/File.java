package by.epam.javaonline.oop.task1.bean;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import by.epam.javaonline.oop.task1.interfaces.FileOperations;

public class File implements FileOperations<File>{

	private Directory directory;
	private String name;
	private String content;
	
	public File() {
		super();
	}

	public File(Directory directory) {
		super();
		this.directory = directory;
	}

	public File(Directory directory, String name) {
		super();
		this.directory = directory;
		this.name = name;
	}
	
	public File(Directory directory, String name, String content) {
		super();
		this.directory = directory;
		this.name = name;
		this.content = content;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override
	public void create() {
		Path path = Paths.get(directory.getName(), name);
		if (Files.exists(path)) {
			System.out.println("File already exists");
		} else {
			try {
				Files.createFile(path);
			} catch (Exception e) {
				System.out.println(e);
			}		
		}	
	}

	@Override
	public void rename(String newName) {
		Path path = Paths.get(directory.getName(), name);
		Path newPath = Paths.get(directory.getName(), newName);
		if (Files.notExists(path)) {
			System.out.println("File doesnt exist");
		} else {
			try {
				Files.move(path, newPath);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.setName(newName);
	}

	@Override
	public void addFile(String str) {
			
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.getDirectory().getName()+"\\" + name, true))) {
			bw.write("shdvnsnv");
			this.content += content;
		} catch (IOException exc) {
				System.out.println(exc);
		}
	}
		
	@Override
	public void delete() {
		try {
			Files.delete(Paths.get(directory.getName(), name));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void display() {
		
		final int BSIZE = 1024;
		try {
			@SuppressWarnings("resource")
			FileChannel fc = new FileInputStream(this.getDirectory().getName()+"\\" + name).getChannel();
			ByteBuffer buff = ByteBuffer.allocate(BSIZE);
			try {
				fc.read(buff);
			} catch (IOException e) {
				e.printStackTrace();
			}
			buff.flip();
			while(buff.hasRemaining()) {
				System.out.print((char)buff.get());
			}
			try {
				fc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
