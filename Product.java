package สตั้าป;

import java.util.ArrayList;

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
	ArrayList product=new ArrayList();
	
	public void addProduct(Product product)
	{
		this.product.add(product);
	}
	public ArrayList<Product> iterator()
	{
		return this.product;
	}
	public Product getProduct(String code)
	{
		for(int i=0;i<this.product.size();i++)
		{
			Product[] product=(Product[]) this.product.toArray(new Product[this.product.size()]);
			if(product[i].getCode()==code)
			{
				return (Product) this.product.get(i);
			}
			else
			{
				return null;
			}
		}
		return null;
	}
	public int getNumberOfProducts()
	{
		return this.product.size();
	}
}