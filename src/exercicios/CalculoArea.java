package exercicios;

import java.util.Scanner;

public class CalculoArea {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor da base: ");
		double base = leitor.nextDouble();
		System.out.println("Informe o valor da altura: ");
		double altura = leitor.nextDouble();
		
		double area = (base * altura)/2;
		System.out.print("A área do triângulo é: "+ area);
		
	}

}
