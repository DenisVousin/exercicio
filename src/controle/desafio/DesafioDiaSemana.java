package controle.desafio;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner dia = new Scanner(System.in);
		
		System.out.println("Qual dia da semana é hoje? ");
		int resposta = dia.nextInt();
		
		if(resposta == 1) {
			System.out.println("Hoje é Segunda-Feira!");
		}else if(resposta == 2) {
			System.out.println("Hoje é Terça-Feira!");	
		}else if(resposta == 3) {
			System.out.println("Hoje é Quarta-Feira!");
		}else if (resposta == 4) {
			System.out.println("Hoje é Quinta-Feira!");
		}else if(resposta == 5) {
			System.out.println("Hoje é Sexta-Feira!");
		}else if(resposta == 6) {
			System.out.println("Hoje é Sábado!");
		}else if(resposta == 7) {
			System.out.println("Hoje é Domingo!");
		}else {
			System.out.println("O número informado é inválido, digite de 1 a 7 (1) sendo Segunda e (7) sendo Domingo.");
		}
	}
}
