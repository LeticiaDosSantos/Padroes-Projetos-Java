package GuitarIV;

public abstract class InstrumentSpec {
	private Builder builder;
	private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    
    
    public InstrumentSpec (Builder builder, String model, Type type,
    		Wood backWood, Wood topWood) {
   	  this.builder = builder;
  	  this.model = model;
  	  this.type = type;
  	  this.backWood = backWood;
  	  this.topWood = topWood;
    }
    
    
    public Builder getBuilder() {
  	  return this.builder;
    }
    
    public Type getType() {
  	  return this.type;
    }
    
    public String getModel() {
  	  return this.model;
    }
    
    
    public Wood getBackWood() {
  	  return this.backWood;
    }
    
    public Wood getTopWood() {
  	  return this.topWood;
    }
    
    
    public boolean matches(InstrumentSpec otherSpec) {
    	if (this.builder != otherSpec.getBuilder())
			 return false;
		 if ((model != null)&&(!model.equals("")&&
				 !model.equals(otherSpec.getModel().toLowerCase())))
			 return false;
		 if (this.type != otherSpec.getType())
			 return false;
		 if (this.backWood != otherSpec.getBackWood())
			 return false; 
		 if (this.topWood != otherSpec.getTopWood())
   			 return false;
		 return true;
    }
}
