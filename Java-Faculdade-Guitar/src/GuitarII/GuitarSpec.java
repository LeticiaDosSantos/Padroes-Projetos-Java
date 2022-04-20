package GuitarII;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
