package exercicios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner operacao = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("======== Calculadora ========");
		System.out.println("====== Digite um Valor ======");
		System.out.println("=============================");
		
		System.out.println("Informe o primeiro valor: ");
		double numero1 = operacao.nextDouble();
		System.out.println("Informe o segundo valor: ");
		double numero2 = operacao.nextDouble();
		
		System.out.println("Escolha qual tipo de cálculo você deseja fazer:");
		System.out.println("[-] [+] [/] [*] [%]");
		String op = operacao.next();
		
		// Lógica
		double resultado = "-".equals(op) ? numero1 - numero2 : 0;
		 resultado = "+".equals(op) ? numero1 + numero2 : resultado;
		 resultado = "/".equals(op) ? numero1 / numero2 : resultado;
		 resultado = "*".equals(op) ? numero1 * numero2 : resultado;
		 resultado = "%".equals(op) ? numero1 % numero2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", numero1, op, numero2, resultado);
		
		
		
		
		
		
		
		operacao.close();
	} 

}
