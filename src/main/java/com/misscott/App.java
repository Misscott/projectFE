package com.misscott;


import java.util.Scanner;

/**
 * @author Misscott
 * @version 1.0
 * @created 15-mar.-2024 13:28:42
 */
public class App {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int option;
		double area;
		do {
			System.out.println("Calculadora de Area de Pau");
			System.out.println("Selecciona una opción:");
			System.out.println("1. Círculo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Triángulo");
			System.out.println("4. Rectángulo");
			System.out.println("5. Pentágono");
			System.out.println("6. Trapecio");
			System.out.println("0. Salir");
			System.out.print("Opción: ");
			option = Integer.parseInt(scanner.nextLine());
			switch (option) {
				case 1:
					System.out.print("Ingrese el radio del círculo: ");
					double radius = Double.parseDouble(App.scanner.nextLine());
					Circle circle = new Circle(radius, 0);
					area = circle.calcularArea();
					System.out.println("El área del círculo es: " + area);
					break;
				case 2:
					System.out.print("Ingrese el lado del cuadrado: ");
					double side = Double.parseDouble(App.scanner.nextLine());
					Square square = new Square(side, 0);
					area = square.calcularArea();
					System.out.println("El área del cuadrado es: " + area);
					break;
				case 3:
					System.out.print("Ingrese la base del triángulo: ");
					double baseT = Double.parseDouble(App.scanner.nextLine());
					System.out.print("Ingrese la altura del triángulo: ");
					double heightT = Double.parseDouble(App.scanner.nextLine());
					Triangle triangle = new Triangle(baseT, heightT);
					area = triangle.calcularArea();
					System.out.println("El área del triángulo es: " + area);
					break;
				case 4:
					System.out.print("Ingrese la base del rectángulo: ");
					double base = Double.parseDouble(App.scanner.nextLine());
					System.out.print("Ingrese la altura del rectángulo: ");
					double height = Double.parseDouble(App.scanner.nextLine());
					Rectangle rectangle = new Rectangle(base, height);
					area = rectangle.calcularArea();
					System.out.println("El área del rectángulo es: " + area);
					break;
				case 5:
					System.out.print("Ingrese el lado del pentágono: ");
					double sideP = Double.parseDouble(App.scanner.nextLine());
					System.out.print("Ingrese la apotema del pentágono: ");
					double apothem = Double.parseDouble(App.scanner.nextLine());
					Pentagon pentagon = new Pentagon(sideP, apothem);
					area = pentagon.calcularArea();
					System.out.println("El área del pentágono es: " + area);
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida");
			}

		} while (option != 0);
	}
}//end App