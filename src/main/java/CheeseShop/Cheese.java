package CheeseShop;

public class Cheese {
	
	private String name;
	private String description;
	private double price;
	
	public Cheese(String name, String description, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getPrice() {
		return price;
	}

}
