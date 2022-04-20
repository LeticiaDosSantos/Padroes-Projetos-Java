package GuitarIV;

public class GuitarSpec extends InstrumentSpec {
	private Builder builder;
	private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;
    
    
    public GuitarSpec (Builder builder, String model, Type type,
    		Wood backWood, Wood topWood, int numStrings) {
    	super(builder, model, type, backWood, topWood);
    	this.numStrings = numStrings;
    }
    
    public int getNumStrings() {
    	return this.numStrings;
    }
    
    public boolean matches(GuitarSpec otherSpec) {
    	if (!(super.matches(otherSpec)))
			 return false;
		 if (this.numStrings != otherSpec.getNumStrings())
			 return false;
		 return true;
    }
}
