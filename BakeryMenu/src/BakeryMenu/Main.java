package BakeryMenu;

public class Main {
	public static void main(String args[]) {
		//makes menu and counter worker
		BakeryMenu menu = new BakeryMenu();
		CounterWorker bob = new CounterWorker(menu);
		
		//prints base menu
		bob.printMenu();
		
		
		//adds a cake to menu
		menu.addItem("Pride Cake", "A vanilla cake with each layer bing a different color of the pride flag.", 30.00);

		
		//prints new menu
		bob.printMenu();

		//atempts to add cake to full menu.
		menu.addItem("Dirt Cake", "Chocolate Cake with an oreo coat and gummy worms on top.", 28.00);
		
		//checks that nothing was added to the menu by printing the menu.
		bob.printMenu();
	}
}
