package GuitarI;
public class Guitar {
	private String serialNumber, model;
	private double price;
	private Builder builder;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public Guitar(String serialNumber, double price, Builder builder,
	String model, Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getSerialNumber(){
		return serialNumber;
	}

	public double getPrice(){
		return this.price;
	}

	public void setPrice(double newPrice){
		this.price = newPrice;
	}

	public Builder getBuilder(){
		return this.builder;
	}
	
	public Type getType(){
		return this.type;
	}

	public String getModel(){
		return this.model;
	}

	public Wood getBackWood(){
		return this.backWood;
	}

	public Wood getTopWood(){
		return this.topWood;
	}

}