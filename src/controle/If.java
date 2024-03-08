package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
				
		if(media >= 6.0) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}
		entrada.close();
	}

}
