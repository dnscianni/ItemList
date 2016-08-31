
/**
 * Write a description of class item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item implements Comparable<Item>
{
    private String name;
	private String category;
	private int quantity;
	private double price;
	
	
	public Item(String name, String category, int quantity, double price)
	{
		this.name=name;
		this.category=category;
		this.quantity=quantity;
		this.price=price;
	}
	
	public Item()
	{
		this.name=null;
		this.category=null;
		this.quantity=0;
		this.price=0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCategory()
	{
		return category;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public double getprice()
	{
		return price;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	
	public int compareTo(Item obj) {
		if(price>obj.getprice())
		{
			return -1;
		}
		else if(price==obj.getprice())
		{
			if(category.equals("C") && (!obj.getCategory().equals("C")))
			{
				return 1;
			}
			else if((!category.equals("C")) && (obj.getCategory().equals("C")))
			{
				return -1;
			}
			else if(category.equals("W") && obj.getCategory().equals("M"))
			{
				return 1;
			}
			else if(category.equals("M") && obj.getCategory().equals("W"))
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 1;
		}
	}
	
	public String toString()
	{
		return "NAME: "+name+"\t CATEGORY: " + category + "\t QUANTITY: " + quantity + "\t PRICE: " + price;
	}
	
}