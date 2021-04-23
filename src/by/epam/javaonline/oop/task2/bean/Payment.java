package by.epam.javaonline.oop.task2.bean;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Payment {
	
	private List<Product> products;
	
	{
		products = new ArrayList<Product>();
	}
	
	
	public Payment() {
		super();
	}

	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void deleteProduct(Product product) {
		products.remove(product);
	}
	
	public Product newProduct(String str, BigDecimal prize) {
		return new Product(str,prize);
	}

	public class Product{
		
		private String name;
		private BigDecimal prize;
		
		public Product() {
			super();
		}

		public Product(String name) {
			super();
			this.name = name;
		}

		public Product(String name, BigDecimal prize) {
			super();
			this.name = name;
			this.prize = prize;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public BigDecimal getPrize() {
			return this.prize;
		}
		public void setPrize(BigDecimal prize) {
			this.prize = prize;
		}
		private Payment getEnclosingInstance() {
			return Payment.this;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((prize == null) ? 0 : prize.hashCode());
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
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (prize == null) {
				if (other.prize != null)
					return false;
			} else if (!prize.equals(other.prize))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", prize=" + prize + "]";
		}	
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		Payment other = (Payment) obj;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [products=" + products + "]";
	}
	
}
