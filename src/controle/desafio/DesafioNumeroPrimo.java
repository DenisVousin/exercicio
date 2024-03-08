package controle.desafio;

import java.util.Scanner;

public class DesafioNumeroPrimo {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		System.out.println("Informe o número: ");
		int valor = numero.nextInt();

		boolean primo = true;

		if (valor <= 1) {
			primo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(valor); i++) {
				if (valor % i == 0) {
					primo = false;
					break;
				}
			}
		}

		if (primo) {
			System.out.println("Número Primo");
		} else {
			System.out.println("Número Composto");
		}
		numero.close();
	}
}
