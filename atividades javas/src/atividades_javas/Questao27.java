package atividades_javas;
import java.util.Scanner;
public class Questao27 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int secreto = 42, chute;
	        do {
	            chute = sc.nextInt();
	            if (chute > secreto) System.out.println("Menor");
	            else if (chute < secreto) System.out.println("Maior");
	        } while (chute != secreto);
	        System.out.println("Acertou!");
	    }
}
