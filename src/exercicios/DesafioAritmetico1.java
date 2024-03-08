package exercicios;

public class DesafioAritmetico1 {
	public static void main(String[] args) {
		
		double valor1 = Math.pow(6 * (3 + 2), 2) / (3 * 2);
		double valor2 = Math.pow((1 - 5) * (2 - 7)/ 2, 2);
		double valor3 = Math.pow(10, 3);
	
		double resultado1 = (valor1 - valor2);
		double resultado2 = Math.pow(resultado1, 3);
		double respostaFinal = resultado2 / valor3;
		System.out.println(respostaFinal);
	}

}
