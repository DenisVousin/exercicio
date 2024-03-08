package classe.exercicio.desafioModulo;
import java.util.List;

public class Jantar {

	public static void main(String[] args) {
		Comida c1 = new Comida("Bife de Frango", 0.10, 1.6);
		var c2 = new Comida("Bife de Carne", 0.20, 1.2);
		
		Pessoa p1 = new Pessoa("Denis", 22, 62.50, 0.0);
		var p2 = new Pessoa("Yasmin", 18, 57.50, 50.10);
		
		System.out.println("Antes de comer:");
		System.out.println(p1.obterPessoaInicial());
		System.out.println(p2.obterPessoaInicial());
		System.out.println(" ");
		
		p1.obterPessoaDepoisDeComer(c1);
		p2.obterPessoaDepoisDeComer(c2);
		
		//System.out.println("Depois de comer:");
		//System.out.println(p1.obterPessoaInicial());
		//System.out.println(p2.obterPessoaInicial());
		
		List.of(p1,p2).forEach(pessoa -> {
			if(pessoa.estaVivo()) {
				System.out.println(pessoa.obterPessoaInicial());
				System.out.println("Você conseguiu viver, parabéns!");
			}else {
				System.out.println(pessoa.obterPessoaInicial());				
				System.out.println("É.. te vejo em outro plano!");
			}			
		});
		
				
		
	}
}
