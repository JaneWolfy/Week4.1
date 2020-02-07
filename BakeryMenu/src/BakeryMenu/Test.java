package BakeryMenu;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		BakeryMenu menu = new BakeryMenu();
		CounterWorker bob = new CounterWorker(menu);

		assertTrue(bob.bakeryMenu.equals(menu));
		
		menu.addItem("Pride Cake", "A vanilla cake with each layer bing a different color of the pride flag.", 30.00);
		assertTrue(menu.getnumberOfItems() == 6);
		
		menu.addItem("Dirt Cake", "Chocolate Cake with an oreo coat and gummy worms on top.", 28.00);
		assertTrue(menu.getnumberOfItems() == 6);
	}

}
