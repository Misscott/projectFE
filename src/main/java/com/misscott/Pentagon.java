package com.misscott;


/**
 * @author Misscott
 * @version 1.0
 * @created 15-mar.-2024 13:28:42
 */
public class Pentagon extends Figura {

	public Pentagon(){

	}

	public Pentagon(double x, double y) {
		super(x, y);
	}

	protected void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public double calcularArea() {
		return ((x * 5) * y)/ 2;
	}
}//end Pentagon