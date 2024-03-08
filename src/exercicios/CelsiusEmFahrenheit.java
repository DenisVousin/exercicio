package exercicios;

import java.util.Scanner;

public class CelsiusEmFahrenheit {
	public static void main(String[] args) {
		System.out.println("informe a temperatura em Celsius: ");
		Scanner temperatura = new Scanner(System.in);
		double c = temperatura.nextDouble();
		double resultado = (c * 9/5) + 32;
		
		System.out.printf("A temperatura em Fahrenheit é: " + resultado);
		
	}

}
