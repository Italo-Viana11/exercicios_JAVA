package atividades_javas;

public class Questao08 {
	 public static void main(String[] args) {
	        long anterior = 0;
	        long atual = 1;

	        for (int i = 1; i <= 20; i++) {
	            if (anterior % 2 == 0) {
	                System.out.println(anterior + " (par)");
	            } else {
	                System.out.println(anterior);
	            }
	            long proximo = anterior + atual;
	            anterior = atual;
	            atual = proximo;
	        }
	    }
}
