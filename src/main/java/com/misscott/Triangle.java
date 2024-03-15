package com.misscott;


/**
 * @author Misscott
 * @version 1.0
 * @created 15-mar.-2024 13:28:42
 */
public class Triangle extends Figura {

	public Triangle(){

	}

	public Triangle(double x, double y) {
		super(x, y);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public double calcularArea() {
		return (x * y) / 2;
	}
}//end Triangle