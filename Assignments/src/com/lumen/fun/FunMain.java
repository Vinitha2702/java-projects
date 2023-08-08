package com.lumen.fun;

public class FunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory=new ShapeFactory();
		shapeFactory.printArea((x, y)->(x*y),10,30);
		
	}

}
