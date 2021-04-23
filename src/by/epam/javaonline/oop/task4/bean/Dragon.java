package by.epam.javaonline.oop.task4.bean;

public class Dragon {
	
	private String name;
	private final static Dragon DRAGON = new Dragon("Draco");
	
	private Dragon(String name) {
		this.name = name;
	}

	public static Dragon getDragon() {
		return DRAGON;
	}

	public String getName() {
		return name;
	}
}
