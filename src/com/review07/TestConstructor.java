package com.review07;

public class TestConstructor {
	public static void main(String[] args)
	{
	StoreProduct product=new StoreProduct("Egg", 3.0, "Produce", true, 10);
	product.displayInfo();
	
	StoreProduct product1=new StoreProduct("Paper Towels", 2.0, 24);
	product1.displayInfo();
	
	StoreProduct product2=new StoreProduct("Papr Towels", 0);
	product2.displayInfo();
	}
}
