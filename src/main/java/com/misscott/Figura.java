package com.misscott;


/**
 * @author Misscott
 * @version 1.0
 * @created 15-mar.-2024 13:28:42
 */
public abstract class Figura implements Area {

	protected int area;
	public double x;
	public double y;

	public Figura(){

	}

	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void finalize() throws Throwable {

	}
	public abstract double calcularArea();
}//end Figura