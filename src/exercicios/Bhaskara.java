package exercicios;

public class Bhaskara {
	public static void main(String[] args) {
		int a = 1;
		int b = 12;
		int c = -13;
		
		double XOperacao1 = -b; 
		double XOperacao2 = Math.pow(b, 2) - 4*(a*c);
		double XOperacao3 = 2*a;
		
		double XOperacao2Raiz = Math.sqrt(XOperacao2);
		double resposta1 = (XOperacao1 + XOperacao2Raiz)/XOperacao3;
		double resposta2 = (XOperacao1 - XOperacao2Raiz)/XOperacao3;
		
		System.out.println("Resultado 1: " + resposta1);
		System.out.println("Resultado 2: " + resposta2);
		
	}

}