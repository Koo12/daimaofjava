package สตั้าป;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {
	private String code;
	private String description;
	private double price;
	
	public Product(String code,String description,double price)
	{
		this.code=code;
		this.description=description;
		this.price=price;
	}
	
	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}
	
	public boolean equals(Product pro)
	{
		if(this.code==pro.code)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return this.code+"_"+this.description+"_"+this.price;
	}
}
class Coffee extends Product{
	private String origin;
	private String roast;
	private String flavor;
	private String aroma;
	private String acidity;
	private String body;
	
	public Coffee(String code,String description,double price,String origin,String roast,String flavor,String aroma,String acidity,String body)
	{
		super(code,description,price);
		this.origin=origin;
		this.roast=roast;
		this.flavor=flavor;
		this.aroma=aroma;
		this.acidity=acidity;
		this.body=body;
	}
	public String getOrigin() {
		return origin;
	}
	public String getRoast() {
		return roast;
	}
	public String getFlavor() {
		return flavor;
	}
	public String getAroma() {
		return aroma;
	}
	public String getAcidity() {
		return acidity;
	}
	public String getBody() {
		return body;
	}
	
	public String toString()
	{
		return super.getCode()+"_"+super.getDescription()+"_"+super.getPrice()+"_"+this.origin+"_"+this.roast+"_"+this.flavor+"_"+this.aroma+"_"+this.acidity+"_"+this.body;
	}
}
class CoffeeBrewer extends Product{
	private String model;
	private String waterSupply;
	private int numberOfCups;
	
	public CoffeeBrewer(String code,String description,double price,String model,String waterSupply,int numberOfCups)
	{
		super(code,description,price);
		this.model=model;
		this.waterSupply=waterSupply;
		this.numberOfCups=numberOfCups;
	}
	public String getModel() {
		return model;
	}
	public String getWaterSupply() {
		return waterSupply;
	}
	public int getNumberOfCups() {
		return numberOfCups;
	}
	public String toString()
	{
		return super.getCode()+"_"+super.getDescription()+"_"+super.getPrice()+"_"+this.model+"_"+this.waterSupply+"_"+this.numberOfCups;
	}
}
class OrderItem{
	private Product product;
	private int quantity;
	
	public OrderItem(Product pro,int quantity)
	{
		this.product=pro;
		this.quantity=quantity;
	}
	
	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}

	public double getValue()
	{
		return this.getProduct().getPrice()*this.quantity;
	}
	
	public String toString()
	{
		return this.quantity+" "+this.product.getCode()+" "+this.product.getPrice();
	}
}
class Catalog{
	private ArrayList<Product> products=null;
	
	public Catalog()
	{
		this.products=new ArrayList<Product>();
	}
	public void addProduct(Product product)
	{
		this.products.add(product);
	}
	public Iterator<Product> iterator()
	{
		return this.products.iterator();
	}
	public Product getProduct(String code)
	{
		for(Product i:products)
		{
			if(i.getCode()==code)
			{
				return i;
			}
		}
		return null;
	}
	public int getNumberOfProducts()
	{
		return this.products.size();
	}
}
class Order{
	private ArrayList<OrderItem> items=null;
	
	public Order()
	{
		this.items=new ArrayList<OrderItem>();
	}
	public void addItem(OrderItem orderItem)
	{
		this.items.add(orderItem);
	}
	public void removeItem(OrderItem orderItem)
	{
		this.items.remove(orderItem);
	}
	public Iterator<OrderItem> iterator()
	{
		return this.items.iterator();
	}
	public OrderItem getItem(Product product)
	{
		for(OrderItem i:items)
		{
			if(i.getProduct().equals(product))
			{
				return i;
			}
		}
		return null;
	}
	public int getNumberOfItems()
	{
		return items.size();
	}
	public double getTotalCost()
	{
		double sum=0;
		for(OrderItem i:items)
		{			
			sum=sum+i.getValue();
		}
		return sum;
	}
}
class Sales{
	private ArrayList<Order> orders=null;
	
	public Sales()
	{
		this.orders=new ArrayList<Order>();
	}
	public void addOrder(Order order)
	{
		this.orders.add(order);
	}
	public Iterator<Order> iterator()
	{
		return this.orders.iterator();
	}
	public int getNumberOfOrders()
	{
		return this.orders.size();
	}
}
class GourmetCoffee{
	private Catalog catalog;
	private Order currentOrder;
	private Sales sales;
	
	public void GourmetCoffeeSolution(){}
	public void displayCatalog(){}
	public void displayProductInfo(){}
	public void displayOrder(){}
	public void addModifyProduct(){}
	public void removeProduct(){}
	public void saleOrder(){}
	public void displayOrdersSold(){}
	public void displayNumberOfOrders(Product product)
	{
		
	}
	public void displayTotalQuantityOfProducts()
	{
		
	}
}