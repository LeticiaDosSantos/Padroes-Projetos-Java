package GuitarV;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindInstrumentTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backwood", Wood.MAPLE);

		InstrumentSpec clienteSpec = new InstrumentSpec(properties);
		List matchingInstruments = inventory.search(clienteSpec);

		if (!matchingInstruments.isEmpty()) {
			System.out.println("Talvez você goste desses instrumentos");
			for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println(spec.getProperty("instrumentType") + " com as seguintes propriedades ");
				for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println(" " + propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println("Ele pode ser seu por apenas $" + instrument.getPrice() + "\n");
			}
		} else
			System.out.println("Desculpe, não temos nada para você");
	}

	private static void initializeInventory(Inventory inventory) {

		Map properties = new HashMap();

		properties.put("instrumentType", InstrumentType.MANDOLIN);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "F5-G");
		properties.put("type", Type.ACOUSTIC);
		properties.remove("numstrings");
		properties.put("topwood", Wood.MAPLE);
		properties.put("backwood", Wood.MAPLE);
		properties.put("style", Style.A);
		inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.BANJO);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "RB-3");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numstrings", 5);
		properties.remove("topwood");
		properties.put("backwood", Wood.MAPLE);
		properties.remove("style");
		inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numstrings", 6);
		properties.put("topwood", Wood.SITKA);
		properties.put("backwood", Wood.INDIAN_ROSEWOOD);
		inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.MARTIN);
		properties.put("model", "D-18");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numstrings", 6);
		properties.put("topwood", Wood.MAHOGANY);
		properties.put("backwood", Wood.ADIRONDACK);
		inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.FENDER);
		properties.put("model", "Stratocastor");
		properties.put("type", Type.ELECTRIC);
		properties.put("numstrings", 6);
		properties.put("topwood", Wood.ALDER);
		properties.put("backwood", Wood.ALDER);
		inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.FENDER);
		properties.put("model", "Stratocastor");
		properties.put("type", Type.ELECTRIC);
		properties.put("numstrings", 6);
		properties.put("topwood", Wood.ALDER);
		properties.put("backwood", Wood.ALDER);
		inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "SG'61 Reissue");
		properties.put("type", Type.ELECTRIC);
		properties.put("numstrings", 6);
		properties.put("topwood", Wood.MAHOGANY);
		properties.put("backwood", Wood.MAHOGANY);
		inventory.addInstrument("82765501", 1890.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "Les Paul");
		properties.put("type", Type.ELECTRIC);
		properties.put("numstrings", 6);
		properties.put("topwood", Wood.MAPLE);
		properties.put("backwood", Wood.MAPLE);
		inventory.addInstrument("70108276", 2295.95, new InstrumentSpec(properties));

	}
}
