package exercicios;

import java.util.Scanner;

public class FahrenheitEmCelsius {
	public static void main(String[] args) {
		System.out.println("Informe a temperatura em Fahrenheit: ");
		Scanner temperatura = new Scanner(System.in);
		int f = temperatura.nextInt();
		double resultado = ((f - 32) * 5)/9;
		
		System.out.printf("A temperatura em Celsius é: " + resultado);
	}

}
