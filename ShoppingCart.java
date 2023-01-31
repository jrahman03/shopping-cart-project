// Jewel Rahman 4/20/22 CS211
//This class stores information about the overall order. 
import java.awt.*;
import java.util.*;

public class ShoppingCart {
	
	//variables 
	private ArrayList<ItemOrder> list;
	private double discount = 1;
	
	//constructor - Constructor that creates an empty list of item orders. 
	public ShoppingCart() {
		list = new ArrayList<ItemOrder>();
	}
	
	//Adds an item order to the list, replacing any previous order for this item with the new order.  The parameter will be of type ItemOrder. 
	public void add(ItemOrder item) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getItem().toString().equals(item.getItem().toString())) {
				list.remove(i);
			}
		}
		list.add(item);
	}
	
	//Sets whether or not this order gets a discount (true means there is a 
	//discount, false means no discount). 
	public void setDiscount(boolean discount) {
		if(discount) {
			this.discount = 0.9;
		}
	}
	
	//Returns the total cost of the shopping cart. 
	public double getTotal() {
		double totalCost = 0.0;
		for(int i = 0; i < list.size(); i++) {
			totalCost += list.get(i).getPrice();
		}
		return totalCost * discount;
	}
}

