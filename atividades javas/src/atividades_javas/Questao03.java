package atividades_javas;

public class Questao03 {
	 public static void main(String[] args) {
	        int soma = 0;
	        int i = 1;
	        while (i <= 100) {
	            if (i % 2 != 0) {
	                soma = soma + i;
	            }
	            i++;
	        }
	        System.out.println("Soma dos impares de 1 a 100: " + soma);
	    }
	}

