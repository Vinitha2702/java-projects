package com.lumen.abs;

public class Bike extends Vehicle {

	public Bike(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		// TODO Auto-generated method stub
		System.out.println("it gets good mileage");

	}

	@Override
	void showType() {
		// TODO Auto-generated method stub
		if(brand.equals("Royal")) {
			System.out.println("best brand");
		}
		else if(brand.equals("honda")) {
			System.out.println("low cost");
		}
		else if(brand.equals("java")) {
			System.out.println("high cost");
		}
		else {
			System.out.println("better to try next time");
		}
	}
	void engineType() {
		System.out.println("double engine");
	}

}
