package controle;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.*;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Par");
			
		}else if(numero % 2 == 1) {
			System.out.println("Ímpar");

		}else {
			System.out.println("Não sei OQUE PORRA VOCÊ COLOCOU AI");
		}
				
	}
}
