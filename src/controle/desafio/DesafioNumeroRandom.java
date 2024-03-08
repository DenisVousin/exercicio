package controle.desafio;

import java.util.Random;
import java.util.Scanner;

public class DesafioNumeroRandom {
	public static void main(String[] args) {
		
		Scanner resposta = new Scanner(System.in);
		Random random = new Random();
		int aleatorio = random.nextInt(100);
		System.out.println("Você tem 10 tentativas para encontrar o número.");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Tentativa: " + i);
			System.out.println("Digite um número: ");
			int numero = resposta.nextInt();
			if(aleatorio == numero){
				System.out.println("Você acertou!!!");
				System.out.println("Parabéns você venceu o desafio!");
				break;
			}else {
				System.out.println("Você errou.");
			}	
		}
		System.out.println("O número era: " + aleatorio);
	}

}
