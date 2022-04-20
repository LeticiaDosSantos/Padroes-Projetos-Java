package GuitarI;

public class FindGuitarTester {
	public static void main(String[]args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar(" " , 0, Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER);
		Guitar guitar = inventory.search(whatErinLikes);
		if(guitar != null) 
			System.out.println("Erin, talvez você gote desta:\n"+guitar.getBuilder()+" "+guitar.getModel()+" "+guitar.getType()+" guitar:\n"+guitar.getBackWood()+" na traseira e laterais, e "+guitar.getTopWood()+" no tampo.\nEla pode ser sua por apenas US$"+guitar.getPrice()+"!");
		else
			System.out.println("Desculpe Erin, não temos nada para você no momento!");		
	}	
		
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER);
	}
	
}
