package exercicios;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Vamos calcular o seu IMC");
		System.out.println("Informe o seu peso: ");
		double peso = leitura.nextDouble();
		System.out.println("Informe a sua altura: ");
		double altura = leitura.nextDouble();
		
		double IMC = peso/(altura*altura);
		System.out.printf("Seu IMC é: %.2f", IMC);
		
		leitura.close();
	}

}
