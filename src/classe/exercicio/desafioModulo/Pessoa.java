package classe.exercicio.desafioModulo;

public class Pessoa {
	
	String nomePessoa;
	int idadePessoa;
	double pesoPessoa;
	double colesterolPessoa;
	boolean vivo;
	
	Pessoa(String nomePessoa, int idadePessoa, double pesoPessoa, double colesterolPessoa){
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
		this.pesoPessoa = pesoPessoa;
		this.colesterolPessoa = colesterolPessoa;
		this.vivo = true;
	}
	String obterPessoaInicial(){
		return String.format("%s - %d - %.2f - %.2f", nomePessoa, idadePessoa, pesoPessoa, colesterolPessoa);
	}
	void obterPessoaDepoisDeComer(Comida comida) {
		colesterolPessoa += comida.colesterolComida;
		pesoPessoa += comida.valorCaloricoComida;
		if(colesterolPessoa > 50 && vivo) {
			vivo = false;
		}
	}
	boolean estaVivo () {
		return vivo;
	}
}
