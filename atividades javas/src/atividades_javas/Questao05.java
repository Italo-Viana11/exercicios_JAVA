package atividades_javas;

public class Questao05 {
	  public static void main(String[] args) {
	        int contador = 0;
	        for (int numero = 2; numero <= 50; numero++) {
	            boolean primo = true;
	            for (int divisor = 2; divisor < numero; divisor++) {
	                if (numero % divisor == 0) {
	                    primo = false;
	                }
	            }
	            if (primo) {
	                contador++;
	            }
	        }
	        System.out.println("Quantidade de primos entre 1 e 50: " + contador);
	    }	
}
