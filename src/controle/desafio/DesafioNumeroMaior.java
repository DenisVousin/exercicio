package controle.desafio;

import java.util.Scanner;

public class DesafioNumeroMaior {
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		int numeroMaior = 0;
		
		for (int i = 1; i <= 4; i++) {
			int numeroEntrada = valor.nextInt();
			if(numeroEntrada > numeroMaior) {
				numeroMaior = numeroEntrada;
			}
		}
		System.out.println("O maior número dos 10 é: " + numeroMaior);
	}
}
