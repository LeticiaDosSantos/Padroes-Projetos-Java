package GuitarIII;
//import java.util.List;
import java.util.*;

public class FindGuitarTester {
	public static void main(String[]args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
		List matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, talvez você gote desta(s):\n");
			for(Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec guitarSpec = guitar.getSpec();		
				System.out.println("Guitarra "+guitar.getSerialNumber()+" - "+guitarSpec.getBuilder()+" "+guitarSpec.getModel()+" "+guitarSpec.getType()+" guitar:\n"+guitarSpec.getBackWood()+" na traseira e laterais, e "+guitarSpec.getTopWood()+" no tampo. Possui "+guitarSpec.getNumStrings()+" cordas.\nEla pode ser sua por apenas US$"+guitar.getPrice()+"!\n");
			}
		}else
			System.out.println("Desculpe Erin, não temos nada para você no momento!");		
	}	
		
	private static void initializeInventory(Inventory inventory) {
		GuitarSpec spec1 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
		inventory.addGuitar("V95693", 1499.95, spec1);
		inventory.addGuitar("V99999", 1599.95, spec1);
	}
	
}
