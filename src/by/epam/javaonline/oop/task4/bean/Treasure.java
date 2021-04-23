package by.epam.javaonline.oop.task4.bean;




import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Treasure")

public class Treasure{
	
	@XmlElement(required = true)
	private int ID;
	@XmlElement(required = true)
	private String name;
	@XmlElement(required = true)
	private int prize;
	
	
	public Treasure() {
		super();
	}
	
	public Treasure(int ID, String name, int prize) {
		super();
		this.ID = ID;
		this.name = name;
		this.prize = prize;
	}
	
	
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrize() {
		return prize;
	}
	
	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + prize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (prize != other.prize)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treasure [ID=" + ID + ", name=" + name + ", prize=" + prize + "]";
	}

}
