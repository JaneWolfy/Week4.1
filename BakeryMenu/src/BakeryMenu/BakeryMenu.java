package BakeryMenu;

public class BakeryMenu implements Menu {
	int numberOfItems = 0;
	MenuItem[] menuItems;
	static final int MAX_ITEMS = 6;

	
	//creates the basic menu
	public BakeryMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		//Adds items to menu
		addItem("Double Chocolate Cake", "A chocolate cake with chcocolate frosting", 22.00);
		addItem("Vanilla Birthday Cake", "A vanilla cake with vanilla frosting and candels", 25.00);
		addItem("Marble Chocolate Cake", "A marble cake with chocolate forsting", 23.00);
		addItem("Funky Chocolate Cake", "A chocolate cake with tye-diyed vanila", 25.00);
		addItem("Vanilla Wedding Cake", "3 layers of white cake with white fondant.", 100.00);
		numberOfItems = 5;
	}
	
	//Adds an item to the menu. If the menu is full it says it can't be added.
	public void addItem(String name, String description, double price) {
		MenuItem menuItem = new MenuItem(name, description, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	//returns the array
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	

	@Override
	public BakeryIterator createIterator() {
		// TODO Auto-generated method stub
		return new BakeryIterator(menuItems);
	}
	
	public int getnumberOfItems() {
		return numberOfItems;
	}
	
	

}
