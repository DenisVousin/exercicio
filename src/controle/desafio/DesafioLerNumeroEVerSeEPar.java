package controle.desafio;

import java.util.Scanner;

public class DesafioLerNumeroEVerSeEPar {
	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informa um número de 0 a 10: ");
		int valor = numero.nextInt();
		
		switch(valor) {
		case 0: case 2: case 4: case 6: case 8: case 10:
			System.out.println("Numero " + valor + " é par.");
			break;
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("Numero " + valor + " é impar.");
			break;
		default:
			System.out.println("Número informado é inválido!");
		}
	}

}
