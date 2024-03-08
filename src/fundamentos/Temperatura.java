package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double Fahrenheit = 86;
		final double Const1 = 32;
		final double Const2 = 5/9.0;
		
		double resultado = (Fahrenheit - Const1) * Const2;  
		System.out.println("Temperatura de: " + resultado +"°C");
		
		Fahrenheit = 120;
		resultado = (Fahrenheit - Const1) * Const2;
		System.out.println("Temperatura de: " + resultado +"°C");
	}
}
