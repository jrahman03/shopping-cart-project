// Jewel Rahman 4/19/22 CS211
// This class stores information about a collection of these items. 
import java.util.*;

public class Catalog {

	
	//variables
	private String name;
	private ArrayList<Item> list = new ArrayList<Item>();
	
	//constructor for catalog
	public Catalog(String name) {
		this.name = name;	
	}
	
	//method that adds item to the end of this list
	public void add(Item item) {
		this.list.add(item);
	}
	
	//Returns the number of items in this list. 
	public int size() {
		return list.size();
	}
	
	//Returns the Item with the given index (0-based). 
	public Item get(int index) {
		return list.get(index);
	}
	
	//Returns the name of this catalog. 
	public String getName(){
		return name;
	}
}
