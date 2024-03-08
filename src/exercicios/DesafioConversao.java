package exercicios;


import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		// Calcular salários
		Scanner salarios = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String s1 = salarios.next().replace(",",".");
		System.out.print("Digite o segundo salário: ");
		String s2 = salarios.next().replace(",",".");
		System.out.print("Digite o terceiro salário: ");
		String s3 = salarios.next().replace(",",".");
		
		double salario1 = Double.parseDouble(s1); 
		double salario2 = Double.parseDouble(s2); 
		double salario3 = Double.parseDouble(s3);		
		double resultado = salario1 + salario2 + salario3;

		System.out.println("Soma dos 3 salários: " + resultado);
		System.out.println("Média dos 3 salários: " + resultado / 3);
		
		salarios.close();
		
	}

}
