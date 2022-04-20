package GuitarIV;

public class MandolinSpec extends InstrumentSpec {
private Style style;
    
    
    public MandolinSpec (Builder builder, String model, Type type,
    		Wood backWood, Wood topWood, Style style) {
    	super(builder, model, type, backWood, topWood);
    	this.style = style;
    }
    
    public Style getStyle() {
    	return this.style;
    }
    
    public boolean matches(MandolinSpec otherSpec) {
    	if (!(super.matches(otherSpec)))
			 return false;
		 if (this.style != otherSpec.getStyle())
			 return false;
		 return true;
    }
}
