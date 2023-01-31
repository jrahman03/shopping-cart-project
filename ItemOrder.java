//Jewel Rahman 4/19/22 CS211
//This class tores information about a particular item and the quantity ordered for that item

public class ItemOrder {
	
	//variables
	private int quantity;
	private Item item;
	
	//constructor used to create item order for certain item and amount
	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	//this method returns the cost for the given item order
	public double getPrice() {
		return item.priceFor(quantity);
	}
	
	//this method returns a reference to the item in this order
	public Item getItem() {
		return item;
	}
}
