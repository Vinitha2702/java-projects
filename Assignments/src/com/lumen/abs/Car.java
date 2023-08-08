package com.lumen.abs;

public class Car extends Vehicle {
	@Override
	void getMileage() {
		// TODO Auto-generated method stub
		System.out.println("give good mileage");
	}
	@Override
	void showType() {
		// TODO Auto-generated method stub
		System.out.println("bcgfgh");
	}
	public Car(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}
	
	String[] showAccessories() {
		String[] arr= {"car cover","seat cover","cleaner"};
		return arr;
	}

	

}
