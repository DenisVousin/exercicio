package exercicios;

import java.util.Scanner;

public class ValorAoQuadradoAoCubo {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
			
		System.out.println("Informe um valor: ");
		double numero = valor.nextDouble();
		
		double ResultadoAoQuadrado = Math.pow(numero, 2);
		double ResultadoAoCubo = Math.pow(numero, 3);
		
		 System.out.println("O resultado ao quadrado é: " + ResultadoAoQuadrado);
		 System.out.println("O resultado ao cubo é: " + ResultadoAoCubo);
		
		valor.close();
	}

}
