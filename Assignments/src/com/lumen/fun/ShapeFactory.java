package com.lumen.fun;

public class ShapeFactory {
	void printArea(Shape shape,double x,double b) {
		System.out.println("printing Area");
		double area=shape.calcArea(45, 30);
		System.out.println(area);
		System.out.println("done");
	}
}
