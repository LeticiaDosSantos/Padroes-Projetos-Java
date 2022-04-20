package GuitarIV;
import java.util.*;

public class FindInstrumentTester {

   public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,"Stratocastor", Type.ELETRIC, Wood.ALDER,Wood.ALDER,6);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
        	System.out.println("Erin, talvez voc� goste destas: ");
        	for (Guitar guitar: matchingGuitars) {
        	         GuitarSpec guitarSpec = (GuitarSpec)guitar.getSpec();
        	         System.out.println("Guitarra: " + guitar.getSerialNumber() + " " + guitarSpec.getBuilder()+ " " + guitarSpec.getModel()+ " " +
        			guitarSpec.getType()+ " guitar:\n " + guitarSpec.getBackWood() + 
        			" na traseira e laterais, \n" + guitarSpec.getTopWood() +
        			" no tampo, " + guitarSpec.getNumStrings() + " cordas\n Ela pode ser sua por apenas US$"+ 
        			guitar.getPrice() + "!");
        	}
        }else
        	System.out.println("Desculpe Erin, n�o temos nada para voc�");
        	
        
        
        
        
        MandolinSpec whatBobLikes = new MandolinSpec(Builder.FENDER,"Stratocastor", Type.ELETRIC, Wood.ALDER,Wood.ALDER, Style.A);
		List<Mandolin> matchingMandolins = inventory.search(whatBobLikes);
        if (!matchingMandolins.isEmpty()) {
        	System.out.println("Bob, talvez voc� goste destas: ");
        	for (Mandolin mandolin: matchingMandolins) {
        			MandolinSpec mandolinSpec = (MandolinSpec)mandolin.getSpec();
        	         System.out.println("Mandolin: " + mandolin.getSerialNumber() + " " + mandolinSpec.getBuilder()+ " " + mandolinSpec.getModel()+ " " +
        	        mandolinSpec.getType()+ " mandolin:\n " + mandolinSpec.getBackWood() + 
        			" na traseira e laterais, \n" + mandolinSpec.getTopWood() +
        			" no tampo, " + mandolinSpec.getStyle() + " estilo.\n Ela pode ser sua por apenas US$"+ 
        			mandolin.getPrice() + "!");
        	}
        }else
        	System.out.println("Desculpe Bob, n�o temos nada para voc�");
        
        
        
        
        }
		
			   
		private static void initializeInventory(Inventory inventory) {
			GuitarSpec spec1 = new GuitarSpec(Builder.FENDER, "stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);	
			inventory.addInstrument("V95693", 1499.95, spec1);
			inventory.addInstrument("V99999", 1599.95, spec1);
			MandolinSpec spec2 = new MandolinSpec(Builder.FENDER, "stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, Style.A);
			inventory.addInstrument("M12345", 1000.00, spec2);
		}
		
	}


