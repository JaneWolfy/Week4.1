package BakeryMenu;

public class CounterWorker {
	BakeryMenu bakeryMenu;

	//Creates counter worker with menu
	public CounterWorker(BakeryMenu bakeryMenu) {
		this.bakeryMenu = bakeryMenu;
	}
	
	//prints out the menu
	public void printMenu() {
		BakeryIterator bakeryIterator = bakeryMenu.createIterator();
		
		System.out.println("Available Goods!");
		printMenu(bakeryIterator);
	}
	
	private void printMenu(MyIterator bakeryIterator) {
		while(bakeryIterator.hasNext()) {
			MenuItem bakeryItem = bakeryIterator.next();
			System.out.println(bakeryItem.getName() + ", $" + bakeryItem.getPrice()+ ": " + bakeryItem.getDescription());
		}
	}
	
}
