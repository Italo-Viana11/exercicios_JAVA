package atividades_javas;

public class Questao12 {
	 public static void main(String[] args) {
	        int[] numeros = {23, 5, 67, 12, 89, 3, 45};

	        int maior = numeros[0];
	        int menor = numeros[0];

	        for (int i = 1; i < numeros.length; i++) {
	            if (numeros[i] > maior) {
	                maior = numeros[i];
	            }
	            if (numeros[i] < menor) {
	                menor = numeros[i];
	            }
	        }

	        System.out.println("Maior valor: " + maior);
	        System.out.println("Menor valor: " + menor);
	    }
}
