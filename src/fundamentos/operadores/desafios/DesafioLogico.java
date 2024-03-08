package fundamentos.operadores.desafios;

public class DesafioLogico {
	public static void main(String[] args) {
	// trabalho na terça (V OU F)
	// trabalho na quinta (V OU F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		System.out.println("Se os dois trabalhos deram certo, iremos comprar uma tv de 50 polegadas: ");
		boolean resultado1 = (trabalho1 && trabalho2);
		System.out.println(resultado1);
		
		System.out.println("\nSe um dos dois deram certo, iremos comprar uma tv de 32 polegadas: ");
		boolean resultado2 = (trabalho1 || trabalho2);
		System.out.println(resultado2);
		
		System.out.println("\nSe um dos dois empregos derem certo então toda a familia irá tomar um sorvete: ");
		boolean resultado3 = resultado1 || resultado2;
		System.out.println(resultado3);
		
		System.out.println("\nSe nenhum dos dois empregos deram certo então vamos todos ficar em casa com fome: ");
		boolean resultado4 = resultado1 ^ resultado2;
		System.out.println(resultado4);
		
		
		
	}

}
