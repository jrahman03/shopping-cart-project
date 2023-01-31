// Jewel Rahman 4/19/22 CS211
//This class creates the Item and it's info needed as an object

import java.awt.*;
import java.util.*;
import java.text.*;

public class Item {
	
	//variables
	private String name;
	private double price;
	private int bQuantity;
	private double bPrice;
	
	 //constructor for item with 2 parameters
	public Item(String name, double price) {
		this.name = name;
	    this.price = price;
	    
	    //if price is negative this will be thrown
	    if(price < 0) {
	        throw new IllegalArgumentException("PRICE IS NEGATIVE");
	    }
	}
	
	//constructor for bulk items
	public Item(String name, double price, int bQuantity, double bPrice) {
		this.name = name;
	    this.price = price;
	    this.bPrice = bPrice;
	    this.bQuantity = bQuantity;
		//If any number is negative...
	    if(price < 0 || bPrice < 0 || bQuantity < 0) {
	        throw new IllegalArgumentException("PRICE OR QUANTITY IS NEGATIVE");
	    }
	}
	
	 //this method returns the price for a given quantity of the item
	public double priceFor(int quantity) {
		//throws if quantity is negative
	    if (quantity < 0) {
	        throw new IllegalArgumentException("Quantity cannot be negative");
	    }
	    //determines whether or not bulk
	    if (quantity >= bQuantity && bQuantity > 0) {
	        int num_BQuantities = 0;
	        for (int i = quantity - bQuantity; i >= 0; i -= bQuantity) {
	            num_BQuantities++;
	            quantity -= bQuantity;
	        }
	        return num_BQuantities * bPrice + quantity * price;
	    }
	    return quantity * price;
	}
	
	//To String method that displays quantity and price
	public String toString() {
	    if(bPrice > 0) {
	        return "" + name + ", $" + price + " (" + bQuantity + " for $" + bPrice + ")";
	    }
	    return "" + name + ", $" + price;
	}
	
}