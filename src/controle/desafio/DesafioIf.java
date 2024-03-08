package controle.desafio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DesafioIf {
	public static void main(String[] args) {
		
		double nota = 10.3;
		
		if(nota >= 9.0) {
			System.out.println("Quadro de honra!");
			System.out.println("Você é fera!!!");
		}
		/* 
		Era por conta do ; estruturas de controle não são terminadas com ; 
		*/
		double nota2 = 1.3;
		
		if(nota2 >= 9.0) {
			System.out.println("Quadro de honra!");
			System.out.println("Você é fera!!!");
		}else {
			System.out.println("Deu ruim, reprovei..");
		}
	}
	
}
