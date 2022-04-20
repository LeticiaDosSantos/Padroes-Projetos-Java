package GuitarIII;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings= numStrings; 
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
	
	public int getNumStrings(){
		return this.numStrings;
	}
	
	public boolean matches(GuitarSpec otherSpec) {
		if(this.builder != otherSpec.getBuilder())
			return false;
		if((model != null )&&(!model.equals("")&&!model.equals(otherSpec.model)))
			return false;
		if(this.type != otherSpec.getType())
			return false;
		if(this.backWood != otherSpec.getBackWood())
			return false;
		if(this.topWood != otherSpec.getTopWood())
			return false;
		if(this.numStrings != otherSpec.getNumStrings())
			return false;
		
		return true;
	}
}
