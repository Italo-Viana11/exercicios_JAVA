package atividades_javas;

public class Questao14 {
	  public static void main(String[] args) {
	        double[] medias = {8.5, 4.0, 6.5, 9.0, 3.5, 7.0, 5.5};

	        int aprovados = 0;
	        int reprovados = 0;

	        for (int i = 0; i < medias.length; i++) {
	            if (medias[i] >= 7) {
	                aprovados++;
	            } else {
	                reprovados++;
	            }
	        }

	        System.out.println("Aprovados: " + aprovados);
	        System.out.println("Reprovados: " + reprovados);
	    }
}
