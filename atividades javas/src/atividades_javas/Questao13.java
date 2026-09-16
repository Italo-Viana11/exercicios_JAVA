package atividades_javas;

public class Questao13 {
	 public static void main(String[] args) {
	        double[][] notas = {
	            {7.0, 8.0, 9.0},
	            {5.0, 4.0, 6.0},
	            {2.0, 3.0, 1.0}
	        };

	        for (int aluno = 0; aluno < notas.length; aluno++) {
	            double soma = 0;
	            for (int nota = 0; nota < notas[aluno].length; nota++) {
	                soma = soma + notas[aluno][nota];
	            }
	            double media = soma / notas[aluno].length;

	            System.out.print("Aluno " + (aluno + 1) + " - Media: " + media + " - ");

	            if (media >= 7) {
	                System.out.println("Aprovado");
	            } else if (media >= 5) {
	                System.out.println("Recuperacao");
	            } else {
	                System.out.println("Reprovado");
	            }
	        }
	    }
}
