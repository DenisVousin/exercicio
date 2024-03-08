package controle.desafio;

import java.util.Scanner;

public class DesafioNumerosPositivos {
	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		int valor = 0;
		int soma = 0;
		do {
			valor = numero.nextInt();
			if(valor > 0) {
				soma += valor;
			}

		} while(valor > 0);
		System.out.println("Você saiu da soma!");
		System.out.println("Soma dos números: " + soma);
		numero.close();
	}

}
