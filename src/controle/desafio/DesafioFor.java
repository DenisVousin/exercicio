package controle.desafio;

import java.util.stream.*;

public class DesafioFor {
    public static void main(String[] args) {
    	
    	// Solução 1
        String valor = "#";
        for(char i = '1'; i <= '5'; i++) {
            System.out.println(valor);
            valor += "#";

            }
        
        // Solução principal
        
        for(String v = "#"; !v.equals("######"); v += "#") {
        	System.out.println(v);
        }
        
    	// Solução 2
    	IntStream.range(0,5).forEach(i -> System.out.print("#".repeat(i+1)+"\n"));
    	
    	// Solução 3
    	  String hash = "#";
		    
		    for (String line = hash; line.length() <= (hash + hash + hash + hash + hash).length(); line += hash) {
		        System.out.println(line);  
		    }
        }
    }

