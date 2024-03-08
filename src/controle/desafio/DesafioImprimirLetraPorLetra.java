package controle.desafio;

import java.util.Scanner;

public class DesafioImprimirLetraPorLetra {
	public static void main(String[] args) {

		Scanner palavra = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra1 = palavra.nextLine();
		for(char letra : palavra1.toCharArray()) {
			System.out.println(letra);
		}
		System.out.println();
		for (int i = 0; i < palavra1.length(); i++) {
			char letra1 = palavra1.charAt(i);
			System.out.println(letra1);
		}
	}
}
