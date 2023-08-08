package com.lumen.abs;

public class MainVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bike("dfsg","honda", 400000.0);
		vehicle.printDetails();
		Bike bike=(Bike)vehicle;
		bike.getMileage();
		bike.showType();
		vehicle = new Car("sdff","dsds",3000.0);
		vehicle.printDetails();
		Car car =(Car)vehicle;
		car.showAccessories();
		
		
		

	}

}
