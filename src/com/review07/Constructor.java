package com.review07;

public class Constructor {

	String item1, item2;
	double price1;
	int price2;

	Constructor(String item1, double price1) {
		this.item1 = item1;
		this.price1 = price1;
		System.out.println(item1 + " Total Value " + price1);

		Constructor(String item2, int price2){
		this.item2 = item2;
		this.price2=price2;

		}
				System.out.println(item2 + " Total Value " + price2);

	}

	public double totalPrice(double price1, double price2) {
		double addition = price1 + price2;
		return addition;

	}

	public void displayInfo() {
		System.out.println("You purchased " + (price1 + price2) + " Today");
	}
}