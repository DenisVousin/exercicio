package classe.exercicio;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		var d2 = new Data(23, 11, 1999);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}
}
