package controle.desafio;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {
	
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos tem na turma: ");
        int quantidadeAlunos = entrada.nextInt();

        int notasValidas = 0;
        int notasInvalidas = 0;
        double notas = 0;

        while (true) {
        	if(quantidadeAlunos == notasValidas) {
        		break;
        	} // Se as notas validas são somar de acordo com a qauntidade de alunos informadas pela pessoa Exemplo: 2 alunos, irá receber somente 2 notas válidas.
        	
            System.out.println("Informe uma nota (ou -1 para encerrar): ");

            if (entrada.hasNextLine()) {
                double validacaoNota = entrada.nextDouble();         
                
                if (validacaoNota == -1) {
                    break; // Após digitar -1 o programa irá fechar.
                }

                if (validacaoNota >= 0 && validacaoNota <= 10) {
                    notas += validacaoNota;
                    notasValidas++;
                } else {
                    System.out.println("Nota fornecida é inválida.");
                    notasInvalidas++;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                entrada.next(); // Informa que a nota não é válida no looping
            }
        }

        double resultado = notas / quantidadeAlunos;
        System.out.println("A média de nota dos alunos é: " + resultado);
        System.out.println("A quantidade de notas válidas: " + notasValidas);
        System.out.println("A quantidade de notas inválidas: " + notasInvalidas);

        entrada.close();
    }
}