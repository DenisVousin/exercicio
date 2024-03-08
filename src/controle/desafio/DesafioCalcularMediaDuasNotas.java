package controle.desafio;

import java.util.Scanner;

public class DesafioCalcularMediaDuasNotas {

	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = notas.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = notas.nextDouble();
		double media = (nota1 + nota2)/2;
		if(media >= 7.0) {
			System.out.println("Aprovado!");
		}else if(media < 7.0 && media > 4.0) {
			System.out.println("Recuperação.");
		}else {
			System.out.println("Reprovado!");
		}
	}
}
