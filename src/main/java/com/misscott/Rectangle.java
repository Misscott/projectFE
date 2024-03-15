package com.misscott;


/**
 * @author Misscott
 * @version 1.0
 * @created 15-mar.-2024 13:28:42
 */
public class Rectangle extends Figura {

	public Rectangle(){

	}

	public Rectangle(double x, double y) {
		super(x, y);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public double calcularArea() {
		return x * y;
	}
}//end Rectangle