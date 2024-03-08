package controle.desafio;

import java.util.Scanner;
import java.util.Calendar;

public class DesafioAnoBissexto {
	    public static void main(String[] args) {
	        Calendar calendario = Calendar.getInstance();
	        calendario.set(2401, Calendar.FEBRUARY, 1); // Mês 1 representa fevereiro em Java

	        int lastDayOfMonth = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
	     
	        if(lastDayOfMonth == 29) { // Retorna true se o mês de fevereiro de 2412 tiver 29 dias
	        	System.out.println("O ano é Bissexto!");
	        }else{
	        	System.out.println("O ano NÃO é Bissexto!");
	        }
	    }
	}
